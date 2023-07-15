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
 * Incident
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
    "incident_number",
    "created_at",
    "status",
    "title",
    "pending_actions",
    "incident_key",
    "service",
    "assignments",
    "assigned_via",
    "acknowledgements",
    "last_status_change_at",
    "last_status_change_by",
    "first_trigger_log_entry",
    "escalation_policy",
    "teams",
    "priority",
    "urgency",
    "resolve_reason",
    "alert_counts",
    "conference_bridge",
    "body",
    "incidents_responders",
    "responder_requests",
    "resolved_at",
    "updated_at"
})
@JsonTypeName("Incident")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Incident {

    /**
     * Constructs a validated implementation of {@link Incident}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Incident(Consumer<Incident> spec) {
        spec.accept(this);
    }

    @JsonProperty("id")
    protected String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
     */
    @JsonProperty("summary")
    protected String summary;

    /**
     * A string that determines the schema of the object. This must be the standard name for the entity, suffixed by `_reference` if the object is a reference.
     */
    @JsonProperty("type")
    protected String type;

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
     * The number of the incident. This is unique across your account.
     */
    @JsonProperty("incident_number")
    protected Integer incidentNumber;

    /**
     * The time the incident was first triggered.
     */
    @JsonProperty("created_at")
    protected OffsetDateTime createdAt;

    /**
     * The current status of the incident.
     */
    @JsonProperty("status")
    protected StatusEnum status;

    /**
     * A succinct description of the nature, symptoms, cause, or effect of the incident.
     */
    @JsonProperty("title")
    protected String title;

    /**
     * The list of pending_actions on the incident. A pending_action object contains a type of action which can be escalate, unacknowledge, resolve or urgency_change. A pending_action object contains at, the time at which the action will take place. An urgency_change pending_action will contain to, the urgency that the incident will change to.
     */
    @JsonProperty("pending_actions")
    protected List<IncidentAction> pendingActions;

    /**
     * The incident's de-duplication key.
     */
    @JsonProperty("incident_key")
    protected String incidentKey;

    @JsonProperty("service")
    protected ServiceReference service;

    /**
     * List of all assignments for this incident. This list will be empty if the `Incident.status` is `resolved`.
     */
    @JsonProperty("assignments")
    protected List<Assignment> assignments;

    /**
     * How the current incident assignments were decided.
     * Note that `direct_assignment` incidents will not escalate up the attached `escalation_policy`
     */
    @JsonProperty("assigned_via")
    protected AssignedViaEnum assignedVia;

    /**
     * List of all acknowledgements for this incident. This list will be empty if the `Incident.status` is `resolved` or `triggered`.
     */
    @JsonProperty("acknowledgements")
    protected List<Acknowledgement> acknowledgements;

    /**
     * The time the status of the incident last changed. If the incident is not currently acknowledged or resolved, this will be the incident's `updated_at`.
     */
    @JsonProperty("last_status_change_at")
    protected OffsetDateTime lastStatusChangeAt;

    @JsonProperty("last_status_change_by")
    protected AgentReference lastStatusChangeBy;

    @JsonProperty("first_trigger_log_entry")
    protected LogEntryReference firstTriggerLogEntry;

    @JsonProperty("escalation_policy")
    protected EscalationPolicyReference escalationPolicy;

    /**
     * The teams involved in the incident’s lifecycle.
     */
    @JsonProperty("teams")
    protected List<TeamReference> teams;

    @JsonProperty("priority")
    protected PriorityReference priority;

    /**
     * The current urgency of the incident.
     */
    @JsonProperty("urgency")
    protected UrgencyEnum urgency;

    @JsonProperty("resolve_reason")
    protected ResolveReason resolveReason;

    @JsonProperty("alert_counts")
    protected AlertCount alertCounts;

    @JsonProperty("conference_bridge")
    protected ConferenceBridge conferenceBridge;

    @JsonProperty("body")
    protected IncidentBody body;

    @JsonProperty("incidents_responders")
    protected List<IncidentsRespondersReference> incidentsResponders;

    @JsonProperty("responder_requests")
    protected List<ResponderRequest> responderRequests;

    /**
     * The time the incident became "resolved" or `null` if the incident is not resolved.
     */
    @JsonProperty("resolved_at")
    protected OffsetDateTime resolvedAt;

    /**
     * The time the incident was last modified.
     */
    @JsonProperty("updated_at")
    protected OffsetDateTime updatedAt;


    /**
     * The current status of the incident.
     */
    @AllArgsConstructor
    public enum StatusEnum {
        TRIGGERED("triggered"),
        ACKNOWLEDGED("acknowledged"),
        RESOLVED("resolved");

        private final String value;
    }

    /**
     * How the current incident assignments were decided.
     * Note that `direct_assignment` incidents will not escalate up the attached `escalation_policy`
     */
    @AllArgsConstructor
    public enum AssignedViaEnum {
        ESCALATION_POLICY("escalation_policy"),
        DIRECT_ASSIGNMENT("direct_assignment");

        private final String value;
    }

    /**
     * The current urgency of the incident.
     */
    @AllArgsConstructor
    public enum UrgencyEnum {
        HIGH("high"),
        LOW("low");

        private final String value;
    }

}
