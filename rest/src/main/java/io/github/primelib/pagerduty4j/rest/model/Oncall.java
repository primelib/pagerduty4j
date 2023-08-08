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

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Oncall
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
     * The start of the on-call. If {@code null}, the on-call is a permanent user on-call.
     */
    @JsonProperty("start")
    protected OffsetDateTime start;

    /**
     * The end of the on-call. If {@code null}, the user does not go off-call.
     */
    @JsonProperty("end")
    protected OffsetDateTime end;

    /**
     * Constructs a validated instance of {@link Oncall}.
     *
     * @param spec the specification to process
     */
    public Oncall(Consumer<Oncall> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Oncall}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Oncall(Consumer)} instead.
     * @param escalationPolicy escalationPolicy
     * @param user user
     * @param schedule schedule
     * @param escalationLevel The escalation level for the on-call.
     * @param start The start of the on-call. If {@code null}, the on-call is a permanent user on-call.
     * @param end The end of the on-call. If {@code null}, the user does not go off-call.
     */
    @ApiStatus.Internal
    public Oncall(EscalationPolicyReference escalationPolicy, UserReference user, ScheduleReference schedule, Integer escalationLevel, OffsetDateTime start, OffsetDateTime end) {
        this.escalationPolicy = escalationPolicy;
        this.user = user;
        this.schedule = schedule;
        this.escalationLevel = escalationLevel;
        this.start = start;
        this.end = end;
    }

}
