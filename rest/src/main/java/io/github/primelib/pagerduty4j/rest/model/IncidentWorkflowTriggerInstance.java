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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IncidentWorkflowTriggerInstance
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
    protected String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to {@code name}, though it is not intended to be an identifier.
     */
    @JsonProperty("summary")
    protected String summary;

    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * the API show URL at which the object is accessible
     */
    @JsonProperty("self")
    protected String self;

    /**
     * a URL at which the entity is uniquely displayed in the Web app
     */
    @JsonProperty("html_url")
    protected String htmlUrl;

    /**
     * A descriptive name for the Incident Workflow Instance
     */
    @JsonProperty("name")
    protected String name;

    /**
     * A description of what the Incident Workflow does
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The current status of the Incident Workflow Instance
     */
    @JsonProperty("status")
    protected StatusEnum status;

    /**
     * The timestamp this Incident Workflow started
     */
    @JsonProperty("started_at")
    protected OffsetDateTime startedAt;

    /**
     * The timestamp this Incident Workflow ended
     */
    @JsonProperty("ended_at")
    protected OffsetDateTime endedAt;

    @JsonProperty("workflow")
    protected IncidentWorkflowTriggerInstanceAllOfWorkflow workflow;

    /**
     * Constructs a validated instance of {@link IncidentWorkflowTriggerInstance}.
     *
     * @param spec the specification to process
     */
    public IncidentWorkflowTriggerInstance(Consumer<IncidentWorkflowTriggerInstance> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IncidentWorkflowTriggerInstance}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IncidentWorkflowTriggerInstance(Consumer)} instead.
     * @param id var.name
     * @param summary A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to {@code name}, though it is not intended to be an identifier.
     * @param type var.name
     * @param self the API show URL at which the object is accessible
     * @param htmlUrl a URL at which the entity is uniquely displayed in the Web app
     * @param name A descriptive name for the Incident Workflow Instance
     * @param description A description of what the Incident Workflow does
     * @param status The current status of the Incident Workflow Instance
     * @param startedAt The timestamp this Incident Workflow started
     * @param endedAt The timestamp this Incident Workflow ended
     * @param workflow var.name
     */
    @ApiStatus.Internal
    public IncidentWorkflowTriggerInstance(String id, String summary, TypeEnum type, String self, String htmlUrl, String name, String description, StatusEnum status, OffsetDateTime startedAt, OffsetDateTime endedAt, IncidentWorkflowTriggerInstanceAllOfWorkflow workflow) {
        this.id = id;
        this.summary = summary;
        this.type = type;
        this.self = self;
        this.htmlUrl = htmlUrl;
        this.name = name;
        this.description = description;
        this.status = status;
        this.startedAt = startedAt;
        this.endedAt = endedAt;
        this.workflow = workflow;
    }

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
