package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ResponderRequest
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "incident",
    "requester",
    "requested_at",
    "message",
    "responder_request_targets"
})
@JsonTypeName("ResponderRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ResponderRequest {

    @JsonProperty("incident")
    private IncidentReference incident;

    @JsonProperty("requester")
    private UserReference requester;

    /**
     * The time the request was made
     */
    @JsonProperty("requested_at")
    private String requestedAt;

    /**
     * The message sent with the responder request
     */
    @JsonProperty("message")
    private String message;

    /**
     * The array of targets the responder request is being sent to
     */
    @JsonProperty("responder_request_targets")
    private List<ResponderRequestTargetReference> responderRequestTargets;


}
