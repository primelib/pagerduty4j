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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * EventRuleActionsCommonSuppress
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
    "value",
    "threshold_value",
    "threshold_time_unit",
    "threshold_time_amount"
})
@JsonTypeName("EventRuleActionsCommon_suppress")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EventRuleActionsCommonSuppress {

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
     * Constructs a validated instance of {@link EventRuleActionsCommonSuppress}.
     *
     * @param spec the specification to process
     */
    public EventRuleActionsCommonSuppress(Consumer<EventRuleActionsCommonSuppress> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link EventRuleActionsCommonSuppress}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #EventRuleActionsCommonSuppress(Consumer)} instead.
     * @param value var.name
     * @param thresholdValue The number of occurences needed during the window of time to trigger the theshold.
     * @param thresholdTimeUnit The time unit for the window of time.
     * @param thresholdTimeAmount The amount of time units for the window of time.
     */
    @ApiStatus.Internal
    public EventRuleActionsCommonSuppress(Boolean value, Integer thresholdValue, ThresholdTimeUnitEnum thresholdTimeUnit, Integer thresholdTimeAmount) {
        this.value = value;
        this.thresholdValue = thresholdValue;
        this.thresholdTimeUnit = thresholdTimeUnit;
        this.thresholdTimeAmount = thresholdTimeAmount;
    }

    /**
     * The time unit for the window of time.
     */
    @AllArgsConstructor
    public enum ThresholdTimeUnitEnum {
        SECONDS("seconds"),
        MINUTES("minutes"),
        HOURS("hours");

        private static final ThresholdTimeUnitEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static ThresholdTimeUnitEnum of(String input) {
            if (input != null) {
                for (ThresholdTimeUnitEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
