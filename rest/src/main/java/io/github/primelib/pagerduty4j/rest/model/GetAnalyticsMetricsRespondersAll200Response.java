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
 * GetAnalyticsMetricsRespondersAll200Response
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
    "data"
})
@JsonTypeName("getAnalyticsMetricsRespondersAll_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetAnalyticsMetricsRespondersAll200Response {

    @JsonProperty("filters")
    protected AnalyticsResponderFilterFilters filters;

    /**
     * The time zone to use for the results and grouping.
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

    @JsonProperty("data")
    protected List<AnalyticsResponderMetrics> data;

    /**
     * Constructs a validated instance of {@link GetAnalyticsMetricsRespondersAll200Response}.
     *
     * @param spec the specification to process
     */
    public GetAnalyticsMetricsRespondersAll200Response(Consumer<GetAnalyticsMetricsRespondersAll200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetAnalyticsMetricsRespondersAll200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetAnalyticsMetricsRespondersAll200Response(Consumer)} instead.
     * @param filters filters
     * @param timeZone The time zone to use for the results and grouping.
     * @param order The order in which the results were sorted; asc for ascending, desc for descending.
     * @param orderBy The column that was used for ordering the results.
     * @param data data
     */
    @ApiStatus.Internal
    public GetAnalyticsMetricsRespondersAll200Response(AnalyticsResponderFilterFilters filters, String timeZone, OrderEnum order, String orderBy, List<AnalyticsResponderMetrics> data) {
        this.filters = filters;
        this.timeZone = timeZone;
        this.order = order;
        this.orderBy = orderBy;
        this.data = data;
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

}
