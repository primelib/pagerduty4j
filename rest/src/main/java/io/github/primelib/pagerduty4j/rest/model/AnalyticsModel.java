package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AnalyticsModel
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "filters",
    "time_zone",
    "aggregate_unit"
})
@JsonTypeName("AnalyticsModel")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AnalyticsModel {

    @JsonProperty("filters")
    private AnalyticsModelFilters filters;

    /**
     * The time zone to use for the results and grouping.
     */
    @JsonProperty("time_zone")
    private String timeZone;

    /**
     * The time unit to aggregate metrics by.
     * If no value is provided, the metrics will be aggregated for the entire period.
     */
    @JsonProperty("aggregate_unit")
    private AggregateUnitEnum aggregateUnit;


    /**
     * The time unit to aggregate metrics by.
     * If no value is provided, the metrics will be aggregated for the entire period.
     */
    @AllArgsConstructor
    public enum AggregateUnitEnum {
        DAY("day"),
        WEEK("week"),
        MONTH("month");

        private final String value;
    }

}
