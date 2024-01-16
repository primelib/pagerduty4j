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
 * OrchestrationGlobalAllOfOrchestrationPath1CatchAll
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
    "actions"
})
@JsonTypeName("OrchestrationGlobal_allOf_orchestration_path_1_catch_all")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationGlobalAllOfOrchestrationPath1CatchAll {

    @JsonProperty("actions")
    protected OrchestrationGlobalAllOfOrchestrationPath1CatchAllActions actions;

    /**
     * Constructs a validated instance of {@link OrchestrationGlobalAllOfOrchestrationPath1CatchAll}.
     *
     * @param spec the specification to process
     */
    public OrchestrationGlobalAllOfOrchestrationPath1CatchAll(Consumer<OrchestrationGlobalAllOfOrchestrationPath1CatchAll> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OrchestrationGlobalAllOfOrchestrationPath1CatchAll}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OrchestrationGlobalAllOfOrchestrationPath1CatchAll(Consumer)} instead.
     * @param actions actions
     */
    @ApiStatus.Internal
    public OrchestrationGlobalAllOfOrchestrationPath1CatchAll(OrchestrationGlobalAllOfOrchestrationPath1CatchAllActions actions) {
        this.actions = actions;
    }

}
