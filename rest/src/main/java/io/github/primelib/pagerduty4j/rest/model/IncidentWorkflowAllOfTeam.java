package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IncidentWorkflowAllOfTeam
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "type",
    "id"
})
@JsonTypeName("IncidentWorkflow_allOf_team")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncidentWorkflowAllOfTeam {

    /**
     * Type of the referenced object
     */
    @JsonProperty("type")
    private TypeEnum type;

    /**
     * Unique identifier for the resource
     */
    @JsonProperty("id")
    private String id;


    /**
     * Type of the referenced object
     */
    @AllArgsConstructor
    public enum TypeEnum {
        TEAM_REFERENCE("team_reference");

        private final String value;
    }

}
