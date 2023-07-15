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
 * AutomationActionsScriptActionWithTeams
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
    "action_type",
    "action_classification",
    "runner",
    "runner_type",
    "services",
    "privileges",
    "metadata",
    "creation_time",
    "modify_time",
    "last_run",
    "last_run_by",
    "action_data_reference",
    "teams"
})
@JsonTypeName("AutomationActionsScriptActionWithTeams")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AutomationActionsScriptActionWithTeams {

    @JsonProperty("id")
    private String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
     */
    @JsonProperty("summary")
    private String summary;

    /**
     * A string that determines the schema of the object. This must be the standard name for the entity, suffixed by `_reference` if the object is a reference.
     */
    @JsonProperty("type")
    private String type;

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

    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    @JsonProperty("action_type")
    private ActionTypeEnum actionType;

    @JsonProperty("action_classification")
    private AutomationActionsActionClassificationEnum actionClassification;

    @JsonProperty("runner")
    private String runner;

    @JsonProperty("runner_type")
    private AutomationActionsRunnerTypeEnum runnerType;

    @JsonProperty("services")
    private List<ServiceReference> services;

    @JsonProperty("privileges")
    private AutomationActionsUserPermissions privileges;

    @JsonProperty("metadata")
    private Object metadata;

    /**
     * The date/time
     */
    @JsonProperty("creation_time")
    private OffsetDateTime creationTime;

    /**
     * The date/time
     */
    @JsonProperty("modify_time")
    private OffsetDateTime modifyTime;

    /**
     * The date/time
     */
    @JsonProperty("last_run")
    private OffsetDateTime lastRun;

    @JsonProperty("last_run_by")
    private AutomationActionsAbstractActionAllOfLastRunBy lastRunBy;

    @JsonProperty("action_data_reference")
    private AutomationActionsScriptActionDataReference actionDataReference;

    @JsonProperty("teams")
    private List<TeamReference> teams;


    @AllArgsConstructor
    public enum ActionTypeEnum {
        SCRIPT("script"),
        PROCESS_AUTOMATION("process_automation");

        private final String value;
    }

}
