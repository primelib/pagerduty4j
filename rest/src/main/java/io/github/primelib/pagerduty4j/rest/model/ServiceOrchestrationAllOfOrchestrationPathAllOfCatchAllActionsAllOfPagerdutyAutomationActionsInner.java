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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ServiceOrchestrationAllOfOrchestrationPathAllOfCatchAllActionsAllOfPagerdutyAutomationActionsInner
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
    "action_id"
})
@JsonTypeName("ServiceOrchestration_allOf_orchestration_path_allOf_catch_all_actions_allOf_pagerduty_automation_actions_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceOrchestrationAllOfOrchestrationPathAllOfCatchAllActionsAllOfPagerdutyAutomationActionsInner {

    /**
     * Automation Action ID
     */
    @JsonProperty("action_id")
    protected String actionId;

    /**
     * Constructs a validated instance of {@link ServiceOrchestrationAllOfOrchestrationPathAllOfCatchAllActionsAllOfPagerdutyAutomationActionsInner}.
     *
     * @param spec the specification to process
     */
    public ServiceOrchestrationAllOfOrchestrationPathAllOfCatchAllActionsAllOfPagerdutyAutomationActionsInner(Consumer<ServiceOrchestrationAllOfOrchestrationPathAllOfCatchAllActionsAllOfPagerdutyAutomationActionsInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ServiceOrchestrationAllOfOrchestrationPathAllOfCatchAllActionsAllOfPagerdutyAutomationActionsInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ServiceOrchestrationAllOfOrchestrationPathAllOfCatchAllActionsAllOfPagerdutyAutomationActionsInner(Consumer)} instead.
     * @param actionId Automation Action ID
     */
    @ApiStatus.Internal
    public ServiceOrchestrationAllOfOrchestrationPathAllOfCatchAllActionsAllOfPagerdutyAutomationActionsInner(String actionId) {
        this.actionId = actionId;
    }

}
