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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import java.time.OffsetDateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * StatusPagePostUpdatesInner
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
    "reviewed_status",
    "status",
    "severity",
    "impacted_services",
    "update_frequency_ms",
    "notify_subscribers",
    "reported_at",
    "type"
})
@JsonTypeName("StatusPagePost_updates_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class StatusPagePostUpdatesInner {

    /**
     * The ID of the Post Update.
     */
    @JsonProperty("id")
    protected String id;

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

    /**
     * The status of the Post Updates to retrieve.
     */
    @JsonProperty("reviewed_status")
    protected ReviewedStatusEnum reviewedStatus;

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
     * Constructs a validated instance of {@link StatusPagePostUpdatesInner}.
     *
     * @param spec the specification to process
     */
    public StatusPagePostUpdatesInner(Consumer<StatusPagePostUpdatesInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link StatusPagePostUpdatesInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #StatusPagePostUpdatesInner(Consumer)} instead.
     * @param id The ID of the Post Update.
     * @param self The path to which the Post Update resource is accessible.
     * @param post post
     * @param message The message of the Post Update.
     * @param reviewedStatus The status of the Post Updates to retrieve.
     * @param status status
     * @param severity severity
     * @param impactedServices Impacted services represent the status page services affected by a post update, and its impact.
     * @param updateFrequencyMs The frequency of the next Post Update in milliseconds.
     * @param notifySubscribers Determines if the subscribers should be notified of the Post Update.
     * @param reportedAt The date and time the Post Update was reported.
     * @param type The type of the object returned by the API - in this case, a Status Page Post Update.
     */
    @ApiStatus.Internal
    public StatusPagePostUpdatesInner(String id, String self, StatusPagePostUpdatePost post, String message, ReviewedStatusEnum reviewedStatus, StatusPagePostUpdateStatus status, StatusPagePostUpdateSeverity severity, List<StatusPageImpact> impactedServices, Integer updateFrequencyMs, Boolean notifySubscribers, OffsetDateTime reportedAt, String type) {
        this.id = id;
        this.self = self;
        this.post = post;
        this.message = message;
        this.reviewedStatus = reviewedStatus;
        this.status = status;
        this.severity = severity;
        this.impactedServices = impactedServices;
        this.updateFrequencyMs = updateFrequencyMs;
        this.notifySubscribers = notifySubscribers;
        this.reportedAt = reportedAt;
        this.type = type;
    }

    /**
     * The status of the Post Updates to retrieve.
     */
    @AllArgsConstructor
    public enum ReviewedStatusEnum {
        APPROVED("approved"),
        NOT_REVIEWED("not_reviewed");

        private static final ReviewedStatusEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static ReviewedStatusEnum of(String input) {
            if (input != null) {
                for (ReviewedStatusEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
