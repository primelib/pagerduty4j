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
 * OrchestrationGlobalAllOfOrchestrationPathSets
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "id",
    "rules"
})
@JsonTypeName("OrchestrationGlobal_allOf_orchestration_path_sets")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationGlobalAllOfOrchestrationPathSets {

    /**
     * The ID of this set of rules. Rules in other sets can route events into this set using the "route_to" properties.
     */
    @JsonProperty("id")
    private String id = "start";

    @JsonProperty("rules")
    private List<OrchestrationGlobalAllOfOrchestrationPathRules> rules;


}
