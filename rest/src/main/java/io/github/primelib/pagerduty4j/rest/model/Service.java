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
 * Service
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
    "name",
    "description",
    "auto_resolve_timeout",
    "acknowledgement_timeout",
    "created_at",
    "status",
    "last_incident_timestamp",
    "escalation_policy",
    "response_play",
    "teams",
    "integrations",
    "incident_urgency_rule",
    "support_hours",
    "scheduled_actions",
    "addons",
    "alert_creation",
    "alert_grouping_parameters",
    "alert_grouping",
    "alert_grouping_timeout",
    "auto_pause_notifications_parameters"
})
@JsonTypeName("Service")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Service {

    @JsonProperty("id")
    private String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
     */
    @JsonProperty("summary")
    private String summary;

    /**
     * The type of object being created.
     */
    @JsonProperty("type")
    private TypeEnum type = TypeEnum.SERVICE;

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
     * The name of the service.
     */
    @JsonProperty("name")
    private String name;

    /**
     * The user-provided description of the service.
     */
    @JsonProperty("description")
    private String description;

    /**
     * Time in seconds that an incident is automatically resolved if left open for that long. Value is `null` if the feature is disabled. Value must not be negative. Setting this field to `0`, `null` (or unset in POST request) will disable the feature.
     */
    @JsonProperty("auto_resolve_timeout")
    private Integer autoResolveTimeout = 14400;

    /**
     * Time in seconds that an incident changes to the Triggered State after being Acknowledged. Value is `null` if the feature is disabled. Value must not be negative. Setting this field to `0`, `null` (or unset in POST request) will disable the feature.
     */
    @JsonProperty("acknowledgement_timeout")
    private Integer acknowledgementTimeout = 1800;

    /**
     * The date/time when this service was created
     */
    @JsonProperty("created_at")
    private OffsetDateTime createdAt;

    /**
     * The current state of the Service. Valid statuses are:
     *  - `active`: The service is enabled and has no open incidents. This is the only status a service can be created with. - `warning`: The service is enabled and has one or more acknowledged incidents. - `critical`: The service is enabled and has one or more triggered incidents. - `maintenance`: The service is under maintenance, no new incidents will be triggered during maintenance mode. - `disabled`: The service is disabled and will not have any new triggered incidents. 
     */
    @JsonProperty("status")
    private StatusEnum status = StatusEnum.ACTIVE;

    /**
     * The date/time when the most recent incident was created for this service.
     */
    @JsonProperty("last_incident_timestamp")
    private OffsetDateTime lastIncidentTimestamp;

    @JsonProperty("escalation_policy")
    private EscalationPolicyReference escalationPolicy;

    @JsonProperty("response_play")
    private ServiceAllOfResponsePlay responsePlay;

    /**
     * The set of teams associated with this service.
     */
    @JsonProperty("teams")
    private List<TeamReference> teams;

    /**
     * An array containing Integration objects that belong to this service. If `integrations` is passed as an argument, these are full objects - otherwise, these are references.
     */
    @JsonProperty("integrations")
    private List<IntegrationReference> integrations;

    @JsonProperty("incident_urgency_rule")
    private IncidentUrgencyRule incidentUrgencyRule;

    @JsonProperty("support_hours")
    private SupportHours supportHours;

    /**
     * An array containing scheduled actions for the service.
     */
    @JsonProperty("scheduled_actions")
    private List<ScheduledAction> scheduledActions;

    /**
     * The array of Add-ons associated with this service.
     */
    @JsonProperty("addons")
    private List<AddonReference> addons;

    /**
     * Whether a service creates only incidents, or both alerts and incidents. A service must create alerts in order to enable incident merging. * "create_incidents" - The service will create one incident and zero alerts for each incoming event. * "create_alerts_and_incidents" - The service will create one incident and one associated alert for each incoming event. 
     */
    @JsonProperty("alert_creation")
    private AlertCreationEnum alertCreation;

    @JsonProperty("alert_grouping_parameters")
    private AlertGroupingParameters alertGroupingParameters;

    /**
     * Defines how alerts on this service will be automatically grouped into incidents. Note that the alert grouping features are available only on certain plans. There are three available options: * null - No alert grouping on the service. Each alert will create a separate incident; * "time" - All alerts within a specified duration will be grouped into the same incident. This duration is set in the `alert_grouping_timeout` setting (described below). Available on Standard, Enterprise, and Event Intelligence plans; * "intelligent" - Alerts will be intelligently grouped based on a machine learning model that looks at the alert summary, timing, and the history of grouped alerts. Available on Enterprise and Event Intelligence plans 
     */
    @JsonProperty("alert_grouping")
    private AlertGroupingEnum alertGrouping;

    /**
     * The duration in minutes within which to automatically group incoming alerts. This setting applies only when `alert_grouping` is set to `time`. To continue grouping alerts until the Incident is resolved, set this value to `0`. 
     */
    @JsonProperty("alert_grouping_timeout")
    private Integer alertGroupingTimeout;

    @JsonProperty("auto_pause_notifications_parameters")
    private AutoPauseNotificationsParameters autoPauseNotificationsParameters;


    /**
     * The type of object being created.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        SERVICE("service");

        private final String value;
    }

    /**
     * The current state of the Service. Valid statuses are:
     *  - `active`: The service is enabled and has no open incidents. This is the only status a service can be created with. - `warning`: The service is enabled and has one or more acknowledged incidents. - `critical`: The service is enabled and has one or more triggered incidents. - `maintenance`: The service is under maintenance, no new incidents will be triggered during maintenance mode. - `disabled`: The service is disabled and will not have any new triggered incidents. 
     */
    @AllArgsConstructor
    public enum StatusEnum {
        ACTIVE("active"),
        WARNING("warning"),
        CRITICAL("critical"),
        MAINTENANCE("maintenance"),
        DISABLED("disabled");

        private final String value;
    }

    /**
     * Whether a service creates only incidents, or both alerts and incidents. A service must create alerts in order to enable incident merging. * "create_incidents" - The service will create one incident and zero alerts for each incoming event. * "create_alerts_and_incidents" - The service will create one incident and one associated alert for each incoming event. 
     */
    @AllArgsConstructor
    public enum AlertCreationEnum {
        INCIDENTS("create_incidents"),
        ALERTS_AND_INCIDENTS("create_alerts_and_incidents");

        private final String value;
    }

    /**
     * Defines how alerts on this service will be automatically grouped into incidents. Note that the alert grouping features are available only on certain plans. There are three available options: * null - No alert grouping on the service. Each alert will create a separate incident; * "time" - All alerts within a specified duration will be grouped into the same incident. This duration is set in the `alert_grouping_timeout` setting (described below). Available on Standard, Enterprise, and Event Intelligence plans; * "intelligent" - Alerts will be intelligently grouped based on a machine learning model that looks at the alert summary, timing, and the history of grouped alerts. Available on Enterprise and Event Intelligence plans 
     */
    @AllArgsConstructor
    public enum AlertGroupingEnum {
        TIME("time"),
        INTELLIGENT("intelligent");

        private final String value;
    }

}
