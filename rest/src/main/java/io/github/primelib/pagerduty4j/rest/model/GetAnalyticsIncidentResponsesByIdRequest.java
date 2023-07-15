package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetAnalyticsIncidentResponsesByIdRequest
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "limit",
    "order",
    "order_by",
    "time_zone"
})
@JsonTypeName("getAnalyticsIncidentResponsesById_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetAnalyticsIncidentResponsesByIdRequest {

    /**
     * Number of results to include in each batch. Limits between 1 to 1000 are accepted.
     */
    @JsonProperty("limit")
    private Integer limit;

    /**
     * The order the results; asc for ascending, desc for descending. Defaults to `desc`.
     */
    @JsonProperty("order")
    private OrderEnum order;

    /**
     * The column to use for ordering the results.
     */
    @JsonProperty("order_by")
    private OrderByEnum orderBy;

    /**
     * The time zone to use for the results.
     */
    @JsonProperty("time_zone")
    private String timeZone;


    /**
     * The order the results; asc for ascending, desc for descending. Defaults to `desc`.
     */
    @AllArgsConstructor
    public enum OrderEnum {
        ASC("asc"),
        DESC("desc");

        private final String value;
    }

    /**
     * The column to use for ordering the results.
     */
    @AllArgsConstructor
    public enum OrderByEnum {
        REQUESTED_AT("requested_at");

        private final String value;
    }

}
