package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OrchestrationUnroutedAllOfOrchestrationPath
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "type",
    "parent",
    "sets",
    "catch_all"
})
@JsonTypeName("OrchestrationUnrouted_allOf_orchestration_path")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationUnroutedAllOfOrchestrationPath {

    /**
     * Indicates that these are a "unrouted" type set of rules.
     */
    @JsonProperty("type")
    private String type = "unrouted";

    @JsonProperty("parent")
    private OrchestrationUnroutedAllOfOrchestrationPathParent parent;

    /**
     * An Unrouted Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
     */
    @JsonProperty("sets")
    private List<OrchestrationUnroutedAllOfOrchestrationPathSetsInner> sets;

    @JsonProperty("catch_all")
    private OrchestrationUnroutedAllOfOrchestrationPathCatchAll catchAll;


}
