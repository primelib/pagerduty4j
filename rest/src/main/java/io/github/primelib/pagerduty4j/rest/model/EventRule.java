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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EventRule
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
    "self",
    "disabled",
    "conditions",
    "time_frame",
    "variables",
    "position",
    "catch_all",
    "actions"
})
@JsonTypeName("EventRule")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EventRule {

    /**
     * ID of the Event Rule.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * the API show URL at which the object is accessible.
     */
    @JsonProperty("self")
    protected String self;

    /**
     * Indicates whether the Event Rule is disabled and would therefore not be evaluated.
     */
    @JsonProperty("disabled")
    protected Boolean disabled;

    @JsonProperty("conditions")
    protected ServiceEventRuleAllOfConditions conditions;

    @JsonProperty("time_frame")
    protected ServiceEventRuleAllOfTimeFrame timeFrame;

    /**
     * [Early Access] Populate variables from event payloads and use those variables in other event actions.
     */
    @JsonProperty("variables")
    protected List<ServiceEventRuleAllOfVariables> variables;

    /**
     * Position/index of the Event Rule in the Ruleset.
     * Starting from position 0 (the first rule), rules are evaluated one-by-one until a matching rule is found.
     */
    @JsonProperty("position")
    protected Integer position;

    /**
     * Indicates whether the Event Rule is the last Event Rule of the Ruleset that serves as a catch-all. It has limited functionality compared to other rules and always matches.
     */
    @JsonProperty("catch_all")
    protected Boolean catchAll;

    @JsonProperty("actions")
    protected EventRuleAllOfActions actions;

    /**
     * Constructs a validated instance of {@link EventRule}.
     *
     * @param spec the specification to process
     */
    public EventRule(Consumer<EventRule> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link EventRule}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #EventRule(Consumer)} instead.
     * @param id ID of the Event Rule.
     * @param self the API show URL at which the object is accessible.
     * @param disabled Indicates whether the Event Rule is disabled and would therefore not be evaluated.
     * @param conditions conditions
     * @param timeFrame timeFrame
     * @param variables [Early Access] Populate variables from event payloads and use those variables in other event actions.
     * @param position Position/index of the Event Rule in the Ruleset.  Starting from position 0 (the first rule), rules are evaluated one-by-one until a matching rule is found.
     * @param catchAll Indicates whether the Event Rule is the last Event Rule of the Ruleset that serves as a catch-all. It has limited functionality compared to other rules and always matches.
     * @param actions actions
     */
    @ApiStatus.Internal
    public EventRule(String id, String self, Boolean disabled, ServiceEventRuleAllOfConditions conditions, ServiceEventRuleAllOfTimeFrame timeFrame, List<ServiceEventRuleAllOfVariables> variables, Integer position, Boolean catchAll, EventRuleAllOfActions actions) {
        this.id = id;
        this.self = self;
        this.disabled = disabled;
        this.conditions = conditions;
        this.timeFrame = timeFrame;
        this.variables = variables;
        this.position = position;
        this.catchAll = catchAll;
        this.actions = actions;
    }

}
