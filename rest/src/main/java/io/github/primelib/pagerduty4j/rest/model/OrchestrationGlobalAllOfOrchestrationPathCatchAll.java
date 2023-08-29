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
 * OrchestrationGlobalAllOfOrchestrationPathCatchAll
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
@JsonTypeName("OrchestrationGlobal_allOf_orchestration_path_catch_all")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationGlobalAllOfOrchestrationPathCatchAll {

    /**
     * These are the actions that will be taken to change the resulting alert and incident.
     */
    @JsonProperty("actions")
    protected Object actions;

    /**
     * Constructs a validated instance of {@link OrchestrationGlobalAllOfOrchestrationPathCatchAll}.
     *
     * @param spec the specification to process
     */
    public OrchestrationGlobalAllOfOrchestrationPathCatchAll(Consumer<OrchestrationGlobalAllOfOrchestrationPathCatchAll> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OrchestrationGlobalAllOfOrchestrationPathCatchAll}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OrchestrationGlobalAllOfOrchestrationPathCatchAll(Consumer)} instead.
     * @param actions These are the actions that will be taken to change the resulting alert and incident.
     */
    @ApiStatus.Internal
    public OrchestrationGlobalAllOfOrchestrationPathCatchAll(Object actions) {
        this.actions = actions;
    }

}
