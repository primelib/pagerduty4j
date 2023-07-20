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
 * OrchestrationGlobalAllOfOrchestrationPath1CatchAllActions
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
    protected Boolean suppress;

    /**
     * The number of seconds to suspend the resulting alert before triggering. This effectively pauses incident notifications. If a resolve event arrives before the alert triggers then PagerDuty won't create an incident for this the resulting alert.
     */
    @JsonProperty("suspend")
    protected Integer suspend;

    /**
     * If true, this event will be dropped. Dropped events will not trigger or resolve an alert or an incident. Dropped events will not be evaluated against router rules.
     */
    @JsonProperty("drop_event")
    protected Boolean dropEvent;

    /**
     * The ID of the priority you want to set on resulting incident. You can find the list of priority IDs for your account by calling the priorities endpoint.
     */
    @JsonProperty("priority")
    protected String priority;

    /**
     * Add this text as a note on the resulting incident.
     */
    @JsonProperty("annotate")
    protected String annotate;

    /**
     * Create a Webhoook associated with the resulting incident.
     */
    @JsonProperty("automation_actions")
    protected List<OrchestrationGlobalAllOfOrchestrationPath1CatchAllActionsAllOfAutomationActionsInner> automationActions;

    /**
     * Constructs a validated instance of {@link OrchestrationGlobalAllOfOrchestrationPath1CatchAllActions}.
     *
     * @param spec the specification to process
     */
    public OrchestrationGlobalAllOfOrchestrationPath1CatchAllActions(Consumer<OrchestrationGlobalAllOfOrchestrationPath1CatchAllActions> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OrchestrationGlobalAllOfOrchestrationPath1CatchAllActions}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OrchestrationGlobalAllOfOrchestrationPath1CatchAllActions(Consumer)} instead.
     * @param suppress If true, the resulting alert is suppressed. Suppressed alerts will not trigger an incident.
     * @param suspend The number of seconds to suspend the resulting alert before triggering. This effectively pauses incident notifications. If a resolve event arrives before the alert triggers then PagerDuty won't create an incident for this the resulting alert.
     * @param dropEvent If true, this event will be dropped. Dropped events will not trigger or resolve an alert or an incident. Dropped events will not be evaluated against router rules.
     * @param priority The ID of the priority you want to set on resulting incident. You can find the list of priority IDs for your account by calling the priorities endpoint.
     * @param annotate Add this text as a note on the resulting incident.
     * @param automationActions Create a Webhoook associated with the resulting incident.
     */
    @ApiStatus.Internal
    public OrchestrationGlobalAllOfOrchestrationPath1CatchAllActions(Boolean suppress, Integer suspend, Boolean dropEvent, String priority, String annotate, List<OrchestrationGlobalAllOfOrchestrationPath1CatchAllActionsAllOfAutomationActionsInner> automationActions) {
        this.suppress = suppress;
        this.suspend = suspend;
        this.dropEvent = dropEvent;
        this.priority = priority;
        this.annotate = annotate;
        this.automationActions = automationActions;
    }

}
