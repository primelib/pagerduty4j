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
 * CreateRulesetRequest
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
    "ruleset"
})
@JsonTypeName("createRuleset_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateRulesetRequest {

    @JsonProperty("ruleset")
    protected CreateRulesetRequestRuleset ruleset;

    /**
     * Constructs a validated instance of {@link CreateRulesetRequest}.
     *
     * @param spec the specification to process
     */
    public CreateRulesetRequest(Consumer<CreateRulesetRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateRulesetRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateRulesetRequest(Consumer)} instead.
     * @param ruleset ruleset
     */
    @ApiStatus.Internal
    public CreateRulesetRequest(CreateRulesetRequestRuleset ruleset) {
        this.ruleset = ruleset;
    }

}
