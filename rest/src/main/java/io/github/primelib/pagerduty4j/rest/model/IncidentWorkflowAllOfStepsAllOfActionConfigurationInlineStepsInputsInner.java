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
 * IncidentWorkflowAllOfStepsAllOfActionConfigurationInlineStepsInputsInner
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
    "value"
})
@JsonTypeName("IncidentWorkflow_allOf_steps_allOf_action_configuration_inline_steps_inputs_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncidentWorkflowAllOfStepsAllOfActionConfigurationInlineStepsInputsInner {

    /**
     * The name of the Input
     */
    @JsonProperty("name")
    protected String name;

    @JsonProperty("value")
    protected IncidentWorkflowAllOfStepsAllOfActionConfigurationInlineStepsInputsInnerValue value;

    /**
     * Constructs a validated instance of {@link IncidentWorkflowAllOfStepsAllOfActionConfigurationInlineStepsInputsInner}.
     *
     * @param spec the specification to process
     */
    public IncidentWorkflowAllOfStepsAllOfActionConfigurationInlineStepsInputsInner(Consumer<IncidentWorkflowAllOfStepsAllOfActionConfigurationInlineStepsInputsInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IncidentWorkflowAllOfStepsAllOfActionConfigurationInlineStepsInputsInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IncidentWorkflowAllOfStepsAllOfActionConfigurationInlineStepsInputsInner(Consumer)} instead.
     * @param name The name of the Input
     * @param value value
     */
    @ApiStatus.Internal
    public IncidentWorkflowAllOfStepsAllOfActionConfigurationInlineStepsInputsInner(String name, IncidentWorkflowAllOfStepsAllOfActionConfigurationInlineStepsInputsInnerValue value) {
        this.name = name;
        this.value = value;
    }

}
