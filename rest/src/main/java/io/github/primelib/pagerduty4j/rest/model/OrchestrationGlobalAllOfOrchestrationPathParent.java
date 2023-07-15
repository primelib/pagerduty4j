package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OrchestrationGlobalAllOfOrchestrationPathParent
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "id",
    "type",
    "self"
})
@JsonTypeName("OrchestrationGlobal_allOf_orchestration_path_parent")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationGlobalAllOfOrchestrationPathParent {

    /**
     * ID of the object these Orchestration Rules belongs to.
     */
    @JsonProperty("id")
    private String id;

    /**
     * A string that determines the schema of the parent object
     */
    @JsonProperty("type")
    private String type;

    /**
     * The API show URL at which the parent object is accessible
     */
    @JsonProperty("self")
    private String self;


}
