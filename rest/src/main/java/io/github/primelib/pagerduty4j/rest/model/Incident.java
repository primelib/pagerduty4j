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
    "title",
    "created_at",
    "updated_at",
    "status",
    "incident_key",
    "service",
    "assignments",
    "assigned_via",
    "last_status_change_at",
    "resolved_at",
    "first_trigger_log_entry",
    "alert_counts",
    "is_mergeable",
    "escalation_policy",
    "teams",
    "pending_actions",
    "acknowledgements",
    "alert_grouping",
    "last_status_change_by",
    "priority",
    "resolve_reason",
    "conference_bridge",
    "incidents_responders",
    "responder_requests",
    "urgency",
    "body"
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
     * A succinct description of the nature, symptoms, cause, or effect of the incident.
     */
    @JsonProperty("title")
    protected String title;

    /**
     * The time the incident was first triggered.
     */
    @JsonProperty("created_at")
    protected OffsetDateTime createdAt;

    /**
     * The time the incident was last modified.
     */
    @JsonProperty("updated_at")
    protected OffsetDateTime updatedAt;

    /**
     * The current status of the incident.
     */
    @JsonProperty("status")
    protected StatusEnum status;

    /**
     * The incident's de-duplication key.
     */
    @JsonProperty("incident_key")
    protected String incidentKey;

    @JsonProperty("service")
    protected IncidentAllOfService service;

    /**
     * List of all assignments for this incident. This list will be empty if the {@code Incident.status} is {@code resolved}. Returns a user reference for each assignment. Full user definitions will be returned if the {@code include[]=assignees} query parameter is provided.
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
     * The time the status of the incident last changed. If the incident is not currently acknowledged or resolved, this will be the incident's {@code updated_at}.
     */
    @JsonProperty("last_status_change_at")
    protected OffsetDateTime lastStatusChangeAt;

    /**
     * The time the incident became "resolved" or {@code null} if the incident is not resolved.
     */
    @JsonProperty("resolved_at")
    protected OffsetDateTime resolvedAt;

    @JsonProperty("first_trigger_log_entry")
    protected IncidentAllOfFirstTriggerLogEntry firstTriggerLogEntry;

    @JsonProperty("alert_counts")
    protected AlertCount alertCounts;

    /**
     * Whether the incident is mergeable. Only incidents that have alerts, or that are manually created can be merged.
     */
    @JsonProperty("is_mergeable")
    protected Boolean isMergeable;

    @JsonProperty("escalation_policy")
    protected IncidentAllOfEscalationPolicy escalationPolicy;

    /**
     * The teams involved in the incident’s lifecycle. If the {@code include[]=teams} query parameter is provided, the full team definitions will be returned.
     */
    @JsonProperty("teams")
    protected List<IncidentAllOfTeams> teams;

    /**
     * The list of pending_actions on the incident. A pending_action object contains a type of action which can be escalate, unacknowledge, resolve or urgency_change. A pending_action object contains at, the time at which the action will take place. An urgency_change pending_action will contain to, the urgency that the incident will change to.
     */
    @JsonProperty("pending_actions")
    protected List<IncidentAction> pendingActions;

    /**
     * List of all acknowledgements for this incident. This list will be empty if the {@code Incident.status} is {@code resolved} or {@code triggered}. If the {@code include[]=acknowledgers} query parameter is provided, the full user or service definitions will be returned for each acknowledgement entry.
     */
    @JsonProperty("acknowledgements")
    protected List<Acknowledgement> acknowledgements;

    @JsonProperty("alert_grouping")
    protected IncidentAllOfAlertGrouping alertGrouping;

    @JsonProperty("last_status_change_by")
    protected IncidentAllOfLastStatusChangeBy lastStatusChangeBy;

    @JsonProperty("priority")
    protected Priority priority;

    @JsonProperty("resolve_reason")
    protected ResolveReason resolveReason;

    @JsonProperty("conference_bridge")
    protected IncidentAllOfConferenceBridge conferenceBridge;

    /**
     * The responders on the incident. Only returned if the account has access to the [responder requests](https://support.pagerduty.com/docs/add-responders) feature.
     */
    @JsonProperty("incidents_responders")
    protected List<IncidentsRespondersReference> incidentsResponders;

    /**
     * Previous responder requests made on this incident. Only returned if the account has access to the [responder requests](https://support.pagerduty.com/docs/add-responders) feature.
     */
    @JsonProperty("responder_requests")
    protected List<ResponderRequest> responderRequests;

    /**
     * The current urgency of the incident.
     */
    @JsonProperty("urgency")
    protected UrgencyEnum urgency;

    @JsonProperty("body")
    protected IncidentAllOfBody body;

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
     * @param id id
     * @param summary A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to {@code name}, though it is not intended to be an identifier.
     * @param type A string that determines the schema of the object. This must be the standard name for the entity, suffixed by {@code _reference} if the object is a reference.
     * @param self the API show URL at which the object is accessible
     * @param htmlUrl a URL at which the entity is uniquely displayed in the Web app
     * @param incidentNumber The number of the incident. This is unique across your account.
     * @param title A succinct description of the nature, symptoms, cause, or effect of the incident.
     * @param createdAt The time the incident was first triggered.
     * @param updatedAt The time the incident was last modified.
     * @param status The current status of the incident.
     * @param incidentKey The incident's de-duplication key.
     * @param service service
     * @param assignments List of all assignments for this incident. This list will be empty if the {@code Incident.status} is {@code resolved}. Returns a user reference for each assignment. Full user definitions will be returned if the {@code include[]=assignees} query parameter is provided.
     * @param assignedVia How the current incident assignments were decided.  Note that {@code direct_assignment} incidents will not escalate up the attached {@code escalation_policy}
     * @param lastStatusChangeAt The time the status of the incident last changed. If the incident is not currently acknowledged or resolved, this will be the incident's {@code updated_at}.
     * @param resolvedAt The time the incident became "resolved" or {@code null} if the incident is not resolved.
     * @param firstTriggerLogEntry firstTriggerLogEntry
     * @param alertCounts alertCounts
     * @param isMergeable Whether the incident is mergeable. Only incidents that have alerts, or that are manually created can be merged.
     * @param escalationPolicy escalationPolicy
     * @param teams The teams involved in the incident’s lifecycle. If the {@code include[]=teams} query parameter is provided, the full team definitions will be returned.
     * @param pendingActions The list of pending_actions on the incident. A pending_action object contains a type of action which can be escalate, unacknowledge, resolve or urgency_change. A pending_action object contains at, the time at which the action will take place. An urgency_change pending_action will contain to, the urgency that the incident will change to.
     * @param acknowledgements List of all acknowledgements for this incident. This list will be empty if the {@code Incident.status} is {@code resolved} or {@code triggered}. If the {@code include[]=acknowledgers} query parameter is provided, the full user or service definitions will be returned for each acknowledgement entry.
     * @param alertGrouping alertGrouping
     * @param lastStatusChangeBy lastStatusChangeBy
     * @param priority priority
     * @param resolveReason resolveReason
     * @param conferenceBridge conferenceBridge
     * @param incidentsResponders The responders on the incident. Only returned if the account has access to the [responder requests](https://support.pagerduty.com/docs/add-responders) feature.
     * @param responderRequests Previous responder requests made on this incident. Only returned if the account has access to the [responder requests](https://support.pagerduty.com/docs/add-responders) feature.
     * @param urgency The current urgency of the incident.
     * @param body body
     */
    @ApiStatus.Internal
    public Incident(String id, String summary, String type, String self, String htmlUrl, Integer incidentNumber, String title, OffsetDateTime createdAt, OffsetDateTime updatedAt, StatusEnum status, String incidentKey, IncidentAllOfService service, List<Assignment> assignments, AssignedViaEnum assignedVia, OffsetDateTime lastStatusChangeAt, OffsetDateTime resolvedAt, IncidentAllOfFirstTriggerLogEntry firstTriggerLogEntry, AlertCount alertCounts, Boolean isMergeable, IncidentAllOfEscalationPolicy escalationPolicy, List<IncidentAllOfTeams> teams, List<IncidentAction> pendingActions, List<Acknowledgement> acknowledgements, IncidentAllOfAlertGrouping alertGrouping, IncidentAllOfLastStatusChangeBy lastStatusChangeBy, Priority priority, ResolveReason resolveReason, IncidentAllOfConferenceBridge conferenceBridge, List<IncidentsRespondersReference> incidentsResponders, List<ResponderRequest> responderRequests, UrgencyEnum urgency, IncidentAllOfBody body) {
        this.id = id;
        this.summary = summary;
        this.type = type;
        this.self = self;
        this.htmlUrl = htmlUrl;
        this.incidentNumber = incidentNumber;
        this.title = title;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.status = status;
        this.incidentKey = incidentKey;
        this.service = service;
        this.assignments = assignments;
        this.assignedVia = assignedVia;
        this.lastStatusChangeAt = lastStatusChangeAt;
        this.resolvedAt = resolvedAt;
        this.firstTriggerLogEntry = firstTriggerLogEntry;
        this.alertCounts = alertCounts;
        this.isMergeable = isMergeable;
        this.escalationPolicy = escalationPolicy;
        this.teams = teams;
        this.pendingActions = pendingActions;
        this.acknowledgements = acknowledgements;
        this.alertGrouping = alertGrouping;
        this.lastStatusChangeBy = lastStatusChangeBy;
        this.priority = priority;
        this.resolveReason = resolveReason;
        this.conferenceBridge = conferenceBridge;
        this.incidentsResponders = incidentsResponders;
        this.responderRequests = responderRequests;
        this.urgency = urgency;
        this.body = body;
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
