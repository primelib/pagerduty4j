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
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * WebhookIncidentAction
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
    protected UUID id;

    /**
     * The date/time when this message was was sent.
     */
    @JsonProperty("triggered_at")
    protected OffsetDateTime triggeredAt;

    @JsonProperty("webhook")
    protected Webhook webhook;

    /**
     * The type of action being reported by this message. * {@code incident.trigger} - Sent when an incident is newly created/triggered. * {@code incident.acknowledge} - Sent when an incident is acknowledged by a user. * {@code incident.unacknowledge} - Sent when an incident is unacknowledged due to its acknowledgement timing out. * {@code incident.resolve} - Sent when an incident has been resolved. * {@code incident.assign} - Sent when an incident has been assigned to another user. Often occurs in concert with an {@code acknowledge}. * {@code incident.escalate} - Sent when an incident has been escalated to another user in the same escalation chain. * {@code incident.delegate} - Sent when an incident has been reassigned to another escalation policy. * {@code incident.annotate} - Sent when a note is created on an incident. 
     */
    @JsonProperty("type")
    protected TypeEnum type;

    @JsonProperty("incident")
    protected Incident incident;

    /**
     * Log Entries that correspond to the action this Webhook is reporting. Includes the channels.
     */
    @JsonProperty("log_entries")
    protected List<WebhookIncidentActionAllOfLogEntries> logEntries;

    /**
     * Constructs a validated instance of {@link WebhookIncidentAction}.
     *
     * @param spec the specification to process
     */
    public WebhookIncidentAction(Consumer<WebhookIncidentAction> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WebhookIncidentAction}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WebhookIncidentAction(Consumer)} instead.
     * @param id Uniquely identifies this outgoing webhook message; can be used for idempotency when processing the messages.
     * @param triggeredAt The date/time when this message was was sent.
     * @param webhook webhook
     * @param type The type of action being reported by this message. * {@code incident.trigger} - Sent when an incident is newly created/triggered. * {@code incident.acknowledge} - Sent when an incident is acknowledged by a user. * {@code incident.unacknowledge} - Sent when an incident is unacknowledged due to its acknowledgement timing out. * {@code incident.resolve} - Sent when an incident has been resolved. * {@code incident.assign} - Sent when an incident has been assigned to another user. Often occurs in concert with an {@code acknowledge}. * {@code incident.escalate} - Sent when an incident has been escalated to another user in the same escalation chain. * {@code incident.delegate} - Sent when an incident has been reassigned to another escalation policy. * {@code incident.annotate} - Sent when a note is created on an incident. 
     * @param incident incident
     * @param logEntries Log Entries that correspond to the action this Webhook is reporting. Includes the channels.
     */
    @ApiStatus.Internal
    public WebhookIncidentAction(UUID id, OffsetDateTime triggeredAt, Webhook webhook, TypeEnum type, Incident incident, List<WebhookIncidentActionAllOfLogEntries> logEntries) {
        this.id = id;
        this.triggeredAt = triggeredAt;
        this.webhook = webhook;
        this.type = type;
        this.incident = incident;
        this.logEntries = logEntries;
    }

    /**
     * The type of action being reported by this message. * {@code incident.trigger} - Sent when an incident is newly created/triggered. * {@code incident.acknowledge} - Sent when an incident is acknowledged by a user. * {@code incident.unacknowledge} - Sent when an incident is unacknowledged due to its acknowledgement timing out. * {@code incident.resolve} - Sent when an incident has been resolved. * {@code incident.assign} - Sent when an incident has been assigned to another user. Often occurs in concert with an {@code acknowledge}. * {@code incident.escalate} - Sent when an incident has been escalated to another user in the same escalation chain. * {@code incident.delegate} - Sent when an incident has been reassigned to another escalation policy. * {@code incident.annotate} - Sent when a note is created on an incident. 
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

        private static final TypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static TypeEnum of(String input) {
            if (input != null) {
                for (TypeEnum v : VALUES) {
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
