package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ServiceEventRuleAllOfVariables
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "type",
    "name",
    "parameters"
})
@JsonTypeName("ServiceEventRule_allOf_variables")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceEventRuleAllOfVariables {

    /**
     * The type of operation to populate the variable.
     */
    @JsonProperty("type")
    private TypeEnum type;

    /**
     * The name of the variable.
     */
    @JsonProperty("name")
    private String name;

    @JsonProperty("parameters")
    private ServiceEventRuleAllOfParameters parameters;


    /**
     * The type of operation to populate the variable.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        REGEX("regex");

        private final String value;
    }

}
