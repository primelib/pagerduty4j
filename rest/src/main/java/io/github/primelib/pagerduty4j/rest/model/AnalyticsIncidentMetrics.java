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
    "service_id",
    "service_name",
    "team_id",
    "team_name",
    "total_business_hour_interruptions",
    "total_engaged_seconds",
    "total_escalation_count",
    "total_incident_count",
    "total_off_hour_interruptions",
    "total_sleep_hour_interruptions",
    "total_snoozed_seconds",
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
     * Mean engaged time across all responders for incidents that match the given filters. Engaged time is measured from the time a user engages with an incident (by acknowledging or accepting a responder request) until the incident is resolved. This may include periods in which the incidents was snoozed.
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
     * ID of the service. Only included when aggregating by service.
     */
    @JsonProperty("service_id")
    protected String serviceId;

    /**
     * Name of the service. Only included when aggregating by service.
     */
    @JsonProperty("service_name")
    protected String serviceName;

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
     * Total number of unique interruptions during business hours. Business hour: 8am-6pm Mon-Fri, based on the user’s time zone. 
     */
    @JsonProperty("total_business_hour_interruptions")
    protected Integer totalBusinessHourInterruptions;

    /**
     * Total engaged time across all responders for incidents. Engaged time is measured from the time a user engages with an incident (by acknowledging or accepting a responder request) until the incident is resolved. This may include periods in which the incidents was snoozed.
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
     * Total number of unique interruptions during off hours. Off hour: 6pm-10pm Mon-Fri and all day Sat-Sun, based on the user’s time zone.
     */
    @JsonProperty("total_off_hour_interruptions")
    protected Integer totalOffHourInterruptions;

    /**
     * Total number of unique interruptions during sleep hours. Sleep hour: 10pm-8am every day, based on the user’s time zone.
     */
    @JsonProperty("total_sleep_hour_interruptions")
    protected Integer totalSleepHourInterruptions;

    /**
     * Total number of seconds incidents were snoozed.
     */
    @JsonProperty("total_snoozed_seconds")
    protected Integer totalSnoozedSeconds;

    /**
     * The percentage of time in the defined date range that the service was not interrupted by a [major incident](https://support.pagerduty.com/docs/operational-reviews#major-incidents).
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
     * @param meanEngagedSeconds Mean engaged time across all responders for incidents that match the given filters. Engaged time is measured from the time a user engages with an incident (by acknowledging or accepting a responder request) until the incident is resolved. This may include periods in which the incidents was snoozed.
     * @param meanEngagedUserCount Mean number of users who engaged with an incident. *Engaged* is defined as acknowledging an incident or accepting a responder request in it.
     * @param meanSecondsToEngage A measure of *people response time*. This metric measures the time from the first user engagement (acknowledge or responder accept) to the last. This metric is only used for incidents with **multiple responders**; for incidents with one or no engaged users, this value is null.
     * @param meanSecondsToFirstAck Mean time between the start of an incident, and the first responder to acknowledge.
     * @param meanSecondsToMobilize Mean time between the start of an incident, and the last additional responder to acknowledge. For incidents with one or no engaged users, this value is null.
     * @param meanSecondsToResolve Mean time from when an incident was triggered until it was resolved.
     * @param serviceId ID of the service. Only included when aggregating by service.
     * @param serviceName Name of the service. Only included when aggregating by service.
     * @param teamId ID of the team the incident was assigned to.
     * @param teamName Name of the team the incident was assigned to.
     * @param totalBusinessHourInterruptions Total number of unique interruptions during business hours. Business hour: 8am-6pm Mon-Fri, based on the user’s time zone. 
     * @param totalEngagedSeconds Total engaged time across all responders for incidents. Engaged time is measured from the time a user engages with an incident (by acknowledging or accepting a responder request) until the incident is resolved. This may include periods in which the incidents was snoozed.
     * @param totalEscalationCount Total count of instances where an incident is escalated between responders assigned to an escalation policy.
     * @param totalIncidentCount The total number of incidents that were created.
     * @param totalOffHourInterruptions Total number of unique interruptions during off hours. Off hour: 6pm-10pm Mon-Fri and all day Sat-Sun, based on the user’s time zone.
     * @param totalSleepHourInterruptions Total number of unique interruptions during sleep hours. Sleep hour: 10pm-8am every day, based on the user’s time zone.
     * @param totalSnoozedSeconds Total number of seconds incidents were snoozed.
     * @param upTimePct The percentage of time in the defined date range that the service was not interrupted by a [major incident](https://support.pagerduty.com/docs/operational-reviews#major-incidents).
     */
    @ApiStatus.Internal
    public AnalyticsIncidentMetrics(Integer meanAssignmentCount, Integer meanEngagedSeconds, Integer meanEngagedUserCount, Integer meanSecondsToEngage, Integer meanSecondsToFirstAck, Integer meanSecondsToMobilize, Integer meanSecondsToResolve, String serviceId, String serviceName, String teamId, String teamName, Integer totalBusinessHourInterruptions, Integer totalEngagedSeconds, Integer totalEscalationCount, Integer totalIncidentCount, Integer totalOffHourInterruptions, Integer totalSleepHourInterruptions, Integer totalSnoozedSeconds, BigDecimal upTimePct) {
        this.meanAssignmentCount = meanAssignmentCount;
        this.meanEngagedSeconds = meanEngagedSeconds;
        this.meanEngagedUserCount = meanEngagedUserCount;
        this.meanSecondsToEngage = meanSecondsToEngage;
        this.meanSecondsToFirstAck = meanSecondsToFirstAck;
        this.meanSecondsToMobilize = meanSecondsToMobilize;
        this.meanSecondsToResolve = meanSecondsToResolve;
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.teamId = teamId;
        this.teamName = teamName;
        this.totalBusinessHourInterruptions = totalBusinessHourInterruptions;
        this.totalEngagedSeconds = totalEngagedSeconds;
        this.totalEscalationCount = totalEscalationCount;
        this.totalIncidentCount = totalIncidentCount;
        this.totalOffHourInterruptions = totalOffHourInterruptions;
        this.totalSleepHourInterruptions = totalSleepHourInterruptions;
        this.totalSnoozedSeconds = totalSnoozedSeconds;
        this.upTimePct = upTimePct;
    }

}
