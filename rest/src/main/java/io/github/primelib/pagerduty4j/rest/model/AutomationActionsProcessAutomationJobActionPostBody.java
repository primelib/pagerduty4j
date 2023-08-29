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
 * AutomationActionsProcessAutomationJobActionPostBody
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
    "services",
    "teams",
    "action_data_reference"
})
@JsonTypeName("AutomationActionsProcessAutomationJobActionPostBody")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AutomationActionsProcessAutomationJobActionPostBody {

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

    @JsonProperty("services")
    protected List<ServiceReference> services;

    @JsonProperty("teams")
    protected List<TeamReference> teams;

    @JsonProperty("action_data_reference")
    protected AutomationActionsProcessAutomationJobActionDataReference actionDataReference;

    /**
     * Constructs a validated instance of {@link AutomationActionsProcessAutomationJobActionPostBody}.
     *
     * @param spec the specification to process
     */
    public AutomationActionsProcessAutomationJobActionPostBody(Consumer<AutomationActionsProcessAutomationJobActionPostBody> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AutomationActionsProcessAutomationJobActionPostBody}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AutomationActionsProcessAutomationJobActionPostBody(Consumer)} instead.
     * @param name name
     * @param description description
     * @param actionClassification actionClassification
     * @param actionType actionType
     * @param runner runner
     * @param services services
     * @param teams teams
     * @param actionDataReference actionDataReference
     */
    @ApiStatus.Internal
    public AutomationActionsProcessAutomationJobActionPostBody(String name, String description, AutomationActionsActionClassificationEnum actionClassification, ActionTypeEnum actionType, String runner, List<ServiceReference> services, List<TeamReference> teams, AutomationActionsProcessAutomationJobActionDataReference actionDataReference) {
        this.name = name;
        this.description = description;
        this.actionClassification = actionClassification;
        this.actionType = actionType;
        this.runner = runner;
        this.services = services;
        this.teams = teams;
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
