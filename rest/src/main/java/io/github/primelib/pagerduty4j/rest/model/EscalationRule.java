package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
@JsonPropertyOrder({
    "id",
    "escalation_delay_in_minutes",
    "targets"
})
@JsonTypeName("EscalationRule")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EscalationRule {

    @JsonProperty("id")
    private String id;

    /**
     * The number of minutes before an unacknowledged incident escalates away from this rule.
     */
    @JsonProperty("escalation_delay_in_minutes")
    private Integer escalationDelayInMinutes;

    /**
     * The targets an incident should be assigned to upon reaching this rule.
     */
    @JsonProperty("targets")
    private List<EscalationTargetReference> targets = new ArrayList<>();


}
