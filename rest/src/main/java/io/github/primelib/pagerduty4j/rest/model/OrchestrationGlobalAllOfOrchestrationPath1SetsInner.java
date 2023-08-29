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
 * OrchestrationGlobalAllOfOrchestrationPath1SetsInner
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
    "rules"
})
@JsonTypeName("OrchestrationGlobal_allOf_orchestration_path_1_sets_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationGlobalAllOfOrchestrationPath1SetsInner {

    @JsonProperty("rules")
    protected List<OrchestrationGlobalAllOfOrchestrationPath1SetsInnerRulesInner> rules;

    /**
     * Constructs a validated instance of {@link OrchestrationGlobalAllOfOrchestrationPath1SetsInner}.
     *
     * @param spec the specification to process
     */
    public OrchestrationGlobalAllOfOrchestrationPath1SetsInner(Consumer<OrchestrationGlobalAllOfOrchestrationPath1SetsInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OrchestrationGlobalAllOfOrchestrationPath1SetsInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OrchestrationGlobalAllOfOrchestrationPath1SetsInner(Consumer)} instead.
     * @param rules rules
     */
    @ApiStatus.Internal
    public OrchestrationGlobalAllOfOrchestrationPath1SetsInner(List<OrchestrationGlobalAllOfOrchestrationPath1SetsInnerRulesInner> rules) {
        this.rules = rules;
    }

}
