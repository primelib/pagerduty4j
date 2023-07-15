package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OrchestrationIntegrationParameters
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "routing_key",
    "type"
})
@JsonTypeName("OrchestrationIntegration_parameters")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationIntegrationParameters {

    /**
     * Constructs a validated implementation of {@link OrchestrationIntegrationParameters}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public OrchestrationIntegrationParameters(Consumer<OrchestrationIntegrationParameters> spec) {
        spec.accept(this);
    }

    /**
     * Routing Key used to send Events to this Orchestration
     */
    @JsonProperty("routing_key")
    protected String routingKey;

    @JsonProperty("type")
    protected String type = "global";


}
