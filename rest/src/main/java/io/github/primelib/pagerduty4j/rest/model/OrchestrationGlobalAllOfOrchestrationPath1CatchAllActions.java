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
 * OrchestrationGlobalAllOfOrchestrationPath1CatchAllActions
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "suppress",
    "suspend",
    "drop_event",
    "priority",
    "annotate",
    "automation_actions"
})
@JsonTypeName("OrchestrationGlobal_allOf_orchestration_path_1_catch_all_actions")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationGlobalAllOfOrchestrationPath1CatchAllActions {

    /**
     * If true, the resulting alert is suppressed. Suppressed alerts will not trigger an incident.
     */
    @JsonProperty("suppress")
    private Boolean suppress;

    /**
     * The number of seconds to suspend the resulting alert before triggering. This effectively pauses incident notifications. If a resolve event arrives before the alert triggers then PagerDuty won't create an incident for this the resulting alert.
     */
    @JsonProperty("suspend")
    private Integer suspend;

    /**
     * If true, this event will be dropped. Dropped events will not trigger or resolve an alert or an incident. Dropped events will not be evaluated against router rules.
     */
    @JsonProperty("drop_event")
    private Boolean dropEvent;

    /**
     * The ID of the priority you want to set on resulting incident. You can find the list of priority IDs for your account by calling the priorities endpoint.
     */
    @JsonProperty("priority")
    private String priority;

    /**
     * Add this text as a note on the resulting incident.
     */
    @JsonProperty("annotate")
    private String annotate;

    /**
     * Create a Webhoook associated with the resulting incident.
     */
    @JsonProperty("automation_actions")
    private List<OrchestrationGlobalAllOfOrchestrationPath1CatchAllActionsAllOfAutomationActionsInner> automationActions;


}
