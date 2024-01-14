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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * EscalationRule
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
    "escalation_delay_in_minutes",
    "targets",
    "escalation_rule_assignment_strategy"
})
@JsonTypeName("EscalationRule")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EscalationRule {

    @JsonProperty("id")
    protected String id;

    /**
     * The number of minutes before an unacknowledged incident escalates away from this rule.
     */
    @JsonProperty("escalation_delay_in_minutes")
    protected Integer escalationDelayInMinutes;

    /**
     * The targets an incident should be assigned to upon reaching this rule.
     */
    @JsonProperty("targets")
    protected List<EscalationTargetReference> targets;

    /**
     * The strategy used to assign the escalation rule to an incident.
     */
    @JsonProperty("escalation_rule_assignment_strategy")
    protected EscalationRuleAssignmentStrategyEnum escalationRuleAssignmentStrategy;

    /**
     * Constructs a validated instance of {@link EscalationRule}.
     *
     * @param spec the specification to process
     */
    public EscalationRule(Consumer<EscalationRule> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link EscalationRule}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #EscalationRule(Consumer)} instead.
     * @param id id
     * @param escalationDelayInMinutes The number of minutes before an unacknowledged incident escalates away from this rule.
     * @param targets The targets an incident should be assigned to upon reaching this rule.
     * @param escalationRuleAssignmentStrategy The strategy used to assign the escalation rule to an incident.
     */
    @ApiStatus.Internal
    public EscalationRule(String id, Integer escalationDelayInMinutes, List<EscalationTargetReference> targets, EscalationRuleAssignmentStrategyEnum escalationRuleAssignmentStrategy) {
        this.id = id;
        this.escalationDelayInMinutes = escalationDelayInMinutes;
        this.targets = targets;
        this.escalationRuleAssignmentStrategy = escalationRuleAssignmentStrategy;
    }

    /**
     * The strategy used to assign the escalation rule to an incident.
     */
    @AllArgsConstructor
    public enum EscalationRuleAssignmentStrategyEnum {
        ROUND_ROBIN("round_robin"),
        ASSIGN_TO_EVERYONE("assign_to_everyone");

        private static final EscalationRuleAssignmentStrategyEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static EscalationRuleAssignmentStrategyEnum of(String input) {
            if (input != null) {
                for (EscalationRuleAssignmentStrategyEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
