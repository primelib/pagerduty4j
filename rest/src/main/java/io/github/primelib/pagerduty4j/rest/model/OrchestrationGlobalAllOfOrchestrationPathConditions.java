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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OrchestrationGlobalAllOfOrchestrationPathConditions
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
    "expression"
})
@JsonTypeName("OrchestrationGlobal_allOf_orchestration_path_conditions")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationGlobalAllOfOrchestrationPathConditions {

    /**
     * A PCL condition string
     */
    @JsonProperty("expression")
    protected String expression;

    /**
     * Constructs a validated instance of {@link OrchestrationGlobalAllOfOrchestrationPathConditions}.
     *
     * @param spec the specification to process
     */
    public OrchestrationGlobalAllOfOrchestrationPathConditions(Consumer<OrchestrationGlobalAllOfOrchestrationPathConditions> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OrchestrationGlobalAllOfOrchestrationPathConditions}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OrchestrationGlobalAllOfOrchestrationPathConditions(Consumer)} instead.
     * @param expression A PCL condition string
     */
    @ApiStatus.Internal
    public OrchestrationGlobalAllOfOrchestrationPathConditions(String expression) {
        this.expression = expression;
    }

}
