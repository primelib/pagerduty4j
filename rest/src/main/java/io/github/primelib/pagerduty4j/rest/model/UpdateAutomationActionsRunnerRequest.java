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
 * UpdateAutomationActionsRunnerRequest
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
    "runner"
})
@JsonTypeName("updateAutomationActionsRunner_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateAutomationActionsRunnerRequest {

    @JsonProperty("runner")
    protected UpdateAutomationActionsRunnerRequestRunner runner;

    /**
     * Constructs a validated instance of {@link UpdateAutomationActionsRunnerRequest}.
     *
     * @param spec the specification to process
     */
    public UpdateAutomationActionsRunnerRequest(Consumer<UpdateAutomationActionsRunnerRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UpdateAutomationActionsRunnerRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UpdateAutomationActionsRunnerRequest(Consumer)} instead.
     * @param runner runner
     */
    @ApiStatus.Internal
    public UpdateAutomationActionsRunnerRequest(UpdateAutomationActionsRunnerRequestRunner runner) {
        this.runner = runner;
    }

}
