package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
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

    @JsonProperty("id")
    private String id;

    @JsonProperty("type")
    private TypeEnum type;

    /**
     * Reference to the Action that was invoked
     */
    @JsonProperty("action_id")
    private String actionId;

    @JsonProperty("inputs")
    private List<IncidentWorkflowActionInvocationInputsInner> inputs;

    @JsonProperty("outputs")
    private List<IncidentWorkflowActionInvocationOutputsInner> outputs;


    @AllArgsConstructor
    public enum TypeEnum {
        ACTION_INVOCATION("action_invocation");

        private final String value;
    }

}
