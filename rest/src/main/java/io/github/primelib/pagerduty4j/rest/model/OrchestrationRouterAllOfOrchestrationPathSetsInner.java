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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OrchestrationRouterAllOfOrchestrationPathSetsInner
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
    "rules"
})
@JsonTypeName("OrchestrationRouter_allOf_orchestration_path_sets_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationRouterAllOfOrchestrationPathSetsInner {

    @JsonProperty("rules")
    protected List<OrchestrationRouterAllOfOrchestrationPathSetsInnerRulesInner> rules;

    /**
     * Constructs a validated instance of {@link OrchestrationRouterAllOfOrchestrationPathSetsInner}.
     *
     * @param spec the specification to process
     */
    public OrchestrationRouterAllOfOrchestrationPathSetsInner(Consumer<OrchestrationRouterAllOfOrchestrationPathSetsInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OrchestrationRouterAllOfOrchestrationPathSetsInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OrchestrationRouterAllOfOrchestrationPathSetsInner(Consumer)} instead.
     * @param rules rules
     */
    @ApiStatus.Internal
    public OrchestrationRouterAllOfOrchestrationPathSetsInner(List<OrchestrationRouterAllOfOrchestrationPathSetsInnerRulesInner> rules) {
        this.rules = rules;
    }

}
