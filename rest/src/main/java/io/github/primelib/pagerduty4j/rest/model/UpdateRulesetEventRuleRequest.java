package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateRulesetEventRuleRequest
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "rule",
    "rule_id"
})
@JsonTypeName("updateRulesetEventRule_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateRulesetEventRuleRequest {

    @JsonProperty("rule")
    private EventRule rule;

    /**
     * The id of the Event Rule to update.
     */
    @JsonProperty("rule_id")
    private String ruleId;


}
