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
 * OrchestrationGlobal
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "orchestration_path"
})
@JsonTypeName("OrchestrationGlobal")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationGlobal {

    /**
     * Constructs a validated implementation of {@link OrchestrationGlobal}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public OrchestrationGlobal(Consumer<OrchestrationGlobal> spec) {
        spec.accept(this);
    }

    @JsonProperty("orchestration_path")
    protected OrchestrationGlobalAllOfOrchestrationPath1 orchestrationPath;


}
