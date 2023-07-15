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
 * OrchestrationGlobalAllOfOrchestrationPathRules
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "id",
    "label",
    "conditions",
    "actions",
    "disabled"
})
@JsonTypeName("OrchestrationGlobal_allOf_orchestration_path_rules")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationGlobalAllOfOrchestrationPathRules {

    /**
     * ID of the rule
     */
    @JsonProperty("id")
    private String id;

    /**
     * A description of this rule's purpose.
     */
    @JsonProperty("label")
    private String label;

    /**
     * Each of these conditions is evaluated to check if an event matches this rule. The rule is considered a match if **any** of these conditions match.
     */
    @JsonProperty("conditions")
    private List<OrchestrationGlobalAllOfOrchestrationPathConditions> conditions;

    /**
     * When an event matches this rule, these are the actions that will be taken to change the resulting alert and incident.
     */
    @JsonProperty("actions")
    private Object actions;

    /**
     * Indicates whether the rule is disabled and would therefore not be evaluated.
     */
    @JsonProperty("disabled")
    private Boolean disabled;


}
