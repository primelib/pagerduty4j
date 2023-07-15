package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
@JsonPropertyOrder({
    "past_incidents",
    "total",
    "limit"
})
@JsonTypeName("getPastIncidents_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetPastIncidents200Response {

    /**
     * Aggregate of past incidents
     */
    @JsonProperty("past_incidents")
    private List<GetPastIncidents200ResponsePastIncidentsInner> pastIncidents;

    /**
     * The total number of Past Incidents if the total parameter was set in the request
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * The maximum number of Incidents requested
     */
    @JsonProperty("limit")
    private BigDecimal limit;


}
