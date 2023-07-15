package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateIncidentResponderRequestRequest
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "requester_id",
    "message",
    "responder_request_targets"
})
@JsonTypeName("createIncidentResponderRequest_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateIncidentResponderRequestRequest {

    /**
     * The user id of the requester.
     */
    @JsonProperty("requester_id")
    private String requesterId;

    /**
     * The message sent with the responder request.
     */
    @JsonProperty("message")
    private String message;

    /**
     * The array of targets the responder request is sent to.
     */
    @JsonProperty("responder_request_targets")
    private List<ResponderRequestTargetReference> responderRequestTargets = new ArrayList<>();


}
