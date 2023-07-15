package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AuditRecordMethod
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "description",
    "truncated_token",
    "type"
})
@JsonTypeName("AuditRecord_method")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AuditRecordMethod {

    @JsonProperty("description")
    private String description;

    /**
     * Truncated token containing the last 4 chars of the token's actual value.
     */
    @JsonProperty("truncated_token")
    private String truncatedToken;

    /**
     * Describes the method used to perform the action:
     * `browser` -- authenticated user session. Session value is not returned in the `truncated_token` field.
     * `oauth` -- access token obtained via the OAuth flow. Truncated token value is returned in the `truncated_token` field.
     * `api_token` -- Pagerduty API token. Truncated token value is returned in the `truncated_token` field.
     * `identity_provider` -- action performed by an Identity provider on behalf of a user. No value is returned in the `truncated_token` field.
     * `other` -- Method that does not fall in the predefined categories. Truncated token value MAY be returned in the `truncated_token` field. 
     */
    @JsonProperty("type")
    private TypeEnum type;


    /**
     * Describes the method used to perform the action:
     * `browser` -- authenticated user session. Session value is not returned in the `truncated_token` field.
     * `oauth` -- access token obtained via the OAuth flow. Truncated token value is returned in the `truncated_token` field.
     * `api_token` -- Pagerduty API token. Truncated token value is returned in the `truncated_token` field.
     * `identity_provider` -- action performed by an Identity provider on behalf of a user. No value is returned in the `truncated_token` field.
     * `other` -- Method that does not fall in the predefined categories. Truncated token value MAY be returned in the `truncated_token` field. 
     */
    @AllArgsConstructor
    public enum TypeEnum {
        BROWSER("browser"),
        OAUTH("oauth"),
        API_TOKEN("api_token"),
        IDENTITY_PROVIDER("identity_provider"),
        OTHER("other");

        private final String value;
    }

}
