package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OrchestrationIntegrationParameters
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "routing_key",
    "type"
})
@JsonTypeName("OrchestrationIntegration_parameters")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationIntegrationParameters {

    /**
     * Routing Key used to send Events to this Orchestration
     */
    @JsonProperty("routing_key")
    private String routingKey;

    @JsonProperty("type")
    private String type = "global";


}
