package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * StatusUpdate
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "id",
    "message",
    "created_at",
    "sender",
    "subject",
    "html_message"
})
@JsonTypeName("StatusUpdate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class StatusUpdate {

    @JsonProperty("id")
    private String id;

    /**
     * The message of the status update.
     */
    @JsonProperty("message")
    private String message;

    /**
     * The date/time when this status update was created.
     */
    @JsonProperty("created_at")
    private String createdAt;

    @JsonProperty("sender")
    private UserReference sender;

    /**
     * The subject of the custom html email status update. Present if included in request body.
     */
    @JsonProperty("subject")
    private String subject;

    /**
     * The html content of the custom html email status update. Present if included in request body.
     */
    @JsonProperty("html_message")
    private String htmlMessage;


}
