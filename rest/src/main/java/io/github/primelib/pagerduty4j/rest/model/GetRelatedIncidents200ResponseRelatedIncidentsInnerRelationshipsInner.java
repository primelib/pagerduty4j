package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetRelatedIncidents200ResponseRelatedIncidentsInnerRelationshipsInner
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "type",
    "metadata"
})
@JsonTypeName("getRelatedIncidents_200_response_related_incidents_inner_relationships_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetRelatedIncidents200ResponseRelatedIncidentsInnerRelationshipsInner {

    /**
     * The type of relationship. A relationship outlines the reason why two Incidents are considered related.
     */
    @JsonProperty("type")
    private TypeEnum type;

    @JsonProperty("metadata")
    private GetRelatedIncidents200ResponseRelatedIncidentsInnerRelationshipsInnerMetadata metadata;


    /**
     * The type of relationship. A relationship outlines the reason why two Incidents are considered related.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        MACHINE_LEARNING_INFERRED("machine_learning_inferred"),
        SERVICE_DEPENDENCY("service_dependency");

        private final String value;
    }

}
