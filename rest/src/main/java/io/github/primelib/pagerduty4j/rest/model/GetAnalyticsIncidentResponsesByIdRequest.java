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
 * GetAnalyticsIncidentResponsesByIdRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link GetAnalyticsIncidentResponsesByIdRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetAnalyticsIncidentResponsesByIdRequest(Consumer<GetAnalyticsIncidentResponsesByIdRequest> spec) {
        spec.accept(this);
    }

    /**
     * Number of results to include in each batch. Limits between 1 to 1000 are accepted.
     */
    @JsonProperty("limit")
    protected Integer limit;

    /**
     * The order the results; asc for ascending, desc for descending. Defaults to `desc`.
     */
    @JsonProperty("order")
    protected OrderEnum order;

    /**
     * The column to use for ordering the results.
     */
    @JsonProperty("order_by")
    protected OrderByEnum orderBy;

    /**
     * The time zone to use for the results.
     */
    @JsonProperty("time_zone")
    protected String timeZone;


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
