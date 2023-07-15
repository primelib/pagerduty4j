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
 * ServiceEventRuleAllOfParameters
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "value",
    "path"
})
@JsonTypeName("ServiceEventRule_allOf_parameters")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceEventRuleAllOfParameters {

    /**
     * Constructs a validated implementation of {@link ServiceEventRuleAllOfParameters}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ServiceEventRuleAllOfParameters(Consumer<ServiceEventRuleAllOfParameters> spec) {
        spec.accept(this);
    }

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


}
