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
 * CreateAutomationActionInvocationRequestInvocation
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
    "metadata"
})
@JsonTypeName("createAutomationActionInvocation_request_invocation")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateAutomationActionInvocationRequestInvocation {

    @JsonProperty("metadata")
    protected CreateAutomationActionInvocationRequestInvocationMetadata metadata;

    /**
     * Constructs a validated instance of {@link CreateAutomationActionInvocationRequestInvocation}.
     *
     * @param spec the specification to process
     */
    public CreateAutomationActionInvocationRequestInvocation(Consumer<CreateAutomationActionInvocationRequestInvocation> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateAutomationActionInvocationRequestInvocation}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateAutomationActionInvocationRequestInvocation(Consumer)} instead.
     * @param metadata var.name
     */
    @ApiStatus.Internal
    public CreateAutomationActionInvocationRequestInvocation(CreateAutomationActionInvocationRequestInvocationMetadata metadata) {
        this.metadata = metadata;
    }

}
