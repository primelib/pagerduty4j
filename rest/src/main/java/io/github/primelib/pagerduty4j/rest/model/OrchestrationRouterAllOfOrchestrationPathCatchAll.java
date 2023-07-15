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
 * OrchestrationRouterAllOfOrchestrationPathCatchAll
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "actions"
})
@JsonTypeName("OrchestrationRouter_allOf_orchestration_path_catch_all")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationRouterAllOfOrchestrationPathCatchAll {

    /**
     * Constructs a validated implementation of {@link OrchestrationRouterAllOfOrchestrationPathCatchAll}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public OrchestrationRouterAllOfOrchestrationPathCatchAll(Consumer<OrchestrationRouterAllOfOrchestrationPathCatchAll> spec) {
        spec.accept(this);
    }

    @JsonProperty("actions")
    protected OrchestrationRouterAllOfOrchestrationPathCatchAllActions actions;


}
