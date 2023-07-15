package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IncidentWorkflowAction
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
    "domain_name",
    "package_name",
    "function_name",
    "version",
    "name",
    "description",
    "action_type",
    "trigger_type",
    "tags",
    "search_keywords",
    "metadata",
    "created_at",
    "created_by_user_id",
    "inputs",
    "outputs"
})
@JsonTypeName("IncidentWorkflowAction")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncidentWorkflowAction {

    /**
     * Constructs a validated implementation of {@link IncidentWorkflowAction}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IncidentWorkflowAction(Consumer<IncidentWorkflowAction> spec) {
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
     * The Verified Domain of the account that created the action
     */
    @JsonProperty("domain_name")
    protected String domainName;

    /**
     * The Package Name corresponding to the broad category of the Action
     */
    @JsonProperty("package_name")
    protected String packageName;

    /**
     * The Function Name describing the specific functionality of the Action
     */
    @JsonProperty("function_name")
    protected String functionName;

    /**
     * The version of the Action
     */
    @JsonProperty("version")
    protected BigDecimal version;

    /**
     * The descriptive name of the Action
     */
    @JsonProperty("name")
    protected String name;

    /**
     * A description of the Action
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The type of Action
     */
    @JsonProperty("action_type")
    protected ActionTypeEnum actionType;

    /**
     * The type of Trigger this Action is, if action_type is trigger
     */
    @JsonProperty("trigger_type")
    protected TriggerTypeEnum triggerType;

    /**
     * A set of tags to apply to this action.
     */
    @JsonProperty("tags")
    protected List<String> tags;

    /**
     * A set of search keywords to apply to this action.
     */
    @JsonProperty("search_keywords")
    protected List<String> searchKeywords;

    /**
     * JSON-formatted string of metadata pertaining to the Action
     */
    @JsonProperty("metadata")
    protected String metadata;

    /**
     * The date-time at which this Action was created
     */
    @JsonProperty("created_at")
    protected OffsetDateTime createdAt;

    /**
     * The obfuscated Id of the User who created this Action
     */
    @JsonProperty("created_by_user_id")
    protected String createdByUserId;

    /**
     * Inputs whose values used during Action execution
     */
    @JsonProperty("inputs")
    protected List<IncidentWorkflowActionAllOfInputs> inputs;

    /**
     * Outputs whose values set during Action execution
     */
    @JsonProperty("outputs")
    protected List<IncidentWorkflowActionAllOfOutputs> outputs;


    @AllArgsConstructor
    public enum TypeEnum {
        ACTION("action");

        private final String value;
    }

    /**
     * The type of Action
     */
    @AllArgsConstructor
    public enum ActionTypeEnum {
        ACTION("action"),
        TRIGGER("trigger");

        private final String value;
    }

    /**
     * The type of Trigger this Action is, if action_type is trigger
     */
    @AllArgsConstructor
    public enum TriggerTypeEnum {
        POLLING("polling"),
        SUBSCRIPTION("subscription"),
        WEB("web");

        private final String value;
    }

}
