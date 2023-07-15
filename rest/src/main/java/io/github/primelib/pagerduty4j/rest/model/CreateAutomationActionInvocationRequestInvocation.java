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
 * CreateAutomationActionInvocationRequestInvocation
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "metadata"
})
@JsonTypeName("createAutomationActionInvocation_request_invocation")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateAutomationActionInvocationRequestInvocation {

    /**
     * Constructs a validated implementation of {@link CreateAutomationActionInvocationRequestInvocation}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateAutomationActionInvocationRequestInvocation(Consumer<CreateAutomationActionInvocationRequestInvocation> spec) {
        spec.accept(this);
    }

    @JsonProperty("metadata")
    protected CreateAutomationActionInvocationRequestInvocationMetadata metadata;


}
