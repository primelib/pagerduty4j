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
 * OrchestrationUnroutedAllOfOrchestrationPathSetsInnerRulesInner
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
@JsonTypeName("OrchestrationUnrouted_allOf_orchestration_path_sets_inner_rules_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationUnroutedAllOfOrchestrationPathSetsInnerRulesInner {

    @JsonProperty("actions")
    protected OrchestrationUnroutedAllOfOrchestrationPathSetsInnerRulesInnerActions actions;

    /**
     * Constructs a validated instance of {@link OrchestrationUnroutedAllOfOrchestrationPathSetsInnerRulesInner}.
     *
     * @param spec the specification to process
     */
    public OrchestrationUnroutedAllOfOrchestrationPathSetsInnerRulesInner(Consumer<OrchestrationUnroutedAllOfOrchestrationPathSetsInnerRulesInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OrchestrationUnroutedAllOfOrchestrationPathSetsInnerRulesInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OrchestrationUnroutedAllOfOrchestrationPathSetsInnerRulesInner(Consumer)} instead.
     * @param actions actions
     */
    @ApiStatus.Internal
    public OrchestrationUnroutedAllOfOrchestrationPathSetsInnerRulesInner(OrchestrationUnroutedAllOfOrchestrationPathSetsInnerRulesInnerActions actions) {
        this.actions = actions;
    }

}
