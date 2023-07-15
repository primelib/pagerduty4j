package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ServiceEventRuleAllOfTimeFrameActiveBetween
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "start_time",
    "end_time"
})
@JsonTypeName("ServiceEventRule_allOf_time_frame_active_between")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceEventRuleAllOfTimeFrameActiveBetween {

    /**
     * The start time in milliseconds.
     */
    @JsonProperty("start_time")
    private Integer startTime;

    /**
     * End time in milliseconds.
     */
    @JsonProperty("end_time")
    private Integer endTime;


}
