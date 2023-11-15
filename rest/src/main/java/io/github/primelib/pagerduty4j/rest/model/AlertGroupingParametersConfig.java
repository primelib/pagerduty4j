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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * AlertGroupingParametersConfig
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
    "time_window",
    "recommended_time_window",
    "timeout",
    "aggregate",
    "fields"
})
@JsonTypeName("AlertGroupingParameters_config")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AlertGroupingParametersConfig {

    /**
     * The maximum amount of time allowed between Alerts. Any Alerts arriving greater than {@code time_window} seconds apart will not be grouped together. This is a rolling time window and is counted from the most recently grouped alert. The window is extended every time a new alert is added to the group, up to 24 hours. To use the "recommended_time_window," set the value to 0, otherwise the value must be between 300 and 3600.
     */
    @JsonProperty("time_window")
    protected Integer timeWindow;

    /**
     * In order to ensure your Service has the optimal grouping window, we use data science to calculate your Service's average Alert inter-arrival time. We encourage customer's to use this value, please set {@code time_window} to 0 to use the {@code recommended_time_window}.
     */
    @JsonProperty("recommended_time_window")
    protected Integer recommendedTimeWindow;

    /**
     * The duration in minutes within which to automatically group incoming Alerts.
     * To continue grouping Alerts until the Incident is resolved, set this value to 0.
     */
    @JsonProperty("timeout")
    protected Integer timeout;

    /**
     * Whether Alerts should be grouped if {@code all} or {@code any} specified fields match. If {@code all} is selected, an exact match on every specified field name must occur for Alerts to be grouped. If {@code any} is selected, Alerts will be grouped when there is an exact match on at least one of the specified fields.
     */
    @JsonProperty("aggregate")
    protected AggregateEnum aggregate;

    /**
     * The fields with which to group against. Depending on the aggregate, Alerts will group if some or all the fields match
     */
    @JsonProperty("fields")
    protected List<String> fields;

    /**
     * Constructs a validated instance of {@link AlertGroupingParametersConfig}.
     *
     * @param spec the specification to process
     */
    public AlertGroupingParametersConfig(Consumer<AlertGroupingParametersConfig> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AlertGroupingParametersConfig}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AlertGroupingParametersConfig(Consumer)} instead.
     * @param timeWindow The maximum amount of time allowed between Alerts. Any Alerts arriving greater than {@code time_window} seconds apart will not be grouped together. This is a rolling time window and is counted from the most recently grouped alert. The window is extended every time a new alert is added to the group, up to 24 hours. To use the "recommended_time_window," set the value to 0, otherwise the value must be between 300 and 3600.
     * @param recommendedTimeWindow In order to ensure your Service has the optimal grouping window, we use data science to calculate your Service's average Alert inter-arrival time. We encourage customer's to use this value, please set {@code time_window} to 0 to use the {@code recommended_time_window}.
     * @param timeout The duration in minutes within which to automatically group incoming Alerts.  To continue grouping Alerts until the Incident is resolved, set this value to 0.
     * @param aggregate Whether Alerts should be grouped if {@code all} or {@code any} specified fields match. If {@code all} is selected, an exact match on every specified field name must occur for Alerts to be grouped. If {@code any} is selected, Alerts will be grouped when there is an exact match on at least one of the specified fields.
     * @param fields The fields with which to group against. Depending on the aggregate, Alerts will group if some or all the fields match
     */
    @ApiStatus.Internal
    public AlertGroupingParametersConfig(Integer timeWindow, Integer recommendedTimeWindow, Integer timeout, AggregateEnum aggregate, List<String> fields) {
        this.timeWindow = timeWindow;
        this.recommendedTimeWindow = recommendedTimeWindow;
        this.timeout = timeout;
        this.aggregate = aggregate;
        this.fields = fields;
    }

    /**
     * Whether Alerts should be grouped if {@code all} or {@code any} specified fields match. If {@code all} is selected, an exact match on every specified field name must occur for Alerts to be grouped. If {@code any} is selected, Alerts will be grouped when there is an exact match on at least one of the specified fields.
     */
    @AllArgsConstructor
    public enum AggregateEnum {
        ALL_ANY("all, any");

        private static final AggregateEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static AggregateEnum of(String input) {
            if (input != null) {
                for (AggregateEnum v : VALUES) {
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
