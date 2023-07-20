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
 * OrchestrationRouterAllOfOrchestrationPathCatchAll
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
@JsonTypeName("OrchestrationRouter_allOf_orchestration_path_catch_all")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationRouterAllOfOrchestrationPathCatchAll {

    @JsonProperty("actions")
    protected OrchestrationRouterAllOfOrchestrationPathCatchAllActions actions;

    /**
     * Constructs a validated instance of {@link OrchestrationRouterAllOfOrchestrationPathCatchAll}.
     *
     * @param spec the specification to process
     */
    public OrchestrationRouterAllOfOrchestrationPathCatchAll(Consumer<OrchestrationRouterAllOfOrchestrationPathCatchAll> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OrchestrationRouterAllOfOrchestrationPathCatchAll}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OrchestrationRouterAllOfOrchestrationPathCatchAll(Consumer)} instead.
     * @param actions var.name
     */
    @ApiStatus.Internal
    public OrchestrationRouterAllOfOrchestrationPathCatchAll(OrchestrationRouterAllOfOrchestrationPathCatchAllActions actions) {
        this.actions = actions;
    }

}
