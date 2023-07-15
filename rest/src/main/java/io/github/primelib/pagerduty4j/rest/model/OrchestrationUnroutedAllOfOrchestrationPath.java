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
 * OrchestrationUnroutedAllOfOrchestrationPath
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
@JsonTypeName("OrchestrationUnrouted_allOf_orchestration_path")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationUnroutedAllOfOrchestrationPath {

    /**
     * Constructs a validated implementation of {@link OrchestrationUnroutedAllOfOrchestrationPath}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public OrchestrationUnroutedAllOfOrchestrationPath(Consumer<OrchestrationUnroutedAllOfOrchestrationPath> spec) {
        spec.accept(this);
    }

    /**
     * Indicates that these are a "unrouted" type set of rules.
     */
    @JsonProperty("type")
    protected String type = "unrouted";

    @JsonProperty("parent")
    protected OrchestrationUnroutedAllOfOrchestrationPathParent parent;

    /**
     * An Unrouted Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
     */
    @JsonProperty("sets")
    protected List<OrchestrationUnroutedAllOfOrchestrationPathSetsInner> sets;

    @JsonProperty("catch_all")
    protected OrchestrationUnroutedAllOfOrchestrationPathCatchAll catchAll;


}
