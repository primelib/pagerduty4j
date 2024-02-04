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

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * StatusPagePostmortem
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
    "self",
    "post",
    "message",
    "notify_subscribers",
    "reported_at",
    "type"
})
@JsonTypeName("StatusPagePostmortem")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class StatusPagePostmortem {

    /**
     * An unique identifier within Status Page scope that defines a single Postmortem resource.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The API resource URL of the Postmortem.
     */
    @JsonProperty("self")
    protected String self;

    @JsonProperty("post")
    protected StatusPagePostmortemPost post;

    /**
     * The message of the Postmortem (supports Rich-Text).
     */
    @JsonProperty("message")
    protected String message;

    /**
     * Whether or not subscribers of the Status Page should be notified about the Postmortem.
     */
    @JsonProperty("notify_subscribers")
    protected Boolean notifySubscribers;

    /**
     * The date and time the Postmortem was reported.
     */
    @JsonProperty("reported_at")
    protected OffsetDateTime reportedAt;

    /**
     * The type of the object returned by the API - in this case, a Status Page Post Postmortem.
     */
    @JsonProperty("type")
    protected String type;

    /**
     * Constructs a validated instance of {@link StatusPagePostmortem}.
     *
     * @param spec the specification to process
     */
    public StatusPagePostmortem(Consumer<StatusPagePostmortem> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link StatusPagePostmortem}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #StatusPagePostmortem(Consumer)} instead.
     * @param id An unique identifier within Status Page scope that defines a single Postmortem resource.
     * @param self The API resource URL of the Postmortem.
     * @param post post
     * @param message The message of the Postmortem (supports Rich-Text).
     * @param notifySubscribers Whether or not subscribers of the Status Page should be notified about the Postmortem.
     * @param reportedAt The date and time the Postmortem was reported.
     * @param type The type of the object returned by the API - in this case, a Status Page Post Postmortem.
     */
    @ApiStatus.Internal
    public StatusPagePostmortem(String id, String self, StatusPagePostmortemPost post, String message, Boolean notifySubscribers, OffsetDateTime reportedAt, String type) {
        this.id = id;
        this.self = self;
        this.post = post;
        this.message = message;
        this.notifySubscribers = notifySubscribers;
        this.reportedAt = reportedAt;
        this.type = type;
    }

}
