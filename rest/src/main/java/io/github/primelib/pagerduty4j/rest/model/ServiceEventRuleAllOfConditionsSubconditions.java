package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ServiceEventRuleAllOfConditionsSubconditions
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "operator",
    "parameters"
})
@JsonTypeName("ServiceEventRule_allOf_conditions_subconditions")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceEventRuleAllOfConditionsSubconditions {

    /**
     * The type of operator to apply.
     */
    @JsonProperty("operator")
    private OperatorEnum operator;

    @JsonProperty("parameters")
    private ServiceEventRuleAllOfConditionsParameters parameters;


    /**
     * The type of operator to apply.
     */
    @AllArgsConstructor
    public enum OperatorEnum {
        EXISTS("exists"),
        NEXISTS("nexists"),
        EQUALS("equals"),
        NEQUALS("nequals"),
        CONTAINS("contains"),
        NCONTAINS("ncontains"),
        MATCHES("matches"),
        NMATCHES("nmatches");

        private final String value;
    }

}
