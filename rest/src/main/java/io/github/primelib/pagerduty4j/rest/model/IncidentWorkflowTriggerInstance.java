package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IncidentWorkflowTriggerInstance
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "id",
    "summary",
    "type",
    "self",
    "html_url",
    "name",
    "description",
    "status",
    "started_at",
    "ended_at",
    "workflow"
})
@JsonTypeName("IncidentWorkflowTriggerInstance")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncidentWorkflowTriggerInstance {

    @JsonProperty("id")
    private String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
     */
    @JsonProperty("summary")
    private String summary;

    @JsonProperty("type")
    private TypeEnum type;

    /**
     * the API show URL at which the object is accessible
     */
    @JsonProperty("self")
    private String self;

    /**
     * a URL at which the entity is uniquely displayed in the Web app
     */
    @JsonProperty("html_url")
    private String htmlUrl;

    /**
     * A descriptive name for the Incident Workflow Instance
     */
    @JsonProperty("name")
    private String name;

    /**
     * A description of what the Incident Workflow does
     */
    @JsonProperty("description")
    private String description;

    /**
     * The current status of the Incident Workflow Instance
     */
    @JsonProperty("status")
    private StatusEnum status;

    /**
     * The timestamp this Incident Workflow started
     */
    @JsonProperty("started_at")
    private OffsetDateTime startedAt;

    /**
     * The timestamp this Incident Workflow ended
     */
    @JsonProperty("ended_at")
    private OffsetDateTime endedAt;

    @JsonProperty("workflow")
    private IncidentWorkflowTriggerInstanceAllOfWorkflow workflow;


    @AllArgsConstructor
    public enum TypeEnum {
        INCIDENT_WORKFLOW_INSTANCE("incident_workflow_instance");

        private final String value;
    }

    /**
     * The current status of the Incident Workflow Instance
     */
    @AllArgsConstructor
    public enum StatusEnum {
        COMPLETED("completed"),
        RUNNING("running"),
        QUEUED("queued");

        private final String value;
    }

}
