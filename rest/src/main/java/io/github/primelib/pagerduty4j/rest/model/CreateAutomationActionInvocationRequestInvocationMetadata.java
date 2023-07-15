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
 * CreateAutomationActionInvocationRequestInvocationMetadata
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "incident_id"
})
@JsonTypeName("createAutomationActionInvocation_request_invocation_metadata")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateAutomationActionInvocationRequestInvocationMetadata {

    /**
     * Constructs a validated implementation of {@link CreateAutomationActionInvocationRequestInvocationMetadata}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateAutomationActionInvocationRequestInvocationMetadata(Consumer<CreateAutomationActionInvocationRequestInvocationMetadata> spec) {
        spec.accept(this);
    }

    @JsonProperty("incident_id")
    protected String incidentId;


}
