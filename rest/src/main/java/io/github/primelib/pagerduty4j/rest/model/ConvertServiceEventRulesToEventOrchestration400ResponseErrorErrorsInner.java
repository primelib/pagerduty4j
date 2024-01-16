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
 * ConvertServiceEventRulesToEventOrchestration400ResponseErrorErrorsInner
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
    "rule_id",
    "position",
    "messages"
})
@JsonTypeName("convertServiceEventRulesToEventOrchestration_400_response_error_errors_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ConvertServiceEventRulesToEventOrchestration400ResponseErrorErrorsInner {

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

    /**
     * Constructs a validated instance of {@link ConvertServiceEventRulesToEventOrchestration400ResponseErrorErrorsInner}.
     *
     * @param spec the specification to process
     */
    public ConvertServiceEventRulesToEventOrchestration400ResponseErrorErrorsInner(Consumer<ConvertServiceEventRulesToEventOrchestration400ResponseErrorErrorsInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ConvertServiceEventRulesToEventOrchestration400ResponseErrorErrorsInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ConvertServiceEventRulesToEventOrchestration400ResponseErrorErrorsInner(Consumer)} instead.
     * @param ruleId The ID of the Service Event Rule that couldn't be successfully converted.
     * @param position The position of the Service Event Rule that couldn't be successfully converted.
     * @param messages Human friendly explanations of why this Event Rule couldn't be converted into an equivalent Event Orchestration Rule.
     */
    @ApiStatus.Internal
    public ConvertServiceEventRulesToEventOrchestration400ResponseErrorErrorsInner(String ruleId, Integer position, List<String> messages) {
        this.ruleId = ruleId;
        this.position = position;
        this.messages = messages;
    }

}
