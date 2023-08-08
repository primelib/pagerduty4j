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
 * ResponderRequest
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
    protected IncidentReference incident;

    @JsonProperty("requester")
    protected UserReference requester;

    /**
     * The time the request was made
     */
    @JsonProperty("requested_at")
    protected String requestedAt;

    /**
     * The message sent with the responder request
     */
    @JsonProperty("message")
    protected String message;

    /**
     * The array of targets the responder request is being sent to
     */
    @JsonProperty("responder_request_targets")
    protected List<ResponderRequestTargetReference> responderRequestTargets;

    /**
     * Constructs a validated instance of {@link ResponderRequest}.
     *
     * @param spec the specification to process
     */
    public ResponderRequest(Consumer<ResponderRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ResponderRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ResponderRequest(Consumer)} instead.
     * @param incident incident
     * @param requester requester
     * @param requestedAt The time the request was made
     * @param message The message sent with the responder request
     * @param responderRequestTargets The array of targets the responder request is being sent to
     */
    @ApiStatus.Internal
    public ResponderRequest(IncidentReference incident, UserReference requester, String requestedAt, String message, List<ResponderRequestTargetReference> responderRequestTargets) {
        this.incident = incident;
        this.requester = requester;
        this.requestedAt = requestedAt;
        this.message = message;
        this.responderRequestTargets = responderRequestTargets;
    }

}
