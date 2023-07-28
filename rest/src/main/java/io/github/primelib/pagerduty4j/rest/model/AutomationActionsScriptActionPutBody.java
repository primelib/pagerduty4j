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
 * AutomationActionsScriptActionPutBody
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
    "description",
    "action_classification",
    "action_type",
    "runner",
    "action_data_reference"
})
@JsonTypeName("AutomationActionsScriptActionPutBody")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AutomationActionsScriptActionPutBody {

    @JsonProperty("name")
    protected String name;

    @JsonProperty("description")
    protected String description;

    @JsonProperty("action_classification")
    protected AutomationActionsActionClassificationEnum actionClassification;

    @JsonProperty("action_type")
    protected ActionTypeEnum actionType;

    @JsonProperty("runner")
    protected String runner;

    @JsonProperty("action_data_reference")
    protected AutomationActionsScriptActionDataReference actionDataReference;

    /**
     * Constructs a validated instance of {@link AutomationActionsScriptActionPutBody}.
     *
     * @param spec the specification to process
     */
    public AutomationActionsScriptActionPutBody(Consumer<AutomationActionsScriptActionPutBody> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AutomationActionsScriptActionPutBody}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AutomationActionsScriptActionPutBody(Consumer)} instead.
     * @param name var.name
     * @param description var.name
     * @param actionClassification var.name
     * @param actionType var.name
     * @param runner var.name
     * @param actionDataReference var.name
     */
    @ApiStatus.Internal
    public AutomationActionsScriptActionPutBody(String name, String description, AutomationActionsActionClassificationEnum actionClassification, ActionTypeEnum actionType, String runner, AutomationActionsScriptActionDataReference actionDataReference) {
        this.name = name;
        this.description = description;
        this.actionClassification = actionClassification;
        this.actionType = actionType;
        this.runner = runner;
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
