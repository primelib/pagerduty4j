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
 * PostOrchestrationIntegration201Response
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
    "integration"
})
@JsonTypeName("postOrchestrationIntegration_201_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PostOrchestrationIntegration201Response {

    @JsonProperty("integration")
    protected OrchestrationIntegration integration;

    /**
     * Constructs a validated instance of {@link PostOrchestrationIntegration201Response}.
     *
     * @param spec the specification to process
     */
    public PostOrchestrationIntegration201Response(Consumer<PostOrchestrationIntegration201Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PostOrchestrationIntegration201Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PostOrchestrationIntegration201Response(Consumer)} instead.
     * @param integration integration
     */
    @ApiStatus.Internal
    public PostOrchestrationIntegration201Response(OrchestrationIntegration integration) {
        this.integration = integration;
    }

}
