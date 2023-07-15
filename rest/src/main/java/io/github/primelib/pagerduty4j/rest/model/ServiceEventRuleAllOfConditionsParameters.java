package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ServiceEventRuleAllOfConditionsParameters
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "path",
    "value",
    "options"
})
@JsonTypeName("ServiceEventRule_allOf_conditions_parameters")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceEventRuleAllOfConditionsParameters {

    /**
     * Path to a field in an event, in dot-notation.
     * For Event Rules on a serivce, this will have to be a PD-CEF field.
     */
    @JsonProperty("path")
    private String path;

    /**
     * Value to apply to the operator.
     */
    @JsonProperty("value")
    private String value;

    /**
     * Options to configure the operator.
     */
    @JsonProperty("options")
    private Object options;


}
