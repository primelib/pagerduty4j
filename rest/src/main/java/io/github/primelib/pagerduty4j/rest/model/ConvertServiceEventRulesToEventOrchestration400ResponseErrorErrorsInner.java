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
 * ConvertServiceEventRulesToEventOrchestration400ResponseErrorErrorsInner
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "rule_id",
    "position",
    "messages"
})
@JsonTypeName("convertServiceEventRulesToEventOrchestration_400_response_error_errors_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ConvertServiceEventRulesToEventOrchestration400ResponseErrorErrorsInner {

    /**
     * Constructs a validated implementation of {@link ConvertServiceEventRulesToEventOrchestration400ResponseErrorErrorsInner}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ConvertServiceEventRulesToEventOrchestration400ResponseErrorErrorsInner(Consumer<ConvertServiceEventRulesToEventOrchestration400ResponseErrorErrorsInner> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the Service Event Rule that couldn't be successfully converted.
     */
    @JsonProperty("rule_id")
    protected String ruleId;

    /**
     * The position of the Service Event Rule that couldn't be successfully converted.
     */
    @JsonProperty("position")
    protected Integer position;

    /**
     * Human friendly explanations of why this Event Rule couldn't be converted into an equivalent Event Orchestration Rule.
     */
    @JsonProperty("messages")
    protected List<String> messages;


}
