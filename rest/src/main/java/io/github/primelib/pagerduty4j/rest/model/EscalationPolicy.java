package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EscalationPolicy
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
    "num_loops",
    "on_call_handoff_notifications",
    "escalation_rules",
    "services",
    "teams"
})
@JsonTypeName("EscalationPolicy")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EscalationPolicy {

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
    private TypeEnum type = TypeEnum.ESCALATION_POLICY;

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
     * The name of the escalation policy.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Escalation policy description.
     */
    @JsonProperty("description")
    private String description;

    /**
     * The number of times the escalation policy will repeat after reaching the end of its escalation.
     */
    @JsonProperty("num_loops")
    private Integer numLoops = 0;

    /**
     * Determines how on call handoff notifications will be sent for users on the escalation policy. Defaults to "if_has_services".
     */
    @JsonProperty("on_call_handoff_notifications")
    private OnCallHandoffNotificationsEnum onCallHandoffNotifications;

    @JsonProperty("escalation_rules")
    private List<EscalationRule> escalationRules = new ArrayList<>();

    @JsonProperty("services")
    private List<ServiceReference> services;

    /**
     * Team associated with the policy. Account must have the `teams` ability to use this parameter. Only one team may be associated with the policy.
     */
    @JsonProperty("teams")
    private List<TeamReference> teams;


    /**
     * The type of object being created.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        ESCALATION_POLICY("escalation_policy");

        private final String value;
    }

    /**
     * Determines how on call handoff notifications will be sent for users on the escalation policy. Defaults to "if_has_services".
     */
    @AllArgsConstructor
    public enum OnCallHandoffNotificationsEnum {
        IF_HAS_SERVICES("if_has_services"),
        ALWAYS("always");

        private final String value;
    }

}
