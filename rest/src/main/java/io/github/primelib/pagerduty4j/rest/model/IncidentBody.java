package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IncidentBody
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "type",
    "details"
})
@JsonTypeName("IncidentBody")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncidentBody {

    @JsonProperty("type")
    private TypeEnum type;

    /**
     * Additional incident details.
     */
    @JsonProperty("details")
    private String details;


    @AllArgsConstructor
    public enum TypeEnum {
        INCIDENT_BODY("incident_body");

        private final String value;
    }

}
