package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AutomationActionsInvocationAllOfActionSnapshot
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "name",
    "action_type",
    "action_data_reference"
})
@JsonTypeName("AutomationActionsInvocation_allOf_action_snapshot")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AutomationActionsInvocationAllOfActionSnapshot {

    @JsonProperty("name")
    private String name;

    @JsonProperty("action_type")
    private ActionTypeEnum actionType;

    @JsonProperty("action_data_reference")
    private AutomationActionsInvocationAllOfActionSnapshotAllOfActionDataReference actionDataReference;


    @AllArgsConstructor
    public enum ActionTypeEnum {
        SCRIPT("script"),
        PROCESS_AUTOMATION("process_automation");

        private final String value;
    }

}
