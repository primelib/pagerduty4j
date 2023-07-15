package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IncidentWorkflowAllOfStepsInnerAllOfActionConfigurationInputsInner
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "name",
    "parameter_type",
    "value"
})
@JsonTypeName("IncidentWorkflow_allOf_steps_inner_allOf_action_configuration_inputs_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncidentWorkflowAllOfStepsInnerAllOfActionConfigurationInputsInner {

    /**
     * Constructs a validated implementation of {@link IncidentWorkflowAllOfStepsInnerAllOfActionConfigurationInputsInner}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IncidentWorkflowAllOfStepsInnerAllOfActionConfigurationInputsInner(Consumer<IncidentWorkflowAllOfStepsInnerAllOfActionConfigurationInputsInner> spec) {
        spec.accept(this);
    }

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


}
