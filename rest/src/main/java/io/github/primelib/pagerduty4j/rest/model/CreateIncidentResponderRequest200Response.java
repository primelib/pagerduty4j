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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateIncidentResponderRequest200Response
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
    "responder_request"
})
@JsonTypeName("createIncidentResponderRequest_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateIncidentResponderRequest200Response {

    @JsonProperty("responder_request")
    protected ResponderRequest responderRequest;

    /**
     * Constructs a validated instance of {@link CreateIncidentResponderRequest200Response}.
     *
     * @param spec the specification to process
     */
    public CreateIncidentResponderRequest200Response(Consumer<CreateIncidentResponderRequest200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateIncidentResponderRequest200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateIncidentResponderRequest200Response(Consumer)} instead.
     * @param responderRequest responderRequest
     */
    @ApiStatus.Internal
    public CreateIncidentResponderRequest200Response(ResponderRequest responderRequest) {
        this.responderRequest = responderRequest;
    }

}
