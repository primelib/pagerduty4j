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
 * CreateAutomationActionInvocationRequestInvocationMetadata
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
    "incident_id"
})
@JsonTypeName("createAutomationActionInvocation_request_invocation_metadata")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateAutomationActionInvocationRequestInvocationMetadata {

    @JsonProperty("incident_id")
    protected String incidentId;

    /**
     * Constructs a validated instance of {@link CreateAutomationActionInvocationRequestInvocationMetadata}.
     *
     * @param spec the specification to process
     */
    public CreateAutomationActionInvocationRequestInvocationMetadata(Consumer<CreateAutomationActionInvocationRequestInvocationMetadata> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateAutomationActionInvocationRequestInvocationMetadata}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateAutomationActionInvocationRequestInvocationMetadata(Consumer)} instead.
     * @param incidentId var.name
     */
    @ApiStatus.Internal
    public CreateAutomationActionInvocationRequestInvocationMetadata(String incidentId) {
        this.incidentId = incidentId;
    }

}
