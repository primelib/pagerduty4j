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
 * UpdateRulesetEventRuleRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "rule",
    "rule_id"
})
@JsonTypeName("updateRulesetEventRule_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateRulesetEventRuleRequest {

    /**
     * Constructs a validated implementation of {@link UpdateRulesetEventRuleRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateRulesetEventRuleRequest(Consumer<UpdateRulesetEventRuleRequest> spec) {
        spec.accept(this);
    }

    @JsonProperty("rule")
    protected EventRule rule;

    /**
     * The id of the Event Rule to update.
     */
    @JsonProperty("rule_id")
    protected String ruleId;


}
