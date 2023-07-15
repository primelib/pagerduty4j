package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
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
     * Cursor to identify the first object in the response.
     */
    @JsonProperty("first")
    private String first;

    /**
     * Cursor to identify the last object in the response.
     */
    @JsonProperty("last")
    private String last;

    /**
     * Number of results to include in the batch.
     */
    @JsonProperty("limit")
    private Integer limit;

    /**
     * Indicates if there are more resources available than were returned.
     */
    @JsonProperty("more")
    private Boolean more;

    /**
     * The order in which the results were sorted;
     * asc for ascending, desc for descending.
     */
    @JsonProperty("order")
    private OrderEnum order;

    /**
     * The column that was used for ordering the results.
     */
    @JsonProperty("order_by")
    private OrderByEnum orderBy;

    @JsonProperty("filters")
    private GetAnalyticsIncidents200ResponseFilters filters;

    /**
     * The time zone that the results are in.
     */
    @JsonProperty("time_zone")
    private String timeZone;

    @JsonProperty("data")
    private List<AnalyticsRawIncident> data = new ArrayList<>();


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
