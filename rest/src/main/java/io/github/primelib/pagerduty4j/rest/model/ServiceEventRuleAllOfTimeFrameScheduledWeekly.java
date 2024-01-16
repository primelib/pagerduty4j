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
 * ServiceEventRuleAllOfTimeFrameScheduledWeekly
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
    "start_time",
    "duration",
    "timezone",
    "weekdays"
})
@JsonTypeName("ServiceEventRule_allOf_time_frame_scheduled_weekly")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceEventRuleAllOfTimeFrameScheduledWeekly {

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
    protected List<Integer> weekdays;

    /**
     * Constructs a validated instance of {@link ServiceEventRuleAllOfTimeFrameScheduledWeekly}.
     *
     * @param spec the specification to process
     */
    public ServiceEventRuleAllOfTimeFrameScheduledWeekly(Consumer<ServiceEventRuleAllOfTimeFrameScheduledWeekly> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ServiceEventRuleAllOfTimeFrameScheduledWeekly}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ServiceEventRuleAllOfTimeFrameScheduledWeekly(Consumer)} instead.
     * @param startTime The amount of milliseconds into the day at which the window starts.
     * @param duration The duration of the window in milliseconds.
     * @param timezone The timezone.
     * @param weekdays An array of day values. Ex [1, 3, 5] is Monday, Wednesday, Friday.
     */
    @ApiStatus.Internal
    public ServiceEventRuleAllOfTimeFrameScheduledWeekly(Integer startTime, Integer duration, String timezone, List<Integer> weekdays) {
        this.startTime = startTime;
        this.duration = duration;
        this.timezone = timezone;
        this.weekdays = weekdays;
    }

}
