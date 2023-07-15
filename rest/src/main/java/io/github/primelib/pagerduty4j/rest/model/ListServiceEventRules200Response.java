package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.time.OffsetDateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListServiceEventRules200Response
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "offset",
    "limit",
    "more",
    "total",
    "migrated_at",
    "migrated_by",
    "migrated_status",
    "migrated_to",
    "migrated_via",
    "rules"
})
@JsonTypeName("listServiceEventRules_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListServiceEventRules200Response {

    /**
     * Constructs a validated implementation of {@link ListServiceEventRules200Response}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ListServiceEventRules200Response(Consumer<ListServiceEventRules200Response> spec) {
        spec.accept(this);
    }

    /**
     * Echoes offset pagination property.
     */
    @JsonProperty("offset")
    protected Integer offset;

    /**
     * Echoes limit pagination property.
     */
    @JsonProperty("limit")
    protected Integer limit;

    /**
     * Indicates if there are additional records to return
     */
    @JsonProperty("more")
    protected Boolean more;

    /**
     * The total number of records matching the given query.
     */
    @JsonProperty("total")
    protected Integer total;

    /**
     * The date/time the service's Event Rules were converted to a Service Orchestration. This property is only included if the `migrated_metadata` query parameter is provided.
     */
    @JsonProperty("migrated_at")
    protected OffsetDateTime migratedAt;

    @JsonProperty("migrated_by")
    protected ListServiceEventRules200ResponseAllOfMigratedBy migratedBy;

    /**
     * The status indicating whether the service's Event Rules were successfully converted to a Service Orchestration. This property is only included if the `migrated_metadata` query parameter is provided.
     */
    @JsonProperty("migrated_status")
    protected MigratedStatusEnum migratedStatus;

    @JsonProperty("migrated_to")
    protected ListServiceEventRules200ResponseAllOfMigratedTo migratedTo;

    /**
     * Indicates whether the conversion was performed via the PagerDuty API or PagerDuty website. This property is only included if the `migrated_metadata` query parameter is provided.
     */
    @JsonProperty("migrated_via")
    protected MigratedViaEnum migratedVia;

    /**
     * The paginated list of Event Rules of the Service.
     */
    @JsonProperty("rules")
    protected List<ServiceEventRule> rules;


    /**
     * The status indicating whether the service's Event Rules were successfully converted to a Service Orchestration. This property is only included if the `migrated_metadata` query parameter is provided.
     */
    @AllArgsConstructor
    public enum MigratedStatusEnum {
        COMPLETED("completed");

        private final String value;
    }

    /**
     * Indicates whether the conversion was performed via the PagerDuty API or PagerDuty website. This property is only included if the `migrated_metadata` query parameter is provided.
     */
    @AllArgsConstructor
    public enum MigratedViaEnum {
        API("API"),
        UI("UI");

        private final String value;
    }

}
