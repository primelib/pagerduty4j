package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IncidentsRespondersReference
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "state",
    "user",
    "incident",
    "updated_at",
    "message",
    "requester",
    "requested_at"
})
@JsonTypeName("IncidentsRespondersReference")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncidentsRespondersReference {

    /**
     * The status of the responder being added to the incident
     */
    @JsonProperty("state")
    private String state;

    @JsonProperty("user")
    private UserReference user;

    @JsonProperty("incident")
    private IncidentReference incident;

    @JsonProperty("updated_at")
    private String updatedAt;

    /**
     * The message sent with the responder request
     */
    @JsonProperty("message")
    private String message;

    @JsonProperty("requester")
    private UserReference requester;

    @JsonProperty("requested_at")
    private String requestedAt;


}
