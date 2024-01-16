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
 * IncidentWorkflowActionConfigurationInlineStepsInputsInnerValue
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
@JsonTypeName("IncidentWorkflowActionConfiguration_inline_steps_inputs_inner_value")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncidentWorkflowActionConfigurationInlineStepsInputsInnerValue {

    @JsonProperty("steps")
    protected List<IncidentWorkflowActionConfigurationInlineStepsInputsInnerValueStepsInner> steps;

    /**
     * Constructs a validated instance of {@link IncidentWorkflowActionConfigurationInlineStepsInputsInnerValue}.
     *
     * @param spec the specification to process
     */
    public IncidentWorkflowActionConfigurationInlineStepsInputsInnerValue(Consumer<IncidentWorkflowActionConfigurationInlineStepsInputsInnerValue> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IncidentWorkflowActionConfigurationInlineStepsInputsInnerValue}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IncidentWorkflowActionConfigurationInlineStepsInputsInnerValue(Consumer)} instead.
     * @param steps steps
     */
    @ApiStatus.Internal
    public IncidentWorkflowActionConfigurationInlineStepsInputsInnerValue(List<IncidentWorkflowActionConfigurationInlineStepsInputsInnerValueStepsInner> steps) {
        this.steps = steps;
    }

}
