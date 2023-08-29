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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * IncidentAllOfEscalationPolicy
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
    "num_loops",
    "on_call_handoff_notifications",
    "escalation_rules",
    "services",
    "teams"
})
@JsonTypeName("Incident_allOf_escalation_policy")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncidentAllOfEscalationPolicy {

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
     * The name of the escalation policy.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Escalation policy description.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The number of times the escalation policy will repeat after reaching the end of its escalation.
     */
    @JsonProperty("num_loops")
    protected Integer numLoops;

    /**
     * Determines how on call handoff notifications will be sent for users on the escalation policy. Defaults to "if_has_services".
     */
    @JsonProperty("on_call_handoff_notifications")
    protected OnCallHandoffNotificationsEnum onCallHandoffNotifications;

    @JsonProperty("escalation_rules")
    protected List<EscalationRule> escalationRules;

    @JsonProperty("services")
    protected List<ServiceReference> services;

    /**
     * Team associated with the policy. Account must have the {@code teams} ability to use this parameter. Only one team may be associated with the policy.
     */
    @JsonProperty("teams")
    protected List<TeamReference> teams;

    /**
     * Constructs a validated instance of {@link IncidentAllOfEscalationPolicy}.
     *
     * @param spec the specification to process
     */
    public IncidentAllOfEscalationPolicy(Consumer<IncidentAllOfEscalationPolicy> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IncidentAllOfEscalationPolicy}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IncidentAllOfEscalationPolicy(Consumer)} instead.
     * @param id id
     * @param summary A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to {@code name}, though it is not intended to be an identifier.
     * @param type type
     * @param self the API show URL at which the object is accessible
     * @param htmlUrl a URL at which the entity is uniquely displayed in the Web app
     * @param name The name of the escalation policy.
     * @param description Escalation policy description.
     * @param numLoops The number of times the escalation policy will repeat after reaching the end of its escalation.
     * @param onCallHandoffNotifications Determines how on call handoff notifications will be sent for users on the escalation policy. Defaults to "if_has_services".
     * @param escalationRules escalationRules
     * @param services services
     * @param teams Team associated with the policy. Account must have the {@code teams} ability to use this parameter. Only one team may be associated with the policy.
     */
    @ApiStatus.Internal
    public IncidentAllOfEscalationPolicy(String id, String summary, TypeEnum type, String self, String htmlUrl, String name, String description, Integer numLoops, OnCallHandoffNotificationsEnum onCallHandoffNotifications, List<EscalationRule> escalationRules, List<ServiceReference> services, List<TeamReference> teams) {
        this.id = id;
        this.summary = summary;
        this.type = type;
        this.self = self;
        this.htmlUrl = htmlUrl;
        this.name = name;
        this.description = description;
        this.numLoops = numLoops;
        this.onCallHandoffNotifications = onCallHandoffNotifications;
        this.escalationRules = escalationRules;
        this.services = services;
        this.teams = teams;
    }

    @AllArgsConstructor
    public enum TypeEnum {
        POLICY_REFERENCE("escalation_policy_reference"),
        POLICY("escalation_policy");

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
     * Determines how on call handoff notifications will be sent for users on the escalation policy. Defaults to "if_has_services".
     */
    @AllArgsConstructor
    public enum OnCallHandoffNotificationsEnum {
        IF_HAS_SERVICES("if_has_services"),
        ALWAYS("always");

        private static final OnCallHandoffNotificationsEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static OnCallHandoffNotificationsEnum of(String input) {
            if (input != null) {
                for (OnCallHandoffNotificationsEnum v : VALUES) {
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
