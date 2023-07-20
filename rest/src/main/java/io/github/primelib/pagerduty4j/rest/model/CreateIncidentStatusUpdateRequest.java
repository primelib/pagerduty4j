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
 * CreateIncidentStatusUpdateRequest
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
    "message",
    "subject",
    "html_message"
})
@JsonTypeName("createIncidentStatusUpdate_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateIncidentStatusUpdateRequest {

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

    /**
     * Constructs a validated instance of {@link CreateIncidentStatusUpdateRequest}.
     *
     * @param spec the specification to process
     */
    public CreateIncidentStatusUpdateRequest(Consumer<CreateIncidentStatusUpdateRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateIncidentStatusUpdateRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateIncidentStatusUpdateRequest(Consumer)} instead.
     * @param message The message to be posted as a status update.
     * @param subject The subject to be sent for the custom html email status update. Required if sending custom html email.
     * @param htmlMessage The html content to be sent for the custom html email status update. Required if sending custom html email.
     */
    @ApiStatus.Internal
    public CreateIncidentStatusUpdateRequest(String message, String subject, String htmlMessage) {
        this.message = message;
        this.subject = subject;
        this.htmlMessage = htmlMessage;
    }

}
