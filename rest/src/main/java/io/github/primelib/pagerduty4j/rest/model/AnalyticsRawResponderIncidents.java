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
 * AnalyticsRawResponderIncidents
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
    "incident_created_at",
    "incident_description",
    "incident_id",
    "incident_number",
    "incident_priority_id",
    "incident_priority_name",
    "incident_priority_order",
    "incident_urgency",
    "mean_time_to_acknowledge_seconds",
    "responder_id",
    "responder_name",
    "service_id",
    "service_name",
    "service_team_id",
    "service_team_name",
    "total_acknowledgements",
    "total_business_hour_interruptions",
    "total_engaged_seconds",
    "total_interruptions",
    "total_manual_escalations_from",
    "total_manual_escalations_to",
    "total_off_hour_interruptions",
    "total_reassignments_from",
    "total_reassignments_to",
    "total_sleep_hour_interruptions",
    "total_timeout_escalations_from",
    "total_timeout_escalations_to"
})
@JsonTypeName("AnalyticsRawResponderIncidents")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AnalyticsRawResponderIncidents {

    /**
     * Timestamp of when the incident was created.
     */
    @JsonProperty("incident_created_at")
    protected String incidentCreatedAt;

    /**
     * The incident description.
     */
    @JsonProperty("incident_description")
    protected String incidentDescription;

    /**
     * Incident ID
     */
    @JsonProperty("incident_id")
    protected String incidentId;

    /**
     * The PagerDuty incident number.
     */
    @JsonProperty("incident_number")
    protected Integer incidentNumber;

    /**
     * ID of the incident's priority level.
     */
    @JsonProperty("incident_priority_id")
    protected String incidentPriorityId;

    /**
     * The user-provided short name of the priority.
     */
    @JsonProperty("incident_priority_name")
    protected String incidentPriorityName;

    /**
     * The numerical value used to sort priorities. Higher values are higher priority.
     */
    @JsonProperty("incident_priority_order")
    protected Integer incidentPriorityOrder;

    /**
     * Notification level
     */
    @JsonProperty("incident_urgency")
    protected String incidentUrgency;

    /**
     * Mean time from this user being assigned to an incident until this user acknowledges the incident.
     */
    @JsonProperty("mean_time_to_acknowledge_seconds")
    protected Integer meanTimeToAcknowledgeSeconds;

    /**
     * ID of the responder.
     */
    @JsonProperty("responder_id")
    protected String responderId;

    /**
     * Name of the responder.
     */
    @JsonProperty("responder_name")
    protected String responderName;

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
     * ID of the team that owns the related service.
     */
    @JsonProperty("service_team_id")
    protected String serviceTeamId;

    /**
     * Name of the team that owns the related service.
     */
    @JsonProperty("service_team_name")
    protected String serviceTeamName;

    /**
     * Total acknowledgements from the responder on the incident.
     */
    @JsonProperty("total_acknowledgements")
    protected Integer totalAcknowledgements;

    /**
     * Total number of unique interruptions during business hours; 8am-6pm Mon-Fri, based on the user’s time zone.
     */
    @JsonProperty("total_business_hour_interruptions")
    protected Integer totalBusinessHourInterruptions;

    /**
     * Total engaged time across all responders for incidents. Engaged time is measured from the time a user engages with an incident (by acknowledging or accepting a responder request) until the incident is resolved. This may include periods in which the incidents were snoozed.
     */
    @JsonProperty("total_engaged_seconds")
    protected Integer totalEngagedSeconds;

    /**
     * Total number of unique interruptions for the responder during the incident.
     */
    @JsonProperty("total_interruptions")
    protected Integer totalInterruptions;

    /**
     * Total times the responder was manually escalated away from the incident.
     */
    @JsonProperty("total_manual_escalations_from")
    protected Integer totalManualEscalationsFrom;

    /**
     * Total times the responder was manually escalated to the incident.
     */
    @JsonProperty("total_manual_escalations_to")
    protected Integer totalManualEscalationsTo;

    /**
     * Total number of unique interruptions during off hours; 6pm-10pm Mon-Fri and all day Sat-Sun, based on the user’s time zone.
     */
    @JsonProperty("total_off_hour_interruptions")
    protected String totalOffHourInterruptions;

    /**
     * Total times the responder was reassigned away from the incident.
     */
    @JsonProperty("total_reassignments_from")
    protected Integer totalReassignmentsFrom;

    /**
     * Total times the responder was reassigned to the incident.
     */
    @JsonProperty("total_reassignments_to")
    protected Integer totalReassignmentsTo;

    /**
     * Total number of unique interruptions during sleep hours; 10pm-8am every day, based on the user’s time zone.
     */
    @JsonProperty("total_sleep_hour_interruptions")
    protected Integer totalSleepHourInterruptions;

    /**
     * Total times the responder was escalated away from the incident due to timeout.
     */
    @JsonProperty("total_timeout_escalations_from")
    protected Integer totalTimeoutEscalationsFrom;

    /**
     * Total times the responder was escalated to the incident due to timeout.
     */
    @JsonProperty("total_timeout_escalations_to")
    protected Integer totalTimeoutEscalationsTo;

    /**
     * Constructs a validated instance of {@link AnalyticsRawResponderIncidents}.
     *
     * @param spec the specification to process
     */
    public AnalyticsRawResponderIncidents(Consumer<AnalyticsRawResponderIncidents> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AnalyticsRawResponderIncidents}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AnalyticsRawResponderIncidents(Consumer)} instead.
     * @param incidentCreatedAt Timestamp of when the incident was created.
     * @param incidentDescription The incident description.
     * @param incidentId Incident ID
     * @param incidentNumber The PagerDuty incident number.
     * @param incidentPriorityId ID of the incident's priority level.
     * @param incidentPriorityName The user-provided short name of the priority.
     * @param incidentPriorityOrder The numerical value used to sort priorities. Higher values are higher priority.
     * @param incidentUrgency Notification level
     * @param meanTimeToAcknowledgeSeconds Mean time from this user being assigned to an incident until this user acknowledges the incident.
     * @param responderId ID of the responder.
     * @param responderName Name of the responder.
     * @param serviceId ID of the service that the incident triggered on.
     * @param serviceName Name of the service that the incident triggered on.
     * @param serviceTeamId ID of the team that owns the related service.
     * @param serviceTeamName Name of the team that owns the related service.
     * @param totalAcknowledgements Total acknowledgements from the responder on the incident.
     * @param totalBusinessHourInterruptions Total number of unique interruptions during business hours; 8am-6pm Mon-Fri, based on the user’s time zone.
     * @param totalEngagedSeconds Total engaged time across all responders for incidents. Engaged time is measured from the time a user engages with an incident (by acknowledging or accepting a responder request) until the incident is resolved. This may include periods in which the incidents were snoozed.
     * @param totalInterruptions Total number of unique interruptions for the responder during the incident.
     * @param totalManualEscalationsFrom Total times the responder was manually escalated away from the incident.
     * @param totalManualEscalationsTo Total times the responder was manually escalated to the incident.
     * @param totalOffHourInterruptions Total number of unique interruptions during off hours; 6pm-10pm Mon-Fri and all day Sat-Sun, based on the user’s time zone.
     * @param totalReassignmentsFrom Total times the responder was reassigned away from the incident.
     * @param totalReassignmentsTo Total times the responder was reassigned to the incident.
     * @param totalSleepHourInterruptions Total number of unique interruptions during sleep hours; 10pm-8am every day, based on the user’s time zone.
     * @param totalTimeoutEscalationsFrom Total times the responder was escalated away from the incident due to timeout.
     * @param totalTimeoutEscalationsTo Total times the responder was escalated to the incident due to timeout.
     */
    @ApiStatus.Internal
    public AnalyticsRawResponderIncidents(String incidentCreatedAt, String incidentDescription, String incidentId, Integer incidentNumber, String incidentPriorityId, String incidentPriorityName, Integer incidentPriorityOrder, String incidentUrgency, Integer meanTimeToAcknowledgeSeconds, String responderId, String responderName, String serviceId, String serviceName, String serviceTeamId, String serviceTeamName, Integer totalAcknowledgements, Integer totalBusinessHourInterruptions, Integer totalEngagedSeconds, Integer totalInterruptions, Integer totalManualEscalationsFrom, Integer totalManualEscalationsTo, String totalOffHourInterruptions, Integer totalReassignmentsFrom, Integer totalReassignmentsTo, Integer totalSleepHourInterruptions, Integer totalTimeoutEscalationsFrom, Integer totalTimeoutEscalationsTo) {
        this.incidentCreatedAt = incidentCreatedAt;
        this.incidentDescription = incidentDescription;
        this.incidentId = incidentId;
        this.incidentNumber = incidentNumber;
        this.incidentPriorityId = incidentPriorityId;
        this.incidentPriorityName = incidentPriorityName;
        this.incidentPriorityOrder = incidentPriorityOrder;
        this.incidentUrgency = incidentUrgency;
        this.meanTimeToAcknowledgeSeconds = meanTimeToAcknowledgeSeconds;
        this.responderId = responderId;
        this.responderName = responderName;
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.serviceTeamId = serviceTeamId;
        this.serviceTeamName = serviceTeamName;
        this.totalAcknowledgements = totalAcknowledgements;
        this.totalBusinessHourInterruptions = totalBusinessHourInterruptions;
        this.totalEngagedSeconds = totalEngagedSeconds;
        this.totalInterruptions = totalInterruptions;
        this.totalManualEscalationsFrom = totalManualEscalationsFrom;
        this.totalManualEscalationsTo = totalManualEscalationsTo;
        this.totalOffHourInterruptions = totalOffHourInterruptions;
        this.totalReassignmentsFrom = totalReassignmentsFrom;
        this.totalReassignmentsTo = totalReassignmentsTo;
        this.totalSleepHourInterruptions = totalSleepHourInterruptions;
        this.totalTimeoutEscalationsFrom = totalTimeoutEscalationsFrom;
        this.totalTimeoutEscalationsTo = totalTimeoutEscalationsTo;
    }

}
