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
 * AcknowledgeLogEntry
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
    "summary",
    "type",
    "self",
    "html_url",
    "created_at",
    "channel",
    "agent",
    "note",
    "contexts",
    "service",
    "incident",
    "teams",
    "event_details",
    "acknowledgement_timeout"
})
@JsonTypeName("AcknowledgeLogEntry")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AcknowledgeLogEntry {

    @JsonProperty("id")
    protected String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to {@code name}, though it is not intended to be an identifier.
     */
    @JsonProperty("summary")
    protected String summary;

    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * the API show URL at which the object is accessible
     */
    @JsonProperty("self")
    protected String self;

    /**
     * a URL at which the entity is uniquely displayed in the Web app
     */
    @JsonProperty("html_url")
    protected String htmlUrl;

    /**
     * Time at which the log entry was created.
     */
    @JsonProperty("created_at")
    protected OffsetDateTime createdAt;

    @JsonProperty("channel")
    protected Channel channel;

    @JsonProperty("agent")
    protected AgentReference agent;

    /**
     * Optional field containing a note, if one was included with the log entry.
     */
    @JsonProperty("note")
    protected String note;

    /**
     * Contexts to be included with the trigger such as links to graphs or images.
     */
    @JsonProperty("contexts")
    protected List<Context> contexts;

    @JsonProperty("service")
    protected ServiceReference service;

    @JsonProperty("incident")
    protected IncidentReference incident;

    /**
     * Will consist of references unless included
     */
    @JsonProperty("teams")
    protected List<TeamReference> teams;

    @JsonProperty("event_details")
    protected LogEntryAllOfEventDetails eventDetails;

    /**
     * Duration for which the acknowledgement lasts, in seconds. Services can contain an {@code acknowledgement_timeout} property, which specifies the length of time acknowledgements should last for. Each time an incident is acknowledged, this timeout is copied into the acknowledgement log entry. This property is optional, as older log entries may not contain it. It may also be {@code null}, as acknowledgements can be performed on incidents whose services have no {@code acknowledgement_timeout} set.
     */
    @JsonProperty("acknowledgement_timeout")
    protected Integer acknowledgementTimeout;

    /**
     * Constructs a validated instance of {@link AcknowledgeLogEntry}.
     *
     * @param spec the specification to process
     */
    public AcknowledgeLogEntry(Consumer<AcknowledgeLogEntry> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AcknowledgeLogEntry}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AcknowledgeLogEntry(Consumer)} instead.
     * @param id id
     * @param summary A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to {@code name}, though it is not intended to be an identifier.
     * @param type type
     * @param self the API show URL at which the object is accessible
     * @param htmlUrl a URL at which the entity is uniquely displayed in the Web app
     * @param createdAt Time at which the log entry was created.
     * @param channel channel
     * @param agent agent
     * @param note Optional field containing a note, if one was included with the log entry.
     * @param contexts Contexts to be included with the trigger such as links to graphs or images.
     * @param service service
     * @param incident incident
     * @param teams Will consist of references unless included
     * @param eventDetails eventDetails
     * @param acknowledgementTimeout Duration for which the acknowledgement lasts, in seconds. Services can contain an {@code acknowledgement_timeout} property, which specifies the length of time acknowledgements should last for. Each time an incident is acknowledged, this timeout is copied into the acknowledgement log entry. This property is optional, as older log entries may not contain it. It may also be {@code null}, as acknowledgements can be performed on incidents whose services have no {@code acknowledgement_timeout} set.
     */
    @ApiStatus.Internal
    public AcknowledgeLogEntry(String id, String summary, TypeEnum type, String self, String htmlUrl, OffsetDateTime createdAt, Channel channel, AgentReference agent, String note, List<Context> contexts, ServiceReference service, IncidentReference incident, List<TeamReference> teams, LogEntryAllOfEventDetails eventDetails, Integer acknowledgementTimeout) {
        this.id = id;
        this.summary = summary;
        this.type = type;
        this.self = self;
        this.htmlUrl = htmlUrl;
        this.createdAt = createdAt;
        this.channel = channel;
        this.agent = agent;
        this.note = note;
        this.contexts = contexts;
        this.service = service;
        this.incident = incident;
        this.teams = teams;
        this.eventDetails = eventDetails;
        this.acknowledgementTimeout = acknowledgementTimeout;
    }

    @AllArgsConstructor
    public enum TypeEnum {
        ACKNOWLEDGEMENT_LOG_ENTRY("acknowledgement_log_entry"),
        ANNOTATE_LOG_ENTRY("annotate_log_entry"),
        ASSIGN_LOG_ENTRY("assign_log_entry"),
        DELEGATE_LOG_ENTRY("delegate_log_entry"),
        ESCALATE_LOG_ENTRY("escalate_log_entry"),
        EXHAUST_ESCALATION_PATH_LOG_ENTRY("exhaust_escalation_path_log_entry"),
        NOTIFY_LOG_ENTRY("notify_log_entry"),
        REACH_ACK_LIMIT_LOG_ENTRY("reach_ack_limit_log_entry"),
        REACH_TRIGGER_LIMIT_LOG_ENTRY("reach_trigger_limit_log_entry"),
        REPEAT_ESCALATION_PATH_LOG_ENTRY("repeat_escalation_path_log_entry"),
        RESOLVE_LOG_ENTRY("resolve_log_entry"),
        SNOOZE_LOG_ENTRY("snooze_log_entry"),
        TRIGGER_LOG_ENTRY("trigger_log_entry"),
        UNACKNOWLEDGE_LOG_ENTRY("unacknowledge_log_entry"),
        URGENCY_CHANGE_LOG_ENTRY("urgency_change_log_entry");

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
