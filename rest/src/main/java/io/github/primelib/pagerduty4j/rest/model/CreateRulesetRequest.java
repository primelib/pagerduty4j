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
 * CreateRulesetRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "ruleset"
})
@JsonTypeName("createRuleset_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateRulesetRequest {

    /**
     * Constructs a validated implementation of {@link CreateRulesetRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateRulesetRequest(Consumer<CreateRulesetRequest> spec) {
        spec.accept(this);
    }

    @JsonProperty("ruleset")
    protected CreateRulesetRequestRuleset ruleset;


}
