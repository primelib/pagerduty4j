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
 * ServiceOrchestrationAllOfOrchestrationPathAllOfCatchAllActions
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "suppress",
    "suspend",
    "pagerduty_automation_actions"
})
@JsonTypeName("ServiceOrchestration_allOf_orchestration_path_allOf_catch_all_actions")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceOrchestrationAllOfOrchestrationPathAllOfCatchAllActions {

    /**
     * Constructs a validated implementation of {@link ServiceOrchestrationAllOfOrchestrationPathAllOfCatchAllActions}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ServiceOrchestrationAllOfOrchestrationPathAllOfCatchAllActions(Consumer<ServiceOrchestrationAllOfOrchestrationPathAllOfCatchAllActions> spec) {
        spec.accept(this);
    }

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


}
