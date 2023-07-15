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
 * ServiceEventRuleAllOfTimeFrameScheduledWeekly
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "start_time",
    "duration",
    "timezone",
    "weekdays"
})
@JsonTypeName("ServiceEventRule_allOf_time_frame_scheduled_weekly")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceEventRuleAllOfTimeFrameScheduledWeekly {

    /**
     * Constructs a validated implementation of {@link ServiceEventRuleAllOfTimeFrameScheduledWeekly}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ServiceEventRuleAllOfTimeFrameScheduledWeekly(Consumer<ServiceEventRuleAllOfTimeFrameScheduledWeekly> spec) {
        spec.accept(this);
    }

    /**
     * The amount of milliseconds into the day at which the window starts.
     */
    @JsonProperty("start_time")
    protected Integer startTime;

    /**
     * The duration of the window in milliseconds.
     */
    @JsonProperty("duration")
    protected Integer duration;

    /**
     * The timezone.
     */
    @JsonProperty("timezone")
    protected String timezone;

    /**
     * An array of day values. Ex [1, 3, 5] is Monday, Wednesday, Friday.
     */
    @JsonProperty("weekdays")
    protected List<Integer> weekdays = new ArrayList<>();


}
