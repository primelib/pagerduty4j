package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetAnalyticsIncidents200Response
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "first",
    "last",
    "limit",
    "more",
    "order",
    "order_by",
    "filters",
    "time_zone",
    "data"
})
@JsonTypeName("getAnalyticsIncidents_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetAnalyticsIncidents200Response {

    /**
     * Constructs a validated implementation of {@link GetAnalyticsIncidents200Response}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetAnalyticsIncidents200Response(Consumer<GetAnalyticsIncidents200Response> spec) {
        spec.accept(this);
    }

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
     * Number of results to include in the batch.
     */
    @JsonProperty("limit")
    protected Integer limit;

    /**
     * Indicates if there are more resources available than were returned.
     */
    @JsonProperty("more")
    protected Boolean more;

    /**
     * The order in which the results were sorted;
     * asc for ascending, desc for descending.
     */
    @JsonProperty("order")
    protected OrderEnum order;

    /**
     * The column that was used for ordering the results.
     */
    @JsonProperty("order_by")
    protected OrderByEnum orderBy;

    @JsonProperty("filters")
    protected GetAnalyticsIncidents200ResponseFilters filters;

    /**
     * The time zone that the results are in.
     */
    @JsonProperty("time_zone")
    protected String timeZone;

    @JsonProperty("data")
    protected List<AnalyticsRawIncident> data = new ArrayList<>();


    /**
     * The order in which the results were sorted;
     * asc for ascending, desc for descending.
     */
    @AllArgsConstructor
    public enum OrderEnum {
        ASC("asc"),
        DESC("desc");

        private final String value;
    }

    /**
     * The column that was used for ordering the results.
     */
    @AllArgsConstructor
    public enum OrderByEnum {
        CREATED_AT("created_at"),
        SECONDS_TO_RESOLVE("seconds_to_resolve");

        private final String value;
    }

}
