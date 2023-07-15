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
 * AutomationActionsProcessAutomationJobActionPostBody
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link AutomationActionsProcessAutomationJobActionPostBody}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AutomationActionsProcessAutomationJobActionPostBody(Consumer<AutomationActionsProcessAutomationJobActionPostBody> spec) {
        spec.accept(this);
    }

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


    @AllArgsConstructor
    public enum ActionTypeEnum {
        SCRIPT("script"),
        PROCESS_AUTOMATION("process_automation");

        private final String value;
    }

}
