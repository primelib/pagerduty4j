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
 * GetAnalyticsIncidentsRequest
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
    "starting_after",
    "ending_before",
    "order",
    "order_by",
    "limit",
    "time_zone"
})
@JsonTypeName("getAnalyticsIncidents_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetAnalyticsIncidentsRequest {

    @JsonProperty("filters")
    protected GetAnalyticsIncidentsRequestFilters filters;

    /**
     * A cursor to indicate the reference point that the results should follow
     */
    @JsonProperty("starting_after")
    protected String startingAfter;

    /**
     * A cursor to indicate the reference point that the results should precede
     */
    @JsonProperty("ending_before")
    protected String endingBefore;

    /**
     * The order the results;
     * asc for ascending, desc for descending. Defaults to 'desc'.
     */
    @JsonProperty("order")
    protected OrderEnum order;

    /**
     * The column to use for ordering the results. Defaults to 'created_at'.
     */
    @JsonProperty("order_by")
    protected OrderByEnum orderBy;

    /**
     * Number of results to include in each batch. Limits between 1 to 1000 are accepted.
     */
    @JsonProperty("limit")
    protected Integer limit;

    /**
     * The time zone to use for the results.
     */
    @JsonProperty("time_zone")
    protected String timeZone;

    /**
     * Constructs a validated instance of {@link GetAnalyticsIncidentsRequest}.
     *
     * @param spec the specification to process
     */
    public GetAnalyticsIncidentsRequest(Consumer<GetAnalyticsIncidentsRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetAnalyticsIncidentsRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetAnalyticsIncidentsRequest(Consumer)} instead.
     * @param filters filters
     * @param startingAfter A cursor to indicate the reference point that the results should follow
     * @param endingBefore A cursor to indicate the reference point that the results should precede
     * @param order The order the results;  asc for ascending, desc for descending. Defaults to 'desc'.
     * @param orderBy The column to use for ordering the results. Defaults to 'created_at'.
     * @param limit Number of results to include in each batch. Limits between 1 to 1000 are accepted.
     * @param timeZone The time zone to use for the results.
     */
    @ApiStatus.Internal
    public GetAnalyticsIncidentsRequest(GetAnalyticsIncidentsRequestFilters filters, String startingAfter, String endingBefore, OrderEnum order, OrderByEnum orderBy, Integer limit, String timeZone) {
        this.filters = filters;
        this.startingAfter = startingAfter;
        this.endingBefore = endingBefore;
        this.order = order;
        this.orderBy = orderBy;
        this.limit = limit;
        this.timeZone = timeZone;
    }

    /**
     * The order the results;
     * asc for ascending, desc for descending. Defaults to 'desc'.
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
     * The column to use for ordering the results. Defaults to 'created_at'.
     */
    @AllArgsConstructor
    public enum OrderByEnum {
        CREATED_AT("created_at"),
        SECONDS_TO_RESOLVE("seconds_to_resolve");

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
