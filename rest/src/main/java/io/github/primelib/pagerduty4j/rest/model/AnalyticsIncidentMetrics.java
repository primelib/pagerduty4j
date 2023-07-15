package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AnalyticsIncidentMetrics
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private Integer meanAssignmentCount;

    /**
     * Mean engaged time across all responders for incidents that match the given filters. Engaged time is measured from the time a user engages with an incident (by acknowledging or accepting a responder request) until the incident is resolved. This may include periods in which the incidents was snoozed.
     */
    @JsonProperty("mean_engaged_seconds")
    private Integer meanEngagedSeconds;

    /**
     * Mean number of users who engaged with an incident. *Engaged* is defined as acknowledging an incident or accepting a responder request in it.
     */
    @JsonProperty("mean_engaged_user_count")
    private Integer meanEngagedUserCount;

    /**
     * A measure of *people response time*. This metric measures the time from the first user engagement (acknowledge or responder accept) to the last. This metric is only used for incidents with **multiple responders**; for incidents with one or no engaged users, this value is null.
     */
    @JsonProperty("mean_seconds_to_engage")
    private Integer meanSecondsToEngage;

    /**
     * Mean time between the start of an incident, and the first responder to acknowledge.
     */
    @JsonProperty("mean_seconds_to_first_ack")
    private Integer meanSecondsToFirstAck;

    /**
     * Mean time between the start of an incident, and the last additional responder to acknowledge. For incidents with one or no engaged users, this value is null.
     */
    @JsonProperty("mean_seconds_to_mobilize")
    private Integer meanSecondsToMobilize;

    /**
     * Mean time from when an incident was triggered until it was resolved.
     */
    @JsonProperty("mean_seconds_to_resolve")
    private Integer meanSecondsToResolve;

    /**
     * ID of the service. Only included when aggregating by service.
     */
    @JsonProperty("service_id")
    private String serviceId;

    /**
     * Name of the service. Only included when aggregating by service.
     */
    @JsonProperty("service_name")
    private String serviceName;

    /**
     * ID of the team the incident was assigned to.
     */
    @JsonProperty("team_id")
    private String teamId;

    /**
     * Name of the team the incident was assigned to.
     */
    @JsonProperty("team_name")
    private String teamName;

    /**
     * Total number of unique interruptions during business hours. Business hour: 8am-6pm Mon-Fri, based on the user’s time zone. 
     */
    @JsonProperty("total_business_hour_interruptions")
    private Integer totalBusinessHourInterruptions;

    /**
     * Total engaged time across all responders for incidents. Engaged time is measured from the time a user engages with an incident (by acknowledging or accepting a responder request) until the incident is resolved. This may include periods in which the incidents was snoozed.
     */
    @JsonProperty("total_engaged_seconds")
    private Integer totalEngagedSeconds;

    /**
     * Total count of instances where an incident is escalated between responders assigned to an escalation policy.
     */
    @JsonProperty("total_escalation_count")
    private Integer totalEscalationCount;

    /**
     * The total number of incidents that were created.
     */
    @JsonProperty("total_incident_count")
    private Integer totalIncidentCount;

    /**
     * Total number of unique interruptions during off hours. Off hour: 6pm-10pm Mon-Fri and all day Sat-Sun, based on the user’s time zone.
     */
    @JsonProperty("total_off_hour_interruptions")
    private Integer totalOffHourInterruptions;

    /**
     * Total number of unique interruptions during sleep hours. Sleep hour: 10pm-8am every day, based on the user’s time zone.
     */
    @JsonProperty("total_sleep_hour_interruptions")
    private Integer totalSleepHourInterruptions;

    /**
     * Total number of seconds incidents were snoozed.
     */
    @JsonProperty("total_snoozed_seconds")
    private Integer totalSnoozedSeconds;

    /**
     * The percentage of time in the defined date range that the service was not interrupted by a [major incident](https://support.pagerduty.com/docs/operational-reviews#major-incidents).
     */
    @JsonProperty("up_time_pct")
    private BigDecimal upTimePct;


}
