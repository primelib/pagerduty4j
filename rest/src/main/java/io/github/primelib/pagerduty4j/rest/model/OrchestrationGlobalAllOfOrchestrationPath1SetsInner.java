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
 * OrchestrationGlobalAllOfOrchestrationPath1SetsInner
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "rules"
})
@JsonTypeName("OrchestrationGlobal_allOf_orchestration_path_1_sets_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationGlobalAllOfOrchestrationPath1SetsInner {

    /**
     * Constructs a validated implementation of {@link OrchestrationGlobalAllOfOrchestrationPath1SetsInner}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public OrchestrationGlobalAllOfOrchestrationPath1SetsInner(Consumer<OrchestrationGlobalAllOfOrchestrationPath1SetsInner> spec) {
        spec.accept(this);
    }

    @JsonProperty("rules")
    protected List<OrchestrationGlobalAllOfOrchestrationPath1SetsInnerRulesInner> rules;


}
