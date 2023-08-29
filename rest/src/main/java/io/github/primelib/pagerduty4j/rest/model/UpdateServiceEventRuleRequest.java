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
 * UpdateServiceEventRuleRequest
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
    "rule",
    "rule_id"
})
@JsonTypeName("updateServiceEventRule_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateServiceEventRuleRequest {

    @JsonProperty("rule")
    protected ServiceEventRule rule;

    /**
     * The id of the Event Rule to update on the Service.
     */
    @JsonProperty("rule_id")
    protected String ruleId;

    /**
     * Constructs a validated instance of {@link UpdateServiceEventRuleRequest}.
     *
     * @param spec the specification to process
     */
    public UpdateServiceEventRuleRequest(Consumer<UpdateServiceEventRuleRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UpdateServiceEventRuleRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UpdateServiceEventRuleRequest(Consumer)} instead.
     * @param rule rule
     * @param ruleId The id of the Event Rule to update on the Service.
     */
    @ApiStatus.Internal
    public UpdateServiceEventRuleRequest(ServiceEventRule rule, String ruleId) {
        this.rule = rule;
        this.ruleId = ruleId;
    }

}
