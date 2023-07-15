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
 * OrchestrationGlobalAllOfOrchestrationPathSets
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "rules"
})
@JsonTypeName("OrchestrationGlobal_allOf_orchestration_path_sets")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationGlobalAllOfOrchestrationPathSets {

    /**
     * Constructs a validated implementation of {@link OrchestrationGlobalAllOfOrchestrationPathSets}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public OrchestrationGlobalAllOfOrchestrationPathSets(Consumer<OrchestrationGlobalAllOfOrchestrationPathSets> spec) {
        spec.accept(this);
    }

    /**
     * The ID of this set of rules. Rules in other sets can route events into this set using the "route_to" properties.
     */
    @JsonProperty("id")
    protected String id = "start";

    @JsonProperty("rules")
    protected List<OrchestrationGlobalAllOfOrchestrationPathRules> rules;


}
