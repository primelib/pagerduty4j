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
 * OrchestrationRouterAllOfOrchestrationPathSetsInnerRulesInnerActions
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
@JsonTypeName("OrchestrationRouter_allOf_orchestration_path_sets_inner_rules_inner_actions")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationRouterAllOfOrchestrationPathSetsInnerRulesInnerActions {

    /**
     * The ID of the target Service for the resulting alert. You can find the service you want to route to by calling the services endpoint.
     */
    @JsonProperty("route_to")
    protected String routeTo;

    /**
     * Constructs a validated instance of {@link OrchestrationRouterAllOfOrchestrationPathSetsInnerRulesInnerActions}.
     *
     * @param spec the specification to process
     */
    public OrchestrationRouterAllOfOrchestrationPathSetsInnerRulesInnerActions(Consumer<OrchestrationRouterAllOfOrchestrationPathSetsInnerRulesInnerActions> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OrchestrationRouterAllOfOrchestrationPathSetsInnerRulesInnerActions}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OrchestrationRouterAllOfOrchestrationPathSetsInnerRulesInnerActions(Consumer)} instead.
     * @param routeTo The ID of the target Service for the resulting alert. You can find the service you want to route to by calling the services endpoint.
     */
    @ApiStatus.Internal
    public OrchestrationRouterAllOfOrchestrationPathSetsInnerRulesInnerActions(String routeTo) {
        this.routeTo = routeTo;
    }

}
