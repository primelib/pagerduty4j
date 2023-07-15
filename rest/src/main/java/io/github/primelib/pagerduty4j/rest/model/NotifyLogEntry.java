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
 * NotifyLogEntry
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
    "event_details",
    "user"
})
@JsonTypeName("NotifyLogEntry")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class NotifyLogEntry {

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
     * Time at which the log entry was created
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

    @JsonProperty("user")
    private UserReference user;


    @AllArgsConstructor
    public enum TypeEnum {
        NOTIFY_LOG_ENTRY("notify_log_entry");

        private final String value;
    }

}