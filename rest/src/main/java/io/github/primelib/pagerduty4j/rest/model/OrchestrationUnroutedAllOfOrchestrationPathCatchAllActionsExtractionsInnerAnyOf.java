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
 * OrchestrationUnroutedAllOfOrchestrationPathCatchAllActionsExtractionsInnerAnyOf
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "target",
    "template"
})
@JsonTypeName("OrchestrationUnrouted_allOf_orchestration_path_catch_all_actions_extractions_inner_anyOf")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationUnroutedAllOfOrchestrationPathCatchAllActionsExtractionsInnerAnyOf {

    /**
     * Constructs a validated implementation of {@link OrchestrationUnroutedAllOfOrchestrationPathCatchAllActionsExtractionsInnerAnyOf}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public OrchestrationUnroutedAllOfOrchestrationPathCatchAllActionsExtractionsInnerAnyOf(Consumer<OrchestrationUnroutedAllOfOrchestrationPathCatchAllActionsExtractionsInnerAnyOf> spec) {
        spec.accept(this);
    }

    /**
     * The PD-CEF field that will be set with the value from the template.
     */
    @JsonProperty("target")
    protected String target;

    /**
     * A value that will be used to populate the target PD-CEF field. You can include variables extracted from the payload by using string interpolation.
     */
    @JsonProperty("template")
    protected String template;


}
