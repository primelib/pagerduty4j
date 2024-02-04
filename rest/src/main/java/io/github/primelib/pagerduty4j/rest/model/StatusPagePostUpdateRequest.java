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
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * StatusPagePostUpdateRequest
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
    "self",
    "post",
    "message",
    "status",
    "severity",
    "impacted_services",
    "update_frequency_ms",
    "notify_subscribers",
    "reported_at",
    "type"
})
@JsonTypeName("StatusPagePostUpdateRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class StatusPagePostUpdateRequest {

    /**
     * The path to which the Post Update resource is accessible.
     */
    @JsonProperty("self")
    protected String self;

    @JsonProperty("post")
    protected StatusPagePostUpdatePost post;

    /**
     * The message of the Post Update.
     */
    @JsonProperty("message")
    protected String message;

    @JsonProperty("status")
    protected StatusPagePostUpdateStatus status;

    @JsonProperty("severity")
    protected StatusPagePostUpdateSeverity severity;

    /**
     * Impacted services represent the status page services affected by a post update, and its impact.
     */
    @JsonProperty("impacted_services")
    protected List<StatusPageImpact> impactedServices;

    /**
     * The frequency of the next Post Update in milliseconds.
     */
    @JsonProperty("update_frequency_ms")
    protected Integer updateFrequencyMs;

    /**
     * Determines if the subscribers should be notified of the Post Update.
     */
    @JsonProperty("notify_subscribers")
    protected Boolean notifySubscribers;

    /**
     * The date and time the Post Update was reported.
     */
    @JsonProperty("reported_at")
    protected OffsetDateTime reportedAt;

    /**
     * The type of the object returned by the API - in this case, a Status Page Post Update.
     */
    @JsonProperty("type")
    protected String type;

    /**
     * Constructs a validated instance of {@link StatusPagePostUpdateRequest}.
     *
     * @param spec the specification to process
     */
    public StatusPagePostUpdateRequest(Consumer<StatusPagePostUpdateRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link StatusPagePostUpdateRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #StatusPagePostUpdateRequest(Consumer)} instead.
     * @param self The path to which the Post Update resource is accessible.
     * @param post post
     * @param message The message of the Post Update.
     * @param status status
     * @param severity severity
     * @param impactedServices Impacted services represent the status page services affected by a post update, and its impact.
     * @param updateFrequencyMs The frequency of the next Post Update in milliseconds.
     * @param notifySubscribers Determines if the subscribers should be notified of the Post Update.
     * @param reportedAt The date and time the Post Update was reported.
     * @param type The type of the object returned by the API - in this case, a Status Page Post Update.
     */
    @ApiStatus.Internal
    public StatusPagePostUpdateRequest(String self, StatusPagePostUpdatePost post, String message, StatusPagePostUpdateStatus status, StatusPagePostUpdateSeverity severity, List<StatusPageImpact> impactedServices, Integer updateFrequencyMs, Boolean notifySubscribers, OffsetDateTime reportedAt, String type) {
        this.self = self;
        this.post = post;
        this.message = message;
        this.status = status;
        this.severity = severity;
        this.impactedServices = impactedServices;
        this.updateFrequencyMs = updateFrequencyMs;
        this.notifySubscribers = notifySubscribers;
        this.reportedAt = reportedAt;
        this.type = type;
    }

}
