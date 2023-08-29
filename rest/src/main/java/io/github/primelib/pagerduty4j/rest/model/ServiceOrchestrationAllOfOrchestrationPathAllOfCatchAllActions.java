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
 * ServiceOrchestrationAllOfOrchestrationPathAllOfCatchAllActions
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
    "pagerduty_automation_actions"
})
@JsonTypeName("ServiceOrchestration_allOf_orchestration_path_allOf_catch_all_actions")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceOrchestrationAllOfOrchestrationPathAllOfCatchAllActions {

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
     * Configure an Automation Action associated with the resulting incident.
     */
    @JsonProperty("pagerduty_automation_actions")
    protected List<ServiceOrchestrationAllOfOrchestrationPathAllOfCatchAllActionsAllOfPagerdutyAutomationActionsInner> pagerdutyAutomationActions;

    /**
     * Constructs a validated instance of {@link ServiceOrchestrationAllOfOrchestrationPathAllOfCatchAllActions}.
     *
     * @param spec the specification to process
     */
    public ServiceOrchestrationAllOfOrchestrationPathAllOfCatchAllActions(Consumer<ServiceOrchestrationAllOfOrchestrationPathAllOfCatchAllActions> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ServiceOrchestrationAllOfOrchestrationPathAllOfCatchAllActions}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ServiceOrchestrationAllOfOrchestrationPathAllOfCatchAllActions(Consumer)} instead.
     * @param suppress If true, the resulting alert is suppressed. Suppressed alerts will not trigger an incident.
     * @param suspend The number of seconds to suspend the resulting alert before triggering. This effectively pauses incident notifications. If a resolve event arrives before the alert triggers then PagerDuty won't create an incident for this the resulting alert.
     * @param pagerdutyAutomationActions Configure an Automation Action associated with the resulting incident.
     */
    @ApiStatus.Internal
    public ServiceOrchestrationAllOfOrchestrationPathAllOfCatchAllActions(Boolean suppress, Integer suspend, List<ServiceOrchestrationAllOfOrchestrationPathAllOfCatchAllActionsAllOfPagerdutyAutomationActionsInner> pagerdutyAutomationActions) {
        this.suppress = suppress;
        this.suspend = suspend;
        this.pagerdutyAutomationActions = pagerdutyAutomationActions;
    }

}
