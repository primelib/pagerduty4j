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
 * AutomationActionsInvocationAllOfMetadata
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "agent",
    "incident"
})
@JsonTypeName("AutomationActionsInvocation_allOf_metadata")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AutomationActionsInvocationAllOfMetadata {

    /**
     * Constructs a validated implementation of {@link AutomationActionsInvocationAllOfMetadata}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AutomationActionsInvocationAllOfMetadata(Consumer<AutomationActionsInvocationAllOfMetadata> spec) {
        spec.accept(this);
    }

    @JsonProperty("agent")
    protected AutomationActionsInvocationAllOfMetadataAgent agent;

    @JsonProperty("incident")
    protected IncidentReference incident;


}
