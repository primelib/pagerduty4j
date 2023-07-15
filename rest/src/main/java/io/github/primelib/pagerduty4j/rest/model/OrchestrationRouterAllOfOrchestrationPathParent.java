package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OrchestrationRouterAllOfOrchestrationPathParent
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "id",
    "type"
})
@JsonTypeName("OrchestrationRouter_allOf_orchestration_path_parent")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationRouterAllOfOrchestrationPathParent {

    /**
     * ID of the Global Event Orchestration this Router belongs to.
     */
    @JsonProperty("id")
    private Object id = null;

    @JsonProperty("type")
    private TypeEnum type;


    @AllArgsConstructor
    public enum TypeEnum {
        EVENT_ORCHESTRATION_REFERENCE("event_orchestration_reference");

        private final String value;
    }

}
