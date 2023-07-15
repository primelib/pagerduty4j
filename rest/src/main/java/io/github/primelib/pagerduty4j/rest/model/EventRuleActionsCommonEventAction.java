package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EventRuleActionsCommonEventAction
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "value"
})
@JsonTypeName("EventRuleActionsCommon_event_action")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EventRuleActionsCommonEventAction {

    @JsonProperty("value")
    private ValueEnum value;


    @AllArgsConstructor
    public enum ValueEnum {
        TRIGGER("trigger"),
        RESOLVE("resolve");

        private final String value;
    }

}
