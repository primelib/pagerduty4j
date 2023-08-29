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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConvertServiceEventRulesToEventOrchestration400ResponseError
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
    "message",
    "errors"
})
@JsonTypeName("convertServiceEventRulesToEventOrchestration_400_response_error")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ConvertServiceEventRulesToEventOrchestration400ResponseError {

    /**
     * Error message string
     */
    @JsonProperty("message")
    protected String message;

    @JsonProperty("errors")
    protected List<ConvertServiceEventRulesToEventOrchestration400ResponseErrorErrorsInner> errors;

    /**
     * Constructs a validated instance of {@link ConvertServiceEventRulesToEventOrchestration400ResponseError}.
     *
     * @param spec the specification to process
     */
    public ConvertServiceEventRulesToEventOrchestration400ResponseError(Consumer<ConvertServiceEventRulesToEventOrchestration400ResponseError> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ConvertServiceEventRulesToEventOrchestration400ResponseError}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ConvertServiceEventRulesToEventOrchestration400ResponseError(Consumer)} instead.
     * @param message Error message string
     * @param errors errors
     */
    @ApiStatus.Internal
    public ConvertServiceEventRulesToEventOrchestration400ResponseError(String message, List<ConvertServiceEventRulesToEventOrchestration400ResponseErrorErrorsInner> errors) {
        this.message = message;
        this.errors = errors;
    }

}
