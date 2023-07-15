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
 * AnalyticsRawIncidentResponses
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link AnalyticsRawIncidentResponses}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AnalyticsRawIncidentResponses(Consumer<AnalyticsRawIncidentResponses> spec) {
        spec.accept(this);
    }

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
     * Type of responder, where `assigned` means the user was added to the Incident via Assignment at Incident creation, `reassigned` means the user was added to the Incident via Reassignment, `escalated` means the user was added via Escalation, and `added_responder` means the user was added via Responder Reqeuest.
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
     * Measures the time it took for the user to respond to the Incident request. In other words, `responded_at - requested_at`.
     */
    @JsonProperty("time_to_respond_seconds")
    protected Integer timeToRespondSeconds;


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
     * Type of responder, where `assigned` means the user was added to the Incident via Assignment at Incident creation, `reassigned` means the user was added to the Incident via Reassignment, `escalated` means the user was added via Escalation, and `added_responder` means the user was added via Responder Reqeuest.
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
