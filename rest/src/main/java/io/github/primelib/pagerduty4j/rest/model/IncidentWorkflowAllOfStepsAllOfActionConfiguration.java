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
 * IncidentWorkflowAllOfStepsAllOfActionConfiguration
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
    "inline_steps_inputs",
    "outputs"
})
@JsonTypeName("IncidentWorkflow_allOf_steps_allOf_action_configuration")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncidentWorkflowAllOfStepsAllOfActionConfiguration {

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

    /**
     * The standard inputs used to configure the Action to execute
     */
    @JsonProperty("inputs")
    protected List<IncidentWorkflowAllOfStepsAllOfActionConfigurationInputsInner> inputs;

    /**
     * Specialized inputs used to configure a workflow-within-a-workflow
     */
    @JsonProperty("inline_steps_inputs")
    protected List<IncidentWorkflowAllOfStepsAllOfActionConfigurationInlineStepsInputsInner> inlineStepsInputs;

    @JsonProperty("outputs")
    protected List<IncidentWorkflowAllOfStepsAllOfActionConfigurationInlineStepsInputsInnerValueStepsInnerAllOfActionConfigurationOutputsInner> outputs;

    /**
     * Constructs a validated instance of {@link IncidentWorkflowAllOfStepsAllOfActionConfiguration}.
     *
     * @param spec the specification to process
     */
    public IncidentWorkflowAllOfStepsAllOfActionConfiguration(Consumer<IncidentWorkflowAllOfStepsAllOfActionConfiguration> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IncidentWorkflowAllOfStepsAllOfActionConfiguration}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IncidentWorkflowAllOfStepsAllOfActionConfiguration(Consumer)} instead.
     * @param actionId The identifier of the Action to execute
     * @param description Description of the Action
     * @param inputs The standard inputs used to configure the Action to execute
     * @param inlineStepsInputs Specialized inputs used to configure a workflow-within-a-workflow
     * @param outputs outputs
     */
    @ApiStatus.Internal
    public IncidentWorkflowAllOfStepsAllOfActionConfiguration(String actionId, String description, List<IncidentWorkflowAllOfStepsAllOfActionConfigurationInputsInner> inputs, List<IncidentWorkflowAllOfStepsAllOfActionConfigurationInlineStepsInputsInner> inlineStepsInputs, List<IncidentWorkflowAllOfStepsAllOfActionConfigurationInlineStepsInputsInnerValueStepsInnerAllOfActionConfigurationOutputsInner> outputs) {
        this.actionId = actionId;
        this.description = description;
        this.inputs = inputs;
        this.inlineStepsInputs = inlineStepsInputs;
        this.outputs = outputs;
    }

}
