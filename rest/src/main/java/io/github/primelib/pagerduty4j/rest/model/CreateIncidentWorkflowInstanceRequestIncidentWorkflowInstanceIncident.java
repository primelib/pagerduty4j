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
 * CreateIncidentWorkflowInstanceRequestIncidentWorkflowInstanceIncident
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "type"
})
@JsonTypeName("createIncidentWorkflowInstance_request_incident_workflow_instance_incident")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateIncidentWorkflowInstanceRequestIncidentWorkflowInstanceIncident {

    /**
     * Constructs a validated implementation of {@link CreateIncidentWorkflowInstanceRequestIncidentWorkflowInstanceIncident}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateIncidentWorkflowInstanceRequestIncidentWorkflowInstanceIncident(Consumer<CreateIncidentWorkflowInstanceRequestIncidentWorkflowInstanceIncident> spec) {
        spec.accept(this);
    }

    @JsonProperty("type")
    protected TypeEnum type;


    @AllArgsConstructor
    public enum TypeEnum {
        INCIDENT_REFERENCE("incident_reference");

        private final String value;
    }

}
