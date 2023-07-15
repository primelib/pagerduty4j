package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ServiceOrchestrationAllOfOrchestrationPath
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "migrated_at",
    "migrated_by",
    "migrated_from",
    "migrated_status",
    "migrated_via",
    "type",
    "parent",
    "sets",
    "catch_all"
})
@JsonTypeName("ServiceOrchestration_allOf_orchestration_path")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceOrchestrationAllOfOrchestrationPath {

    /**
     * The date/time the service's Event Rules were converted to this Service Orchestration. This property is only included if the `migrated_metadata` query parameter is provided.
     */
    @JsonProperty("migrated_at")
    private OffsetDateTime migratedAt;

    @JsonProperty("migrated_by")
    private ServiceOrchestrationAllOfOrchestrationPathAllOfMigratedBy migratedBy;

    @JsonProperty("migrated_from")
    private ServiceOrchestrationAllOfOrchestrationPathAllOfMigratedFrom migratedFrom;

    /**
     * The status indicating whether the service's Event Rules were successfully converted to this Service Orchestration. This property is only included if the `migrated_metadata` query parameter is provided.
     */
    @JsonProperty("migrated_status")
    private MigratedStatusEnum migratedStatus;

    /**
     * Indicates whether the conversion was performed via the PagerDuty API or PagerDuty website. This property is only included if the `migrated_metadata` query parameter is provided.
     */
    @JsonProperty("migrated_via")
    private MigratedViaEnum migratedVia;

    /**
     * Indicates that these are sets of rules belonging to a service.
     */
    @JsonProperty("type")
    private String type = "service";

    @JsonProperty("parent")
    private ServiceOrchestrationAllOfOrchestrationPathAllOfParent parent;

    /**
     * A Service Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
     */
    @JsonProperty("sets")
    private List<ServiceOrchestrationAllOfOrchestrationPathAllOfSetsInner> sets;

    @JsonProperty("catch_all")
    private ServiceOrchestrationAllOfOrchestrationPathAllOfCatchAll catchAll;


    /**
     * The status indicating whether the service's Event Rules were successfully converted to this Service Orchestration. This property is only included if the `migrated_metadata` query parameter is provided.
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
