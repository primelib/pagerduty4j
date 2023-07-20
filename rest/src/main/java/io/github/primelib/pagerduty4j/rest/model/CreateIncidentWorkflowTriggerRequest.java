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
 * CreateIncidentWorkflowTriggerRequest
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
    "trigger"
})
@JsonTypeName("createIncidentWorkflowTrigger_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateIncidentWorkflowTriggerRequest {

    @JsonProperty("trigger")
    protected IncidentWorkflowTrigger trigger;

    /**
     * Constructs a validated instance of {@link CreateIncidentWorkflowTriggerRequest}.
     *
     * @param spec the specification to process
     */
    public CreateIncidentWorkflowTriggerRequest(Consumer<CreateIncidentWorkflowTriggerRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateIncidentWorkflowTriggerRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateIncidentWorkflowTriggerRequest(Consumer)} instead.
     * @param trigger var.name
     */
    @ApiStatus.Internal
    public CreateIncidentWorkflowTriggerRequest(IncidentWorkflowTrigger trigger) {
        this.trigger = trigger;
    }

}
