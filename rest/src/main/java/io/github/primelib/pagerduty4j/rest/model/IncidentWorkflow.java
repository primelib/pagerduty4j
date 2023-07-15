package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
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
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link IncidentWorkflow}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IncidentWorkflow(Consumer<IncidentWorkflow> spec) {
        spec.accept(this);
    }

    @JsonProperty("id")
    protected String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
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


    @AllArgsConstructor
    public enum TypeEnum {
        INCIDENT_WORKFLOW("incident_workflow");

        private final String value;
    }

}
