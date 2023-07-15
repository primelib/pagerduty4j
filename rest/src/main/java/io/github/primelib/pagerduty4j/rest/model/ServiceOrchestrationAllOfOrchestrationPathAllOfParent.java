package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ServiceOrchestrationAllOfOrchestrationPathAllOfParent
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "id",
    "type"
})
@JsonTypeName("ServiceOrchestration_allOf_orchestration_path_allOf_parent")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceOrchestrationAllOfOrchestrationPathAllOfParent {

    /**
     * The ID of the Service this Orchestration belongs to.
     */
    @JsonProperty("id")
    private Object id = null;

    @JsonProperty("type")
    private TypeEnum type;


    @AllArgsConstructor
    public enum TypeEnum {
        SERVICE_REFERENCE("service_reference");

        private final String value;
    }

}
