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
 * CreateEscalationPolicyRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "escalation_policy"
})
@JsonTypeName("createEscalationPolicy_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateEscalationPolicyRequest {

    /**
     * Constructs a validated implementation of {@link CreateEscalationPolicyRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateEscalationPolicyRequest(Consumer<CreateEscalationPolicyRequest> spec) {
        spec.accept(this);
    }

    @JsonProperty("escalation_policy")
    protected EscalationPolicy escalationPolicy;


}
