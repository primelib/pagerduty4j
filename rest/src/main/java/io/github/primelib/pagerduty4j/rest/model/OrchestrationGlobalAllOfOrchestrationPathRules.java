package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

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
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link OrchestrationGlobalAllOfOrchestrationPathRules}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public OrchestrationGlobalAllOfOrchestrationPathRules(Consumer<OrchestrationGlobalAllOfOrchestrationPathRules> spec) {
        spec.accept(this);
    }

    /**
     * ID of the rule
     */
    @JsonProperty("id")
    protected String id;

    /**
     * A description of this rule's purpose.
     */
    @JsonProperty("label")
    protected String label;

    /**
     * Each of these conditions is evaluated to check if an event matches this rule. The rule is considered a match if **any** of these conditions match.
     */
    @JsonProperty("conditions")
    protected List<OrchestrationGlobalAllOfOrchestrationPathConditions> conditions;

    /**
     * When an event matches this rule, these are the actions that will be taken to change the resulting alert and incident.
     */
    @JsonProperty("actions")
    protected Object actions;

    /**
     * Indicates whether the rule is disabled and would therefore not be evaluated.
     */
    @JsonProperty("disabled")
    protected Boolean disabled;


}
