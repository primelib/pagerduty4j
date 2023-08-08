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
 * AutomationActionsInvocationAllOfMetadata
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
    "agent",
    "incident"
})
@JsonTypeName("AutomationActionsInvocation_allOf_metadata")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AutomationActionsInvocationAllOfMetadata {

    @JsonProperty("agent")
    protected AutomationActionsInvocationAllOfMetadataAgent agent;

    @JsonProperty("incident")
    protected IncidentReference incident;

    /**
     * Constructs a validated instance of {@link AutomationActionsInvocationAllOfMetadata}.
     *
     * @param spec the specification to process
     */
    public AutomationActionsInvocationAllOfMetadata(Consumer<AutomationActionsInvocationAllOfMetadata> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AutomationActionsInvocationAllOfMetadata}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AutomationActionsInvocationAllOfMetadata(Consumer)} instead.
     * @param agent agent
     * @param incident incident
     */
    @ApiStatus.Internal
    public AutomationActionsInvocationAllOfMetadata(AutomationActionsInvocationAllOfMetadataAgent agent, IncidentReference incident) {
        this.agent = agent;
        this.incident = incident;
    }

}
