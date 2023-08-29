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
 * IncidentAllOfLastStatusChangeBy
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
    "email",
    "time_zone",
    "color",
    "role",
    "avatar_url",
    "description",
    "invitation_sent",
    "job_title",
    "teams",
    "contact_methods",
    "notification_rules",
    "license",
    "auto_resolve_timeout",
    "acknowledgement_timeout",
    "created_at",
    "status",
    "last_incident_timestamp",
    "escalation_policy",
    "response_play",
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
@JsonTypeName("Incident_allOf_last_status_change_by")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncidentAllOfLastStatusChangeBy {

    @JsonProperty("id")
    protected String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to {@code name}, though it is not intended to be an identifier.
     */
    @JsonProperty("summary")
    protected String summary;

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
     * The user's email address.
     */
    @JsonProperty("email")
    protected String email;

    /**
     * The preferred time zone name. If null, the account's time zone will be used.
     */
    @JsonProperty("time_zone")
    protected String timeZone;

    /**
     * The schedule color.
     */
    @JsonProperty("color")
    protected String color;

    /**
     * The user role. Account must have the {@code read_only_users} ability to set a user as a {@code read_only_user} or a {@code read_only_limited_user}, and must have advanced permissions abilities to set a user as {@code observer} or {@code restricted_access}.
     */
    @JsonProperty("role")
    protected RoleEnum role;

    /**
     * The URL of the user's avatar.
     */
    @JsonProperty("avatar_url")
    protected String avatarUrl;

    /**
     * The user-provided description of the service.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * If true, the user has an outstanding invitation.
     */
    @JsonProperty("invitation_sent")
    protected Boolean invitationSent;

    /**
     * The user's title.
     */
    @JsonProperty("job_title")
    protected String jobTitle;

    /**
     * The set of teams associated with this service.
     */
    @JsonProperty("teams")
    protected List<TeamReference> teams;

    /**
     * The list of contact methods for the user.
     */
    @JsonProperty("contact_methods")
    protected List<ContactMethodReference> contactMethods;

    /**
     * The list of notification rules for the user.
     */
    @JsonProperty("notification_rules")
    protected List<NotificationRuleReference> notificationRules;

    @JsonProperty("license")
    protected UserAllOfLicense license;

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
     * Constructs a validated instance of {@link IncidentAllOfLastStatusChangeBy}.
     *
     * @param spec the specification to process
     */
    public IncidentAllOfLastStatusChangeBy(Consumer<IncidentAllOfLastStatusChangeBy> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IncidentAllOfLastStatusChangeBy}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IncidentAllOfLastStatusChangeBy(Consumer)} instead.
     * @param id id
     * @param summary A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to {@code name}, though it is not intended to be an identifier.
     * @param type type
     * @param self the API show URL at which the object is accessible
     * @param htmlUrl a URL at which the entity is uniquely displayed in the Web app
     * @param name The name of the service.
     * @param email The user's email address.
     * @param timeZone The preferred time zone name. If null, the account's time zone will be used.
     * @param color The schedule color.
     * @param role The user role. Account must have the {@code read_only_users} ability to set a user as a {@code read_only_user} or a {@code read_only_limited_user}, and must have advanced permissions abilities to set a user as {@code observer} or {@code restricted_access}.
     * @param avatarUrl The URL of the user's avatar.
     * @param description The user-provided description of the service.
     * @param invitationSent If true, the user has an outstanding invitation.
     * @param jobTitle The user's title.
     * @param teams The set of teams associated with this service.
     * @param contactMethods The list of contact methods for the user.
     * @param notificationRules The list of notification rules for the user.
     * @param license license
     * @param autoResolveTimeout Time in seconds that an incident is automatically resolved if left open for that long. Value is {@code null} if the feature is disabled. Value must not be negative. Setting this field to {@code 0}, {@code null} (or unset in POST request) will disable the feature.
     * @param acknowledgementTimeout Time in seconds that an incident changes to the Triggered State after being Acknowledged. Value is {@code null} if the feature is disabled. Value must not be negative. Setting this field to {@code 0}, {@code null} (or unset in POST request) will disable the feature.
     * @param createdAt The date/time when this service was created
     * @param status The current state of the Service. Valid statuses are:   - {@code active}: The service is enabled and has no open incidents. This is the only status a service can be created with. - {@code warning}: The service is enabled and has one or more acknowledged incidents. - {@code critical}: The service is enabled and has one or more triggered incidents. - {@code maintenance}: The service is under maintenance, no new incidents will be triggered during maintenance mode. - {@code disabled}: The service is disabled and will not have any new triggered incidents. 
     * @param lastIncidentTimestamp The date/time when the most recent incident was created for this service.
     * @param escalationPolicy escalationPolicy
     * @param responsePlay responsePlay
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
    public IncidentAllOfLastStatusChangeBy(String id, String summary, TypeEnum type, String self, String htmlUrl, String name, String email, String timeZone, String color, RoleEnum role, String avatarUrl, String description, Boolean invitationSent, String jobTitle, List<TeamReference> teams, List<ContactMethodReference> contactMethods, List<NotificationRuleReference> notificationRules, UserAllOfLicense license, Integer autoResolveTimeout, Integer acknowledgementTimeout, OffsetDateTime createdAt, StatusEnum status, OffsetDateTime lastIncidentTimestamp, EscalationPolicyReference escalationPolicy, ServiceAllOfResponsePlay responsePlay, List<IntegrationReference> integrations, IncidentUrgencyRule incidentUrgencyRule, SupportHours supportHours, List<ScheduledAction> scheduledActions, List<AddonReference> addons, AlertCreationEnum alertCreation, AlertGroupingParameters alertGroupingParameters, AlertGroupingEnum alertGrouping, Integer alertGroupingTimeout, AutoPauseNotificationsParameters autoPauseNotificationsParameters) {
        this.id = id;
        this.summary = summary;
        this.type = type;
        this.self = self;
        this.htmlUrl = htmlUrl;
        this.name = name;
        this.email = email;
        this.timeZone = timeZone;
        this.color = color;
        this.role = role;
        this.avatarUrl = avatarUrl;
        this.description = description;
        this.invitationSent = invitationSent;
        this.jobTitle = jobTitle;
        this.teams = teams;
        this.contactMethods = contactMethods;
        this.notificationRules = notificationRules;
        this.license = license;
        this.autoResolveTimeout = autoResolveTimeout;
        this.acknowledgementTimeout = acknowledgementTimeout;
        this.createdAt = createdAt;
        this.status = status;
        this.lastIncidentTimestamp = lastIncidentTimestamp;
        this.escalationPolicy = escalationPolicy;
        this.responsePlay = responsePlay;
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

    @AllArgsConstructor
    public enum TypeEnum {
        USER_REFERENCE("user_reference"),
        SERVICE_REFERENCE("service_reference"),
        INTEGRATION_REFERENCE("integration_reference"),
        USER("user"),
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
     * The user role. Account must have the {@code read_only_users} ability to set a user as a {@code read_only_user} or a {@code read_only_limited_user}, and must have advanced permissions abilities to set a user as {@code observer} or {@code restricted_access}.
     */
    @AllArgsConstructor
    public enum RoleEnum {
        ADMIN("admin"),
        LIMITED_USER("limited_user"),
        OBSERVER("observer"),
        OWNER("owner"),
        READ_ONLY_USER("read_only_user"),
        RESTRICTED_ACCESS("restricted_access"),
        READ_ONLY_LIMITED_USER("read_only_limited_user"),
        USER("user");

        private static final RoleEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static RoleEnum of(String input) {
            if (input != null) {
                for (RoleEnum v : VALUES) {
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
