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
 * ServiceEventRuleAllOfParameters
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
    protected String value;

    /**
     * Path to a field in an event, in dot-notation. For Event Rules on a Service, this will have to be a PD-CEF field.
     */
    @JsonProperty("path")
    protected String path;

    /**
     * Constructs a validated instance of {@link ServiceEventRuleAllOfParameters}.
     *
     * @param spec the specification to process
     */
    public ServiceEventRuleAllOfParameters(Consumer<ServiceEventRuleAllOfParameters> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ServiceEventRuleAllOfParameters}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ServiceEventRuleAllOfParameters(Consumer)} instead.
     * @param value The value for the operation. For example, an RE2 regular expression for regex-type variables.
     * @param path Path to a field in an event, in dot-notation. For Event Rules on a Service, this will have to be a PD-CEF field.
     */
    @ApiStatus.Internal
    public ServiceEventRuleAllOfParameters(String value, String path) {
        this.value = value;
        this.path = path;
    }

}
