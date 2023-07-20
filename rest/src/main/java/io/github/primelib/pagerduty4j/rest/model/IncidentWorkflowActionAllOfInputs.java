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

/**
 * IncidentWorkflowActionAllOfInputs
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
     * Constructs a validated instance of {@link IncidentWorkflowActionAllOfInputs}.
     *
     * @param spec the specification to process
     */
    public IncidentWorkflowActionAllOfInputs(Consumer<IncidentWorkflowActionAllOfInputs> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IncidentWorkflowActionAllOfInputs}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IncidentWorkflowActionAllOfInputs(Consumer)} instead.
     * @param name The name of the Input
     * @param description Describes what the purpose of the Input
     * @param type The data type of this Input
     * @param defaultValue Serialized form of the default value that the input will take
     * @param isRequired Whether a value must be provided for this input
     * @param isHidden If true then this input will not be shown to users when configuring this action
     * @param advanced var.name
     * @param metadata var.name
     * @param connectionTypeId The configured value of the Input
     */
    @ApiStatus.Internal
    public IncidentWorkflowActionAllOfInputs(String name, String description, TypeEnum type, String defaultValue, Boolean isRequired, Boolean isHidden, Boolean advanced, String metadata, String connectionTypeId) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.defaultValue = defaultValue;
        this.isRequired = isRequired;
        this.isHidden = isHidden;
        this.advanced = advanced;
        this.metadata = metadata;
        this.connectionTypeId = connectionTypeId;
    }

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
