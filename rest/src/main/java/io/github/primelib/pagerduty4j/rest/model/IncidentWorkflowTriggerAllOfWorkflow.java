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
 * IncidentWorkflowTriggerAllOfWorkflow
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "type",
    "name",
    "self",
    "html_url"
})
@JsonTypeName("IncidentWorkflowTrigger_allOf_workflow")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncidentWorkflowTriggerAllOfWorkflow {

    /**
     * Constructs a validated implementation of {@link IncidentWorkflowTriggerAllOfWorkflow}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IncidentWorkflowTriggerAllOfWorkflow(Consumer<IncidentWorkflowTriggerAllOfWorkflow> spec) {
        spec.accept(this);
    }

    @JsonProperty("id")
    protected String id;

    /**
     * A string that determines the schema of the object. This must be the standard name for the entity, suffixed by `_reference` if the object is a reference.
     */
    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * A descriptive name for the Incident Workflow
     */
    @JsonProperty("name")
    protected String name;

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
     * A string that determines the schema of the object. This must be the standard name for the entity, suffixed by `_reference` if the object is a reference.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        WORKFLOW_REFERENCE("workflow_reference");

        private final String value;
    }

}
