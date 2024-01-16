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
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AnalyticsRawIncident
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
    "assignment_count",
    "auto_resolved",
    "business_hour_interruptions",
    "created_at",
    "description",
    "engaged_seconds",
    "engaged_user_count",
    "escalation_count",
    "escalation_policy_id",
    "escalation_policy_name",
    "id",
    "incident_number",
    "major",
    "manual_escalation_count",
    "off_hour_interruptions",
    "priority_id",
    "priority_name",
    "priority_order",
    "reassignment_count",
    "resolved_at",
    "resolved_by_user_id",
    "resolved_by_user_name",
    "seconds_to_engage",
    "seconds_to_first_ack",
    "seconds_to_mobilize",
    "seconds_to_resolve",
    "service_id",
    "service_name",
    "sleep_hour_interruptions",
    "snoozed_seconds",
    "status",
    "team_id",
    "team_name",
    "timeout_escalation_count",
    "total_interruptions",
    "total_notifications",
    "urgency",
    "user_defined_effort_seconds"
})
@JsonTypeName("AnalyticsRawIncident")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AnalyticsRawIncident {

    /**
     * Total count of instances where responders were assigned an incident (including through reassignment or escalation) or accepted a responder request.
     */
    @JsonProperty("assignment_count")
    protected Integer assignmentCount;

    /**
     * Whether or not the incident resolved automatically, either via an integration
     * or [auto-resolved in PagerDuty](https://support.pagerduty.com/docs/configurable-service-settings#auto-resolution).
     */
    @JsonProperty("auto_resolved")
    protected Boolean autoResolved;

    /**
     * Total number of unique interruptions during business hours; 8am-6pm Mon-Fri, based on the user’s time zone.
     */
    @JsonProperty("business_hour_interruptions")
    protected Integer businessHourInterruptions;

    /**
     * Timestamp of when the incident was created.
     */
    @JsonProperty("created_at")
    protected String createdAt;

    /**
     * The incident description
     */
    @JsonProperty("description")
    protected String description;

    /**
     * Total engaged time across all responders for this incident.
     * Engaged time is measured from the time a user engages with an incident (by acknowledging or accepting a responder request) until the incident is resolved.
     * This may include periods in which the incidents were snoozed.
     */
    @JsonProperty("engaged_seconds")
    protected Integer engagedSeconds;

    /**
     * Total number of users who engaged (acknowledged, accepted responder request) in the incident.
     */
    @JsonProperty("engaged_user_count")
    protected Integer engagedUserCount;

    /**
     * Total count of instances where an incident is escalated between responders assigned to an escalation policy.
     */
    @JsonProperty("escalation_count")
    protected Integer escalationCount;

    /**
     * ID of the escalation policy the incident was assigned to.
     */
    @JsonProperty("escalation_policy_id")
    protected String escalationPolicyId;

    /**
     * Name of the escalation policy the incident was assigned to.
     */
    @JsonProperty("escalation_policy_name")
    protected String escalationPolicyName;

    /**
     * Incident ID
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The PagerDuty incident number.
     */
    @JsonProperty("incident_number")
    protected Integer incidentNumber;

    /**
     * An incident is classified as a [major incident](https://support.pagerduty.com/docs/operational-reviews#major-incidents) if it has one of the two highest priorities, or if multiple responders are added and acknowledge the incident.
     */
    @JsonProperty("major")
    protected Boolean major;

    /**
     * Total count of manual escalations in the incident.
     */
    @JsonProperty("manual_escalation_count")
    protected Integer manualEscalationCount;

    /**
     * Total number of unique interruptions during off hours; 6pm-10pm Mon-Fri and all day Sat-Sun, based on the user’s time zone.
     */
    @JsonProperty("off_hour_interruptions")
    protected Integer offHourInterruptions;

    /**
     * ID of the incident's priority level.
     */
    @JsonProperty("priority_id")
    protected String priorityId;

    /**
     * The user-provided short name of the priority.
     */
    @JsonProperty("priority_name")
    protected String priorityName;

    /**
     * The numerical value used to sort priorities. Higher values are higher priority.
     */
    @JsonProperty("priority_order")
    protected Integer priorityOrder;

    /**
     * Total count of reassignments in the incident.
     */
    @JsonProperty("reassignment_count")
    protected Integer reassignmentCount;

    /**
     * Timestamp of when the incident was resolved.
     */
    @JsonProperty("resolved_at")
    protected String resolvedAt;

    /**
     * ID of the user who resolved the incident.
     */
    @JsonProperty("resolved_by_user_id")
    protected String resolvedByUserId;

    /**
     * Name of the user who resolved the incident.
     */
    @JsonProperty("resolved_by_user_name")
    protected String resolvedByUserName;

    /**
     * A measure of *people response time*. This metric measures the time from the first user engagement (acknowledge or responder accept) to the last. This metric is only used for incidents with **multiple responders**; for incidents with one or no engaged users, this value is null.
     */
    @JsonProperty("seconds_to_engage")
    protected Integer secondsToEngage;

    /**
     * Time between the start of an incident, and the first responder to acknowledge.
     */
    @JsonProperty("seconds_to_first_ack")
    protected Integer secondsToFirstAck;

    /**
     * Time between the start of an incident, and the last additional responder to acknowledge. If an incident has one or no responders, the value will be null.
     */
    @JsonProperty("seconds_to_mobilize")
    protected Integer secondsToMobilize;

    /**
     * Time from when an incident was triggered until it was resolved.
     */
    @JsonProperty("seconds_to_resolve")
    protected Integer secondsToResolve;

    /**
     * ID of the service that the incident triggered on.
     */
    @JsonProperty("service_id")
    protected String serviceId;

    /**
     * Name of the service that the incident triggered on.
     */
    @JsonProperty("service_name")
    protected String serviceName;

    /**
     * Total number of unique interruptions during sleep hours; 10pm-8am every day, based on the user’s time zone.
     */
    @JsonProperty("sleep_hour_interruptions")
    protected Integer sleepHourInterruptions;

    /**
     * Total seconds the incident has been snoozed for.
     */
    @JsonProperty("snoozed_seconds")
    protected Integer snoozedSeconds;

    /**
     * The incident status. Can be one of {@code triggered}, {@code acknowledged}, or {@code resolved}.
     */
    @JsonProperty("status")
    protected String status;

    /**
     * ID of the team the incident was assigned to.
     */
    @JsonProperty("team_id")
    protected String teamId;

    /**
     * Name of the team the incident was assigned to.
     */
    @JsonProperty("team_name")
    protected String teamName;

    /**
     * Total count of timeout escalations in the incident.
     */
    @JsonProperty("timeout_escalation_count")
    protected Integer timeoutEscalationCount;

    /**
     * Total number of unique interruptions in the incident.
     */
    @JsonProperty("total_interruptions")
    protected Integer totalInterruptions;

    /**
     * Total number of notifications sent for the incident.
     */
    @JsonProperty("total_notifications")
    protected Integer totalNotifications;

    /**
     * Notification level
     */
    @JsonProperty("urgency")
    protected String urgency;

    /**
     * The total response effort in seconds, [as defined by the user](https://support.pagerduty.com/docs/editing-incidents#edit-incident-duration).
     */
    @JsonProperty("user_defined_effort_seconds")
    protected Integer userDefinedEffortSeconds;

    /**
     * Constructs a validated instance of {@link AnalyticsRawIncident}.
     *
     * @param spec the specification to process
     */
    public AnalyticsRawIncident(Consumer<AnalyticsRawIncident> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AnalyticsRawIncident}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AnalyticsRawIncident(Consumer)} instead.
     * @param assignmentCount Total count of instances where responders were assigned an incident (including through reassignment or escalation) or accepted a responder request.
     * @param autoResolved Whether or not the incident resolved automatically, either via an integration  or [auto-resolved in PagerDuty](https://support.pagerduty.com/docs/configurable-service-settings#auto-resolution).
     * @param businessHourInterruptions Total number of unique interruptions during business hours; 8am-6pm Mon-Fri, based on the user’s time zone.
     * @param createdAt Timestamp of when the incident was created.
     * @param description The incident description
     * @param engagedSeconds Total engaged time across all responders for this incident.  Engaged time is measured from the time a user engages with an incident (by acknowledging or accepting a responder request) until the incident is resolved.  This may include periods in which the incidents were snoozed.
     * @param engagedUserCount Total number of users who engaged (acknowledged, accepted responder request) in the incident.
     * @param escalationCount Total count of instances where an incident is escalated between responders assigned to an escalation policy.
     * @param escalationPolicyId ID of the escalation policy the incident was assigned to.
     * @param escalationPolicyName Name of the escalation policy the incident was assigned to.
     * @param id Incident ID
     * @param incidentNumber The PagerDuty incident number.
     * @param major An incident is classified as a [major incident](https://support.pagerduty.com/docs/operational-reviews#major-incidents) if it has one of the two highest priorities, or if multiple responders are added and acknowledge the incident.
     * @param manualEscalationCount Total count of manual escalations in the incident.
     * @param offHourInterruptions Total number of unique interruptions during off hours; 6pm-10pm Mon-Fri and all day Sat-Sun, based on the user’s time zone.
     * @param priorityId ID of the incident's priority level.
     * @param priorityName The user-provided short name of the priority.
     * @param priorityOrder The numerical value used to sort priorities. Higher values are higher priority.
     * @param reassignmentCount Total count of reassignments in the incident.
     * @param resolvedAt Timestamp of when the incident was resolved.
     * @param resolvedByUserId ID of the user who resolved the incident.
     * @param resolvedByUserName Name of the user who resolved the incident.
     * @param secondsToEngage A measure of *people response time*. This metric measures the time from the first user engagement (acknowledge or responder accept) to the last. This metric is only used for incidents with **multiple responders**; for incidents with one or no engaged users, this value is null.
     * @param secondsToFirstAck Time between the start of an incident, and the first responder to acknowledge.
     * @param secondsToMobilize Time between the start of an incident, and the last additional responder to acknowledge. If an incident has one or no responders, the value will be null.
     * @param secondsToResolve Time from when an incident was triggered until it was resolved.
     * @param serviceId ID of the service that the incident triggered on.
     * @param serviceName Name of the service that the incident triggered on.
     * @param sleepHourInterruptions Total number of unique interruptions during sleep hours; 10pm-8am every day, based on the user’s time zone.
     * @param snoozedSeconds Total seconds the incident has been snoozed for.
     * @param status The incident status. Can be one of {@code triggered}, {@code acknowledged}, or {@code resolved}.
     * @param teamId ID of the team the incident was assigned to.
     * @param teamName Name of the team the incident was assigned to.
     * @param timeoutEscalationCount Total count of timeout escalations in the incident.
     * @param totalInterruptions Total number of unique interruptions in the incident.
     * @param totalNotifications Total number of notifications sent for the incident.
     * @param urgency Notification level
     * @param userDefinedEffortSeconds The total response effort in seconds, [as defined by the user](https://support.pagerduty.com/docs/editing-incidents#edit-incident-duration).
     */
    @ApiStatus.Internal
    public AnalyticsRawIncident(Integer assignmentCount, Boolean autoResolved, Integer businessHourInterruptions, String createdAt, String description, Integer engagedSeconds, Integer engagedUserCount, Integer escalationCount, String escalationPolicyId, String escalationPolicyName, String id, Integer incidentNumber, Boolean major, Integer manualEscalationCount, Integer offHourInterruptions, String priorityId, String priorityName, Integer priorityOrder, Integer reassignmentCount, String resolvedAt, String resolvedByUserId, String resolvedByUserName, Integer secondsToEngage, Integer secondsToFirstAck, Integer secondsToMobilize, Integer secondsToResolve, String serviceId, String serviceName, Integer sleepHourInterruptions, Integer snoozedSeconds, String status, String teamId, String teamName, Integer timeoutEscalationCount, Integer totalInterruptions, Integer totalNotifications, String urgency, Integer userDefinedEffortSeconds) {
        this.assignmentCount = assignmentCount;
        this.autoResolved = autoResolved;
        this.businessHourInterruptions = businessHourInterruptions;
        this.createdAt = createdAt;
        this.description = description;
        this.engagedSeconds = engagedSeconds;
        this.engagedUserCount = engagedUserCount;
        this.escalationCount = escalationCount;
        this.escalationPolicyId = escalationPolicyId;
        this.escalationPolicyName = escalationPolicyName;
        this.id = id;
        this.incidentNumber = incidentNumber;
        this.major = major;
        this.manualEscalationCount = manualEscalationCount;
        this.offHourInterruptions = offHourInterruptions;
        this.priorityId = priorityId;
        this.priorityName = priorityName;
        this.priorityOrder = priorityOrder;
        this.reassignmentCount = reassignmentCount;
        this.resolvedAt = resolvedAt;
        this.resolvedByUserId = resolvedByUserId;
        this.resolvedByUserName = resolvedByUserName;
        this.secondsToEngage = secondsToEngage;
        this.secondsToFirstAck = secondsToFirstAck;
        this.secondsToMobilize = secondsToMobilize;
        this.secondsToResolve = secondsToResolve;
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.sleepHourInterruptions = sleepHourInterruptions;
        this.snoozedSeconds = snoozedSeconds;
        this.status = status;
        this.teamId = teamId;
        this.teamName = teamName;
        this.timeoutEscalationCount = timeoutEscalationCount;
        this.totalInterruptions = totalInterruptions;
        this.totalNotifications = totalNotifications;
        this.urgency = urgency;
        this.userDefinedEffortSeconds = userDefinedEffortSeconds;
    }

}
