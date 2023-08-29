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
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ServiceEventRuleAllOfConditionsParameters
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

    /**
     * Constructs a validated instance of {@link ServiceEventRuleAllOfConditionsParameters}.
     *
     * @param spec the specification to process
     */
    public ServiceEventRuleAllOfConditionsParameters(Consumer<ServiceEventRuleAllOfConditionsParameters> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ServiceEventRuleAllOfConditionsParameters}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ServiceEventRuleAllOfConditionsParameters(Consumer)} instead.
     * @param path Path to a field in an event, in dot-notation.  For Event Rules on a serivce, this will have to be a PD-CEF field.
     * @param value Value to apply to the operator.
     * @param options Options to configure the operator.
     */
    @ApiStatus.Internal
    public ServiceEventRuleAllOfConditionsParameters(String path, String value, Object options) {
        this.path = path;
        this.value = value;
        this.options = options;
    }

}
