package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateIncidentWorkflowInstanceRequestIncidentWorkflowInstanceIncident
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "type"
})
@JsonTypeName("createIncidentWorkflowInstance_request_incident_workflow_instance_incident")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateIncidentWorkflowInstanceRequestIncidentWorkflowInstanceIncident {

    @JsonProperty("type")
    private TypeEnum type;


    @AllArgsConstructor
    public enum TypeEnum {
        INCIDENT_REFERENCE("incident_reference");

        private final String value;
    }

}
