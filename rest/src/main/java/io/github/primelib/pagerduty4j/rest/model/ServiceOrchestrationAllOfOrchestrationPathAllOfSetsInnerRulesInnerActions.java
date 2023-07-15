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
 * ServiceOrchestrationAllOfOrchestrationPathAllOfSetsInnerRulesInnerActions
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "route_to"
})
@JsonTypeName("ServiceOrchestration_allOf_orchestration_path_allOf_sets_inner_rules_inner_actions")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceOrchestrationAllOfOrchestrationPathAllOfSetsInnerRulesInnerActions {

    /**
     * Constructs a validated implementation of {@link ServiceOrchestrationAllOfOrchestrationPathAllOfSetsInnerRulesInnerActions}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ServiceOrchestrationAllOfOrchestrationPathAllOfSetsInnerRulesInnerActions(Consumer<ServiceOrchestrationAllOfOrchestrationPathAllOfSetsInnerRulesInnerActions> spec) {
        spec.accept(this);
    }

    /**
     * The ID of a Set from this Service Orchestration whose rules you also want to use with event that match this rule.
     */
    @JsonProperty("route_to")
    protected String routeTo;


}
