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
 * IncidentWorkflowAllOfStepsAllOfActionConfigurationInlineStepsInputsInnerValue
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
    "steps"
})
@JsonTypeName("IncidentWorkflow_allOf_steps_allOf_action_configuration_inline_steps_inputs_inner_value")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncidentWorkflowAllOfStepsAllOfActionConfigurationInlineStepsInputsInnerValue {

    @JsonProperty("steps")
    protected List<IncidentWorkflowAllOfStepsAllOfActionConfigurationInlineStepsInputsInnerValueStepsInner> steps;

    /**
     * Constructs a validated instance of {@link IncidentWorkflowAllOfStepsAllOfActionConfigurationInlineStepsInputsInnerValue}.
     *
     * @param spec the specification to process
     */
    public IncidentWorkflowAllOfStepsAllOfActionConfigurationInlineStepsInputsInnerValue(Consumer<IncidentWorkflowAllOfStepsAllOfActionConfigurationInlineStepsInputsInnerValue> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IncidentWorkflowAllOfStepsAllOfActionConfigurationInlineStepsInputsInnerValue}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IncidentWorkflowAllOfStepsAllOfActionConfigurationInlineStepsInputsInnerValue(Consumer)} instead.
     * @param steps steps
     */
    @ApiStatus.Internal
    public IncidentWorkflowAllOfStepsAllOfActionConfigurationInlineStepsInputsInnerValue(List<IncidentWorkflowAllOfStepsAllOfActionConfigurationInlineStepsInputsInnerValueStepsInner> steps) {
        this.steps = steps;
    }

}
