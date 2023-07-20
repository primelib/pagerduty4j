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
 * CreateAutomationActionInvocationRequest
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
    "invocation"
})
@JsonTypeName("createAutomationActionInvocation_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateAutomationActionInvocationRequest {

    @JsonProperty("invocation")
    protected CreateAutomationActionInvocationRequestInvocation invocation;

    /**
     * Constructs a validated instance of {@link CreateAutomationActionInvocationRequest}.
     *
     * @param spec the specification to process
     */
    public CreateAutomationActionInvocationRequest(Consumer<CreateAutomationActionInvocationRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateAutomationActionInvocationRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateAutomationActionInvocationRequest(Consumer)} instead.
     * @param invocation var.name
     */
    @ApiStatus.Internal
    public CreateAutomationActionInvocationRequest(CreateAutomationActionInvocationRequestInvocation invocation) {
        this.invocation = invocation;
    }

}
