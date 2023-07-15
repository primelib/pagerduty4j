package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

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
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "operator",
    "subconditions"
})
@JsonTypeName("ServiceEventRule_allOf_conditions")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceEventRuleAllOfConditions {

    /**
     * Constructs a validated implementation of {@link ServiceEventRuleAllOfConditions}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ServiceEventRuleAllOfConditions(Consumer<ServiceEventRuleAllOfConditions> spec) {
        spec.accept(this);
    }

    /**
     * Operator to combine sub-conditions.
     */
    @JsonProperty("operator")
    protected OperatorEnum operator;

    /**
     * Array of sub-conditions.
     */
    @JsonProperty("subconditions")
    protected List<ServiceEventRuleAllOfConditionsSubconditions> subconditions = new ArrayList<>();


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
