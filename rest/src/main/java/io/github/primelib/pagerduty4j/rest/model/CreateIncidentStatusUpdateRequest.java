package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateIncidentStatusUpdateRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "message",
    "subject",
    "html_message"
})
@JsonTypeName("createIncidentStatusUpdate_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateIncidentStatusUpdateRequest {

    /**
     * Constructs a validated implementation of {@link CreateIncidentStatusUpdateRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateIncidentStatusUpdateRequest(Consumer<CreateIncidentStatusUpdateRequest> spec) {
        spec.accept(this);
    }

    /**
     * The message to be posted as a status update.
     */
    @JsonProperty("message")
    protected String message;

    /**
     * The subject to be sent for the custom html email status update. Required if sending custom html email.
     */
    @JsonProperty("subject")
    protected String subject;

    /**
     * The html content to be sent for the custom html email status update. Required if sending custom html email.
     */
    @JsonProperty("html_message")
    protected String htmlMessage;


}
