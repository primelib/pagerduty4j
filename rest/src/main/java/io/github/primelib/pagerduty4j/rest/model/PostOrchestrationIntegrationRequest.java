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
 * PostOrchestrationIntegrationRequest
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
@JsonTypeName("postOrchestrationIntegration_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PostOrchestrationIntegrationRequest {

    @JsonProperty("integration")
    protected PostOrchestrationIntegrationRequestIntegration integration;

    /**
     * Constructs a validated instance of {@link PostOrchestrationIntegrationRequest}.
     *
     * @param spec the specification to process
     */
    public PostOrchestrationIntegrationRequest(Consumer<PostOrchestrationIntegrationRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PostOrchestrationIntegrationRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PostOrchestrationIntegrationRequest(Consumer)} instead.
     * @param integration var.name
     */
    @ApiStatus.Internal
    public PostOrchestrationIntegrationRequest(PostOrchestrationIntegrationRequestIntegration integration) {
        this.integration = integration;
    }

}
