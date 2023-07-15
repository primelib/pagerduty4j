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
 * EventRuleActionsCommonSuppress
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "value",
    "threshold_value",
    "threshold_time_unit",
    "threshold_time_amount"
})
@JsonTypeName("EventRuleActionsCommon_suppress")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EventRuleActionsCommonSuppress {

    /**
     * Constructs a validated implementation of {@link EventRuleActionsCommonSuppress}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public EventRuleActionsCommonSuppress(Consumer<EventRuleActionsCommonSuppress> spec) {
        spec.accept(this);
    }

    @JsonProperty("value")
    protected Boolean value;

    /**
     * The number of occurences needed during the window of time to trigger the theshold.
     */
    @JsonProperty("threshold_value")
    protected Integer thresholdValue;

    /**
     * The time unit for the window of time.
     */
    @JsonProperty("threshold_time_unit")
    protected ThresholdTimeUnitEnum thresholdTimeUnit;

    /**
     * The amount of time units for the window of time.
     */
    @JsonProperty("threshold_time_amount")
    protected Integer thresholdTimeAmount;


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
