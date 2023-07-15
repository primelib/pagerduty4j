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
 * StatusUpdate
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link StatusUpdate}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public StatusUpdate(Consumer<StatusUpdate> spec) {
        spec.accept(this);
    }

    @JsonProperty("id")
    protected String id;

    /**
     * The message of the status update.
     */
    @JsonProperty("message")
    protected String message;

    /**
     * The date/time when this status update was created.
     */
    @JsonProperty("created_at")
    protected String createdAt;

    @JsonProperty("sender")
    protected UserReference sender;

    /**
     * The subject of the custom html email status update. Present if included in request body.
     */
    @JsonProperty("subject")
    protected String subject;

    /**
     * The html content of the custom html email status update. Present if included in request body.
     */
    @JsonProperty("html_message")
    protected String htmlMessage;


}
