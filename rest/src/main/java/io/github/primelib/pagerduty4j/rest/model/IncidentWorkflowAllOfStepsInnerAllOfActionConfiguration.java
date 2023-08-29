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
 * IncidentWorkflowAllOfStepsInnerAllOfActionConfiguration
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
    protected String actionId;

    /**
     * Description of the Action
     */
    @JsonProperty("description")
    protected String description;

    @JsonProperty("inputs")
    protected List<IncidentWorkflowAllOfStepsInnerAllOfActionConfigurationInputsInner> inputs;

    @JsonProperty("outputs")
    protected List<IncidentWorkflowAllOfStepsInnerAllOfActionConfigurationOutputsInner> outputs;

    /**
     * Constructs a validated instance of {@link IncidentWorkflowAllOfStepsInnerAllOfActionConfiguration}.
     *
     * @param spec the specification to process
     */
    public IncidentWorkflowAllOfStepsInnerAllOfActionConfiguration(Consumer<IncidentWorkflowAllOfStepsInnerAllOfActionConfiguration> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IncidentWorkflowAllOfStepsInnerAllOfActionConfiguration}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IncidentWorkflowAllOfStepsInnerAllOfActionConfiguration(Consumer)} instead.
     * @param actionId The identifier of the Action to execute
     * @param description Description of the Action
     * @param inputs inputs
     * @param outputs outputs
     */
    @ApiStatus.Internal
    public IncidentWorkflowAllOfStepsInnerAllOfActionConfiguration(String actionId, String description, List<IncidentWorkflowAllOfStepsInnerAllOfActionConfigurationInputsInner> inputs, List<IncidentWorkflowAllOfStepsInnerAllOfActionConfigurationOutputsInner> outputs) {
        this.actionId = actionId;
        this.description = description;
        this.inputs = inputs;
        this.outputs = outputs;
    }

}
