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
 * PostIncidentWorkflowRequest
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
    "incident_workflow"
})
@JsonTypeName("postIncidentWorkflow_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PostIncidentWorkflowRequest {

    @JsonProperty("incident_workflow")
    protected IncidentWorkflow incidentWorkflow;

    /**
     * Constructs a validated instance of {@link PostIncidentWorkflowRequest}.
     *
     * @param spec the specification to process
     */
    public PostIncidentWorkflowRequest(Consumer<PostIncidentWorkflowRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PostIncidentWorkflowRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PostIncidentWorkflowRequest(Consumer)} instead.
     * @param incidentWorkflow var.name
     */
    @ApiStatus.Internal
    public PostIncidentWorkflowRequest(IncidentWorkflow incidentWorkflow) {
        this.incidentWorkflow = incidentWorkflow;
    }

}
