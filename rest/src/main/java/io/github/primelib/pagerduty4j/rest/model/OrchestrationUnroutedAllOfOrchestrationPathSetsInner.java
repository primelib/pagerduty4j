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
 * OrchestrationUnroutedAllOfOrchestrationPathSetsInner
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
@JsonTypeName("OrchestrationUnrouted_allOf_orchestration_path_sets_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationUnroutedAllOfOrchestrationPathSetsInner {

    @JsonProperty("rules")
    protected List<OrchestrationUnroutedAllOfOrchestrationPathSetsInnerRulesInner> rules;

    /**
     * Constructs a validated instance of {@link OrchestrationUnroutedAllOfOrchestrationPathSetsInner}.
     *
     * @param spec the specification to process
     */
    public OrchestrationUnroutedAllOfOrchestrationPathSetsInner(Consumer<OrchestrationUnroutedAllOfOrchestrationPathSetsInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OrchestrationUnroutedAllOfOrchestrationPathSetsInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OrchestrationUnroutedAllOfOrchestrationPathSetsInner(Consumer)} instead.
     * @param rules var.name
     */
    @ApiStatus.Internal
    public OrchestrationUnroutedAllOfOrchestrationPathSetsInner(List<OrchestrationUnroutedAllOfOrchestrationPathSetsInnerRulesInner> rules) {
        this.rules = rules;
    }

}
