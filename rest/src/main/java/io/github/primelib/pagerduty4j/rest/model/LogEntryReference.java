package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LogEntryReference
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
    "html_url"
})
@JsonTypeName("LogEntryReference")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class LogEntryReference {

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


    @AllArgsConstructor
    public enum TypeEnum {
        ACKNOWLEDGE_LOG_ENTRY_REFERENCE("acknowledge_log_entry_reference"),
        ANNOTATE_LOG_ENTRY_REFERENCE("annotate_log_entry_reference"),
        ASSIGN_LOG_ENTRY_REFERENCE("assign_log_entry_reference"),
        ESCALATE_LOG_ENTRY_REFERENCE("escalate_log_entry_reference"),
        EXHAUST_ESCALATION_PATH_LOG_ENTRY_REFERENCE("exhaust_escalation_path_log_entry_reference"),
        NOTIFY_LOG_ENTRY_REFERENCE("notify_log_entry_reference"),
        REACH_TRIGGER_LIMIT_LOG_ENTRY_REFERENCE("reach_trigger_limit_log_entry_reference"),
        REPEAT_ESCALATION_PATH_LOG_ENTRY_REFERENCE("repeat_escalation_path_log_entry_reference"),
        RESOLVE_LOG_ENTRY_REFERENCE("resolve_log_entry_reference"),
        SNOOZE_LOG_ENTRY_REFERENCE("snooze_log_entry_reference"),
        TRIGGER_LOG_ENTRY_REFERENCE("trigger_log_entry_reference"),
        UNACKNOWLEDGE_LOG_ENTRY_REFERENCE("unacknowledge_log_entry_reference");

        private final String value;
    }

}