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
 * IncidentWorkflowAllOfStepsInnerAllOfActionConfigurationOutputsInner
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "name",
    "reference_name",
    "parameter_type"
})
@JsonTypeName("IncidentWorkflow_allOf_steps_inner_allOf_action_configuration_outputs_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncidentWorkflowAllOfStepsInnerAllOfActionConfigurationOutputsInner {

    /**
     * Constructs a validated implementation of {@link IncidentWorkflowAllOfStepsInnerAllOfActionConfigurationOutputsInner}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IncidentWorkflowAllOfStepsInnerAllOfActionConfigurationOutputsInner(Consumer<IncidentWorkflowAllOfStepsInnerAllOfActionConfigurationOutputsInner> spec) {
        spec.accept(this);
    }

    /**
     * The name of the Output
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The reference name of the Output
     */
    @JsonProperty("reference_name")
    protected String referenceName;

    /**
     * The data type produced by this Output
     */
    @JsonProperty("parameter_type")
    protected String parameterType;


}
