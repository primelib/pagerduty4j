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
 * IncidentWorkflowActionConfigurationInlineStepsInputsInnerValueStepsInnerAllOfActionConfigurationOutputsInner
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
    "name",
    "reference_name",
    "parameter_type"
})
@JsonTypeName("IncidentWorkflowActionConfiguration_inline_steps_inputs_inner_value_steps_inner_allOf_action_configuration_outputs_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncidentWorkflowActionConfigurationInlineStepsInputsInnerValueStepsInnerAllOfActionConfigurationOutputsInner {

    /**
     * The name of the Output
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The reference name of the Output
     */
    @JsonProperty("reference_name")
    protected String referenceName;

    /**
     * The data type produced by this Output
     */
    @JsonProperty("parameter_type")
    protected String parameterType;

    /**
     * Constructs a validated instance of {@link IncidentWorkflowActionConfigurationInlineStepsInputsInnerValueStepsInnerAllOfActionConfigurationOutputsInner}.
     *
     * @param spec the specification to process
     */
    public IncidentWorkflowActionConfigurationInlineStepsInputsInnerValueStepsInnerAllOfActionConfigurationOutputsInner(Consumer<IncidentWorkflowActionConfigurationInlineStepsInputsInnerValueStepsInnerAllOfActionConfigurationOutputsInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IncidentWorkflowActionConfigurationInlineStepsInputsInnerValueStepsInnerAllOfActionConfigurationOutputsInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IncidentWorkflowActionConfigurationInlineStepsInputsInnerValueStepsInnerAllOfActionConfigurationOutputsInner(Consumer)} instead.
     * @param name The name of the Output
     * @param referenceName The reference name of the Output
     * @param parameterType The data type produced by this Output
     */
    @ApiStatus.Internal
    public IncidentWorkflowActionConfigurationInlineStepsInputsInnerValueStepsInnerAllOfActionConfigurationOutputsInner(String name, String referenceName, String parameterType) {
        this.name = name;
        this.referenceName = referenceName;
        this.parameterType = parameterType;
    }

}
