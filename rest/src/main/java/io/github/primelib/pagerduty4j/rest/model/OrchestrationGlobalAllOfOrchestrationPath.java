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
 * OrchestrationGlobalAllOfOrchestrationPath
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "type",
    "parent",
    "sets",
    "catch_all",
    "created_at",
    "created_by",
    "updated_at",
    "updated_by",
    "version"
})
@JsonTypeName("OrchestrationGlobal_allOf_orchestration_path")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationGlobalAllOfOrchestrationPath {

    @JsonProperty("type")
    private String type = "service";

    @JsonProperty("parent")
    private OrchestrationGlobalAllOfOrchestrationPathParent parent;

    /**
     * Must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph of rules.
     */
    @JsonProperty("sets")
    private List<OrchestrationGlobalAllOfOrchestrationPathSets> sets;

    @JsonProperty("catch_all")
    private OrchestrationGlobalAllOfOrchestrationPathCatchAll catchAll;

    /**
     * The date/time the object was created.
     */
    @JsonProperty("created_at")
    private OffsetDateTime createdAt;

    @JsonProperty("created_by")
    private OrchestrationGlobalAllOfOrchestrationPathCreatedBy createdBy;

    /**
     * The date/time the object was last updated.
     */
    @JsonProperty("updated_at")
    private OffsetDateTime updatedAt;

    @JsonProperty("updated_by")
    private OrchestrationGlobalAllOfOrchestrationPathUpdatedBy updatedBy;

    /**
     * Version of these Orchestration Rules
     */
    @JsonProperty("version")
    private String version;


}
