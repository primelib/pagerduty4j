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

/**
 * GetAnalyticsIncidentResponsesByIdRequest
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
    protected Integer limit;

    /**
     * The order the results; asc for ascending, desc for descending. Defaults to {@code desc}.
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
     * Constructs a validated instance of {@link GetAnalyticsIncidentResponsesByIdRequest}.
     *
     * @param spec the specification to process
     */
    public GetAnalyticsIncidentResponsesByIdRequest(Consumer<GetAnalyticsIncidentResponsesByIdRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetAnalyticsIncidentResponsesByIdRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetAnalyticsIncidentResponsesByIdRequest(Consumer)} instead.
     * @param limit Number of results to include in each batch. Limits between 1 to 1000 are accepted.
     * @param order The order the results; asc for ascending, desc for descending. Defaults to {@code desc}.
     * @param orderBy The column to use for ordering the results.
     * @param timeZone The time zone to use for the results.
     */
    @ApiStatus.Internal
    public GetAnalyticsIncidentResponsesByIdRequest(Integer limit, OrderEnum order, OrderByEnum orderBy, String timeZone) {
        this.limit = limit;
        this.order = order;
        this.orderBy = orderBy;
        this.timeZone = timeZone;
    }

    /**
     * The order the results; asc for ascending, desc for descending. Defaults to {@code desc}.
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
