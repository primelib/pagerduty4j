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
 * ServiceEventRule
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
    "actions"
})
@JsonTypeName("ServiceEventRule")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceEventRule {

    /**
     * Constructs a validated implementation of {@link ServiceEventRule}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ServiceEventRule(Consumer<ServiceEventRule> spec) {
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
     * Position/index of the Event Rule on the Service.
     * Starting from position 0 (the first rule), rules are evaluated one-by-one until a matching Event Rule is found or the end of the list is reached.
     */
    @JsonProperty("position")
    protected Integer position;

    @JsonProperty("actions")
    protected EventRuleActionsCommon actions;


}
