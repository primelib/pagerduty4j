package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IncidentWorkflowAllOfStepsInnerAllOfActionConfiguration
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "action_id",
    "description",
    "inputs",
    "outputs"
})
@JsonTypeName("IncidentWorkflow_allOf_steps_inner_allOf_action_configuration")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncidentWorkflowAllOfStepsInnerAllOfActionConfiguration {

    /**
     * The identifier of the Action to execute
     */
    @JsonProperty("action_id")
    private String actionId;

    /**
     * Description of the Action
     */
    @JsonProperty("description")
    private String description;

    @JsonProperty("inputs")
    private List<IncidentWorkflowAllOfStepsInnerAllOfActionConfigurationInputsInner> inputs = new ArrayList<>();

    @JsonProperty("outputs")
    private List<IncidentWorkflowAllOfStepsInnerAllOfActionConfigurationOutputsInner> outputs;


}
