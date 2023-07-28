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
 * Incident
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
    protected String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to {@code name}, though it is not intended to be an identifier.
     */
    @JsonProperty("summary")
    protected String summary;

    /**
     * A string that determines the schema of the object. This must be the standard name for the entity, suffixed by {@code _reference} if the object is a reference.
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
     * List of all assignments for this incident. This list will be empty if the {@code Incident.status} is {@code resolved}.
     */
    @JsonProperty("assignments")
    protected List<Assignment> assignments;

    /**
     * How the current incident assignments were decided.
     * Note that {@code direct_assignment} incidents will not escalate up the attached {@code escalation_policy}
     */
    @JsonProperty("assigned_via")
    protected AssignedViaEnum assignedVia;

    /**
     * List of all acknowledgements for this incident. This list will be empty if the {@code Incident.status} is {@code resolved} or {@code triggered}.
     */
    @JsonProperty("acknowledgements")
    protected List<Acknowledgement> acknowledgements;

    /**
     * The time the status of the incident last changed. If the incident is not currently acknowledged or resolved, this will be the incident's {@code updated_at}.
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
     * The time the incident became "resolved" or {@code null} if the incident is not resolved.
     */
    @JsonProperty("resolved_at")
    protected OffsetDateTime resolvedAt;

    /**
     * The time the incident was last modified.
     */
    @JsonProperty("updated_at")
    protected OffsetDateTime updatedAt;

    /**
     * Constructs a validated instance of {@link Incident}.
     *
     * @param spec the specification to process
     */
    public Incident(Consumer<Incident> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Incident}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Incident(Consumer)} instead.
     * @param id var.name
     * @param summary A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to {@code name}, though it is not intended to be an identifier.
     * @param type A string that determines the schema of the object. This must be the standard name for the entity, suffixed by {@code _reference} if the object is a reference.
     * @param self the API show URL at which the object is accessible
     * @param htmlUrl a URL at which the entity is uniquely displayed in the Web app
     * @param incidentNumber The number of the incident. This is unique across your account.
     * @param createdAt The time the incident was first triggered.
     * @param status The current status of the incident.
     * @param title A succinct description of the nature, symptoms, cause, or effect of the incident.
     * @param pendingActions The list of pending_actions on the incident. A pending_action object contains a type of action which can be escalate, unacknowledge, resolve or urgency_change. A pending_action object contains at, the time at which the action will take place. An urgency_change pending_action will contain to, the urgency that the incident will change to.
     * @param incidentKey The incident's de-duplication key.
     * @param service var.name
     * @param assignments List of all assignments for this incident. This list will be empty if the {@code Incident.status} is {@code resolved}.
     * @param assignedVia How the current incident assignments were decided.  Note that {@code direct_assignment} incidents will not escalate up the attached {@code escalation_policy}
     * @param acknowledgements List of all acknowledgements for this incident. This list will be empty if the {@code Incident.status} is {@code resolved} or {@code triggered}.
     * @param lastStatusChangeAt The time the status of the incident last changed. If the incident is not currently acknowledged or resolved, this will be the incident's {@code updated_at}.
     * @param lastStatusChangeBy var.name
     * @param firstTriggerLogEntry var.name
     * @param escalationPolicy var.name
     * @param teams The teams involved in the incident’s lifecycle.
     * @param priority var.name
     * @param urgency The current urgency of the incident.
     * @param resolveReason var.name
     * @param alertCounts var.name
     * @param conferenceBridge var.name
     * @param body var.name
     * @param incidentsResponders var.name
     * @param responderRequests var.name
     * @param resolvedAt The time the incident became "resolved" or {@code null} if the incident is not resolved.
     * @param updatedAt The time the incident was last modified.
     */
    @ApiStatus.Internal
    public Incident(String id, String summary, String type, String self, String htmlUrl, Integer incidentNumber, OffsetDateTime createdAt, StatusEnum status, String title, List<IncidentAction> pendingActions, String incidentKey, ServiceReference service, List<Assignment> assignments, AssignedViaEnum assignedVia, List<Acknowledgement> acknowledgements, OffsetDateTime lastStatusChangeAt, AgentReference lastStatusChangeBy, LogEntryReference firstTriggerLogEntry, EscalationPolicyReference escalationPolicy, List<TeamReference> teams, PriorityReference priority, UrgencyEnum urgency, ResolveReason resolveReason, AlertCount alertCounts, ConferenceBridge conferenceBridge, IncidentBody body, List<IncidentsRespondersReference> incidentsResponders, List<ResponderRequest> responderRequests, OffsetDateTime resolvedAt, OffsetDateTime updatedAt) {
        this.id = id;
        this.summary = summary;
        this.type = type;
        this.self = self;
        this.htmlUrl = htmlUrl;
        this.incidentNumber = incidentNumber;
        this.createdAt = createdAt;
        this.status = status;
        this.title = title;
        this.pendingActions = pendingActions;
        this.incidentKey = incidentKey;
        this.service = service;
        this.assignments = assignments;
        this.assignedVia = assignedVia;
        this.acknowledgements = acknowledgements;
        this.lastStatusChangeAt = lastStatusChangeAt;
        this.lastStatusChangeBy = lastStatusChangeBy;
        this.firstTriggerLogEntry = firstTriggerLogEntry;
        this.escalationPolicy = escalationPolicy;
        this.teams = teams;
        this.priority = priority;
        this.urgency = urgency;
        this.resolveReason = resolveReason;
        this.alertCounts = alertCounts;
        this.conferenceBridge = conferenceBridge;
        this.body = body;
        this.incidentsResponders = incidentsResponders;
        this.responderRequests = responderRequests;
        this.resolvedAt = resolvedAt;
        this.updatedAt = updatedAt;
    }

    /**
     * The current status of the incident.
     */
    @AllArgsConstructor
    public enum StatusEnum {
        TRIGGERED("triggered"),
        ACKNOWLEDGED("acknowledged"),
        RESOLVED("resolved");

        private static final StatusEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static StatusEnum of(String input) {
            if (input != null) {
                for (StatusEnum v : VALUES) {
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

    /**
     * How the current incident assignments were decided.
     * Note that {@code direct_assignment} incidents will not escalate up the attached {@code escalation_policy}
     */
    @AllArgsConstructor
    public enum AssignedViaEnum {
        ESCALATION_POLICY("escalation_policy"),
        DIRECT_ASSIGNMENT("direct_assignment");

        private static final AssignedViaEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static AssignedViaEnum of(String input) {
            if (input != null) {
                for (AssignedViaEnum v : VALUES) {
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

    /**
     * The current urgency of the incident.
     */
    @AllArgsConstructor
    public enum UrgencyEnum {
        HIGH("high"),
        LOW("low");

        private static final UrgencyEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static UrgencyEnum of(String input) {
            if (input != null) {
                for (UrgencyEnum v : VALUES) {
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
