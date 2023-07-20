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
 * CreateServiceEventRuleRequest
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
    "rule"
})
@JsonTypeName("createServiceEventRule_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateServiceEventRuleRequest {

    @JsonProperty("rule")
    protected ServiceEventRule rule;

    /**
     * Constructs a validated instance of {@link CreateServiceEventRuleRequest}.
     *
     * @param spec the specification to process
     */
    public CreateServiceEventRuleRequest(Consumer<CreateServiceEventRuleRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateServiceEventRuleRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateServiceEventRuleRequest(Consumer)} instead.
     * @param rule var.name
     */
    @ApiStatus.Internal
    public CreateServiceEventRuleRequest(ServiceEventRule rule) {
        this.rule = rule;
    }

}
