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
 * GetAnalyticsIncidentsRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link GetAnalyticsIncidentsRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetAnalyticsIncidentsRequest(Consumer<GetAnalyticsIncidentsRequest> spec) {
        spec.accept(this);
    }

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
     * The order the results;
     * asc for ascending, desc for descending. Defaults to 'desc'.
     */
    @AllArgsConstructor
    public enum OrderEnum {
        ASC("asc"),
        DESC("desc");

        private final String value;
    }

    /**
     * The column to use for ordering the results. Defaults to 'created_at'.
     */
    @AllArgsConstructor
    public enum OrderByEnum {
        CREATED_AT("created_at"),
        SECONDS_TO_RESOLVE("seconds_to_resolve");

        private final String value;
    }

}
