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
 * IncidentWorkflowAllOfStepsInnerAllOfActionConfigurationInputsInner
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
    "parameter_type",
    "value"
})
@JsonTypeName("IncidentWorkflow_allOf_steps_inner_allOf_action_configuration_inputs_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncidentWorkflowAllOfStepsInnerAllOfActionConfigurationInputsInner {

    /**
     * The name of the Input
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The data type of this Input
     */
    @JsonProperty("parameter_type")
    protected String parameterType;

    /**
     * The configured value of the Input
     */
    @JsonProperty("value")
    protected String value;

    /**
     * Constructs a validated instance of {@link IncidentWorkflowAllOfStepsInnerAllOfActionConfigurationInputsInner}.
     *
     * @param spec the specification to process
     */
    public IncidentWorkflowAllOfStepsInnerAllOfActionConfigurationInputsInner(Consumer<IncidentWorkflowAllOfStepsInnerAllOfActionConfigurationInputsInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IncidentWorkflowAllOfStepsInnerAllOfActionConfigurationInputsInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IncidentWorkflowAllOfStepsInnerAllOfActionConfigurationInputsInner(Consumer)} instead.
     * @param name The name of the Input
     * @param parameterType The data type of this Input
     * @param value The configured value of the Input
     */
    @ApiStatus.Internal
    public IncidentWorkflowAllOfStepsInnerAllOfActionConfigurationInputsInner(String name, String parameterType, String value) {
        this.name = name;
        this.parameterType = parameterType;
        this.value = value;
    }

}
