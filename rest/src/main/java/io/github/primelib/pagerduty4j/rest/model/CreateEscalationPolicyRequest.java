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
 * CreateEscalationPolicyRequest
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
    "escalation_policy"
})
@JsonTypeName("createEscalationPolicy_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateEscalationPolicyRequest {

    @JsonProperty("escalation_policy")
    protected EscalationPolicy escalationPolicy;

    /**
     * Constructs a validated instance of {@link CreateEscalationPolicyRequest}.
     *
     * @param spec the specification to process
     */
    public CreateEscalationPolicyRequest(Consumer<CreateEscalationPolicyRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateEscalationPolicyRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateEscalationPolicyRequest(Consumer)} instead.
     * @param escalationPolicy escalationPolicy
     */
    @ApiStatus.Internal
    public CreateEscalationPolicyRequest(EscalationPolicy escalationPolicy) {
        this.escalationPolicy = escalationPolicy;
    }

}
