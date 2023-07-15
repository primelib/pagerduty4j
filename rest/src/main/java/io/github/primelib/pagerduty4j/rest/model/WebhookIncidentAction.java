package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebhookIncidentAction
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "id",
    "triggered_at",
    "webhook",
    "type",
    "incident",
    "log_entries"
})
@JsonTypeName("WebhookIncidentAction")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WebhookIncidentAction {

    /**
     * Uniquely identifies this outgoing webhook message; can be used for idempotency when processing the messages.
     */
    @JsonProperty("id")
    private UUID id;

    /**
     * The date/time when this message was was sent.
     */
    @JsonProperty("triggered_at")
    private OffsetDateTime triggeredAt;

    @JsonProperty("webhook")
    private Webhook webhook;

    /**
     * The type of action being reported by this message. * `incident.trigger` - Sent when an incident is newly created/triggered. * `incident.acknowledge` - Sent when an incident is acknowledged by a user. * `incident.unacknowledge` - Sent when an incident is unacknowledged due to its acknowledgement timing out. * `incident.resolve` - Sent when an incident has been resolved. * `incident.assign` - Sent when an incident has been assigned to another user. Often occurs in concert with an `acknowledge`. * `incident.escalate` - Sent when an incident has been escalated to another user in the same escalation chain. * `incident.delegate` - Sent when an incident has been reassigned to another escalation policy. * `incident.annotate` - Sent when a note is created on an incident. 
     */
    @JsonProperty("type")
    private TypeEnum type;

    @JsonProperty("incident")
    private Incident incident;

    /**
     * Log Entries that correspond to the action this Webhook is reporting. Includes the channels.
     */
    @JsonProperty("log_entries")
    private List<ListIncidentLogEntries200ResponseAllOfLogEntriesInner> logEntries;


    /**
     * The type of action being reported by this message. * `incident.trigger` - Sent when an incident is newly created/triggered. * `incident.acknowledge` - Sent when an incident is acknowledged by a user. * `incident.unacknowledge` - Sent when an incident is unacknowledged due to its acknowledgement timing out. * `incident.resolve` - Sent when an incident has been resolved. * `incident.assign` - Sent when an incident has been assigned to another user. Often occurs in concert with an `acknowledge`. * `incident.escalate` - Sent when an incident has been escalated to another user in the same escalation chain. * `incident.delegate` - Sent when an incident has been reassigned to another escalation policy. * `incident.annotate` - Sent when a note is created on an incident. 
     */
    @AllArgsConstructor
    public enum TypeEnum {
        TRIGGER("incident.trigger"),
        ACKNOWLEDGE("incident.acknowledge"),
        UNACKNOWLEDGE("incident.unacknowledge"),
        RESOLVE("incident.resolve"),
        ASSIGN("incident.assign"),
        ESCALATE("incident.escalate"),
        DELEGATE("incident.delegate"),
        ANNOTATE("incident.annotate");

        private final String value;
    }

}
