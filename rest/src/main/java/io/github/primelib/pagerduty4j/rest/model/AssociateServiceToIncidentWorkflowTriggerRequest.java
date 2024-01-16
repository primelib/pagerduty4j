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
 * AssociateServiceToIncidentWorkflowTriggerRequest
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
    "service"
})
@JsonTypeName("associateServiceToIncidentWorkflowTrigger_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AssociateServiceToIncidentWorkflowTriggerRequest {

    @JsonProperty("service")
    protected AssociateServiceToIncidentWorkflowTriggerRequestService service;

    /**
     * Constructs a validated instance of {@link AssociateServiceToIncidentWorkflowTriggerRequest}.
     *
     * @param spec the specification to process
     */
    public AssociateServiceToIncidentWorkflowTriggerRequest(Consumer<AssociateServiceToIncidentWorkflowTriggerRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AssociateServiceToIncidentWorkflowTriggerRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AssociateServiceToIncidentWorkflowTriggerRequest(Consumer)} instead.
     * @param service service
     */
    @ApiStatus.Internal
    public AssociateServiceToIncidentWorkflowTriggerRequest(AssociateServiceToIncidentWorkflowTriggerRequestService service) {
        this.service = service;
    }

}
