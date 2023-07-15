package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
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
    private String id;

    /**
     * the API show URL at which the object is accessible.
     */
    @JsonProperty("self")
    private String self;

    /**
     * Indicates whether the Event Rule is disabled and would therefore not be evaluated.
     */
    @JsonProperty("disabled")
    private Boolean disabled;

    @JsonProperty("conditions")
    private ServiceEventRuleAllOfConditions conditions;

    @JsonProperty("time_frame")
    private ServiceEventRuleAllOfTimeFrame timeFrame;

    /**
     * [Early Access] Populate variables from event payloads and use those variables in other event actions.
     */
    @JsonProperty("variables")
    private List<ServiceEventRuleAllOfVariables> variables;

    /**
     * Position/index of the Event Rule in the Ruleset.
     * Starting from position 0 (the first rule), rules are evaluated one-by-one until a matching rule is found.
     */
    @JsonProperty("position")
    private Integer position;

    /**
     * Indicates whether the Event Rule is the last Event Rule of the Ruleset that serves as a catch-all. It has limited functionality compared to other rules and always matches.
     */
    @JsonProperty("catch_all")
    private Boolean catchAll;

    @JsonProperty("actions")
    private EventRuleAllOfActions actions;


}
