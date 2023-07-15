package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IncidentWorkflowAllOfStepsInnerAllOfActionConfigurationInputsInner
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private String name;

    /**
     * The data type of this Input
     */
    @JsonProperty("parameter_type")
    private String parameterType;

    /**
     * The configured value of the Input
     */
    @JsonProperty("value")
    private String value;


}
