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
 * IncidentWorkflowActionAllOfInputs
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "name",
    "description",
    "type",
    "default_value",
    "is_required",
    "is_hidden",
    "advanced",
    "metadata",
    "connection_type_id"
})
@JsonTypeName("IncidentWorkflowAction_allOf_inputs")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncidentWorkflowActionAllOfInputs {

    /**
     * Constructs a validated implementation of {@link IncidentWorkflowActionAllOfInputs}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IncidentWorkflowActionAllOfInputs(Consumer<IncidentWorkflowActionAllOfInputs> spec) {
        spec.accept(this);
    }

    /**
     * The name of the Input
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Describes what the purpose of the Input
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The data type of this Input
     */
    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * Serialized form of the default value that the input will take
     */
    @JsonProperty("default_value")
    protected String defaultValue;

    /**
     * Whether a value must be provided for this input
     */
    @JsonProperty("is_required")
    protected Boolean isRequired;

    /**
     * If true then this input will not be shown to users when configuring this action
     */
    @JsonProperty("is_hidden")
    protected Boolean isHidden;

    @JsonProperty("advanced")
    protected Boolean advanced;

    @JsonProperty("metadata")
    protected String metadata;

    /**
     * The configured value of the Input
     */
    @JsonProperty("connection_type_id")
    protected String connectionTypeId;


    /**
     * The data type of this Input
     */
    @AllArgsConstructor
    public enum TypeEnum {
        TEXT("text"),
        PASSWORD("password"),
        INTEGER("integer"),
        DECIMAL("decimal"),
        DATE("date"),
        DATETIME("dateTime"),
        BOOLEAN("boolean"),
        SINGLECHOICE("singleChoice"),
        MULTIPLECHOICE("multipleChoice"),
        JSON("json"),
        CONNECTION("connection"),
        TRIGGER("trigger");

        private final String value;
    }

}
