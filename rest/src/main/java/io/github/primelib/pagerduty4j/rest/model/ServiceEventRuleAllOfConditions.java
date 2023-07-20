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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ServiceEventRuleAllOfConditions
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
    protected OperatorEnum operator;

    /**
     * Array of sub-conditions.
     */
    @JsonProperty("subconditions")
    protected List<ServiceEventRuleAllOfConditionsSubconditions> subconditions;

    /**
     * Constructs a validated instance of {@link ServiceEventRuleAllOfConditions}.
     *
     * @param spec the specification to process
     */
    public ServiceEventRuleAllOfConditions(Consumer<ServiceEventRuleAllOfConditions> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ServiceEventRuleAllOfConditions}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ServiceEventRuleAllOfConditions(Consumer)} instead.
     * @param operator Operator to combine sub-conditions.
     * @param subconditions Array of sub-conditions.
     */
    @ApiStatus.Internal
    public ServiceEventRuleAllOfConditions(OperatorEnum operator, List<ServiceEventRuleAllOfConditionsSubconditions> subconditions) {
        this.operator = operator;
        this.subconditions = subconditions;
    }

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
