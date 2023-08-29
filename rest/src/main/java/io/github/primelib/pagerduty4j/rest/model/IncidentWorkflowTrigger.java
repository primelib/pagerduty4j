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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * IncidentWorkflowTrigger
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
     * Human readable name for the trigger type
     */
    @JsonProperty("trigger_type_name")
    protected String triggerTypeName;

    @JsonProperty("trigger_type")
    protected TriggerTypeEnum triggerType;

    /**
     * A PCL condition string.
     * If specified, the trigger will execute when the condition is met on an incident.
     * If unspecified, the trigger will execute on incident creation.
     * Required if trigger_type is “conditional”, not allowed if trigger_type is “manual”. 
     */
    @JsonProperty("condition")
    protected String condition;

    @JsonProperty("trigger_url")
    protected String triggerUrl;

    @JsonProperty("workflow")
    protected IncidentWorkflowTriggerAllOfWorkflow workflow;

    /**
     * An optional array of Services associated with this workflow. Incidents in any of the listed Services are eligible to fire this Trigger
     */
    @JsonProperty("services")
    protected List<IncidentWorkflowTriggerAllOfServices> services;

    /**
     * Indicates that the Trigger should be associated with All Services
     */
    @JsonProperty("is_subscribed_to_all_services")
    protected Boolean isSubscribedToAllServices;

    @JsonProperty("permissions")
    protected IncidentWorkflowTriggerAllOfPermissions permissions;

    /**
     * Constructs a validated instance of {@link IncidentWorkflowTrigger}.
     *
     * @param spec the specification to process
     */
    public IncidentWorkflowTrigger(Consumer<IncidentWorkflowTrigger> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IncidentWorkflowTrigger}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IncidentWorkflowTrigger(Consumer)} instead.
     * @param id id
     * @param summary A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to {@code name}, though it is not intended to be an identifier.
     * @param type type
     * @param self the API show URL at which the object is accessible
     * @param htmlUrl a URL at which the entity is uniquely displayed in the Web app
     * @param triggerTypeName Human readable name for the trigger type
     * @param triggerType triggerType
     * @param condition A PCL condition string.  If specified, the trigger will execute when the condition is met on an incident.  If unspecified, the trigger will execute on incident creation.  Required if trigger_type is “conditional”, not allowed if trigger_type is “manual”. 
     * @param triggerUrl triggerUrl
     * @param workflow workflow
     * @param services An optional array of Services associated with this workflow. Incidents in any of the listed Services are eligible to fire this Trigger
     * @param isSubscribedToAllServices Indicates that the Trigger should be associated with All Services
     * @param permissions permissions
     */
    @ApiStatus.Internal
    public IncidentWorkflowTrigger(String id, String summary, TypeEnum type, String self, String htmlUrl, String triggerTypeName, TriggerTypeEnum triggerType, String condition, String triggerUrl, IncidentWorkflowTriggerAllOfWorkflow workflow, List<IncidentWorkflowTriggerAllOfServices> services, Boolean isSubscribedToAllServices, IncidentWorkflowTriggerAllOfPermissions permissions) {
        this.id = id;
        this.summary = summary;
        this.type = type;
        this.self = self;
        this.htmlUrl = htmlUrl;
        this.triggerTypeName = triggerTypeName;
        this.triggerType = triggerType;
        this.condition = condition;
        this.triggerUrl = triggerUrl;
        this.workflow = workflow;
        this.services = services;
        this.isSubscribedToAllServices = isSubscribedToAllServices;
        this.permissions = permissions;
    }

    @AllArgsConstructor
    public enum TypeEnum {
        WORKFLOW_TRIGGER("workflow_trigger");

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

    @AllArgsConstructor
    public enum TriggerTypeEnum {
        CONDITIONAL("conditional"),
        MANUAL("manual");

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
