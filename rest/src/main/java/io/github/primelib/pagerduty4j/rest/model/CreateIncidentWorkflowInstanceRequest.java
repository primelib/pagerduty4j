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
 * CreateIncidentWorkflowInstanceRequest
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
    "incident_workflow_instance"
})
@JsonTypeName("createIncidentWorkflowInstance_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateIncidentWorkflowInstanceRequest {

    @JsonProperty("incident_workflow_instance")
    protected CreateIncidentWorkflowInstanceRequestIncidentWorkflowInstance incidentWorkflowInstance;

    /**
     * Constructs a validated instance of {@link CreateIncidentWorkflowInstanceRequest}.
     *
     * @param spec the specification to process
     */
    public CreateIncidentWorkflowInstanceRequest(Consumer<CreateIncidentWorkflowInstanceRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateIncidentWorkflowInstanceRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateIncidentWorkflowInstanceRequest(Consumer)} instead.
     * @param incidentWorkflowInstance var.name
     */
    @ApiStatus.Internal
    public CreateIncidentWorkflowInstanceRequest(CreateIncidentWorkflowInstanceRequestIncidentWorkflowInstance incidentWorkflowInstance) {
        this.incidentWorkflowInstance = incidentWorkflowInstance;
    }

}
