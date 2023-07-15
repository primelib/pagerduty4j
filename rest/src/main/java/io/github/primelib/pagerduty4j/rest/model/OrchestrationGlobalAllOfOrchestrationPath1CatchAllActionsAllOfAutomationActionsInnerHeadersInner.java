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
 * OrchestrationGlobalAllOfOrchestrationPath1CatchAllActionsAllOfAutomationActionsInnerHeadersInner
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "key",
    "value"
})
@JsonTypeName("OrchestrationGlobal_allOf_orchestration_path_1_catch_all_actions_allOf_automation_actions_inner_headers_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationGlobalAllOfOrchestrationPath1CatchAllActionsAllOfAutomationActionsInnerHeadersInner {

    /**
     * Constructs a validated implementation of {@link OrchestrationGlobalAllOfOrchestrationPath1CatchAllActionsAllOfAutomationActionsInnerHeadersInner}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public OrchestrationGlobalAllOfOrchestrationPath1CatchAllActionsAllOfAutomationActionsInnerHeadersInner(Consumer<OrchestrationGlobalAllOfOrchestrationPath1CatchAllActionsAllOfAutomationActionsInnerHeadersInner> spec) {
        spec.accept(this);
    }

    @JsonProperty("key")
    protected String key;

    @JsonProperty("value")
    protected String value;


}
