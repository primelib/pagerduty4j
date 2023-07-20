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
 * StatusUpdate
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

    /**
     * Constructs a validated instance of {@link StatusUpdate}.
     *
     * @param spec the specification to process
     */
    public StatusUpdate(Consumer<StatusUpdate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link StatusUpdate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #StatusUpdate(Consumer)} instead.
     * @param id var.name
     * @param message The message of the status update.
     * @param createdAt The date/time when this status update was created.
     * @param sender var.name
     * @param subject The subject of the custom html email status update. Present if included in request body.
     * @param htmlMessage The html content of the custom html email status update. Present if included in request body.
     */
    @ApiStatus.Internal
    public StatusUpdate(String id, String message, String createdAt, UserReference sender, String subject, String htmlMessage) {
        this.id = id;
        this.message = message;
        this.createdAt = createdAt;
        this.sender = sender;
        this.subject = subject;
        this.htmlMessage = htmlMessage;
    }

}
