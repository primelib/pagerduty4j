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
 * OrchestrationUnrouted
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
@JsonTypeName("OrchestrationUnrouted")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationUnrouted {

    @JsonProperty("orchestration_path")
    protected OrchestrationUnroutedAllOfOrchestrationPath orchestrationPath;

    /**
     * Constructs a validated instance of {@link OrchestrationUnrouted}.
     *
     * @param spec the specification to process
     */
    public OrchestrationUnrouted(Consumer<OrchestrationUnrouted> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OrchestrationUnrouted}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OrchestrationUnrouted(Consumer)} instead.
     * @param orchestrationPath orchestrationPath
     */
    @ApiStatus.Internal
    public OrchestrationUnrouted(OrchestrationUnroutedAllOfOrchestrationPath orchestrationPath) {
        this.orchestrationPath = orchestrationPath;
    }

}
