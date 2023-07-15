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
 * OrchestrationRouterAllOfOrchestrationPathCatchAllActions
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "route_to"
})
@JsonTypeName("OrchestrationRouter_allOf_orchestration_path_catch_all_actions")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationRouterAllOfOrchestrationPathCatchAllActions {

    /**
     * Constructs a validated implementation of {@link OrchestrationRouterAllOfOrchestrationPathCatchAllActions}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public OrchestrationRouterAllOfOrchestrationPathCatchAllActions(Consumer<OrchestrationRouterAllOfOrchestrationPathCatchAllActions> spec) {
        spec.accept(this);
    }

    /**
     * With a value of 'unrouted', all events are sent to the Unrouted Orchestration.
     */
    @JsonProperty("route_to")
    protected String routeTo = "unrouted";


}
