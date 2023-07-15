package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ServiceEventRuleAllOfConditions
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "operator",
    "subconditions"
})
@JsonTypeName("ServiceEventRule_allOf_conditions")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceEventRuleAllOfConditions {

    /**
     * Operator to combine sub-conditions.
     */
    @JsonProperty("operator")
    private OperatorEnum operator;

    /**
     * Array of sub-conditions.
     */
    @JsonProperty("subconditions")
    private List<ServiceEventRuleAllOfConditionsSubconditions> subconditions = new ArrayList<>();


    /**
     * Operator to combine sub-conditions.
     */
    @AllArgsConstructor
    public enum OperatorEnum {
        AND("and"),
        OR("or");

        private final String value;
    }

}
