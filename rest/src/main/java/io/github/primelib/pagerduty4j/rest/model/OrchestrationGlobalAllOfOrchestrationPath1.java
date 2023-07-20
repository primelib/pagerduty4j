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
 * OrchestrationGlobalAllOfOrchestrationPath1
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
@JsonTypeName("OrchestrationGlobal_allOf_orchestration_path_1")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationGlobalAllOfOrchestrationPath1 {

    /**
     * Indicates that these are a set of "global" rules.
     */
    @JsonProperty("type")
    protected String type;

    @JsonProperty("parent")
    protected OrchestrationGlobalAllOfOrchestrationPath1Parent parent;

    /**
     * You must define at least a "start" set, but you can also define any number of additional sets that are routed to by other rules to form a directional graph.
     */
    @JsonProperty("sets")
    protected List<OrchestrationGlobalAllOfOrchestrationPath1SetsInner> sets;

    @JsonProperty("catch_all")
    protected OrchestrationGlobalAllOfOrchestrationPath1CatchAll catchAll;

    /**
     * Constructs a validated instance of {@link OrchestrationGlobalAllOfOrchestrationPath1}.
     *
     * @param spec the specification to process
     */
    public OrchestrationGlobalAllOfOrchestrationPath1(Consumer<OrchestrationGlobalAllOfOrchestrationPath1> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OrchestrationGlobalAllOfOrchestrationPath1}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OrchestrationGlobalAllOfOrchestrationPath1(Consumer)} instead.
     * @param type Indicates that these are a set of "global" rules.
     * @param parent var.name
     * @param sets You must define at least a "start" set, but you can also define any number of additional sets that are routed to by other rules to form a directional graph.
     * @param catchAll var.name
     */
    @ApiStatus.Internal
    public OrchestrationGlobalAllOfOrchestrationPath1(String type, OrchestrationGlobalAllOfOrchestrationPath1Parent parent, List<OrchestrationGlobalAllOfOrchestrationPath1SetsInner> sets, OrchestrationGlobalAllOfOrchestrationPath1CatchAll catchAll) {
        this.type = type;
        this.parent = parent;
        this.sets = sets;
        this.catchAll = catchAll;
    }

}
