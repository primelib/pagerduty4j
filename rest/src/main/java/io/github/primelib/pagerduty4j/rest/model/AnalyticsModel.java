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
 * AnalyticsModel
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "filters",
    "time_zone",
    "aggregate_unit"
})
@JsonTypeName("AnalyticsModel")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AnalyticsModel {

    /**
     * Constructs a validated implementation of {@link AnalyticsModel}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AnalyticsModel(Consumer<AnalyticsModel> spec) {
        spec.accept(this);
    }

    @JsonProperty("filters")
    protected AnalyticsModelFilters filters;

    /**
     * The time zone to use for the results and grouping.
     */
    @JsonProperty("time_zone")
    protected String timeZone;

    /**
     * The time unit to aggregate metrics by.
     * If no value is provided, the metrics will be aggregated for the entire period.
     */
    @JsonProperty("aggregate_unit")
    protected AggregateUnitEnum aggregateUnit;


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
