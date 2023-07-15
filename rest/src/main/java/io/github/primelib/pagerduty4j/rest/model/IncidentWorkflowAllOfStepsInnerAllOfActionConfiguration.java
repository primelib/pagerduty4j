package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

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
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link IncidentWorkflowAllOfStepsInnerAllOfActionConfiguration}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IncidentWorkflowAllOfStepsInnerAllOfActionConfiguration(Consumer<IncidentWorkflowAllOfStepsInnerAllOfActionConfiguration> spec) {
        spec.accept(this);
    }

    /**
     * The identifier of the Action to execute
     */
    @JsonProperty("action_id")
    protected String actionId;

    /**
     * Description of the Action
     */
    @JsonProperty("description")
    protected String description;

    @JsonProperty("inputs")
    protected List<IncidentWorkflowAllOfStepsInnerAllOfActionConfigurationInputsInner> inputs = new ArrayList<>();

    @JsonProperty("outputs")
    protected List<IncidentWorkflowAllOfStepsInnerAllOfActionConfigurationOutputsInner> outputs;


}
