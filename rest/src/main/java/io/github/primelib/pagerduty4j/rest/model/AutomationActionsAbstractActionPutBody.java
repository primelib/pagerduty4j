package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AutomationActionsAbstractActionPutBody
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "name",
    "description",
    "action_classification",
    "action_type",
    "runner"
})
@JsonTypeName("AutomationActionsAbstractActionPutBody")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AutomationActionsAbstractActionPutBody {

    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    @JsonProperty("action_classification")
    private AutomationActionsActionClassificationEnum actionClassification;

    @JsonProperty("action_type")
    private ActionTypeEnum actionType;

    @JsonProperty("runner")
    private String runner;


    @AllArgsConstructor
    public enum ActionTypeEnum {
        SCRIPT("script"),
        PROCESS_AUTOMATION("process_automation");

        private final String value;
    }

}
