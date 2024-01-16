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
 * OrchestrationGlobalAllOfOrchestrationPath1CatchAllActionsAllOfAutomationActionsInnerHeadersInner
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
    "key",
    "value"
})
@JsonTypeName("OrchestrationGlobal_allOf_orchestration_path_1_catch_all_actions_allOf_automation_actions_inner_headers_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationGlobalAllOfOrchestrationPath1CatchAllActionsAllOfAutomationActionsInnerHeadersInner {

    @JsonProperty("key")
    protected String key;

    @JsonProperty("value")
    protected String value;

    /**
     * Constructs a validated instance of {@link OrchestrationGlobalAllOfOrchestrationPath1CatchAllActionsAllOfAutomationActionsInnerHeadersInner}.
     *
     * @param spec the specification to process
     */
    public OrchestrationGlobalAllOfOrchestrationPath1CatchAllActionsAllOfAutomationActionsInnerHeadersInner(Consumer<OrchestrationGlobalAllOfOrchestrationPath1CatchAllActionsAllOfAutomationActionsInnerHeadersInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OrchestrationGlobalAllOfOrchestrationPath1CatchAllActionsAllOfAutomationActionsInnerHeadersInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OrchestrationGlobalAllOfOrchestrationPath1CatchAllActionsAllOfAutomationActionsInnerHeadersInner(Consumer)} instead.
     * @param key key
     * @param value value
     */
    @ApiStatus.Internal
    public OrchestrationGlobalAllOfOrchestrationPath1CatchAllActionsAllOfAutomationActionsInnerHeadersInner(String key, String value) {
        this.key = key;
        this.value = value;
    }

}
