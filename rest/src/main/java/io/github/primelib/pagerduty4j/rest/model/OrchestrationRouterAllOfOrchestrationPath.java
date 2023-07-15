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
 * OrchestrationRouterAllOfOrchestrationPath
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
@JsonTypeName("OrchestrationRouter_allOf_orchestration_path")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationRouterAllOfOrchestrationPath {

    /**
     * Indicates that these are a "router" type set of rules.
     */
    @JsonProperty("type")
    private String type = "router";

    @JsonProperty("parent")
    private OrchestrationRouterAllOfOrchestrationPathParent parent;

    /**
     * The Router contains a single set of rules (the "start" set). The Router evaluates Events against these Rules, one at a time, and routes each Event to a specific Service based on the first rule that matches.
     */
    @JsonProperty("sets")
    private List<OrchestrationRouterAllOfOrchestrationPathSetsInner> sets;

    @JsonProperty("catch_all")
    private OrchestrationRouterAllOfOrchestrationPathCatchAll catchAll;


}
