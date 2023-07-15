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
 * CreateIncidentWorkflowInstanceRequestIncidentWorkflowInstance
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "incident"
})
@JsonTypeName("createIncidentWorkflowInstance_request_incident_workflow_instance")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateIncidentWorkflowInstanceRequestIncidentWorkflowInstance {

    /**
     * Constructs a validated implementation of {@link CreateIncidentWorkflowInstanceRequestIncidentWorkflowInstance}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateIncidentWorkflowInstanceRequestIncidentWorkflowInstance(Consumer<CreateIncidentWorkflowInstanceRequestIncidentWorkflowInstance> spec) {
        spec.accept(this);
    }

    @JsonProperty("incident")
    protected CreateIncidentWorkflowInstanceRequestIncidentWorkflowInstanceIncident incident;


}
