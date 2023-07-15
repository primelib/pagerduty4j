package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ServiceEventRuleAllOfTimeFrame
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "active_between",
    "scheduled_weekly"
})
@JsonTypeName("ServiceEventRule_allOf_time_frame")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceEventRuleAllOfTimeFrame {

    /**
     * Constructs a validated implementation of {@link ServiceEventRuleAllOfTimeFrame}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ServiceEventRuleAllOfTimeFrame(Consumer<ServiceEventRuleAllOfTimeFrame> spec) {
        spec.accept(this);
    }

    @JsonProperty("active_between")
    protected ServiceEventRuleAllOfTimeFrameActiveBetween activeBetween;

    @JsonProperty("scheduled_weekly")
    protected ServiceEventRuleAllOfTimeFrameScheduledWeekly scheduledWeekly;


}
