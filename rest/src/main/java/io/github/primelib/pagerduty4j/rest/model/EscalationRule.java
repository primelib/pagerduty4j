package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EscalationRule
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "escalation_delay_in_minutes",
    "targets"
})
@JsonTypeName("EscalationRule")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EscalationRule {

    /**
     * Constructs a validated implementation of {@link EscalationRule}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public EscalationRule(Consumer<EscalationRule> spec) {
        spec.accept(this);
    }

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
    protected List<EscalationTargetReference> targets = new ArrayList<>();


}
