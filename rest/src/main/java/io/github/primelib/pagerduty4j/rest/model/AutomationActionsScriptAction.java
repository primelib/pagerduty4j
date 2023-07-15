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
 * AutomationActionsScriptAction
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
    "action_data_reference"
})
@JsonTypeName("AutomationActionsScriptAction")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AutomationActionsScriptAction {

    /**
     * Constructs a validated implementation of {@link AutomationActionsScriptAction}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AutomationActionsScriptAction(Consumer<AutomationActionsScriptAction> spec) {
        spec.accept(this);
    }

    @JsonProperty("id")
    protected String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
     */
    @JsonProperty("summary")
    protected String summary;

    /**
     * A string that determines the schema of the object. This must be the standard name for the entity, suffixed by `_reference` if the object is a reference.
     */
    @JsonProperty("type")
    protected String type;

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

    @JsonProperty("name")
    protected String name;

    @JsonProperty("description")
    protected String description;

    @JsonProperty("action_type")
    protected ActionTypeEnum actionType;

    @JsonProperty("action_classification")
    protected AutomationActionsActionClassificationEnum actionClassification;

    @JsonProperty("runner")
    protected String runner;

    @JsonProperty("runner_type")
    protected AutomationActionsRunnerTypeEnum runnerType;

    @JsonProperty("services")
    protected List<ServiceReference> services;

    @JsonProperty("privileges")
    protected AutomationActionsUserPermissions privileges;

    @JsonProperty("metadata")
    protected Object metadata;

    /**
     * The date/time
     */
    @JsonProperty("creation_time")
    protected OffsetDateTime creationTime;

    /**
     * The date/time
     */
    @JsonProperty("modify_time")
    protected OffsetDateTime modifyTime;

    /**
     * The date/time
     */
    @JsonProperty("last_run")
    protected OffsetDateTime lastRun;

    @JsonProperty("last_run_by")
    protected AutomationActionsAbstractActionAllOfLastRunBy lastRunBy;

    @JsonProperty("action_data_reference")
    protected AutomationActionsScriptActionDataReference actionDataReference;


    @AllArgsConstructor
    public enum ActionTypeEnum {
        SCRIPT("script"),
        PROCESS_AUTOMATION("process_automation");

        private final String value;
    }

}
