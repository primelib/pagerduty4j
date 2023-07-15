package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IncidentWorkflowTrigger
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
    "trigger_type_name",
    "trigger_type",
    "condition",
    "trigger_url",
    "workflow",
    "services",
    "is_subscribed_to_all_services",
    "permissions"
})
@JsonTypeName("IncidentWorkflowTrigger")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncidentWorkflowTrigger {

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
     * Human readable name for the trigger type
     */
    @JsonProperty("trigger_type_name")
    private String triggerTypeName;

    @JsonProperty("trigger_type")
    private TriggerTypeEnum triggerType;

    /**
     * A PCL condition string.
     * If specified, the trigger will execute when the condition is met on an incident.
     * If unspecified, the trigger will execute on incident creation.
     * Required if trigger_type is “conditional”, not allowed if trigger_type is “manual”. 
     */
    @JsonProperty("condition")
    private String condition;

    @JsonProperty("trigger_url")
    private String triggerUrl;

    @JsonProperty("workflow")
    private IncidentWorkflowTriggerAllOfWorkflow workflow;

    /**
     * An optional array of Services associated with this workflow. Incidents in any of the listed Services are eligible to fire this Trigger
     */
    @JsonProperty("services")
    private List<IncidentWorkflowTriggerAllOfServices> services;

    /**
     * Indicates that the Trigger should be associated with All Services
     */
    @JsonProperty("is_subscribed_to_all_services")
    private Boolean isSubscribedToAllServices;

    @JsonProperty("permissions")
    private IncidentWorkflowTriggerAllOfPermissions permissions;


    @AllArgsConstructor
    public enum TypeEnum {
        WORKFLOW_TRIGGER("workflow_trigger");

        private final String value;
    }

    @AllArgsConstructor
    public enum TriggerTypeEnum {
        CONDITIONAL("conditional"),
        MANUAL("manual");

        private final String value;
    }

}
