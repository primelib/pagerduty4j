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
 * IncidentWorkflowActionConfigurationInlineStepsInputsInner
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
@JsonTypeName("IncidentWorkflowActionConfiguration_inline_steps_inputs_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncidentWorkflowActionConfigurationInlineStepsInputsInner {

    /**
     * The name of the Input
     */
    @JsonProperty("name")
    protected String name;

    @JsonProperty("value")
    protected IncidentWorkflowActionConfigurationInlineStepsInputsInnerValue value;

    /**
     * Constructs a validated instance of {@link IncidentWorkflowActionConfigurationInlineStepsInputsInner}.
     *
     * @param spec the specification to process
     */
    public IncidentWorkflowActionConfigurationInlineStepsInputsInner(Consumer<IncidentWorkflowActionConfigurationInlineStepsInputsInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IncidentWorkflowActionConfigurationInlineStepsInputsInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IncidentWorkflowActionConfigurationInlineStepsInputsInner(Consumer)} instead.
     * @param name The name of the Input
     * @param value value
     */
    @ApiStatus.Internal
    public IncidentWorkflowActionConfigurationInlineStepsInputsInner(String name, IncidentWorkflowActionConfigurationInlineStepsInputsInnerValue value) {
        this.name = name;
        this.value = value;
    }

}
