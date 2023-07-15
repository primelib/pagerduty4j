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
 * EventRuleAllOfActions
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "annotate",
    "event_action",
    "extractions",
    "priority",
    "severity",
    "suppress",
    "suspend",
    "route"
})
@JsonTypeName("EventRule_allOf_actions")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EventRuleAllOfActions {

    @JsonProperty("annotate")
    private EventRuleActionsCommonAnnotate annotate;

    @JsonProperty("event_action")
    private EventRuleActionsCommonEventAction eventAction;

    /**
     * Dynamically extract values to set and modify new and existing PD-CEF fields.
     */
    @JsonProperty("extractions")
    private List<EventRuleActionsCommonExtractionsInner> extractions;

    @JsonProperty("priority")
    private EventRuleActionsCommonPriority priority;

    @JsonProperty("severity")
    private EventRuleActionsCommonSeverity severity;

    @JsonProperty("suppress")
    private EventRuleActionsCommonSuppress suppress;

    @JsonProperty("suspend")
    private EventRuleActionsCommonSuspend suspend;

    @JsonProperty("route")
    private EventRuleAllOfActionsAllOfRoute route;


}
