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

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * IncidentWorkflowAction
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

    /**
     * Constructs a validated instance of {@link IncidentWorkflowAction}.
     *
     * @param spec the specification to process
     */
    public IncidentWorkflowAction(Consumer<IncidentWorkflowAction> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IncidentWorkflowAction}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IncidentWorkflowAction(Consumer)} instead.
     * @param id var.name
     * @param summary A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to {@code name}, though it is not intended to be an identifier.
     * @param type var.name
     * @param self the API show URL at which the object is accessible
     * @param htmlUrl a URL at which the entity is uniquely displayed in the Web app
     * @param domainName The Verified Domain of the account that created the action
     * @param packageName The Package Name corresponding to the broad category of the Action
     * @param functionName The Function Name describing the specific functionality of the Action
     * @param version The version of the Action
     * @param name The descriptive name of the Action
     * @param description A description of the Action
     * @param actionType The type of Action
     * @param triggerType The type of Trigger this Action is, if action_type is trigger
     * @param tags A set of tags to apply to this action.
     * @param searchKeywords A set of search keywords to apply to this action.
     * @param metadata JSON-formatted string of metadata pertaining to the Action
     * @param createdAt The date-time at which this Action was created
     * @param createdByUserId The obfuscated Id of the User who created this Action
     * @param inputs Inputs whose values used during Action execution
     * @param outputs Outputs whose values set during Action execution
     */
    @ApiStatus.Internal
    public IncidentWorkflowAction(String id, String summary, TypeEnum type, String self, String htmlUrl, String domainName, String packageName, String functionName, BigDecimal version, String name, String description, ActionTypeEnum actionType, TriggerTypeEnum triggerType, List<String> tags, List<String> searchKeywords, String metadata, OffsetDateTime createdAt, String createdByUserId, List<IncidentWorkflowActionAllOfInputs> inputs, List<IncidentWorkflowActionAllOfOutputs> outputs) {
        this.id = id;
        this.summary = summary;
        this.type = type;
        this.self = self;
        this.htmlUrl = htmlUrl;
        this.domainName = domainName;
        this.packageName = packageName;
        this.functionName = functionName;
        this.version = version;
        this.name = name;
        this.description = description;
        this.actionType = actionType;
        this.triggerType = triggerType;
        this.tags = tags;
        this.searchKeywords = searchKeywords;
        this.metadata = metadata;
        this.createdAt = createdAt;
        this.createdByUserId = createdByUserId;
        this.inputs = inputs;
        this.outputs = outputs;
    }

    @AllArgsConstructor
    public enum TypeEnum {
        ACTION("action");

        private static final TypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static TypeEnum of(String input) {
            if (input != null) {
                for (TypeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

    /**
     * The type of Action
     */
    @AllArgsConstructor
    public enum ActionTypeEnum {
        ACTION("action"),
        TRIGGER("trigger");

        private static final ActionTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static ActionTypeEnum of(String input) {
            if (input != null) {
                for (ActionTypeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

    /**
     * The type of Trigger this Action is, if action_type is trigger
     */
    @AllArgsConstructor
    public enum TriggerTypeEnum {
        POLLING("polling"),
        SUBSCRIPTION("subscription"),
        WEB("web");

        private static final TriggerTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static TriggerTypeEnum of(String input) {
            if (input != null) {
                for (TriggerTypeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
