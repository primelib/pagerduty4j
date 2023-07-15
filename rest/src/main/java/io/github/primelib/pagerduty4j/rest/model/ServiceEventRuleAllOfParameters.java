package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ServiceEventRuleAllOfParameters
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "value",
    "path"
})
@JsonTypeName("ServiceEventRule_allOf_parameters")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceEventRuleAllOfParameters {

    /**
     * The value for the operation. For example, an RE2 regular expression for regex-type variables.
     */
    @JsonProperty("value")
    private String value;

    /**
     * Path to a field in an event, in dot-notation. For Event Rules on a Service, this will have to be a PD-CEF field.
     */
    @JsonProperty("path")
    private String path;


}
