package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IncidentWorkflowActionAllOfOutputs
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "name",
    "description",
    "type"
})
@JsonTypeName("IncidentWorkflowAction_allOf_outputs")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncidentWorkflowActionAllOfOutputs {

    /**
     * The name of the Output
     */
    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    /**
     * The data type produced by this Output
     */
    @JsonProperty("type")
    private TypeEnum type;


    /**
     * The data type produced by this Output
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
        JSON("json");

        private final String value;
    }

}
