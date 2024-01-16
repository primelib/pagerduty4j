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
 * OrchestrationIntegration
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
    protected String id;

    /**
     * Name of the Integration.
     */
    @JsonProperty("label")
    protected String label;

    @JsonProperty("parameters")
    protected OrchestrationIntegrationParameters parameters;

    /**
     * Constructs a validated instance of {@link OrchestrationIntegration}.
     *
     * @param spec the specification to process
     */
    public OrchestrationIntegration(Consumer<OrchestrationIntegration> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OrchestrationIntegration}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OrchestrationIntegration(Consumer)} instead.
     * @param id ID of the Integration.
     * @param label Name of the Integration.
     * @param parameters parameters
     */
    @ApiStatus.Internal
    public OrchestrationIntegration(String id, String label, OrchestrationIntegrationParameters parameters) {
        this.id = id;
        this.label = label;
        this.parameters = parameters;
    }

}
