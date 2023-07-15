package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
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
    private String ruleId;

    /**
     * The position of the Service Event Rule that couldn't be successfully converted.
     */
    @JsonProperty("position")
    private Integer position;

    /**
     * Human friendly explanations of why this Event Rule couldn't be converted into an equivalent Event Orchestration Rule.
     */
    @JsonProperty("messages")
    private List<String> messages;


}
