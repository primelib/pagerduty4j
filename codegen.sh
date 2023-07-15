#!/bin/bash

# setup
PROJECT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )"

# test
case $1 in
  "update")
    echo "> updating openapi spec"
    EVENTSV2_SPEC="$PROJECT_DIR/events-v2/openapi.json"
    curl -o "$EVENTSV2_SPEC" https://raw.githubusercontent.com/PagerDuty/api-schema/main/reference/events-v2/openapiv3.json
    jq '.info.title="PagerDuty Events V2"' "$EVENTSV2_SPEC" | sponge "$EVENTSV2_SPEC" # overwrite name

    REST_SPEC="$PROJECT_DIR/rest/openapi.json"
    curl -o "$REST_SPEC" https://raw.githubusercontent.com/PagerDuty/api-schema/main/reference/REST/openapiv3.json
    jq '.info.title="PagerDuty REST"' "$REST_SPEC" | sponge "$REST_SPEC" # overwrite name
    jq 'walk(if type == "object" and .discriminator and .discriminator.mapping then del(.discriminator.mapping) else . end)' "$REST_SPEC" | sponge "$REST_SPEC" # remove any discriminator.mapping as the files are missing
    jq '.components.parameters.header_Accept."x-param-static"="true"' "$REST_SPEC" | sponge "$REST_SPEC" # add x-param-static to Accept header
    jq '.components.parameters."header_Content-Type"."x-param-static"="true"' "$REST_SPEC" | sponge "$REST_SPEC" # add x-param-static to Accept header
    # delete endpoints with broken specification
    jq 'del(.paths."/extensions")' "$REST_SPEC" | sponge "$REST_SPEC"
    # bad references
    jq 'walk(if type == "object" then with_entries(select(.key != "")) else . end)' "$REST_SPEC" | sponge "$REST_SPEC" # remove properties with empty keys
    jq '.components.schemas.OrchestrationRouter.allOf[1].properties.orchestration_path.properties.type.type="string"' "$REST_SPEC" | sponge "$REST_SPEC" # missing type
    jq '.components.schemas.OrchestrationUnrouted.allOf[1].properties.orchestration_path.properties.type.type="string"' "$REST_SPEC" | sponge "$REST_SPEC" # missing type
    jq '.components.schemas.OrchestrationGlobal.allOf[1].properties.orchestration_path.properties.type.type="string"' "$REST_SPEC" | sponge "$REST_SPEC" # missing type
    jq '.components.schemas.ServiceOrchestration.allOf[1].properties.orchestration_path.allOf[1].properties.type.type="string"' "$REST_SPEC" | sponge "$REST_SPEC" # missing type
    jq '.components.schemas += {"ContactMethodType": {"type": "object", "properties": {"type": {"type": "string", "description": "The type of contact method being created.", "enum": ["email_contact_method", "phone_contact_method", "push_notification_contact_method", "sms_contact_method"]}}}}' "$REST_SPEC" | sponge "$REST_SPEC"
    jq '.components.schemas.ContactMethod.allOf[1].properties.type={"$ref": "#/components/schemas/ContactMethodType"}' "$REST_SPEC" | sponge "$REST_SPEC"
    jq '.components.schemas.EmailContactMethod.allOf[1].properties.type={"$ref": "#/components/schemas/ContactMethodType"}' "$REST_SPEC" | sponge "$REST_SPEC"
    jq '.components.schemas.PhoneContactMethod.allOf[1].properties.type={"$ref": "#/components/schemas/ContactMethodType"}' "$REST_SPEC" | sponge "$REST_SPEC"
    jq '.components.schemas.PushContactMethod.allOf[1].properties.type={"$ref": "#/components/schemas/ContactMethodType"}' "$REST_SPEC" | sponge "$REST_SPEC"
    # bad names
    jq '(.components.schemas.ScheduleOverride = .components.schemas.Override) | del(.components.schemas.Override)' "$REST_SPEC" | sponge "$REST_SPEC"
    jq 'walk(if type == "string" and . == "#/components/schemas/Override" then "#/components/schemas/ScheduleOverride" else . end)' "$REST_SPEC" | sponge "$REST_SPEC"
    # replace refs
    references=$(jq -r '.. | objects | select(has("$ref")) | .["$ref"]' "$REST_SPEC" | sort -u)
    for ref in $references; do
      jsonRef=$(echo "$ref" | sed 's/^#//' | tr '/' '.')
      jsonRef=$(echo "$jsonRef" | sed -E 's/(anyOf|allOf|oneOf)\.([0-9]+)/\1[\2]/g')
      jsonRef="${jsonRef/application~1json/"\"application/json\""}"

      if [[ $(grep -o '/' <<< "$ref" | wc -l) -ge 4 && $(grep -o '/' <<< "$ref" | wc -l) -lt 8 ]]; then
          jq --argjson replacement "$(jq "$jsonRef" "$REST_SPEC")" \
                  'walk(if type == "object" and has("$ref") and .["$ref"] == "'"$ref"'" then . = $replacement else . end)' \
                  "$REST_SPEC" | sponge "$REST_SPEC"
      fi
    done
    ;;

  "generate")
    echo "> running code generation"
    docker run -it --rm -v $(pwd):/project ghcr.io/primelib/primecodegen:0.0.1 \
        primecodegen generate \
        -e auto \
        -i "/project/events-v2/openapi.json" \
        -o "/project/events-v2" \
        -c "/project/events-v2/openapi-generator.json" \
        --openapi-normalizer SIMPLIFY_ONEOF_ANYOF=true \
        --openapi-normalizer SIMPLIFY_BOOLEAN_ENUM=true \
        --openapi-normalizer REMOVE_ANYOF_ONEOF_AND_KEEP_PROPERTIES_ONLY=true \
        --openapi-normalizer REFACTOR_ALLOF_WITH_PROPERTIES_ONLY=true \
        --skip-validate-spec

    docker run -it --rm -v $(pwd):/project ghcr.io/primelib/primecodegen:0.0.1 \
        primecodegen generate \
        -e auto \
        -i "/project/rest/openapi.json" \
        -o "/project/rest" \
        -c "/project/rest/openapi-generator.json" \
        --openapi-normalizer SIMPLIFY_ONEOF_ANYOF=true \
        --openapi-normalizer SIMPLIFY_BOOLEAN_ENUM=true \
        --openapi-normalizer REMOVE_ANYOF_ONEOF_AND_KEEP_PROPERTIES_ONLY=true \
        --openapi-normalizer REFACTOR_ALLOF_WITH_PROPERTIES_ONLY=true \
        --skip-validate-spec
    ;;
esac
