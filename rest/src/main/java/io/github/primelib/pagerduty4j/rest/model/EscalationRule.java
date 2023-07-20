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
    "targets"
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
     * @param id var.name
     * @param escalationDelayInMinutes The number of minutes before an unacknowledged incident escalates away from this rule.
     * @param targets The targets an incident should be assigned to upon reaching this rule.
     */
    @ApiStatus.Internal
    public EscalationRule(String id, Integer escalationDelayInMinutes, List<EscalationTargetReference> targets) {
        this.id = id;
        this.escalationDelayInMinutes = escalationDelayInMinutes;
        this.targets = targets;
    }

}
