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
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateIncidentResponderRequestRequest
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
    protected List<ResponderRequestTargetReference> responderRequestTargets;

    /**
     * Constructs a validated instance of {@link CreateIncidentResponderRequestRequest}.
     *
     * @param spec the specification to process
     */
    public CreateIncidentResponderRequestRequest(Consumer<CreateIncidentResponderRequestRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateIncidentResponderRequestRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateIncidentResponderRequestRequest(Consumer)} instead.
     * @param requesterId The user id of the requester.
     * @param message The message sent with the responder request.
     * @param responderRequestTargets The array of targets the responder request is sent to.
     */
    @ApiStatus.Internal
    public CreateIncidentResponderRequestRequest(String requesterId, String message, List<ResponderRequestTargetReference> responderRequestTargets) {
        this.requesterId = requesterId;
        this.message = message;
        this.responderRequestTargets = responderRequestTargets;
    }

}
