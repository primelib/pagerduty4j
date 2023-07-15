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
 * AssociateServiceToIncidentWorkflowTriggerRequestService
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id"
})
@JsonTypeName("associateServiceToIncidentWorkflowTrigger_request_service")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AssociateServiceToIncidentWorkflowTriggerRequestService {

    /**
     * Constructs a validated implementation of {@link AssociateServiceToIncidentWorkflowTriggerRequestService}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AssociateServiceToIncidentWorkflowTriggerRequestService(Consumer<AssociateServiceToIncidentWorkflowTriggerRequestService> spec) {
        spec.accept(this);
    }

    @JsonProperty("id")
    protected String id;


}
