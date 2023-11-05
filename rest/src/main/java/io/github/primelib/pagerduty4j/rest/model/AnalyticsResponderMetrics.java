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
 * AnalyticsResponderMetrics
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
    "mean_engaged_seconds",
    "mean_time_to_acknowledge_seconds",
    "responder_id",
    "responder_name",
    "team_id",
    "team_name",
    "total_business_hour_interruptions",
    "total_engaged_seconds",
    "total_incident_count",
    "total_incidents_acknowledged",
    "total_incidents_manual_escalated_from",
    "total_incidents_manual_escalated_to",
    "total_incidents_reassigned_from",
    "total_incidents_reassigned_to",
    "total_incidents_timeout_escalated_from",
    "total_incidents_timeout_escalated_to",
    "total_interruptions",
    "total_notifications",
    "total_off_hour_interruptions",
    "total_seconds_on_call",
    "total_seconds_on_call_level_1",
    "total_seconds_on_call_level_2_plus",
    "total_sleep_hour_interruptions"
})
@JsonTypeName("AnalyticsResponderMetrics")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AnalyticsResponderMetrics {

    /**
     * Mean engaged time across all responders for incidents that match the given filters. Engaged time is measured from the time a user engages with an incident (by acknowledging or accepting a responder request) until the incident is resolved. This may include periods in which the incidents were snoozed.
     */
    @JsonProperty("mean_engaged_seconds")
    protected Integer meanEngagedSeconds;

    /**
     * The average time between when an incident is first assigned to a user and when the incident is first acknowledged by that user. Reassign, resolve, and escalation actions do not imply acknowledgement.
     */
    @JsonProperty("mean_time_to_acknowledge_seconds")
    protected Integer meanTimeToAcknowledgeSeconds;

    /**
     * ID of the responder (user). Not included when aggregating by all responders.
     */
    @JsonProperty("responder_id")
    protected Integer responderId;

    /**
     * Name of the responder (user). Not included when aggregating by all responders.
     */
    @JsonProperty("responder_name")
    protected String responderName;

    /**
     * ID of the team associated with the responder. Not included when aggregating by all responders.
     */
    @JsonProperty("team_id")
    protected String teamId;

    /**
     * Name of the team associated with the responder. Not included when aggregating by all responders.
     */
    @JsonProperty("team_name")
    protected String teamName;

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
     * The total number of incidents that were created.
     */
    @JsonProperty("total_incident_count")
    protected Integer totalIncidentCount;

    /**
     * The total count of assigned incidents acknowledged by the user.
     * Only explicit incident acknowledgment counts; reassign, resolve, and escalation actions do not imply acknowledgement.
     */
    @JsonProperty("total_incidents_acknowledged")
    protected Integer totalIncidentsAcknowledged;

    /**
     * The total count of the user’s assigned incidents that were manually escalated away from a user without acknowledgement.
     */
    @JsonProperty("total_incidents_manual_escalated_from")
    protected Integer totalIncidentsManualEscalatedFrom;

    /**
     * The total count of incidents the user was manually escalated to.
     */
    @JsonProperty("total_incidents_manual_escalated_to")
    protected Integer totalIncidentsManualEscalatedTo;

    /**
     * The total count of a user's assigned incidents that were reassigned away from the user to another user or escalation policy.
     */
    @JsonProperty("total_incidents_reassigned_from")
    protected Integer totalIncidentsReassignedFrom;

    /**
     * The total count of incidents the user was reassigned to.
     */
    @JsonProperty("total_incidents_reassigned_to")
    protected Integer totalIncidentsReassignedTo;

    /**
     * The total count of the user’s assigned incidents that were escalated due to timeouts.
     */
    @JsonProperty("total_incidents_timeout_escalated_from")
    protected Integer totalIncidentsTimeoutEscalatedFrom;

    /**
     * The total count of incidents the user was escalated to due to timeouts.
     */
    @JsonProperty("total_incidents_timeout_escalated_to")
    protected Integer totalIncidentsTimeoutEscalatedTo;

    /**
     * Total number of unique interruptions.
     */
    @JsonProperty("total_interruptions")
    protected Integer totalInterruptions;

    /**
     * The total count of incident notifications sent via email, SMS, phone call and push.
     */
    @JsonProperty("total_notifications")
    protected Integer totalNotifications;

    /**
     * Total number of unique interruptions during off hours; 6pm-10pm Mon-Fri and all day Sat-Sun, based on the user’s time zone.
     */
    @JsonProperty("total_off_hour_interruptions")
    protected Integer totalOffHourInterruptions;

    /**
     * Total seconds the responder was on call.
     */
    @JsonProperty("total_seconds_on_call")
    protected Integer totalSecondsOnCall;

    /**
     * Total seconds the responder was on call at level 1 of their escalation policy.
     */
    @JsonProperty("total_seconds_on_call_level_1")
    protected Integer totalSecondsOnCallLevel1;

    /**
     * Total seconds the responder was on call at level 2 or higher of their escalation policy.
     */
    @JsonProperty("total_seconds_on_call_level_2_plus")
    protected Integer totalSecondsOnCallLevel2Plus;

    /**
     * Total number of unique interruptions during sleep hours; 10pm-8am every day, based on the user’s time zone.
     */
    @JsonProperty("total_sleep_hour_interruptions")
    protected Integer totalSleepHourInterruptions;

    /**
     * Constructs a validated instance of {@link AnalyticsResponderMetrics}.
     *
     * @param spec the specification to process
     */
    public AnalyticsResponderMetrics(Consumer<AnalyticsResponderMetrics> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AnalyticsResponderMetrics}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AnalyticsResponderMetrics(Consumer)} instead.
     * @param meanEngagedSeconds Mean engaged time across all responders for incidents that match the given filters. Engaged time is measured from the time a user engages with an incident (by acknowledging or accepting a responder request) until the incident is resolved. This may include periods in which the incidents were snoozed.
     * @param meanTimeToAcknowledgeSeconds The average time between when an incident is first assigned to a user and when the incident is first acknowledged by that user. Reassign, resolve, and escalation actions do not imply acknowledgement.
     * @param responderId ID of the responder (user). Not included when aggregating by all responders.
     * @param responderName Name of the responder (user). Not included when aggregating by all responders.
     * @param teamId ID of the team associated with the responder. Not included when aggregating by all responders.
     * @param teamName Name of the team associated with the responder. Not included when aggregating by all responders.
     * @param totalBusinessHourInterruptions Total number of unique interruptions during business hours; 8am-6pm Mon-Fri, based on the user’s time zone.
     * @param totalEngagedSeconds Total engaged time across all responders for incidents. Engaged time is measured from the time a user engages with an incident (by acknowledging or accepting a responder request) until the incident is resolved. This may include periods in which the incidents were snoozed.
     * @param totalIncidentCount The total number of incidents that were created.
     * @param totalIncidentsAcknowledged The total count of assigned incidents acknowledged by the user.  Only explicit incident acknowledgment counts; reassign, resolve, and escalation actions do not imply acknowledgement.
     * @param totalIncidentsManualEscalatedFrom The total count of the user’s assigned incidents that were manually escalated away from a user without acknowledgement.
     * @param totalIncidentsManualEscalatedTo The total count of incidents the user was manually escalated to.
     * @param totalIncidentsReassignedFrom The total count of a user's assigned incidents that were reassigned away from the user to another user or escalation policy.
     * @param totalIncidentsReassignedTo The total count of incidents the user was reassigned to.
     * @param totalIncidentsTimeoutEscalatedFrom The total count of the user’s assigned incidents that were escalated due to timeouts.
     * @param totalIncidentsTimeoutEscalatedTo The total count of incidents the user was escalated to due to timeouts.
     * @param totalInterruptions Total number of unique interruptions.
     * @param totalNotifications The total count of incident notifications sent via email, SMS, phone call and push.
     * @param totalOffHourInterruptions Total number of unique interruptions during off hours; 6pm-10pm Mon-Fri and all day Sat-Sun, based on the user’s time zone.
     * @param totalSecondsOnCall Total seconds the responder was on call.
     * @param totalSecondsOnCallLevel1 Total seconds the responder was on call at level 1 of their escalation policy.
     * @param totalSecondsOnCallLevel2Plus Total seconds the responder was on call at level 2 or higher of their escalation policy.
     * @param totalSleepHourInterruptions Total number of unique interruptions during sleep hours; 10pm-8am every day, based on the user’s time zone.
     */
    @ApiStatus.Internal
    public AnalyticsResponderMetrics(Integer meanEngagedSeconds, Integer meanTimeToAcknowledgeSeconds, Integer responderId, String responderName, String teamId, String teamName, Integer totalBusinessHourInterruptions, Integer totalEngagedSeconds, Integer totalIncidentCount, Integer totalIncidentsAcknowledged, Integer totalIncidentsManualEscalatedFrom, Integer totalIncidentsManualEscalatedTo, Integer totalIncidentsReassignedFrom, Integer totalIncidentsReassignedTo, Integer totalIncidentsTimeoutEscalatedFrom, Integer totalIncidentsTimeoutEscalatedTo, Integer totalInterruptions, Integer totalNotifications, Integer totalOffHourInterruptions, Integer totalSecondsOnCall, Integer totalSecondsOnCallLevel1, Integer totalSecondsOnCallLevel2Plus, Integer totalSleepHourInterruptions) {
        this.meanEngagedSeconds = meanEngagedSeconds;
        this.meanTimeToAcknowledgeSeconds = meanTimeToAcknowledgeSeconds;
        this.responderId = responderId;
        this.responderName = responderName;
        this.teamId = teamId;
        this.teamName = teamName;
        this.totalBusinessHourInterruptions = totalBusinessHourInterruptions;
        this.totalEngagedSeconds = totalEngagedSeconds;
        this.totalIncidentCount = totalIncidentCount;
        this.totalIncidentsAcknowledged = totalIncidentsAcknowledged;
        this.totalIncidentsManualEscalatedFrom = totalIncidentsManualEscalatedFrom;
        this.totalIncidentsManualEscalatedTo = totalIncidentsManualEscalatedTo;
        this.totalIncidentsReassignedFrom = totalIncidentsReassignedFrom;
        this.totalIncidentsReassignedTo = totalIncidentsReassignedTo;
        this.totalIncidentsTimeoutEscalatedFrom = totalIncidentsTimeoutEscalatedFrom;
        this.totalIncidentsTimeoutEscalatedTo = totalIncidentsTimeoutEscalatedTo;
        this.totalInterruptions = totalInterruptions;
        this.totalNotifications = totalNotifications;
        this.totalOffHourInterruptions = totalOffHourInterruptions;
        this.totalSecondsOnCall = totalSecondsOnCall;
        this.totalSecondsOnCallLevel1 = totalSecondsOnCallLevel1;
        this.totalSecondsOnCallLevel2Plus = totalSecondsOnCallLevel2Plus;
        this.totalSleepHourInterruptions = totalSleepHourInterruptions;
    }

}
