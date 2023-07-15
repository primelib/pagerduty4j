package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IncidentWorkflowActionInvocation
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "type",
    "action_id",
    "inputs",
    "outputs"
})
@JsonTypeName("IncidentWorkflowActionInvocation")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncidentWorkflowActionInvocation {

    /**
     * Constructs a validated implementation of {@link IncidentWorkflowActionInvocation}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IncidentWorkflowActionInvocation(Consumer<IncidentWorkflowActionInvocation> spec) {
        spec.accept(this);
    }

    @JsonProperty("id")
    protected String id;

    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * Reference to the Action that was invoked
     */
    @JsonProperty("action_id")
    protected String actionId;

    @JsonProperty("inputs")
    protected List<IncidentWorkflowActionInvocationInputsInner> inputs;

    @JsonProperty("outputs")
    protected List<IncidentWorkflowActionInvocationOutputsInner> outputs;


    @AllArgsConstructor
    public enum TypeEnum {
        ACTION_INVOCATION("action_invocation");

        private final String value;
    }

}
