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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AnalyticsRawIncidentResponses
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
    "responder_name",
    "responder_id",
    "response_status",
    "responder_type",
    "requested_at",
    "responded_at",
    "time_to_respond_seconds"
})
@JsonTypeName("Analytics_Raw_Incident_Responses")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AnalyticsRawIncidentResponses {

    /**
     * Name of the user associated with the Incident Response.
     */
    @JsonProperty("responder_name")
    protected String responderName;

    /**
     * ID of the user associated with the Incident Response.
     */
    @JsonProperty("responder_id")
    protected String responderId;

    /**
     * Status of the user's interaction with the Incident notification.
     */
    @JsonProperty("response_status")
    protected ResponseStatusEnum responseStatus;

    /**
     * Type of responder, where {@code assigned} means the user was added to the Incident via Assignment at Incident creation, {@code reassigned} means the user was added to the Incident via Reassignment, {@code escalated} means the user was added via Escalation, and {@code added_responder} means the user was added via Responder Reqeuest.
     */
    @JsonProperty("responder_type")
    protected ResponderTypeEnum responderType;

    /**
     * Timestamp of when the user was requested.
     */
    @JsonProperty("requested_at")
    protected String requestedAt;

    /**
     * Timestamp of when the user responded to the request.
     */
    @JsonProperty("responded_at")
    protected String respondedAt;

    /**
     * Measures the time it took for the user to respond to the Incident request. In other words, {@code responded_at - requested_at}.
     */
    @JsonProperty("time_to_respond_seconds")
    protected Integer timeToRespondSeconds;

    /**
     * Constructs a validated instance of {@link AnalyticsRawIncidentResponses}.
     *
     * @param spec the specification to process
     */
    public AnalyticsRawIncidentResponses(Consumer<AnalyticsRawIncidentResponses> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AnalyticsRawIncidentResponses}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AnalyticsRawIncidentResponses(Consumer)} instead.
     * @param responderName Name of the user associated with the Incident Response.
     * @param responderId ID of the user associated with the Incident Response.
     * @param responseStatus Status of the user's interaction with the Incident notification.
     * @param responderType Type of responder, where {@code assigned} means the user was added to the Incident via Assignment at Incident creation, {@code reassigned} means the user was added to the Incident via Reassignment, {@code escalated} means the user was added via Escalation, and {@code added_responder} means the user was added via Responder Reqeuest.
     * @param requestedAt Timestamp of when the user was requested.
     * @param respondedAt Timestamp of when the user responded to the request.
     * @param timeToRespondSeconds Measures the time it took for the user to respond to the Incident request. In other words, {@code responded_at - requested_at}.
     */
    @ApiStatus.Internal
    public AnalyticsRawIncidentResponses(String responderName, String responderId, ResponseStatusEnum responseStatus, ResponderTypeEnum responderType, String requestedAt, String respondedAt, Integer timeToRespondSeconds) {
        this.responderName = responderName;
        this.responderId = responderId;
        this.responseStatus = responseStatus;
        this.responderType = responderType;
        this.requestedAt = requestedAt;
        this.respondedAt = respondedAt;
        this.timeToRespondSeconds = timeToRespondSeconds;
    }

    /**
     * Status of the user's interaction with the Incident notification.
     */
    @AllArgsConstructor
    public enum ResponseStatusEnum {
        JOINED("joined"),
        PENDING("pending"),
        DECLINED("declined");

        private final String value;
    }

    /**
     * Type of responder, where {@code assigned} means the user was added to the Incident via Assignment at Incident creation, {@code reassigned} means the user was added to the Incident via Reassignment, {@code escalated} means the user was added via Escalation, and {@code added_responder} means the user was added via Responder Reqeuest.
     */
    @AllArgsConstructor
    public enum ResponderTypeEnum {
        ASSIGNED("assigned"),
        REASSIGNED("reassigned"),
        ESCALATED("escalated"),
        ADDED_RESPONDER("added_responder");

        private final String value;
    }

}
