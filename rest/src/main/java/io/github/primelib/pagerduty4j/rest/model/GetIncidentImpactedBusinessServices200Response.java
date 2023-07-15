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
 * GetIncidentImpactedBusinessServices200Response
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "limit",
    "next_cursor",
    "services"
})
@JsonTypeName("getIncidentImpactedBusinessServices_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetIncidentImpactedBusinessServices200Response {

    /**
     * Constructs a validated implementation of {@link GetIncidentImpactedBusinessServices200Response}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetIncidentImpactedBusinessServices200Response(Consumer<GetIncidentImpactedBusinessServices200Response> spec) {
        spec.accept(this);
    }

    /**
     * The minimum of the `limit` parameter used in the request or the maximum request size of the API.
     */
    @JsonProperty("limit")
    protected Integer limit;

    /**
     * An opaque string than will deliver the next set of results when provided as the `cursor` parameter in a subsequent request.
     * A `null` value for this field indicates that there are no additional results. 
     */
    @JsonProperty("next_cursor")
    protected String nextCursor;

    @JsonProperty("services")
    protected List<Impact> services;


}
