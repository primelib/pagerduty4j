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
 * GetAnalyticsMetricsIncidentsAll200Response
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
    "aggregate_unit",
    "data"
})
@JsonTypeName("getAnalyticsMetricsIncidentsAll_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetAnalyticsMetricsIncidentsAll200Response {

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

    @JsonProperty("data")
    protected List<AnalyticsIncidentMetrics> data;

    /**
     * Constructs a validated instance of {@link GetAnalyticsMetricsIncidentsAll200Response}.
     *
     * @param spec the specification to process
     */
    public GetAnalyticsMetricsIncidentsAll200Response(Consumer<GetAnalyticsMetricsIncidentsAll200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetAnalyticsMetricsIncidentsAll200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetAnalyticsMetricsIncidentsAll200Response(Consumer)} instead.
     * @param filters var.name
     * @param timeZone The time zone to use for the results and grouping.
     * @param aggregateUnit The time unit to aggregate metrics by.  If no value is provided, the metrics will be aggregated for the entire period.
     * @param data var.name
     */
    @ApiStatus.Internal
    public GetAnalyticsMetricsIncidentsAll200Response(AnalyticsModelFilters filters, String timeZone, AggregateUnitEnum aggregateUnit, List<AnalyticsIncidentMetrics> data) {
        this.filters = filters;
        this.timeZone = timeZone;
        this.aggregateUnit = aggregateUnit;
        this.data = data;
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

        private static final AggregateUnitEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static AggregateUnitEnum of(String input) {
            if (input != null) {
                for (AggregateUnitEnum v : VALUES) {
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
