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
 * ServiceOrchestrationAllOfOrchestrationPathAllOfSetsInnerRulesInner
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "actions"
})
@JsonTypeName("ServiceOrchestration_allOf_orchestration_path_allOf_sets_inner_rules_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceOrchestrationAllOfOrchestrationPathAllOfSetsInnerRulesInner {

    /**
     * Constructs a validated implementation of {@link ServiceOrchestrationAllOfOrchestrationPathAllOfSetsInnerRulesInner}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ServiceOrchestrationAllOfOrchestrationPathAllOfSetsInnerRulesInner(Consumer<ServiceOrchestrationAllOfOrchestrationPathAllOfSetsInnerRulesInner> spec) {
        spec.accept(this);
    }

    @JsonProperty("actions")
    protected ServiceOrchestrationAllOfOrchestrationPathAllOfSetsInnerRulesInnerActions actions;


}
