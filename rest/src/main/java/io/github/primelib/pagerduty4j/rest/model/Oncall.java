package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

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
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link Oncall}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Oncall(Consumer<Oncall> spec) {
        spec.accept(this);
    }

    @JsonProperty("escalation_policy")
    protected EscalationPolicyReference escalationPolicy;

    @JsonProperty("user")
    protected UserReference user;

    @JsonProperty("schedule")
    protected ScheduleReference schedule;

    /**
     * The escalation level for the on-call.
     */
    @JsonProperty("escalation_level")
    protected Integer escalationLevel;

    /**
     * The start of the on-call. If `null`, the on-call is a permanent user on-call.
     */
    @JsonProperty("start")
    protected OffsetDateTime start;

    /**
     * The end of the on-call. If `null`, the user does not go off-call.
     */
    @JsonProperty("end")
    protected OffsetDateTime end;


}
