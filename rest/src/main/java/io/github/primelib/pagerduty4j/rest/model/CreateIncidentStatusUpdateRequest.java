package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateIncidentStatusUpdateRequest
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private String message;

    /**
     * The subject to be sent for the custom html email status update. Required if sending custom html email.
     */
    @JsonProperty("subject")
    private String subject;

    /**
     * The html content to be sent for the custom html email status update. Required if sending custom html email.
     */
    @JsonProperty("html_message")
    private String htmlMessage;


}
