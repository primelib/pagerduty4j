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
 * GetAnalyticsResponderIncidents200Response
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
    "first",
    "last",
    "responder_id",
    "limit",
    "order",
    "order_by",
    "time_zone",
    "filters",
    "data"
})
@JsonTypeName("getAnalyticsResponderIncidents_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetAnalyticsResponderIncidents200Response {

    /**
     * Cursor to identify the first object in the response.
     */
    @JsonProperty("first")
    protected String first;

    /**
     * Cursor to identify the last object in the response.
     */
    @JsonProperty("last")
    protected String last;

    /**
     * The Responder ID passed into the request.
     */
    @JsonProperty("responder_id")
    protected String responderId;

    /**
     * Number of results to include in the batch.
     */
    @JsonProperty("limit")
    protected Integer limit;

    /**
     * The order in which the results were sorted; asc for ascending, desc for descending.
     */
    @JsonProperty("order")
    protected OrderEnum order;

    /**
     * The column that was used for ordering the results.
     */
    @JsonProperty("order_by")
    protected OrderByEnum orderBy;

    /**
     * The time zone that the results are in.
     */
    @JsonProperty("time_zone")
    protected String timeZone;

    @JsonProperty("filters")
    protected GetAnalyticsIncidents200ResponseFilters filters;

    @JsonProperty("data")
    protected List<AnalyticsRawResponderIncidents> data;

    /**
     * Constructs a validated instance of {@link GetAnalyticsResponderIncidents200Response}.
     *
     * @param spec the specification to process
     */
    public GetAnalyticsResponderIncidents200Response(Consumer<GetAnalyticsResponderIncidents200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetAnalyticsResponderIncidents200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetAnalyticsResponderIncidents200Response(Consumer)} instead.
     * @param first Cursor to identify the first object in the response.
     * @param last Cursor to identify the last object in the response.
     * @param responderId The Responder ID passed into the request.
     * @param limit Number of results to include in the batch.
     * @param order The order in which the results were sorted; asc for ascending, desc for descending.
     * @param orderBy The column that was used for ordering the results.
     * @param timeZone The time zone that the results are in.
     * @param filters filters
     * @param data data
     */
    @ApiStatus.Internal
    public GetAnalyticsResponderIncidents200Response(String first, String last, String responderId, Integer limit, OrderEnum order, OrderByEnum orderBy, String timeZone, GetAnalyticsIncidents200ResponseFilters filters, List<AnalyticsRawResponderIncidents> data) {
        this.first = first;
        this.last = last;
        this.responderId = responderId;
        this.limit = limit;
        this.order = order;
        this.orderBy = orderBy;
        this.timeZone = timeZone;
        this.filters = filters;
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

    /**
     * The column that was used for ordering the results.
     */
    @AllArgsConstructor
    public enum OrderByEnum {
        INCIDENT_CREATED_AT("incident_created_at");

        private static final OrderByEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static OrderByEnum of(String input) {
            if (input != null) {
                for (OrderByEnum v : VALUES) {
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
