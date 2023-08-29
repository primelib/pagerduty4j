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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * IncidentWorkflowTriggerAllOfWorkflow
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
    "type",
    "name",
    "self",
    "html_url"
})
@JsonTypeName("IncidentWorkflowTrigger_allOf_workflow")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncidentWorkflowTriggerAllOfWorkflow {

    @JsonProperty("id")
    protected String id;

    /**
     * A string that determines the schema of the object. This must be the standard name for the entity, suffixed by {@code _reference} if the object is a reference.
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
     * Constructs a validated instance of {@link IncidentWorkflowTriggerAllOfWorkflow}.
     *
     * @param spec the specification to process
     */
    public IncidentWorkflowTriggerAllOfWorkflow(Consumer<IncidentWorkflowTriggerAllOfWorkflow> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IncidentWorkflowTriggerAllOfWorkflow}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IncidentWorkflowTriggerAllOfWorkflow(Consumer)} instead.
     * @param id id
     * @param type A string that determines the schema of the object. This must be the standard name for the entity, suffixed by {@code _reference} if the object is a reference.
     * @param name A descriptive name for the Incident Workflow
     * @param self the API show URL at which the object is accessible
     * @param htmlUrl a URL at which the entity is uniquely displayed in the Web app
     */
    @ApiStatus.Internal
    public IncidentWorkflowTriggerAllOfWorkflow(String id, TypeEnum type, String name, String self, String htmlUrl) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.self = self;
        this.htmlUrl = htmlUrl;
    }

    /**
     * A string that determines the schema of the object. This must be the standard name for the entity, suffixed by {@code _reference} if the object is a reference.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        WORKFLOW_REFERENCE("workflow_reference");

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

}
