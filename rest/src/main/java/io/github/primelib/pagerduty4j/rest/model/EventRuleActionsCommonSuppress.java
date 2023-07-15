package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EventRuleActionsCommonSuppress
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "value",
    "threshold_value",
    "threshold_time_unit",
    "threshold_time_amount"
})
@JsonTypeName("EventRuleActionsCommon_suppress")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EventRuleActionsCommonSuppress {

    @JsonProperty("value")
    private Boolean value;

    /**
     * The number of occurences needed during the window of time to trigger the theshold.
     */
    @JsonProperty("threshold_value")
    private Integer thresholdValue;

    /**
     * The time unit for the window of time.
     */
    @JsonProperty("threshold_time_unit")
    private ThresholdTimeUnitEnum thresholdTimeUnit;

    /**
     * The amount of time units for the window of time.
     */
    @JsonProperty("threshold_time_amount")
    private Integer thresholdTimeAmount;


    /**
     * The time unit for the window of time.
     */
    @AllArgsConstructor
    public enum ThresholdTimeUnitEnum {
        SECONDS("seconds"),
        MINUTES("minutes"),
        HOURS("hours");

        private final String value;
    }

}
