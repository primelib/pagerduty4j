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
 * AssignLogEntry
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
    "assignees"
})
@JsonTypeName("AssignLogEntry")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AssignLogEntry {

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
     * An array of assigned Users for this log entry
     */
    @JsonProperty("assignees")
    protected List<UserReference> assignees;

    /**
     * Constructs a validated instance of {@link AssignLogEntry}.
     *
     * @param spec the specification to process
     */
    public AssignLogEntry(Consumer<AssignLogEntry> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AssignLogEntry}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AssignLogEntry(Consumer)} instead.
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
     * @param assignees An array of assigned Users for this log entry
     */
    @ApiStatus.Internal
    public AssignLogEntry(String id, String summary, TypeEnum type, String self, String htmlUrl, OffsetDateTime createdAt, Channel channel, AgentReference agent, String note, List<Context> contexts, ServiceReference service, IncidentReference incident, List<TeamReference> teams, LogEntryAllOfEventDetails eventDetails, List<UserReference> assignees) {
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
        this.assignees = assignees;
    }

    @AllArgsConstructor
    public enum TypeEnum {
        ASSIGN_LOG_ENTRY("assign_log_entry");

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
