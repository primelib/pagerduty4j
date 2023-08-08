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
 * Service
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
    protected String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to {@code name}, though it is not intended to be an identifier.
     */
    @JsonProperty("summary")
    protected String summary;

    /**
     * The type of object being created.
     */
    @JsonProperty("type")
    protected TypeEnum type;

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
     * The name of the service.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The user-provided description of the service.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * Time in seconds that an incident is automatically resolved if left open for that long. Value is {@code null} if the feature is disabled. Value must not be negative. Setting this field to {@code 0}, {@code null} (or unset in POST request) will disable the feature.
     */
    @JsonProperty("auto_resolve_timeout")
    protected Integer autoResolveTimeout;

    /**
     * Time in seconds that an incident changes to the Triggered State after being Acknowledged. Value is {@code null} if the feature is disabled. Value must not be negative. Setting this field to {@code 0}, {@code null} (or unset in POST request) will disable the feature.
     */
    @JsonProperty("acknowledgement_timeout")
    protected Integer acknowledgementTimeout;

    /**
     * The date/time when this service was created
     */
    @JsonProperty("created_at")
    protected OffsetDateTime createdAt;

    /**
     * The current state of the Service. Valid statuses are:
     *  - {@code active}: The service is enabled and has no open incidents. This is the only status a service can be created with. - {@code warning}: The service is enabled and has one or more acknowledged incidents. - {@code critical}: The service is enabled and has one or more triggered incidents. - {@code maintenance}: The service is under maintenance, no new incidents will be triggered during maintenance mode. - {@code disabled}: The service is disabled and will not have any new triggered incidents. 
     */
    @JsonProperty("status")
    protected StatusEnum status;

    /**
     * The date/time when the most recent incident was created for this service.
     */
    @JsonProperty("last_incident_timestamp")
    protected OffsetDateTime lastIncidentTimestamp;

    @JsonProperty("escalation_policy")
    protected EscalationPolicyReference escalationPolicy;

    @JsonProperty("response_play")
    protected ServiceAllOfResponsePlay responsePlay;

    /**
     * The set of teams associated with this service.
     */
    @JsonProperty("teams")
    protected List<TeamReference> teams;

    /**
     * An array containing Integration objects that belong to this service. If {@code integrations} is passed as an argument, these are full objects - otherwise, these are references.
     */
    @JsonProperty("integrations")
    protected List<IntegrationReference> integrations;

    @JsonProperty("incident_urgency_rule")
    protected IncidentUrgencyRule incidentUrgencyRule;

    @JsonProperty("support_hours")
    protected SupportHours supportHours;

    /**
     * An array containing scheduled actions for the service.
     */
    @JsonProperty("scheduled_actions")
    protected List<ScheduledAction> scheduledActions;

    /**
     * The array of Add-ons associated with this service.
     */
    @JsonProperty("addons")
    protected List<AddonReference> addons;

    /**
     * Whether a service creates only incidents, or both alerts and incidents. A service must create alerts in order to enable incident merging. * "create_incidents" - The service will create one incident and zero alerts for each incoming event. * "create_alerts_and_incidents" - The service will create one incident and one associated alert for each incoming event. 
     */
    @JsonProperty("alert_creation")
    protected AlertCreationEnum alertCreation;

    @JsonProperty("alert_grouping_parameters")
    protected AlertGroupingParameters alertGroupingParameters;

    /**
     * Defines how alerts on this service will be automatically grouped into incidents. Note that the alert grouping features are available only on certain plans. There are three available options: * null - No alert grouping on the service. Each alert will create a separate incident; * "time" - All alerts within a specified duration will be grouped into the same incident. This duration is set in the {@code alert_grouping_timeout} setting (described below). Available on Standard, Enterprise, and Event Intelligence plans; * "intelligent" - Alerts will be intelligently grouped based on a machine learning model that looks at the alert summary, timing, and the history of grouped alerts. Available on Enterprise and Event Intelligence plans 
     */
    @JsonProperty("alert_grouping")
    protected AlertGroupingEnum alertGrouping;

    /**
     * The duration in minutes within which to automatically group incoming alerts. This setting applies only when {@code alert_grouping} is set to {@code time}. To continue grouping alerts until the Incident is resolved, set this value to {@code 0}. 
     */
    @JsonProperty("alert_grouping_timeout")
    protected Integer alertGroupingTimeout;

    @JsonProperty("auto_pause_notifications_parameters")
    protected AutoPauseNotificationsParameters autoPauseNotificationsParameters;

    /**
     * Constructs a validated instance of {@link Service}.
     *
     * @param spec the specification to process
     */
    public Service(Consumer<Service> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Service}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Service(Consumer)} instead.
     * @param id id
     * @param summary A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to {@code name}, though it is not intended to be an identifier.
     * @param type The type of object being created.
     * @param self the API show URL at which the object is accessible
     * @param htmlUrl a URL at which the entity is uniquely displayed in the Web app
     * @param name The name of the service.
     * @param description The user-provided description of the service.
     * @param autoResolveTimeout Time in seconds that an incident is automatically resolved if left open for that long. Value is {@code null} if the feature is disabled. Value must not be negative. Setting this field to {@code 0}, {@code null} (or unset in POST request) will disable the feature.
     * @param acknowledgementTimeout Time in seconds that an incident changes to the Triggered State after being Acknowledged. Value is {@code null} if the feature is disabled. Value must not be negative. Setting this field to {@code 0}, {@code null} (or unset in POST request) will disable the feature.
     * @param createdAt The date/time when this service was created
     * @param status The current state of the Service. Valid statuses are:   - {@code active}: The service is enabled and has no open incidents. This is the only status a service can be created with. - {@code warning}: The service is enabled and has one or more acknowledged incidents. - {@code critical}: The service is enabled and has one or more triggered incidents. - {@code maintenance}: The service is under maintenance, no new incidents will be triggered during maintenance mode. - {@code disabled}: The service is disabled and will not have any new triggered incidents. 
     * @param lastIncidentTimestamp The date/time when the most recent incident was created for this service.
     * @param escalationPolicy escalationPolicy
     * @param responsePlay responsePlay
     * @param teams The set of teams associated with this service.
     * @param integrations An array containing Integration objects that belong to this service. If {@code integrations} is passed as an argument, these are full objects - otherwise, these are references.
     * @param incidentUrgencyRule incidentUrgencyRule
     * @param supportHours supportHours
     * @param scheduledActions An array containing scheduled actions for the service.
     * @param addons The array of Add-ons associated with this service.
     * @param alertCreation Whether a service creates only incidents, or both alerts and incidents. A service must create alerts in order to enable incident merging. * "create_incidents" - The service will create one incident and zero alerts for each incoming event. * "create_alerts_and_incidents" - The service will create one incident and one associated alert for each incoming event. 
     * @param alertGroupingParameters alertGroupingParameters
     * @param alertGrouping Defines how alerts on this service will be automatically grouped into incidents. Note that the alert grouping features are available only on certain plans. There are three available options: * null - No alert grouping on the service. Each alert will create a separate incident; * "time" - All alerts within a specified duration will be grouped into the same incident. This duration is set in the {@code alert_grouping_timeout} setting (described below). Available on Standard, Enterprise, and Event Intelligence plans; * "intelligent" - Alerts will be intelligently grouped based on a machine learning model that looks at the alert summary, timing, and the history of grouped alerts. Available on Enterprise and Event Intelligence plans 
     * @param alertGroupingTimeout The duration in minutes within which to automatically group incoming alerts. This setting applies only when {@code alert_grouping} is set to {@code time}. To continue grouping alerts until the Incident is resolved, set this value to {@code 0}. 
     * @param autoPauseNotificationsParameters autoPauseNotificationsParameters
     */
    @ApiStatus.Internal
    public Service(String id, String summary, TypeEnum type, String self, String htmlUrl, String name, String description, Integer autoResolveTimeout, Integer acknowledgementTimeout, OffsetDateTime createdAt, StatusEnum status, OffsetDateTime lastIncidentTimestamp, EscalationPolicyReference escalationPolicy, ServiceAllOfResponsePlay responsePlay, List<TeamReference> teams, List<IntegrationReference> integrations, IncidentUrgencyRule incidentUrgencyRule, SupportHours supportHours, List<ScheduledAction> scheduledActions, List<AddonReference> addons, AlertCreationEnum alertCreation, AlertGroupingParameters alertGroupingParameters, AlertGroupingEnum alertGrouping, Integer alertGroupingTimeout, AutoPauseNotificationsParameters autoPauseNotificationsParameters) {
        this.id = id;
        this.summary = summary;
        this.type = type;
        this.self = self;
        this.htmlUrl = htmlUrl;
        this.name = name;
        this.description = description;
        this.autoResolveTimeout = autoResolveTimeout;
        this.acknowledgementTimeout = acknowledgementTimeout;
        this.createdAt = createdAt;
        this.status = status;
        this.lastIncidentTimestamp = lastIncidentTimestamp;
        this.escalationPolicy = escalationPolicy;
        this.responsePlay = responsePlay;
        this.teams = teams;
        this.integrations = integrations;
        this.incidentUrgencyRule = incidentUrgencyRule;
        this.supportHours = supportHours;
        this.scheduledActions = scheduledActions;
        this.addons = addons;
        this.alertCreation = alertCreation;
        this.alertGroupingParameters = alertGroupingParameters;
        this.alertGrouping = alertGrouping;
        this.alertGroupingTimeout = alertGroupingTimeout;
        this.autoPauseNotificationsParameters = autoPauseNotificationsParameters;
    }

    /**
     * The type of object being created.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        SERVICE("service");

        private static final TypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static TypeEnum of(String input) {
            if (input != null) {
                for (TypeEnum v : VALUES) {
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
     * The current state of the Service. Valid statuses are:
     *  - {@code active}: The service is enabled and has no open incidents. This is the only status a service can be created with. - {@code warning}: The service is enabled and has one or more acknowledged incidents. - {@code critical}: The service is enabled and has one or more triggered incidents. - {@code maintenance}: The service is under maintenance, no new incidents will be triggered during maintenance mode. - {@code disabled}: The service is disabled and will not have any new triggered incidents. 
     */
    @AllArgsConstructor
    public enum StatusEnum {
        ACTIVE("active"),
        WARNING("warning"),
        CRITICAL("critical"),
        MAINTENANCE("maintenance"),
        DISABLED("disabled");

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
     * Whether a service creates only incidents, or both alerts and incidents. A service must create alerts in order to enable incident merging. * "create_incidents" - The service will create one incident and zero alerts for each incoming event. * "create_alerts_and_incidents" - The service will create one incident and one associated alert for each incoming event. 
     */
    @AllArgsConstructor
    public enum AlertCreationEnum {
        INCIDENTS("create_incidents"),
        ALERTS_AND_INCIDENTS("create_alerts_and_incidents");

        private static final AlertCreationEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static AlertCreationEnum of(String input) {
            if (input != null) {
                for (AlertCreationEnum v : VALUES) {
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
     * Defines how alerts on this service will be automatically grouped into incidents. Note that the alert grouping features are available only on certain plans. There are three available options: * null - No alert grouping on the service. Each alert will create a separate incident; * "time" - All alerts within a specified duration will be grouped into the same incident. This duration is set in the {@code alert_grouping_timeout} setting (described below). Available on Standard, Enterprise, and Event Intelligence plans; * "intelligent" - Alerts will be intelligently grouped based on a machine learning model that looks at the alert summary, timing, and the history of grouped alerts. Available on Enterprise and Event Intelligence plans 
     */
    @AllArgsConstructor
    public enum AlertGroupingEnum {
        TIME("time"),
        INTELLIGENT("intelligent");

        private static final AlertGroupingEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static AlertGroupingEnum of(String input) {
            if (input != null) {
                for (AlertGroupingEnum v : VALUES) {
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
