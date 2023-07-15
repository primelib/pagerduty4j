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
 * AutomationActionsAbstractActionPostBody
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
    "runner",
    "services",
    "teams"
})
@JsonTypeName("AutomationActionsAbstractActionPostBody")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AutomationActionsAbstractActionPostBody {

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

    @JsonProperty("services")
    private List<ServiceReference> services;

    @JsonProperty("teams")
    private List<TeamReference> teams;


    @AllArgsConstructor
    public enum ActionTypeEnum {
        SCRIPT("script"),
        PROCESS_AUTOMATION("process_automation");

        private final String value;
    }

}
