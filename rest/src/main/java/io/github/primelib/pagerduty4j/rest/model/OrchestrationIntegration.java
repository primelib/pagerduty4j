package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OrchestrationIntegration
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "id",
    "label",
    "parameters"
})
@JsonTypeName("OrchestrationIntegration")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationIntegration {

    /**
     * ID of the Integration.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Name of the Integration.
     */
    @JsonProperty("label")
    private String label;

    @JsonProperty("parameters")
    private OrchestrationIntegrationParameters parameters;


}
