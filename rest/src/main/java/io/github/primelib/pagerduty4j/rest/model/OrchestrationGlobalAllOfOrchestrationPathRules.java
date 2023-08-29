package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OrchestrationGlobalAllOfOrchestrationPathRules
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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

    /**
     * Constructs a validated instance of {@link OrchestrationGlobalAllOfOrchestrationPathRules}.
     *
     * @param spec the specification to process
     */
    public OrchestrationGlobalAllOfOrchestrationPathRules(Consumer<OrchestrationGlobalAllOfOrchestrationPathRules> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OrchestrationGlobalAllOfOrchestrationPathRules}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OrchestrationGlobalAllOfOrchestrationPathRules(Consumer)} instead.
     * @param id ID of the rule
     * @param label A description of this rule's purpose.
     * @param conditions Each of these conditions is evaluated to check if an event matches this rule. The rule is considered a match if **any** of these conditions match.
     * @param actions When an event matches this rule, these are the actions that will be taken to change the resulting alert and incident.
     * @param disabled Indicates whether the rule is disabled and would therefore not be evaluated.
     */
    @ApiStatus.Internal
    public OrchestrationGlobalAllOfOrchestrationPathRules(String id, String label, List<OrchestrationGlobalAllOfOrchestrationPathConditions> conditions, Object actions, Boolean disabled) {
        this.id = id;
        this.label = label;
        this.conditions = conditions;
        this.actions = actions;
        this.disabled = disabled;
    }

}
