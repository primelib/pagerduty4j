package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LogEntry
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    "event_details"
})
@JsonTypeName("LogEntry")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class LogEntry {

    @JsonProperty("id")
    private String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
     */
    @JsonProperty("summary")
    private String summary;

    @JsonProperty("type")
    private TypeEnum type;

    /**
     * the API show URL at which the object is accessible
     */
    @JsonProperty("self")
    private String self;

    /**
     * a URL at which the entity is uniquely displayed in the Web app
     */
    @JsonProperty("html_url")
    private String htmlUrl;

    /**
     * Time at which the log entry was created.
     */
    @JsonProperty("created_at")
    private OffsetDateTime createdAt;

    @JsonProperty("channel")
    private Channel channel;

    @JsonProperty("agent")
    private AgentReference agent;

    /**
     * Optional field containing a note, if one was included with the log entry.
     */
    @JsonProperty("note")
    private String note;

    /**
     * Contexts to be included with the trigger such as links to graphs or images.
     */
    @JsonProperty("contexts")
    private List<Context> contexts;

    @JsonProperty("service")
    private ServiceReference service;

    @JsonProperty("incident")
    private IncidentReference incident;

    /**
     * Will consist of references unless included
     */
    @JsonProperty("teams")
    private List<TeamReference> teams;

    @JsonProperty("event_details")
    private LogEntryAllOfEventDetails eventDetails;


    @AllArgsConstructor
    public enum TypeEnum {
        ACKNOWLEDGE_LOG_ENTRY("acknowledge_log_entry"),
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

        private final String value;
    }

}
