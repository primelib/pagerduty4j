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
 * CreateIncidentWorkflowInstance201Response
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
@JsonTypeName("createIncidentWorkflowInstance_201_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateIncidentWorkflowInstance201Response {

    @JsonProperty("incident_workflow_instance")
    protected IncidentWorkflowInstance incidentWorkflowInstance;

    /**
     * Constructs a validated instance of {@link CreateIncidentWorkflowInstance201Response}.
     *
     * @param spec the specification to process
     */
    public CreateIncidentWorkflowInstance201Response(Consumer<CreateIncidentWorkflowInstance201Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateIncidentWorkflowInstance201Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateIncidentWorkflowInstance201Response(Consumer)} instead.
     * @param incidentWorkflowInstance incidentWorkflowInstance
     */
    @ApiStatus.Internal
    public CreateIncidentWorkflowInstance201Response(IncidentWorkflowInstance incidentWorkflowInstance) {
        this.incidentWorkflowInstance = incidentWorkflowInstance;
    }

}
