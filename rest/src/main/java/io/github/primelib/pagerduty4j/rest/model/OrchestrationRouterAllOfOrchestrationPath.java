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
 * OrchestrationRouterAllOfOrchestrationPath
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
@JsonTypeName("OrchestrationRouter_allOf_orchestration_path")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationRouterAllOfOrchestrationPath {

    /**
     * Indicates that these are a "router" type set of rules.
     */
    @JsonProperty("type")
    protected String type;

    @JsonProperty("parent")
    protected OrchestrationRouterAllOfOrchestrationPathParent parent;

    /**
     * The Router contains a single set of rules (the "start" set). The Router evaluates Events against these Rules, one at a time, and routes each Event to a specific Service based on the first rule that matches.
     */
    @JsonProperty("sets")
    protected List<OrchestrationRouterAllOfOrchestrationPathSetsInner> sets;

    @JsonProperty("catch_all")
    protected OrchestrationRouterAllOfOrchestrationPathCatchAll catchAll;

    /**
     * Constructs a validated instance of {@link OrchestrationRouterAllOfOrchestrationPath}.
     *
     * @param spec the specification to process
     */
    public OrchestrationRouterAllOfOrchestrationPath(Consumer<OrchestrationRouterAllOfOrchestrationPath> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OrchestrationRouterAllOfOrchestrationPath}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OrchestrationRouterAllOfOrchestrationPath(Consumer)} instead.
     * @param type Indicates that these are a "router" type set of rules.
     * @param parent var.name
     * @param sets The Router contains a single set of rules (the "start" set). The Router evaluates Events against these Rules, one at a time, and routes each Event to a specific Service based on the first rule that matches.
     * @param catchAll var.name
     */
    @ApiStatus.Internal
    public OrchestrationRouterAllOfOrchestrationPath(String type, OrchestrationRouterAllOfOrchestrationPathParent parent, List<OrchestrationRouterAllOfOrchestrationPathSetsInner> sets, OrchestrationRouterAllOfOrchestrationPathCatchAll catchAll) {
        this.type = type;
        this.parent = parent;
        this.sets = sets;
        this.catchAll = catchAll;
    }

}
