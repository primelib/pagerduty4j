package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EventRule
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link EventRule}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public EventRule(Consumer<EventRule> spec) {
        spec.accept(this);
    }

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


}
