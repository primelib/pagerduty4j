package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
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
     * The Verified Domain of the account that created the action
     */
    @JsonProperty("domain_name")
    private String domainName;

    /**
     * The Package Name corresponding to the broad category of the Action
     */
    @JsonProperty("package_name")
    private String packageName;

    /**
     * The Function Name describing the specific functionality of the Action
     */
    @JsonProperty("function_name")
    private String functionName;

    /**
     * The version of the Action
     */
    @JsonProperty("version")
    private BigDecimal version;

    /**
     * The descriptive name of the Action
     */
    @JsonProperty("name")
    private String name;

    /**
     * A description of the Action
     */
    @JsonProperty("description")
    private String description;

    /**
     * The type of Action
     */
    @JsonProperty("action_type")
    private ActionTypeEnum actionType;

    /**
     * The type of Trigger this Action is, if action_type is trigger
     */
    @JsonProperty("trigger_type")
    private TriggerTypeEnum triggerType;

    /**
     * A set of tags to apply to this action.
     */
    @JsonProperty("tags")
    private List<String> tags;

    /**
     * A set of search keywords to apply to this action.
     */
    @JsonProperty("search_keywords")
    private List<String> searchKeywords;

    /**
     * JSON-formatted string of metadata pertaining to the Action
     */
    @JsonProperty("metadata")
    private String metadata;

    /**
     * The date-time at which this Action was created
     */
    @JsonProperty("created_at")
    private OffsetDateTime createdAt;

    /**
     * The obfuscated Id of the User who created this Action
     */
    @JsonProperty("created_by_user_id")
    private String createdByUserId;

    /**
     * Inputs whose values used during Action execution
     */
    @JsonProperty("inputs")
    private List<IncidentWorkflowActionAllOfInputs> inputs;

    /**
     * Outputs whose values set during Action execution
     */
    @JsonProperty("outputs")
    private List<IncidentWorkflowActionAllOfOutputs> outputs;


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
