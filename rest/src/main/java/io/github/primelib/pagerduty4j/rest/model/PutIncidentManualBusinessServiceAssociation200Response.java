package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PutIncidentManualBusinessServiceAssociation200Response
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "relation"
})
@JsonTypeName("putIncidentManualBusinessServiceAssociation_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PutIncidentManualBusinessServiceAssociation200Response {

    @JsonProperty("relation")
    private RelationEnum relation;


    @AllArgsConstructor
    public enum RelationEnum {
        IMPACTED("impacted"),
        NOT_IMPACTED("not_impacted");

        private final String value;
    }

}
