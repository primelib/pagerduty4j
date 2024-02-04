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

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AnalyticsIncidentMetrics
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
    "mean_assignment_count",
    "mean_engaged_seconds",
    "mean_engaged_user_count",
    "mean_seconds_to_engage",
    "mean_seconds_to_first_ack",
    "mean_seconds_to_mobilize",
    "mean_seconds_to_resolve",
    "mean_user_defined_engaged_seconds",
    "range_start",
    "service_id",
    "service_name",
    "team_id",
    "team_name",
    "total_business_hour_interruptions",
    "total_engaged_seconds",
    "total_escalation_count",
    "total_incident_count",
    "total_incidents_acknowledged",
    "total_incidents_auto_resolved",
    "total_incidents_manual_escalated",
    "total_incidents_reassigned",
    "total_incidents_timeout_escalated",
    "total_interruptions",
    "total_notifications",
    "total_off_hour_interruptions",
    "total_sleep_hour_interruptions",
    "total_snoozed_seconds",
    "total_user_defined_engaged_seconds",
    "up_time_pct"
})
@JsonTypeName("AnalyticsIncidentMetrics")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AnalyticsIncidentMetrics {

    /**
     * Mean count of instances where responders were assigned an incident (including through reassignment or escalation) or accepted a responder request.
     */
    @JsonProperty("mean_assignment_count")
    protected Integer meanAssignmentCount;

    /**
     * Mean engaged time across all responders. Engaged time is measured from the time a user engages with an incident (by acknowledging or accepting a responder request) until the incident is resolved. This may include periods in which the incidents were snoozed.
     */
    @JsonProperty("mean_engaged_seconds")
    protected Integer meanEngagedSeconds;

    /**
     * Mean number of users who engaged with an incident. *Engaged* is defined as acknowledging an incident or accepting a responder request in it.
     */
    @JsonProperty("mean_engaged_user_count")
    protected Integer meanEngagedUserCount;

    /**
     * A measure of *people response time*. This metric measures the time from the first user engagement (acknowledge or responder accept) to the last. This metric is only used for incidents with **multiple responders**; for incidents with one or no engaged users, this value is null.
     */
    @JsonProperty("mean_seconds_to_engage")
    protected Integer meanSecondsToEngage;

    /**
     * Mean time between the start of an incident, and the first responder to acknowledge.
     */
    @JsonProperty("mean_seconds_to_first_ack")
    protected Integer meanSecondsToFirstAck;

    /**
     * Mean time between the start of an incident, and the last additional responder to acknowledge. For incidents with one or no engaged users, this value is null.
     */
    @JsonProperty("mean_seconds_to_mobilize")
    protected Integer meanSecondsToMobilize;

    /**
     * Mean time from when an incident was triggered until it was resolved.
     */
    @JsonProperty("mean_seconds_to_resolve")
    protected Integer meanSecondsToResolve;

    /**
     * Mean engaged time across all responders. Engaged time is measured from the time
     * a user engages with an incident (by acknowledging or accepting a responder request)
     * until the incident is resolved. This may include periods in which the incidents were snoozed. This metric uses the incident response effort values that
     * [users have defined](https://support.pagerduty.com/docs/edit-incidents#edit-incident-duration), if they exist.
     */
    @JsonProperty("mean_user_defined_engaged_seconds")
    protected Integer meanUserDefinedEngagedSeconds;

    /**
     * Start of the date range for which the metrics were calculated. Only included when an aggregate unit is specified in the request.
     */
    @JsonProperty("range_start")
    protected String rangeStart;

    /**
     * ID of the service. Only included when aggregating by service. Not included when aggregating by all.
     */
    @JsonProperty("service_id")
    protected String serviceId;

    /**
     * Name of the service. Only included when aggregating by service. Not included when aggregating by all.
     */
    @JsonProperty("service_name")
    protected String serviceName;

    /**
     * ID of the team to which the incident was assigned. Not included when aggregating by all.
     */
    @JsonProperty("team_id")
    protected String teamId;

    /**
     * Name of the team to which the incident was assigned. Not included when aggregating by all.
     */
    @JsonProperty("team_name")
    protected String teamName;

    /**
     * Total number of unique interruptions during business hours; 8am-6pm Mon-Fri, based on the user’s time zone.
     */
    @JsonProperty("total_business_hour_interruptions")
    protected Integer totalBusinessHourInterruptions;

    /**
     * Total engaged time across all responders. Engaged time is measured from the time a user engages with an incident (by acknowledging or accepting a responder request) until the incident is resolved. This may include periods in which the incidents were snoozed.
     */
    @JsonProperty("total_engaged_seconds")
    protected Integer totalEngagedSeconds;

    /**
     * Total count of instances where an incident is escalated between responders assigned to an escalation policy.
     */
    @JsonProperty("total_escalation_count")
    protected Integer totalEscalationCount;

    /**
     * The total number of incidents that were created.
     */
    @JsonProperty("total_incident_count")
    protected Integer totalIncidentCount;

    /**
     * The total count of assigned incidents acknowledged.
     * Only explicit incident acknowledgment counts; reassign, resolve, and escalation actions do not imply acknowledgement.
     */
    @JsonProperty("total_incidents_acknowledged")
    protected Integer totalIncidentsAcknowledged;

    /**
     * The total count of incidents that were resolved automatically.
     * This count includes incidents resolved via an integration and those that were [auto-resolved in PagerDuty](https://support.pagerduty.com/docs/configurable-service-settings#auto-resolution).
     */
    @JsonProperty("total_incidents_auto_resolved")
    protected Object totalIncidentsAutoResolved;

    /**
     * The total count of incidents that were manually escalated.
     */
    @JsonProperty("total_incidents_manual_escalated")
    protected Integer totalIncidentsManualEscalated;

    /**
     * The total count of incidents that were reassigned.
     */
    @JsonProperty("total_incidents_reassigned")
    protected Integer totalIncidentsReassigned;

    /**
     * The total count of incidents that were escalated due to timeouts.
     */
    @JsonProperty("total_incidents_timeout_escalated")
    protected Integer totalIncidentsTimeoutEscalated;

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
     * Total number of unique interruptions during sleep hours. Sleep hours: 10pm-8am every day, based on the user’s time zone.
     */
    @JsonProperty("total_sleep_hour_interruptions")
    protected Integer totalSleepHourInterruptions;

    /**
     * Total number of seconds incidents were snoozed.
     */
    @JsonProperty("total_snoozed_seconds")
    protected Integer totalSnoozedSeconds;

    /**
     * Total engaged time across all responders. Engaged time is measured from the time a user engages with an incident (by acknowledging or accepting a responder request) until the incident is resolved. This may include periods in which the incidents were snoozed. This metric uses the edited incident response effort values that
     * [users have defined](https://support.pagerduty.com/docs/edit-incidents#edit-incident-duration), if they exist.
     */
    @JsonProperty("total_user_defined_engaged_seconds")
    protected Integer totalUserDefinedEngagedSeconds;

    /**
     * The percentage of time in the defined date range that the service was not interrupted by a [major incident](https://support.pagerduty.com/docs/operational-reviews#major-incidents). Only included when aggregating by team, escalation policy, service, or all services.
     */
    @JsonProperty("up_time_pct")
    protected BigDecimal upTimePct;

    /**
     * Constructs a validated instance of {@link AnalyticsIncidentMetrics}.
     *
     * @param spec the specification to process
     */
    public AnalyticsIncidentMetrics(Consumer<AnalyticsIncidentMetrics> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AnalyticsIncidentMetrics}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AnalyticsIncidentMetrics(Consumer)} instead.
     * @param meanAssignmentCount Mean count of instances where responders were assigned an incident (including through reassignment or escalation) or accepted a responder request.
     * @param meanEngagedSeconds Mean engaged time across all responders. Engaged time is measured from the time a user engages with an incident (by acknowledging or accepting a responder request) until the incident is resolved. This may include periods in which the incidents were snoozed.
     * @param meanEngagedUserCount Mean number of users who engaged with an incident. *Engaged* is defined as acknowledging an incident or accepting a responder request in it.
     * @param meanSecondsToEngage A measure of *people response time*. This metric measures the time from the first user engagement (acknowledge or responder accept) to the last. This metric is only used for incidents with **multiple responders**; for incidents with one or no engaged users, this value is null.
     * @param meanSecondsToFirstAck Mean time between the start of an incident, and the first responder to acknowledge.
     * @param meanSecondsToMobilize Mean time between the start of an incident, and the last additional responder to acknowledge. For incidents with one or no engaged users, this value is null.
     * @param meanSecondsToResolve Mean time from when an incident was triggered until it was resolved.
     * @param meanUserDefinedEngagedSeconds Mean engaged time across all responders. Engaged time is measured from the time  a user engages with an incident (by acknowledging or accepting a responder request)  until the incident is resolved. This may include periods in which the incidents were snoozed. This metric uses the incident response effort values that  [users have defined](https://support.pagerduty.com/docs/edit-incidents#edit-incident-duration), if they exist.
     * @param rangeStart Start of the date range for which the metrics were calculated. Only included when an aggregate unit is specified in the request.
     * @param serviceId ID of the service. Only included when aggregating by service. Not included when aggregating by all.
     * @param serviceName Name of the service. Only included when aggregating by service. Not included when aggregating by all.
     * @param teamId ID of the team to which the incident was assigned. Not included when aggregating by all.
     * @param teamName Name of the team to which the incident was assigned. Not included when aggregating by all.
     * @param totalBusinessHourInterruptions Total number of unique interruptions during business hours; 8am-6pm Mon-Fri, based on the user’s time zone.
     * @param totalEngagedSeconds Total engaged time across all responders. Engaged time is measured from the time a user engages with an incident (by acknowledging or accepting a responder request) until the incident is resolved. This may include periods in which the incidents were snoozed.
     * @param totalEscalationCount Total count of instances where an incident is escalated between responders assigned to an escalation policy.
     * @param totalIncidentCount The total number of incidents that were created.
     * @param totalIncidentsAcknowledged The total count of assigned incidents acknowledged.  Only explicit incident acknowledgment counts; reassign, resolve, and escalation actions do not imply acknowledgement.
     * @param totalIncidentsAutoResolved The total count of incidents that were resolved automatically.  This count includes incidents resolved via an integration and those that were [auto-resolved in PagerDuty](https://support.pagerduty.com/docs/configurable-service-settings#auto-resolution).
     * @param totalIncidentsManualEscalated The total count of incidents that were manually escalated.
     * @param totalIncidentsReassigned The total count of incidents that were reassigned.
     * @param totalIncidentsTimeoutEscalated The total count of incidents that were escalated due to timeouts.
     * @param totalInterruptions Total number of unique interruptions.
     * @param totalNotifications The total count of incident notifications sent via email, SMS, phone call and push.
     * @param totalOffHourInterruptions Total number of unique interruptions during off hours; 6pm-10pm Mon-Fri and all day Sat-Sun, based on the user’s time zone.
     * @param totalSleepHourInterruptions Total number of unique interruptions during sleep hours. Sleep hours: 10pm-8am every day, based on the user’s time zone.
     * @param totalSnoozedSeconds Total number of seconds incidents were snoozed.
     * @param totalUserDefinedEngagedSeconds Total engaged time across all responders. Engaged time is measured from the time a user engages with an incident (by acknowledging or accepting a responder request) until the incident is resolved. This may include periods in which the incidents were snoozed. This metric uses the edited incident response effort values that  [users have defined](https://support.pagerduty.com/docs/edit-incidents#edit-incident-duration), if they exist.
     * @param upTimePct The percentage of time in the defined date range that the service was not interrupted by a [major incident](https://support.pagerduty.com/docs/operational-reviews#major-incidents). Only included when aggregating by team, escalation policy, service, or all services.
     */
    @ApiStatus.Internal
    public AnalyticsIncidentMetrics(Integer meanAssignmentCount, Integer meanEngagedSeconds, Integer meanEngagedUserCount, Integer meanSecondsToEngage, Integer meanSecondsToFirstAck, Integer meanSecondsToMobilize, Integer meanSecondsToResolve, Integer meanUserDefinedEngagedSeconds, String rangeStart, String serviceId, String serviceName, String teamId, String teamName, Integer totalBusinessHourInterruptions, Integer totalEngagedSeconds, Integer totalEscalationCount, Integer totalIncidentCount, Integer totalIncidentsAcknowledged, Object totalIncidentsAutoResolved, Integer totalIncidentsManualEscalated, Integer totalIncidentsReassigned, Integer totalIncidentsTimeoutEscalated, Integer totalInterruptions, Integer totalNotifications, Integer totalOffHourInterruptions, Integer totalSleepHourInterruptions, Integer totalSnoozedSeconds, Integer totalUserDefinedEngagedSeconds, BigDecimal upTimePct) {
        this.meanAssignmentCount = meanAssignmentCount;
        this.meanEngagedSeconds = meanEngagedSeconds;
        this.meanEngagedUserCount = meanEngagedUserCount;
        this.meanSecondsToEngage = meanSecondsToEngage;
        this.meanSecondsToFirstAck = meanSecondsToFirstAck;
        this.meanSecondsToMobilize = meanSecondsToMobilize;
        this.meanSecondsToResolve = meanSecondsToResolve;
        this.meanUserDefinedEngagedSeconds = meanUserDefinedEngagedSeconds;
        this.rangeStart = rangeStart;
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.teamId = teamId;
        this.teamName = teamName;
        this.totalBusinessHourInterruptions = totalBusinessHourInterruptions;
        this.totalEngagedSeconds = totalEngagedSeconds;
        this.totalEscalationCount = totalEscalationCount;
        this.totalIncidentCount = totalIncidentCount;
        this.totalIncidentsAcknowledged = totalIncidentsAcknowledged;
        this.totalIncidentsAutoResolved = totalIncidentsAutoResolved;
        this.totalIncidentsManualEscalated = totalIncidentsManualEscalated;
        this.totalIncidentsReassigned = totalIncidentsReassigned;
        this.totalIncidentsTimeoutEscalated = totalIncidentsTimeoutEscalated;
        this.totalInterruptions = totalInterruptions;
        this.totalNotifications = totalNotifications;
        this.totalOffHourInterruptions = totalOffHourInterruptions;
        this.totalSleepHourInterruptions = totalSleepHourInterruptions;
        this.totalSnoozedSeconds = totalSnoozedSeconds;
        this.totalUserDefinedEngagedSeconds = totalUserDefinedEngagedSeconds;
        this.upTimePct = upTimePct;
    }

}
