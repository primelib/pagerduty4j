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
 * IncidentWorkflowActionConfiguration
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
@JsonTypeName("IncidentWorkflowActionConfiguration")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncidentWorkflowActionConfiguration {

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
     * An unordered list of standard inputs used to configure the Action to execute
     */
    @JsonProperty("inputs")
    protected List<IncidentWorkflowActionConfigurationInputsInner> inputs;

    /**
     * An unordered list of specialized inputs used to configure a workflow-within-a-workflow
     */
    @JsonProperty("inline_steps_inputs")
    protected List<IncidentWorkflowActionConfigurationInlineStepsInputsInner> inlineStepsInputs;

    /**
     * An unordered list of outputs this action produces
     */
    @JsonProperty("outputs")
    protected List<IncidentWorkflowActionConfigurationInlineStepsInputsInnerValueStepsInnerAllOfActionConfigurationOutputsInner> outputs;

    /**
     * Constructs a validated instance of {@link IncidentWorkflowActionConfiguration}.
     *
     * @param spec the specification to process
     */
    public IncidentWorkflowActionConfiguration(Consumer<IncidentWorkflowActionConfiguration> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IncidentWorkflowActionConfiguration}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IncidentWorkflowActionConfiguration(Consumer)} instead.
     * @param actionId The identifier of the Action to execute
     * @param description Description of the Action
     * @param inputs An unordered list of standard inputs used to configure the Action to execute
     * @param inlineStepsInputs An unordered list of specialized inputs used to configure a workflow-within-a-workflow
     * @param outputs An unordered list of outputs this action produces
     */
    @ApiStatus.Internal
    public IncidentWorkflowActionConfiguration(String actionId, String description, List<IncidentWorkflowActionConfigurationInputsInner> inputs, List<IncidentWorkflowActionConfigurationInlineStepsInputsInner> inlineStepsInputs, List<IncidentWorkflowActionConfigurationInlineStepsInputsInnerValueStepsInnerAllOfActionConfigurationOutputsInner> outputs) {
        this.actionId = actionId;
        this.description = description;
        this.inputs = inputs;
        this.inlineStepsInputs = inlineStepsInputs;
        this.outputs = outputs;
    }

}
