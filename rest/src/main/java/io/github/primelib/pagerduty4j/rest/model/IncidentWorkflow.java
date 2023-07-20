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
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IncidentWorkflow
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
    "created_at",
    "team",
    "steps"
})
@JsonTypeName("IncidentWorkflow")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncidentWorkflow {

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
     * A descriptive name for the Incident Workflow
     */
    @JsonProperty("name")
    protected String name;

    /**
     * A description of what the Incident Workflow does
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The timestamp this Incident Workflow was created
     */
    @JsonProperty("created_at")
    protected OffsetDateTime createdAt;

    @JsonProperty("team")
    protected IncidentWorkflowAllOfTeam team;

    /**
     * The ordered list of steps that execute sequentially as part of the workflow
     */
    @JsonProperty("steps")
    protected List<IncidentWorkflowAllOfStepsInner> steps;

    /**
     * Constructs a validated instance of {@link IncidentWorkflow}.
     *
     * @param spec the specification to process
     */
    public IncidentWorkflow(Consumer<IncidentWorkflow> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IncidentWorkflow}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IncidentWorkflow(Consumer)} instead.
     * @param id var.name
     * @param summary A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to {@code name}, though it is not intended to be an identifier.
     * @param type var.name
     * @param self the API show URL at which the object is accessible
     * @param htmlUrl a URL at which the entity is uniquely displayed in the Web app
     * @param name A descriptive name for the Incident Workflow
     * @param description A description of what the Incident Workflow does
     * @param createdAt The timestamp this Incident Workflow was created
     * @param team var.name
     * @param steps The ordered list of steps that execute sequentially as part of the workflow
     */
    @ApiStatus.Internal
    public IncidentWorkflow(String id, String summary, TypeEnum type, String self, String htmlUrl, String name, String description, OffsetDateTime createdAt, IncidentWorkflowAllOfTeam team, List<IncidentWorkflowAllOfStepsInner> steps) {
        this.id = id;
        this.summary = summary;
        this.type = type;
        this.self = self;
        this.htmlUrl = htmlUrl;
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
        this.team = team;
        this.steps = steps;
    }

    @AllArgsConstructor
    public enum TypeEnum {
        INCIDENT_WORKFLOW("incident_workflow");

        private final String value;
    }

}
