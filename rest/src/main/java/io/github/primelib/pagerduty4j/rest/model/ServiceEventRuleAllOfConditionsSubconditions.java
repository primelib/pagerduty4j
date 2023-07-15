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
 * ServiceEventRuleAllOfConditionsSubconditions
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "operator",
    "parameters"
})
@JsonTypeName("ServiceEventRule_allOf_conditions_subconditions")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceEventRuleAllOfConditionsSubconditions {

    /**
     * Constructs a validated implementation of {@link ServiceEventRuleAllOfConditionsSubconditions}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ServiceEventRuleAllOfConditionsSubconditions(Consumer<ServiceEventRuleAllOfConditionsSubconditions> spec) {
        spec.accept(this);
    }

    /**
     * The type of operator to apply.
     */
    @JsonProperty("operator")
    protected OperatorEnum operator;

    @JsonProperty("parameters")
    protected ServiceEventRuleAllOfConditionsParameters parameters;


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
