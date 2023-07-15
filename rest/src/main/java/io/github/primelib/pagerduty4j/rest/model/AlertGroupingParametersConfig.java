package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AlertGroupingParametersConfig
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
     * The maximum amount of time allowed between Alerts. Any Alerts arriving greater than `time_window` seconds apart will not be grouped together. This is a rolling time window and is counted from the most recently grouped alert. The window is extended every time a new alert is added to the group, up to 24 hours. To use the "recommended_time_window," set the value to 0, otherwise the value must be between 300 and 3600.
     */
    @JsonProperty("time_window")
    private Integer timeWindow;

    /**
     * In order to ensure your Service has the optimal grouping window, we use data science to calculate your Service's average Alert inter-arrival time. We encourage customer's to use this value, please set `time_window` to 0 to use the `recommended_time_window`.
     */
    @JsonProperty("recommended_time_window")
    private Integer recommendedTimeWindow;

    /**
     * The duration in minutes within which to automatically group incoming Alerts.
     * To continue grouping Alerts until the Incident is resolved, set this value to 0.
     */
    @JsonProperty("timeout")
    private Integer timeout;

    /**
     * Whether Alerts should be grouped if `all` or `any` specified fields match. If `all` is selected, an exact match on every specified field name must occur for Alerts to be grouped. If `any` is selected, Alerts will be grouped when there is an exact match on at least one of the specified fields.
     */
    @JsonProperty("aggregate")
    private AggregateEnum aggregate;

    /**
     * The fields with which to group against. Depending on the aggregate, Alerts will group if some or all the fields match
     */
    @JsonProperty("fields")
    private List fields = null;


    /**
     * Whether Alerts should be grouped if `all` or `any` specified fields match. If `all` is selected, an exact match on every specified field name must occur for Alerts to be grouped. If `any` is selected, Alerts will be grouped when there is an exact match on at least one of the specified fields.
     */
    @AllArgsConstructor
    public enum AggregateEnum {
        ALL_ANY("all, any");

        private final String value;
    }

}
