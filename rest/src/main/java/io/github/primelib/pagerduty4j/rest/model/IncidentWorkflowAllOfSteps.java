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
 * IncidentWorkflowAllOfSteps
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
    "name",
    "description",
    "action_configuration"
})
@JsonTypeName("IncidentWorkflow_allOf_steps")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncidentWorkflowAllOfSteps {

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
     * A descriptive name for the Step
     */
    @JsonProperty("name")
    protected String name;

    /**
     * A description of the action performed by the Step
     */
    @JsonProperty("description")
    protected String description;

    @JsonProperty("action_configuration")
    protected IncidentWorkflowActionConfiguration actionConfiguration;

    /**
     * Constructs a validated instance of {@link IncidentWorkflowAllOfSteps}.
     *
     * @param spec the specification to process
     */
    public IncidentWorkflowAllOfSteps(Consumer<IncidentWorkflowAllOfSteps> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IncidentWorkflowAllOfSteps}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IncidentWorkflowAllOfSteps(Consumer)} instead.
     * @param id id
     * @param summary A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to {@code name}, though it is not intended to be an identifier.
     * @param type type
     * @param self the API show URL at which the object is accessible
     * @param htmlUrl a URL at which the entity is uniquely displayed in the Web app
     * @param name A descriptive name for the Step
     * @param description A description of the action performed by the Step
     * @param actionConfiguration actionConfiguration
     */
    @ApiStatus.Internal
    public IncidentWorkflowAllOfSteps(String id, String summary, TypeEnum type, String self, String htmlUrl, String name, String description, IncidentWorkflowActionConfiguration actionConfiguration) {
        this.id = id;
        this.summary = summary;
        this.type = type;
        this.self = self;
        this.htmlUrl = htmlUrl;
        this.name = name;
        this.description = description;
        this.actionConfiguration = actionConfiguration;
    }

    @AllArgsConstructor
    public enum TypeEnum {
        STEP("step");

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
