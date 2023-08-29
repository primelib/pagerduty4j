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
 * CreateServiceIntegrationRequest
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
@JsonTypeName("createServiceIntegration_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateServiceIntegrationRequest {

    @JsonProperty("integration")
    protected Integration integration;

    /**
     * Constructs a validated instance of {@link CreateServiceIntegrationRequest}.
     *
     * @param spec the specification to process
     */
    public CreateServiceIntegrationRequest(Consumer<CreateServiceIntegrationRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateServiceIntegrationRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateServiceIntegrationRequest(Consumer)} instead.
     * @param integration integration
     */
    @ApiStatus.Internal
    public CreateServiceIntegrationRequest(Integration integration) {
        this.integration = integration;
    }

}
