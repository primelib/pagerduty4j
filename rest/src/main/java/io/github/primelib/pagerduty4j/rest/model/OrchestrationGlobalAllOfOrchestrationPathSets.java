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
 * OrchestrationGlobalAllOfOrchestrationPathSets
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
    "id",
    "rules"
})
@JsonTypeName("OrchestrationGlobal_allOf_orchestration_path_sets")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationGlobalAllOfOrchestrationPathSets {

    /**
     * The ID of this set of rules. Rules in other sets can route events into this set using the "route_to" properties.
     */
    @JsonProperty("id")
    protected String id;

    @JsonProperty("rules")
    protected List<OrchestrationGlobalAllOfOrchestrationPathRules> rules;

    /**
     * Constructs a validated instance of {@link OrchestrationGlobalAllOfOrchestrationPathSets}.
     *
     * @param spec the specification to process
     */
    public OrchestrationGlobalAllOfOrchestrationPathSets(Consumer<OrchestrationGlobalAllOfOrchestrationPathSets> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OrchestrationGlobalAllOfOrchestrationPathSets}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OrchestrationGlobalAllOfOrchestrationPathSets(Consumer)} instead.
     * @param id The ID of this set of rules. Rules in other sets can route events into this set using the "route_to" properties.
     * @param rules rules
     */
    @ApiStatus.Internal
    public OrchestrationGlobalAllOfOrchestrationPathSets(String id, List<OrchestrationGlobalAllOfOrchestrationPathRules> rules) {
        this.id = id;
        this.rules = rules;
    }

}
