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
 * OrchestrationUnroutedAllOfOrchestrationPathCatchAllActions
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "severity",
    "event_action",
    "variables",
    "extractions"
})
@JsonTypeName("OrchestrationUnrouted_allOf_orchestration_path_catch_all_actions")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationUnroutedAllOfOrchestrationPathCatchAllActions {

    /**
     * Set the severity of the resulting alert.
     */
    @JsonProperty("severity")
    private SeverityEnum severity;

    /**
     * Set whether the resulting alert status is trigger or resolve.
     */
    @JsonProperty("event_action")
    private EventActionEnum eventAction;

    /**
     * Populate variables from event payloads and use those variables in other event actions.
     */
    @JsonProperty("variables")
    private List<OrchestrationUnroutedAllOfOrchestrationPathCatchAllActionsVariablesInner> variables;

    /**
     * Dynamically extract values to set and modify new and existing PD-CEF fields.
     */
    @JsonProperty("extractions")
    private List<OrchestrationUnroutedAllOfOrchestrationPathCatchAllActionsExtractionsInner> extractions;


    /**
     * Set the severity of the resulting alert.
     */
    @AllArgsConstructor
    public enum SeverityEnum {
        INFO("info"),
        ERROR("error"),
        WARNING("warning"),
        CRITICAL("critical");

        private final String value;
    }

    /**
     * Set whether the resulting alert status is trigger or resolve.
     */
    @AllArgsConstructor
    public enum EventActionEnum {
        TRIGGER("trigger"),
        RESOLVE("resolve");

        private final String value;
    }

}
