package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OrchestrationRouterAllOfOrchestrationPathSetsInner
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "rules"
})
@JsonTypeName("OrchestrationRouter_allOf_orchestration_path_sets_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationRouterAllOfOrchestrationPathSetsInner {

    /**
     * Constructs a validated implementation of {@link OrchestrationRouterAllOfOrchestrationPathSetsInner}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public OrchestrationRouterAllOfOrchestrationPathSetsInner(Consumer<OrchestrationRouterAllOfOrchestrationPathSetsInner> spec) {
        spec.accept(this);
    }

    @JsonProperty("rules")
    protected List<OrchestrationRouterAllOfOrchestrationPathSetsInnerRulesInner> rules;


}
