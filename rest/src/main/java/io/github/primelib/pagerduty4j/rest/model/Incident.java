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
 * Incident
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

    @JsonProperty("id")
    private String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
     */
    @JsonProperty("summary")
    private String summary;

    /**
     * A string that determines the schema of the object. This must be the standard name for the entity, suffixed by `_reference` if the object is a reference.
     */
    @JsonProperty("type")
    private String type;

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
     * The number of the incident. This is unique across your account.
     */
    @JsonProperty("incident_number")
    private Integer incidentNumber;

    /**
     * The time the incident was first triggered.
     */
    @JsonProperty("created_at")
    private OffsetDateTime createdAt;

    /**
     * The current status of the incident.
     */
    @JsonProperty("status")
    private StatusEnum status;

    /**
     * A succinct description of the nature, symptoms, cause, or effect of the incident.
     */
    @JsonProperty("title")
    private String title;

    /**
     * The list of pending_actions on the incident. A pending_action object contains a type of action which can be escalate, unacknowledge, resolve or urgency_change. A pending_action object contains at, the time at which the action will take place. An urgency_change pending_action will contain to, the urgency that the incident will change to.
     */
    @JsonProperty("pending_actions")
    private List<IncidentAction> pendingActions;

    /**
     * The incident's de-duplication key.
     */
    @JsonProperty("incident_key")
    private String incidentKey;

    @JsonProperty("service")
    private ServiceReference service;

    /**
     * List of all assignments for this incident. This list will be empty if the `Incident.status` is `resolved`.
     */
    @JsonProperty("assignments")
    private List<Assignment> assignments;

    /**
     * How the current incident assignments were decided.
     * Note that `direct_assignment` incidents will not escalate up the attached `escalation_policy`
     */
    @JsonProperty("assigned_via")
    private AssignedViaEnum assignedVia;

    /**
     * List of all acknowledgements for this incident. This list will be empty if the `Incident.status` is `resolved` or `triggered`.
     */
    @JsonProperty("acknowledgements")
    private List<Acknowledgement> acknowledgements;

    /**
     * The time the status of the incident last changed. If the incident is not currently acknowledged or resolved, this will be the incident's `updated_at`.
     */
    @JsonProperty("last_status_change_at")
    private OffsetDateTime lastStatusChangeAt;

    @JsonProperty("last_status_change_by")
    private AgentReference lastStatusChangeBy;

    @JsonProperty("first_trigger_log_entry")
    private LogEntryReference firstTriggerLogEntry;

    @JsonProperty("escalation_policy")
    private EscalationPolicyReference escalationPolicy;

    /**
     * The teams involved in the incident’s lifecycle.
     */
    @JsonProperty("teams")
    private List<TeamReference> teams;

    @JsonProperty("priority")
    private PriorityReference priority;

    /**
     * The current urgency of the incident.
     */
    @JsonProperty("urgency")
    private UrgencyEnum urgency;

    @JsonProperty("resolve_reason")
    private ResolveReason resolveReason;

    @JsonProperty("alert_counts")
    private AlertCount alertCounts;

    @JsonProperty("conference_bridge")
    private ConferenceBridge conferenceBridge;

    @JsonProperty("body")
    private IncidentBody body;

    @JsonProperty("incidents_responders")
    private List<IncidentsRespondersReference> incidentsResponders;

    @JsonProperty("responder_requests")
    private List<ResponderRequest> responderRequests;

    /**
     * The time the incident became "resolved" or `null` if the incident is not resolved.
     */
    @JsonProperty("resolved_at")
    private OffsetDateTime resolvedAt;

    /**
     * The time the incident was last modified.
     */
    @JsonProperty("updated_at")
    private OffsetDateTime updatedAt;


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