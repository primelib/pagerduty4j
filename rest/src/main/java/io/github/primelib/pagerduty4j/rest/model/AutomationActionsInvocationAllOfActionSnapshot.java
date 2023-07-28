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
 * AutomationActionsInvocationAllOfActionSnapshot
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
    "name",
    "action_type",
    "action_data_reference"
})
@JsonTypeName("AutomationActionsInvocation_allOf_action_snapshot")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AutomationActionsInvocationAllOfActionSnapshot {

    @JsonProperty("name")
    protected String name;

    @JsonProperty("action_type")
    protected ActionTypeEnum actionType;

    @JsonProperty("action_data_reference")
    protected AutomationActionsInvocationAllOfActionSnapshotAllOfActionDataReference actionDataReference;

    /**
     * Constructs a validated instance of {@link AutomationActionsInvocationAllOfActionSnapshot}.
     *
     * @param spec the specification to process
     */
    public AutomationActionsInvocationAllOfActionSnapshot(Consumer<AutomationActionsInvocationAllOfActionSnapshot> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AutomationActionsInvocationAllOfActionSnapshot}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AutomationActionsInvocationAllOfActionSnapshot(Consumer)} instead.
     * @param name var.name
     * @param actionType var.name
     * @param actionDataReference var.name
     */
    @ApiStatus.Internal
    public AutomationActionsInvocationAllOfActionSnapshot(String name, ActionTypeEnum actionType, AutomationActionsInvocationAllOfActionSnapshotAllOfActionDataReference actionDataReference) {
        this.name = name;
        this.actionType = actionType;
        this.actionDataReference = actionDataReference;
    }

    @AllArgsConstructor
    public enum ActionTypeEnum {
        SCRIPT("script"),
        PROCESS_AUTOMATION("process_automation");

        private static final ActionTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static ActionTypeEnum of(String input) {
            if (input != null) {
                for (ActionTypeEnum v : VALUES) {
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
