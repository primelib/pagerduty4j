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
 * ServiceEventRuleAllOfTimeFrameScheduledWeekly
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private Integer startTime;

    /**
     * The duration of the window in milliseconds.
     */
    @JsonProperty("duration")
    private Integer duration;

    /**
     * The timezone.
     */
    @JsonProperty("timezone")
    private String timezone;

    /**
     * An array of day values. Ex [1, 3, 5] is Monday, Wednesday, Friday.
     */
    @JsonProperty("weekdays")
    private List<Integer> weekdays = new ArrayList<>();


}
