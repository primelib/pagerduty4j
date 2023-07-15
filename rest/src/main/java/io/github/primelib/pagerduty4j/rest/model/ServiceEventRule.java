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
 * ServiceEventRule
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
    "actions"
})
@JsonTypeName("ServiceEventRule")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceEventRule {

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
     * Position/index of the Event Rule on the Service.
     * Starting from position 0 (the first rule), rules are evaluated one-by-one until a matching Event Rule is found or the end of the list is reached.
     */
    @JsonProperty("position")
    private Integer position;

    @JsonProperty("actions")
    private EventRuleActionsCommon actions;


}
