package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

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
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link EscalationPolicy}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public EscalationPolicy(Consumer<EscalationPolicy> spec) {
        spec.accept(this);
    }

    @JsonProperty("id")
    protected String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
     */
    @JsonProperty("summary")
    protected String summary;

    /**
     * The type of object being created.
     */
    @JsonProperty("type")
    protected TypeEnum type = TypeEnum.ESCALATION_POLICY;

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
    protected Integer numLoops = 0;

    /**
     * Determines how on call handoff notifications will be sent for users on the escalation policy. Defaults to "if_has_services".
     */
    @JsonProperty("on_call_handoff_notifications")
    protected OnCallHandoffNotificationsEnum onCallHandoffNotifications;

    @JsonProperty("escalation_rules")
    protected List<EscalationRule> escalationRules = new ArrayList<>();

    @JsonProperty("services")
    protected List<ServiceReference> services;

    /**
     * Team associated with the policy. Account must have the `teams` ability to use this parameter. Only one team may be associated with the policy.
     */
    @JsonProperty("teams")
    protected List<TeamReference> teams;


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
