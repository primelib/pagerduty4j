package io.github.primelib.pagerduty4j.rest.model;

import java.util.List;
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
    "order",
    "order_by",
    "aggregate_unit"
})
@JsonTypeName("AnalyticsModel")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AnalyticsModel {

    @JsonProperty("filters")
    protected AnalyticsModelFilters filters;

    /**
     * The time zone to use for the results and grouping. Must be in tzdata format. See list of accepted values [here](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones).
     */
    @JsonProperty("time_zone")
    protected String timeZone;

    /**
     * The order in which the results were sorted; asc for ascending, desc for descending.
     */
    @JsonProperty("order")
    protected OrderEnum order;

    /**
     * The column that was used for ordering the results.
     */
    @JsonProperty("order_by")
    protected String orderBy;

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
     * @param filters filters
     * @param timeZone The time zone to use for the results and grouping. Must be in tzdata format. See list of accepted values [here](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones).
     * @param order The order in which the results were sorted; asc for ascending, desc for descending.
     * @param orderBy The column that was used for ordering the results.
     * @param aggregateUnit The time unit to aggregate metrics by.  If no value is provided, the metrics will be aggregated for the entire period.
     */
    @ApiStatus.Internal
    public AnalyticsModel(AnalyticsModelFilters filters, String timeZone, OrderEnum order, String orderBy, AggregateUnitEnum aggregateUnit) {
        this.filters = filters;
        this.timeZone = timeZone;
        this.order = order;
        this.orderBy = orderBy;
        this.aggregateUnit = aggregateUnit;
    }

    /**
     * The order in which the results were sorted; asc for ascending, desc for descending.
     */
    @AllArgsConstructor
    public enum OrderEnum {
        ASC("asc"),
        DESC("desc");

        private static final OrderEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static OrderEnum of(String input) {
            if (input != null) {
                for (OrderEnum v : VALUES) {
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
