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
 * OrchestrationRouter
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
    "orchestration_path"
})
@JsonTypeName("OrchestrationRouter")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationRouter {

    @JsonProperty("orchestration_path")
    protected OrchestrationRouterAllOfOrchestrationPath orchestrationPath;

    /**
     * Constructs a validated instance of {@link OrchestrationRouter}.
     *
     * @param spec the specification to process
     */
    public OrchestrationRouter(Consumer<OrchestrationRouter> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OrchestrationRouter}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OrchestrationRouter(Consumer)} instead.
     * @param orchestrationPath orchestrationPath
     */
    @ApiStatus.Internal
    public OrchestrationRouter(OrchestrationRouterAllOfOrchestrationPath orchestrationPath) {
        this.orchestrationPath = orchestrationPath;
    }

}
