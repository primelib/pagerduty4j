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
 * IncidentWorkflowActionInvocationOutputsInner
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "value"
})
@JsonTypeName("IncidentWorkflowActionInvocation_outputs_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncidentWorkflowActionInvocationOutputsInner {

    /**
     * Constructs a validated implementation of {@link IncidentWorkflowActionInvocationOutputsInner}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IncidentWorkflowActionInvocationOutputsInner(Consumer<IncidentWorkflowActionInvocationOutputsInner> spec) {
        spec.accept(this);
    }

    @JsonProperty("value")
    protected String value;


}
