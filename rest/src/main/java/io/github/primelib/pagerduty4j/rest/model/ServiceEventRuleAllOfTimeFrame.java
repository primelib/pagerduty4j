package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ServiceEventRuleAllOfTimeFrame
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "active_between",
    "scheduled_weekly"
})
@JsonTypeName("ServiceEventRule_allOf_time_frame")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceEventRuleAllOfTimeFrame {

    @JsonProperty("active_between")
    private ServiceEventRuleAllOfTimeFrameActiveBetween activeBetween;

    @JsonProperty("scheduled_weekly")
    private ServiceEventRuleAllOfTimeFrameScheduledWeekly scheduledWeekly;


}
