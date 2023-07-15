package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PutIncidentManualBusinessServiceAssociationRequest
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "relation"
})
@JsonTypeName("putIncidentManualBusinessServiceAssociation_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PutIncidentManualBusinessServiceAssociationRequest {

    @JsonProperty("relation")
    private RelationEnum relation;


    @AllArgsConstructor
    public enum RelationEnum {
        IMPACTED("impacted"),
        NOT_IMPACTED("not_impacted");

        private final String value;
    }

}
