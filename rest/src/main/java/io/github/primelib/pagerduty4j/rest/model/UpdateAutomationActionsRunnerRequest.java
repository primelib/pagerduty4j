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
 * UpdateAutomationActionsRunnerRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "runner"
})
@JsonTypeName("updateAutomationActionsRunner_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateAutomationActionsRunnerRequest {

    /**
     * Constructs a validated implementation of {@link UpdateAutomationActionsRunnerRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateAutomationActionsRunnerRequest(Consumer<UpdateAutomationActionsRunnerRequest> spec) {
        spec.accept(this);
    }

    @JsonProperty("runner")
    protected UpdateAutomationActionsRunnerRequestRunner runner;


}
