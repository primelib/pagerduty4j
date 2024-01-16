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
 * OrchestrationUnroutedAllOfOrchestrationPathSetsInnerRulesInnerActions
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
@JsonTypeName("OrchestrationUnrouted_allOf_orchestration_path_sets_inner_rules_inner_actions")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationUnroutedAllOfOrchestrationPathSetsInnerRulesInnerActions {

    /**
     * The ID of a Set from this Unrouted Orchestration whose rules you also want to use with event that match this rule.
     */
    @JsonProperty("route_to")
    protected String routeTo;

    /**
     * Constructs a validated instance of {@link OrchestrationUnroutedAllOfOrchestrationPathSetsInnerRulesInnerActions}.
     *
     * @param spec the specification to process
     */
    public OrchestrationUnroutedAllOfOrchestrationPathSetsInnerRulesInnerActions(Consumer<OrchestrationUnroutedAllOfOrchestrationPathSetsInnerRulesInnerActions> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OrchestrationUnroutedAllOfOrchestrationPathSetsInnerRulesInnerActions}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OrchestrationUnroutedAllOfOrchestrationPathSetsInnerRulesInnerActions(Consumer)} instead.
     * @param routeTo The ID of a Set from this Unrouted Orchestration whose rules you also want to use with event that match this rule.
     */
    @ApiStatus.Internal
    public OrchestrationUnroutedAllOfOrchestrationPathSetsInnerRulesInnerActions(String routeTo) {
        this.routeTo = routeTo;
    }

}
