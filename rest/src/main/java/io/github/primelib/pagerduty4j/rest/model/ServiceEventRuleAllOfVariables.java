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
 * ServiceEventRuleAllOfVariables
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "type",
    "name",
    "parameters"
})
@JsonTypeName("ServiceEventRule_allOf_variables")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceEventRuleAllOfVariables {

    /**
     * Constructs a validated implementation of {@link ServiceEventRuleAllOfVariables}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ServiceEventRuleAllOfVariables(Consumer<ServiceEventRuleAllOfVariables> spec) {
        spec.accept(this);
    }

    /**
     * The type of operation to populate the variable.
     */
    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * The name of the variable.
     */
    @JsonProperty("name")
    protected String name;

    @JsonProperty("parameters")
    protected ServiceEventRuleAllOfParameters parameters;


    /**
     * The type of operation to populate the variable.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        REGEX("regex");

        private final String value;
    }

}
