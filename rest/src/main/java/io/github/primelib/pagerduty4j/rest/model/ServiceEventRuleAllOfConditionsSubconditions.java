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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ServiceEventRuleAllOfConditionsSubconditions
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
    "parameters"
})
@JsonTypeName("ServiceEventRule_allOf_conditions_subconditions")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceEventRuleAllOfConditionsSubconditions {

    /**
     * The type of operator to apply.
     */
    @JsonProperty("operator")
    protected OperatorEnum operator;

    @JsonProperty("parameters")
    protected ServiceEventRuleAllOfConditionsParameters parameters;

    /**
     * Constructs a validated instance of {@link ServiceEventRuleAllOfConditionsSubconditions}.
     *
     * @param spec the specification to process
     */
    public ServiceEventRuleAllOfConditionsSubconditions(Consumer<ServiceEventRuleAllOfConditionsSubconditions> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ServiceEventRuleAllOfConditionsSubconditions}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ServiceEventRuleAllOfConditionsSubconditions(Consumer)} instead.
     * @param operator The type of operator to apply.
     * @param parameters var.name
     */
    @ApiStatus.Internal
    public ServiceEventRuleAllOfConditionsSubconditions(OperatorEnum operator, ServiceEventRuleAllOfConditionsParameters parameters) {
        this.operator = operator;
        this.parameters = parameters;
    }

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

        private static final OperatorEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static OperatorEnum of(String input) {
            if (input != null) {
                for (OperatorEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
