package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OrchestrationRouterAllOfOrchestrationPathSetsInnerRulesInnerActions
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "route_to"
})
@JsonTypeName("OrchestrationRouter_allOf_orchestration_path_sets_inner_rules_inner_actions")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationRouterAllOfOrchestrationPathSetsInnerRulesInnerActions {

    /**
     * The ID of the target Service for the resulting alert. You can find the service you want to route to by calling the services endpoint.
     */
    @JsonProperty("route_to")
    private String routeTo;


}
