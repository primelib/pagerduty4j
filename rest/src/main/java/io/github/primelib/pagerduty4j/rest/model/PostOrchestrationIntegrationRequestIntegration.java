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
 * PostOrchestrationIntegrationRequestIntegration
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
    "label"
})
@JsonTypeName("postOrchestrationIntegration_request_integration")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PostOrchestrationIntegrationRequestIntegration {

    /**
     * Name of the Integration.
     */
    @JsonProperty("label")
    protected String label;

    /**
     * Constructs a validated instance of {@link PostOrchestrationIntegrationRequestIntegration}.
     *
     * @param spec the specification to process
     */
    public PostOrchestrationIntegrationRequestIntegration(Consumer<PostOrchestrationIntegrationRequestIntegration> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PostOrchestrationIntegrationRequestIntegration}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PostOrchestrationIntegrationRequestIntegration(Consumer)} instead.
     * @param label Name of the Integration.
     */
    @ApiStatus.Internal
    public PostOrchestrationIntegrationRequestIntegration(String label) {
        this.label = label;
    }

}
