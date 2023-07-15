package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetPastIncidents200ResponsePastIncidentsInner
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "incident",
    "score"
})
@JsonTypeName("getPastIncidents_200_response_past_incidents_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetPastIncidents200ResponsePastIncidentsInner {

    @JsonProperty("incident")
    private GetPastIncidents200ResponsePastIncidentsInnerIncident incident;

    /**
     * The computed similarity score associated with the incident and parent incident 
     */
    @JsonProperty("score")
    private BigDecimal score;


}
