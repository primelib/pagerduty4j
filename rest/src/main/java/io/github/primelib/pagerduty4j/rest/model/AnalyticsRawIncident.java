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
    "business_hour_interruptions",
    "created_at",
    "description",
    "engaged_seconds",
    "engaged_user_count",
    "escalation_count",
    "id",
    "incident_number",
    "major",
    "off_hour_interruptions",
    "priority_id",
    "priority_name",
    "resolved_at",
    "seconds_to_engage",
    "seconds_to_first_ack",
    "seconds_to_mobilize",
    "seconds_to_resolve",
    "service_id",
    "service_name",
    "sleep_hour_interruptions",
    "snoozed_seconds",
    "team_id",
    "team_name",
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
     * Total number of unique interruptions during business hour. Business hour: 8am-6pm Mon-Fri, based on the user’s time zone.
     * 
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
     * This may include periods in which the incident was snoozed.
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
     * Incident ID
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The PagerDuty incident number
     */
    @JsonProperty("incident_number")
    protected Integer incidentNumber;

    /**
     * An incident is classified as a [major incident](https://support.pagerduty.com/docs/operational-reviews#major-incidents) if it has one of the two highest priorities, or if multiple responders are added and acknowledge the incident.
     */
    @JsonProperty("major")
    protected Boolean major;

    /**
     * Total number of unique interruptions during off hour. Off hour: 6pm-10pm Mon-Fri and all day Sat-Sun, based on the user’s time zone.
     * 
     * 
     * 
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
     * Timestamp of when the incident was resolved.
     */
    @JsonProperty("resolved_at")
    protected String resolvedAt;

    /**
     * A measure of *people response time*. This metric measures the time from the first user engagement (acknowledge or responder accept) to the last. This metric is only used for incidents with **multiple responders**; for incidents with one or no engaged users, this value is null.
     */
    @JsonProperty("seconds_to_engage")
    protected Integer secondsToEngage;

    /**
     * Time between start of an incident, and the first responder to acknowledge.
     */
    @JsonProperty("seconds_to_first_ack")
    protected Integer secondsToFirstAck;

    /**
     * Time between start of an incident, and the last additional responder to acknowledge.
     * If an incident has one or less responders, the value will be null.
     */
    @JsonProperty("seconds_to_mobilize")
    protected Integer secondsToMobilize;

    /**
     * Time from when incident triggered until it was resolved.
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
     * Total number of unique interruptions during sleep hour. Sleep hour: 10pm-8am every day, based on the user’s time zone.
     */
    @JsonProperty("sleep_hour_interruptions")
    protected Integer sleepHourInterruptions;

    /**
     * Total seconds the incident has been snoozed for.
     */
    @JsonProperty("snoozed_seconds")
    protected Integer snoozedSeconds;

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
     * @param businessHourInterruptions Total number of unique interruptions during business hour. Business hour: 8am-6pm Mon-Fri, based on the user’s time zone.  
     * @param createdAt Timestamp of when the incident was created.
     * @param description The incident description
     * @param engagedSeconds Total engaged time across all responders for this incident.  Engaged time is measured from the time a user engages with an incident (by acknowledging or accepting a responder request) until the incident is resolved.  This may include periods in which the incident was snoozed.
     * @param engagedUserCount Total number of users who engaged (acknowledged, accepted responder request) in the incident.
     * @param escalationCount Total count of instances where an incident is escalated between responders assigned to an escalation policy.
     * @param id Incident ID
     * @param incidentNumber The PagerDuty incident number
     * @param major An incident is classified as a [major incident](https://support.pagerduty.com/docs/operational-reviews#major-incidents) if it has one of the two highest priorities, or if multiple responders are added and acknowledge the incident.
     * @param offHourInterruptions Total number of unique interruptions during off hour. Off hour: 6pm-10pm Mon-Fri and all day Sat-Sun, based on the user’s time zone.      
     * @param priorityId ID of the incident's priority level.
     * @param priorityName The user-provided short name of the priority.
     * @param resolvedAt Timestamp of when the incident was resolved.
     * @param secondsToEngage A measure of *people response time*. This metric measures the time from the first user engagement (acknowledge or responder accept) to the last. This metric is only used for incidents with **multiple responders**; for incidents with one or no engaged users, this value is null.
     * @param secondsToFirstAck Time between start of an incident, and the first responder to acknowledge.
     * @param secondsToMobilize Time between start of an incident, and the last additional responder to acknowledge.  If an incident has one or less responders, the value will be null.
     * @param secondsToResolve Time from when incident triggered until it was resolved.
     * @param serviceId ID of the service that the incident triggered on.
     * @param serviceName Name of the service that the incident triggered on.
     * @param sleepHourInterruptions Total number of unique interruptions during sleep hour. Sleep hour: 10pm-8am every day, based on the user’s time zone.
     * @param snoozedSeconds Total seconds the incident has been snoozed for.
     * @param teamId ID of the team the incident was assigned to.
     * @param teamName Name of the team the incident was assigned to.
     * @param urgency Notification level
     * @param userDefinedEffortSeconds The total response effort in seconds, [as defined by the user](https://support.pagerduty.com/docs/editing-incidents#edit-incident-duration).
     */
    @ApiStatus.Internal
    public AnalyticsRawIncident(Integer assignmentCount, Integer businessHourInterruptions, String createdAt, String description, Integer engagedSeconds, Integer engagedUserCount, Integer escalationCount, String id, Integer incidentNumber, Boolean major, Integer offHourInterruptions, String priorityId, String priorityName, String resolvedAt, Integer secondsToEngage, Integer secondsToFirstAck, Integer secondsToMobilize, Integer secondsToResolve, String serviceId, String serviceName, Integer sleepHourInterruptions, Integer snoozedSeconds, String teamId, String teamName, String urgency, Integer userDefinedEffortSeconds) {
        this.assignmentCount = assignmentCount;
        this.businessHourInterruptions = businessHourInterruptions;
        this.createdAt = createdAt;
        this.description = description;
        this.engagedSeconds = engagedSeconds;
        this.engagedUserCount = engagedUserCount;
        this.escalationCount = escalationCount;
        this.id = id;
        this.incidentNumber = incidentNumber;
        this.major = major;
        this.offHourInterruptions = offHourInterruptions;
        this.priorityId = priorityId;
        this.priorityName = priorityName;
        this.resolvedAt = resolvedAt;
        this.secondsToEngage = secondsToEngage;
        this.secondsToFirstAck = secondsToFirstAck;
        this.secondsToMobilize = secondsToMobilize;
        this.secondsToResolve = secondsToResolve;
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.sleepHourInterruptions = sleepHourInterruptions;
        this.snoozedSeconds = snoozedSeconds;
        this.teamId = teamId;
        this.teamName = teamName;
        this.urgency = urgency;
        this.userDefinedEffortSeconds = userDefinedEffortSeconds;
    }

}
