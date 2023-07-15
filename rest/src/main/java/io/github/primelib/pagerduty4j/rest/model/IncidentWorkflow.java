package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
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
     * A descriptive name for the Incident Workflow
     */
    @JsonProperty("name")
    private String name;

    /**
     * A description of what the Incident Workflow does
     */
    @JsonProperty("description")
    private String description;

    /**
     * The timestamp this Incident Workflow was created
     */
    @JsonProperty("created_at")
    private OffsetDateTime createdAt;

    @JsonProperty("team")
    private IncidentWorkflowAllOfTeam team;

    /**
     * The ordered list of steps that execute sequentially as part of the workflow
     */
    @JsonProperty("steps")
    private List<IncidentWorkflowAllOfStepsInner> steps;


    @AllArgsConstructor
    public enum TypeEnum {
        INCIDENT_WORKFLOW("incident_workflow");

        private final String value;
    }

}
