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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ServiceEventRuleAllOfTimeFrame
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
    "active_between",
    "scheduled_weekly"
})
@JsonTypeName("ServiceEventRule_allOf_time_frame")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceEventRuleAllOfTimeFrame {

    @JsonProperty("active_between")
    protected ServiceEventRuleAllOfTimeFrameActiveBetween activeBetween;

    @JsonProperty("scheduled_weekly")
    protected ServiceEventRuleAllOfTimeFrameScheduledWeekly scheduledWeekly;

    /**
     * Constructs a validated instance of {@link ServiceEventRuleAllOfTimeFrame}.
     *
     * @param spec the specification to process
     */
    public ServiceEventRuleAllOfTimeFrame(Consumer<ServiceEventRuleAllOfTimeFrame> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ServiceEventRuleAllOfTimeFrame}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ServiceEventRuleAllOfTimeFrame(Consumer)} instead.
     * @param activeBetween activeBetween
     * @param scheduledWeekly scheduledWeekly
     */
    @ApiStatus.Internal
    public ServiceEventRuleAllOfTimeFrame(ServiceEventRuleAllOfTimeFrameActiveBetween activeBetween, ServiceEventRuleAllOfTimeFrameScheduledWeekly scheduledWeekly) {
        this.activeBetween = activeBetween;
        this.scheduledWeekly = scheduledWeekly;
    }

}
