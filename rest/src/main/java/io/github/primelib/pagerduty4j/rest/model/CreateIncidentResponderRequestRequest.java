package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

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
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "requester_id",
    "message",
    "responder_request_targets"
})
@JsonTypeName("createIncidentResponderRequest_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateIncidentResponderRequestRequest {

    /**
     * Constructs a validated implementation of {@link CreateIncidentResponderRequestRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateIncidentResponderRequestRequest(Consumer<CreateIncidentResponderRequestRequest> spec) {
        spec.accept(this);
    }

    /**
     * The user id of the requester.
     */
    @JsonProperty("requester_id")
    protected String requesterId;

    /**
     * The message sent with the responder request.
     */
    @JsonProperty("message")
    protected String message;

    /**
     * The array of targets the responder request is sent to.
     */
    @JsonProperty("responder_request_targets")
    protected List<ResponderRequestTargetReference> responderRequestTargets = new ArrayList<>();


}
