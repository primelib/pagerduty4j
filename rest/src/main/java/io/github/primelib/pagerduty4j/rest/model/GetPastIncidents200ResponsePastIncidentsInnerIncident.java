package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetPastIncidents200ResponsePastIncidentsInnerIncident
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "id",
    "created_at",
    "self",
    "title"
})
@JsonTypeName("getPastIncidents_200_response_past_incidents_inner_incident")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetPastIncidents200ResponsePastIncidentsInnerIncident {

    /**
     * The globally unique identifier of the incident
     */
    @JsonProperty("id")
    private String id;

    /**
     * The date/time the incident was first triggered
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * The URL at which the object is accessible
     */
    @JsonProperty("self")
    private String self;

    /**
     * The description of the nature, symptoms, cause, or effect of the incident
     */
    @JsonProperty("title")
    private String title;


}
