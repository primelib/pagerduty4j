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
 * OrchestrationUnroutedAllOfOrchestrationPath
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
    "type",
    "parent",
    "sets",
    "catch_all"
})
@JsonTypeName("OrchestrationUnrouted_allOf_orchestration_path")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationUnroutedAllOfOrchestrationPath {

    /**
     * Indicates that these are a "unrouted" type set of rules.
     */
    @JsonProperty("type")
    protected String type;

    @JsonProperty("parent")
    protected OrchestrationUnroutedAllOfOrchestrationPathParent parent;

    /**
     * An Unrouted Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
     */
    @JsonProperty("sets")
    protected List<OrchestrationUnroutedAllOfOrchestrationPathSetsInner> sets;

    @JsonProperty("catch_all")
    protected OrchestrationUnroutedAllOfOrchestrationPathCatchAll catchAll;

    /**
     * Constructs a validated instance of {@link OrchestrationUnroutedAllOfOrchestrationPath}.
     *
     * @param spec the specification to process
     */
    public OrchestrationUnroutedAllOfOrchestrationPath(Consumer<OrchestrationUnroutedAllOfOrchestrationPath> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OrchestrationUnroutedAllOfOrchestrationPath}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OrchestrationUnroutedAllOfOrchestrationPath(Consumer)} instead.
     * @param type Indicates that these are a "unrouted" type set of rules.
     * @param parent var.name
     * @param sets An Unrouted Orchestration must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph.
     * @param catchAll var.name
     */
    @ApiStatus.Internal
    public OrchestrationUnroutedAllOfOrchestrationPath(String type, OrchestrationUnroutedAllOfOrchestrationPathParent parent, List<OrchestrationUnroutedAllOfOrchestrationPathSetsInner> sets, OrchestrationUnroutedAllOfOrchestrationPathCatchAll catchAll) {
        this.type = type;
        this.parent = parent;
        this.sets = sets;
        this.catchAll = catchAll;
    }

}
