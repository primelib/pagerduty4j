package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ServiceOrchestrationAllOfOrchestrationPathAllOfCatchAllActionsAllOfPagerdutyAutomationActionsInner
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "action_id"
})
@JsonTypeName("ServiceOrchestration_allOf_orchestration_path_allOf_catch_all_actions_allOf_pagerduty_automation_actions_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceOrchestrationAllOfOrchestrationPathAllOfCatchAllActionsAllOfPagerdutyAutomationActionsInner {

    /**
     * Constructs a validated implementation of {@link ServiceOrchestrationAllOfOrchestrationPathAllOfCatchAllActionsAllOfPagerdutyAutomationActionsInner}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ServiceOrchestrationAllOfOrchestrationPathAllOfCatchAllActionsAllOfPagerdutyAutomationActionsInner(Consumer<ServiceOrchestrationAllOfOrchestrationPathAllOfCatchAllActionsAllOfPagerdutyAutomationActionsInner> spec) {
        spec.accept(this);
    }

    /**
     * Automation Action ID
     */
    @JsonProperty("action_id")
    protected String actionId;


}
