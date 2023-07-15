package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OrchestrationGlobalAllOfOrchestrationPath1SetsInnerRulesInner
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "actions"
})
@JsonTypeName("OrchestrationGlobal_allOf_orchestration_path_1_sets_inner_rules_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationGlobalAllOfOrchestrationPath1SetsInnerRulesInner {

    @JsonProperty("actions")
    private OrchestrationGlobalAllOfOrchestrationPath1SetsInnerRulesInnerActions actions;


}