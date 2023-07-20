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

/**
 * AnalyticsModel
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
    "filters",
    "time_zone",
    "aggregate_unit"
})
@JsonTypeName("AnalyticsModel")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AnalyticsModel {

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
     * Constructs a validated instance of {@link AnalyticsModel}.
     *
     * @param spec the specification to process
     */
    public AnalyticsModel(Consumer<AnalyticsModel> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AnalyticsModel}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AnalyticsModel(Consumer)} instead.
     * @param filters var.name
     * @param timeZone The time zone to use for the results and grouping.
     * @param aggregateUnit The time unit to aggregate metrics by.  If no value is provided, the metrics will be aggregated for the entire period.
     */
    @ApiStatus.Internal
    public AnalyticsModel(AnalyticsModelFilters filters, String timeZone, AggregateUnitEnum aggregateUnit) {
        this.filters = filters;
        this.timeZone = timeZone;
        this.aggregateUnit = aggregateUnit;
    }

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
