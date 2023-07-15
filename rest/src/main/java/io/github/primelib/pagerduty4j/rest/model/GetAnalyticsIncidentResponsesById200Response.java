package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetAnalyticsIncidentResponsesById200Response
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "incident_id",
    "limit",
    "order",
    "order_by",
    "time_zone",
    "responses"
})
@JsonTypeName("getAnalyticsIncidentResponsesById_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetAnalyticsIncidentResponsesById200Response {

    /**
     * Constructs a validated implementation of {@link GetAnalyticsIncidentResponsesById200Response}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetAnalyticsIncidentResponsesById200Response(Consumer<GetAnalyticsIncidentResponsesById200Response> spec) {
        spec.accept(this);
    }

    /**
     * The Incident ID passed in to the request.
     */
    @JsonProperty("incident_id")
    protected String incidentId;

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

    @JsonProperty("responses")
    protected List<AnalyticsRawIncidentResponses> responses;


    /**
     * The order in which the results were sorted; asc for ascending, desc for descending.
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
        REQUESTED_AT("requested_at");

        private final String value;
    }

}
