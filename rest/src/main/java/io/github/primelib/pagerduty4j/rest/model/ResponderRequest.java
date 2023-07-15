package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

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
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link ResponderRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ResponderRequest(Consumer<ResponderRequest> spec) {
        spec.accept(this);
    }

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


}
