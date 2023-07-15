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
 * OrchestrationGlobalAllOfOrchestrationPath1
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
@JsonTypeName("OrchestrationGlobal_allOf_orchestration_path_1")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationGlobalAllOfOrchestrationPath1 {

    /**
     * Constructs a validated implementation of {@link OrchestrationGlobalAllOfOrchestrationPath1}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public OrchestrationGlobalAllOfOrchestrationPath1(Consumer<OrchestrationGlobalAllOfOrchestrationPath1> spec) {
        spec.accept(this);
    }

    /**
     * Indicates that these are a set of "global" rules.
     */
    @JsonProperty("type")
    protected String type = "global";

    @JsonProperty("parent")
    protected OrchestrationGlobalAllOfOrchestrationPath1Parent parent;

    /**
     * You must define at least a "start" set, but you can also define any number of additional sets that are routed to by other rules to form a directional graph.
     */
    @JsonProperty("sets")
    protected List<OrchestrationGlobalAllOfOrchestrationPath1SetsInner> sets;

    @JsonProperty("catch_all")
    protected OrchestrationGlobalAllOfOrchestrationPath1CatchAll catchAll;


}
