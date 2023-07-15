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
 * ServiceEventRuleAllOfConditionsParameters
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "path",
    "value",
    "options"
})
@JsonTypeName("ServiceEventRule_allOf_conditions_parameters")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceEventRuleAllOfConditionsParameters {

    /**
     * Constructs a validated implementation of {@link ServiceEventRuleAllOfConditionsParameters}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ServiceEventRuleAllOfConditionsParameters(Consumer<ServiceEventRuleAllOfConditionsParameters> spec) {
        spec.accept(this);
    }

    /**
     * Path to a field in an event, in dot-notation.
     * For Event Rules on a serivce, this will have to be a PD-CEF field.
     */
    @JsonProperty("path")
    protected String path;

    /**
     * Value to apply to the operator.
     */
    @JsonProperty("value")
    protected String value;

    /**
     * Options to configure the operator.
     */
    @JsonProperty("options")
    protected Object options;


}
