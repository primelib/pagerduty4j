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
 * IncidentWorkflowActionConfigurationInputsInner
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
    "parameter_type",
    "value"
})
@JsonTypeName("IncidentWorkflowActionConfiguration_inputs_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncidentWorkflowActionConfigurationInputsInner {

    /**
     * The name for this Input. Input names are unique per action and should be used to find a specific Input.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The data type of this Input
     */
    @JsonProperty("parameter_type")
    protected String parameterType;

    /**
     * The configured value of the Input
     */
    @JsonProperty("value")
    protected String value;

    /**
     * Constructs a validated instance of {@link IncidentWorkflowActionConfigurationInputsInner}.
     *
     * @param spec the specification to process
     */
    public IncidentWorkflowActionConfigurationInputsInner(Consumer<IncidentWorkflowActionConfigurationInputsInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IncidentWorkflowActionConfigurationInputsInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IncidentWorkflowActionConfigurationInputsInner(Consumer)} instead.
     * @param name The name for this Input. Input names are unique per action and should be used to find a specific Input.
     * @param parameterType The data type of this Input
     * @param value The configured value of the Input
     */
    @ApiStatus.Internal
    public IncidentWorkflowActionConfigurationInputsInner(String name, String parameterType, String value) {
        this.name = name;
        this.parameterType = parameterType;
        this.value = value;
    }

}
