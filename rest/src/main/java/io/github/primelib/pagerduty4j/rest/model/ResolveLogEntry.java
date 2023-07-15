package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.time.OffsetDateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ResolveLogEntry
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
@JsonTypeName("ResolveLogEntry")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ResolveLogEntry {

    /**
     * Constructs a validated implementation of {@link ResolveLogEntry}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ResolveLogEntry(Consumer<ResolveLogEntry> spec) {
        spec.accept(this);
    }

    @JsonProperty("id")
    protected String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
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


    @AllArgsConstructor
    public enum TypeEnum {
        RESOLVE_LOG_ENTRY("resolve_log_entry");

        private final String value;
    }

}
