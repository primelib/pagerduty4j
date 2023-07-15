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
 * GetOrchestrationIntegration200Response
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "integration"
})
@JsonTypeName("getOrchestrationIntegration_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetOrchestrationIntegration200Response {

    /**
     * Constructs a validated implementation of {@link GetOrchestrationIntegration200Response}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetOrchestrationIntegration200Response(Consumer<GetOrchestrationIntegration200Response> spec) {
        spec.accept(this);
    }

    @JsonProperty("integration")
    protected OrchestrationIntegration integration;


}
