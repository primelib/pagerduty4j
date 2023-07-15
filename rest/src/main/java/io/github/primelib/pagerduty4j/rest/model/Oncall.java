package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Oncall
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "escalation_policy",
    "user",
    "schedule",
    "escalation_level",
    "start",
    "end"
})
@JsonTypeName("Oncall")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Oncall {

    @JsonProperty("escalation_policy")
    private EscalationPolicyReference escalationPolicy;

    @JsonProperty("user")
    private UserReference user;

    @JsonProperty("schedule")
    private ScheduleReference schedule;

    /**
     * The escalation level for the on-call.
     */
    @JsonProperty("escalation_level")
    private Integer escalationLevel;

    /**
     * The start of the on-call. If `null`, the on-call is a permanent user on-call.
     */
    @JsonProperty("start")
    private OffsetDateTime start;

    /**
     * The end of the on-call. If `null`, the user does not go off-call.
     */
    @JsonProperty("end")
    private OffsetDateTime end;


}
