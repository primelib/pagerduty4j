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
 * OrchestrationRouterAllOfOrchestrationPathCatchAllActions
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
    "route_to"
})
@JsonTypeName("OrchestrationRouter_allOf_orchestration_path_catch_all_actions")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationRouterAllOfOrchestrationPathCatchAllActions {

    /**
     * With a value of 'unrouted', all events are sent to the Unrouted Orchestration.
     */
    @JsonProperty("route_to")
    protected String routeTo;

    /**
     * Constructs a validated instance of {@link OrchestrationRouterAllOfOrchestrationPathCatchAllActions}.
     *
     * @param spec the specification to process
     */
    public OrchestrationRouterAllOfOrchestrationPathCatchAllActions(Consumer<OrchestrationRouterAllOfOrchestrationPathCatchAllActions> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OrchestrationRouterAllOfOrchestrationPathCatchAllActions}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OrchestrationRouterAllOfOrchestrationPathCatchAllActions(Consumer)} instead.
     * @param routeTo With a value of 'unrouted', all events are sent to the Unrouted Orchestration.
     */
    @ApiStatus.Internal
    public OrchestrationRouterAllOfOrchestrationPathCatchAllActions(String routeTo) {
        this.routeTo = routeTo;
    }

}
