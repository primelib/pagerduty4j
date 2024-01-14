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
 * IncidentWorkflowAllOfStepsAllOfActionConfigurationInlineStepsInputsInnerValueStepsInnerAllOfActionConfiguration
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
@JsonTypeName("IncidentWorkflow_allOf_steps_allOf_action_configuration_inline_steps_inputs_inner_value_steps_inner_allOf_action_configuration")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncidentWorkflowAllOfStepsAllOfActionConfigurationInlineStepsInputsInnerValueStepsInnerAllOfActionConfiguration {

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

    @JsonProperty("outputs")
    protected List<IncidentWorkflowAllOfStepsAllOfActionConfigurationInlineStepsInputsInnerValueStepsInnerAllOfActionConfigurationOutputsInner> outputs;

    /**
     * Constructs a validated instance of {@link IncidentWorkflowAllOfStepsAllOfActionConfigurationInlineStepsInputsInnerValueStepsInnerAllOfActionConfiguration}.
     *
     * @param spec the specification to process
     */
    public IncidentWorkflowAllOfStepsAllOfActionConfigurationInlineStepsInputsInnerValueStepsInnerAllOfActionConfiguration(Consumer<IncidentWorkflowAllOfStepsAllOfActionConfigurationInlineStepsInputsInnerValueStepsInnerAllOfActionConfiguration> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IncidentWorkflowAllOfStepsAllOfActionConfigurationInlineStepsInputsInnerValueStepsInnerAllOfActionConfiguration}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IncidentWorkflowAllOfStepsAllOfActionConfigurationInlineStepsInputsInnerValueStepsInnerAllOfActionConfiguration(Consumer)} instead.
     * @param actionId The identifier of the Action to execute
     * @param description Description of the Action
     * @param inputs The standard inputs used to configure the Action to execute
     * @param outputs outputs
     */
    @ApiStatus.Internal
    public IncidentWorkflowAllOfStepsAllOfActionConfigurationInlineStepsInputsInnerValueStepsInnerAllOfActionConfiguration(String actionId, String description, List<IncidentWorkflowAllOfStepsAllOfActionConfigurationInputsInner> inputs, List<IncidentWorkflowAllOfStepsAllOfActionConfigurationInlineStepsInputsInnerValueStepsInnerAllOfActionConfigurationOutputsInner> outputs) {
        this.actionId = actionId;
        this.description = description;
        this.inputs = inputs;
        this.outputs = outputs;
    }

}
