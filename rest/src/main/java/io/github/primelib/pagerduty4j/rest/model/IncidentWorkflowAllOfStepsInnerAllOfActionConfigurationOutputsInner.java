package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IncidentWorkflowAllOfStepsInnerAllOfActionConfigurationOutputsInner
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "name",
    "reference_name",
    "parameter_type"
})
@JsonTypeName("IncidentWorkflow_allOf_steps_inner_allOf_action_configuration_outputs_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncidentWorkflowAllOfStepsInnerAllOfActionConfigurationOutputsInner {

    /**
     * The name of the Output
     */
    @JsonProperty("name")
    private String name;

    /**
     * The reference name of the Output
     */
    @JsonProperty("reference_name")
    private String referenceName;

    /**
     * The data type produced by this Output
     */
    @JsonProperty("parameter_type")
    private String parameterType;


}
