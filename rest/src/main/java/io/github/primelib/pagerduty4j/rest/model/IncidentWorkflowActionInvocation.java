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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * IncidentWorkflowActionInvocation
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

    /**
     * Constructs a validated instance of {@link IncidentWorkflowActionInvocation}.
     *
     * @param spec the specification to process
     */
    public IncidentWorkflowActionInvocation(Consumer<IncidentWorkflowActionInvocation> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IncidentWorkflowActionInvocation}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IncidentWorkflowActionInvocation(Consumer)} instead.
     * @param id id
     * @param type type
     * @param actionId Reference to the Action that was invoked
     * @param inputs inputs
     * @param outputs outputs
     */
    @ApiStatus.Internal
    public IncidentWorkflowActionInvocation(String id, TypeEnum type, String actionId, List<IncidentWorkflowActionInvocationInputsInner> inputs, List<IncidentWorkflowActionInvocationOutputsInner> outputs) {
        this.id = id;
        this.type = type;
        this.actionId = actionId;
        this.inputs = inputs;
        this.outputs = outputs;
    }

    @AllArgsConstructor
    public enum TypeEnum {
        ACTION_INVOCATION("action_invocation");

        private static final TypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static TypeEnum of(String input) {
            if (input != null) {
                for (TypeEnum v : VALUES) {
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
