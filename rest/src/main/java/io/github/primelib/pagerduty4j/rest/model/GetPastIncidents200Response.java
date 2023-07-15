package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetPastIncidents200Response
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "past_incidents",
    "total",
    "limit"
})
@JsonTypeName("getPastIncidents_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetPastIncidents200Response {

    /**
     * Constructs a validated implementation of {@link GetPastIncidents200Response}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetPastIncidents200Response(Consumer<GetPastIncidents200Response> spec) {
        spec.accept(this);
    }

    /**
     * Aggregate of past incidents
     */
    @JsonProperty("past_incidents")
    protected List<GetPastIncidents200ResponsePastIncidentsInner> pastIncidents;

    /**
     * The total number of Past Incidents if the total parameter was set in the request
     */
    @JsonProperty("total")
    protected BigDecimal total;

    /**
     * The maximum number of Incidents requested
     */
    @JsonProperty("limit")
    protected BigDecimal limit;


}
