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
 * OrchestrationGlobalAllOfOrchestrationPath1
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
@JsonTypeName("OrchestrationGlobal_allOf_orchestration_path_1")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationGlobalAllOfOrchestrationPath1 {

    /**
     * Indicates that these are a set of "global" rules.
     */
    @JsonProperty("type")
    private String type = "global";

    @JsonProperty("parent")
    private OrchestrationGlobalAllOfOrchestrationPath1Parent parent;

    /**
     * You must define at least a "start" set, but you can also define any number of additional sets that are routed to by other rules to form a directional graph.
     */
    @JsonProperty("sets")
    private List<OrchestrationGlobalAllOfOrchestrationPath1SetsInner> sets;

    @JsonProperty("catch_all")
    private OrchestrationGlobalAllOfOrchestrationPath1CatchAll catchAll;


}
