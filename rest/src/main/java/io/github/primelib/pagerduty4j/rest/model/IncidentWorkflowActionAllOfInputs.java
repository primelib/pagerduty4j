package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IncidentWorkflowActionAllOfInputs
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private String name;

    /**
     * Describes what the purpose of the Input
     */
    @JsonProperty("description")
    private String description;

    /**
     * The data type of this Input
     */
    @JsonProperty("type")
    private TypeEnum type;

    /**
     * Serialized form of the default value that the input will take
     */
    @JsonProperty("default_value")
    private String defaultValue;

    /**
     * Whether a value must be provided for this input
     */
    @JsonProperty("is_required")
    private Boolean isRequired;

    /**
     * If true then this input will not be shown to users when configuring this action
     */
    @JsonProperty("is_hidden")
    private Boolean isHidden;

    @JsonProperty("advanced")
    private Boolean advanced;

    @JsonProperty("metadata")
    private String metadata;

    /**
     * The configured value of the Input
     */
    @JsonProperty("connection_type_id")
    private String connectionTypeId;


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
