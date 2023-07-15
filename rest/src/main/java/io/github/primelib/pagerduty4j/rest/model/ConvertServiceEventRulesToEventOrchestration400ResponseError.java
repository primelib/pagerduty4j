package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConvertServiceEventRulesToEventOrchestration400ResponseError
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "message",
    "errors"
})
@JsonTypeName("convertServiceEventRulesToEventOrchestration_400_response_error")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ConvertServiceEventRulesToEventOrchestration400ResponseError {

    /**
     * Constructs a validated implementation of {@link ConvertServiceEventRulesToEventOrchestration400ResponseError}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ConvertServiceEventRulesToEventOrchestration400ResponseError(Consumer<ConvertServiceEventRulesToEventOrchestration400ResponseError> spec) {
        spec.accept(this);
    }

    /**
     * Error message string
     */
    @JsonProperty("message")
    protected String message;

    @JsonProperty("errors")
    protected List<ConvertServiceEventRulesToEventOrchestration400ResponseErrorErrorsInner> errors;


}
