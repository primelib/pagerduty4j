package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OrchestrationIntegrationParameters
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
    protected String routingKey;

    @JsonProperty("type")
    protected String type;

    /**
     * Constructs a validated instance of {@link OrchestrationIntegrationParameters}.
     *
     * @param spec the specification to process
     */
    public OrchestrationIntegrationParameters(Consumer<OrchestrationIntegrationParameters> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OrchestrationIntegrationParameters}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OrchestrationIntegrationParameters(Consumer)} instead.
     * @param routingKey Routing Key used to send Events to this Orchestration
     * @param type var.name
     */
    @ApiStatus.Internal
    public OrchestrationIntegrationParameters(String routingKey, String type) {
        this.routingKey = routingKey;
        this.type = type;
    }

}
