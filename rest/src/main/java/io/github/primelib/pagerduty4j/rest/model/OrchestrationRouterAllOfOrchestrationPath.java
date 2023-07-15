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
 * OrchestrationRouterAllOfOrchestrationPath
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "type",
    "parent",
    "sets",
    "catch_all"
})
@JsonTypeName("OrchestrationRouter_allOf_orchestration_path")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationRouterAllOfOrchestrationPath {

    /**
     * Constructs a validated implementation of {@link OrchestrationRouterAllOfOrchestrationPath}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public OrchestrationRouterAllOfOrchestrationPath(Consumer<OrchestrationRouterAllOfOrchestrationPath> spec) {
        spec.accept(this);
    }

    /**
     * Indicates that these are a "router" type set of rules.
     */
    @JsonProperty("type")
    protected String type = "router";

    @JsonProperty("parent")
    protected OrchestrationRouterAllOfOrchestrationPathParent parent;

    /**
     * The Router contains a single set of rules (the "start" set). The Router evaluates Events against these Rules, one at a time, and routes each Event to a specific Service based on the first rule that matches.
     */
    @JsonProperty("sets")
    protected List<OrchestrationRouterAllOfOrchestrationPathSetsInner> sets;

    @JsonProperty("catch_all")
    protected OrchestrationRouterAllOfOrchestrationPathCatchAll catchAll;


}
