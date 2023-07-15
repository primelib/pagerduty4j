package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetBusinessServiceServiceDependencies200ResponseRelationshipsInner
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "supporting_service",
    "dependent_service",
    "id",
    "type"
})
@JsonTypeName("getBusinessServiceServiceDependencies_200_response_relationships_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetBusinessServiceServiceDependencies200ResponseRelationshipsInner {

    @JsonProperty("supporting_service")
    private GetBusinessServiceServiceDependencies200ResponseRelationshipsInnerSupportingService supportingService;

    @JsonProperty("dependent_service")
    private GetBusinessServiceServiceDependencies200ResponseRelationshipsInnerDependentService dependentService;

    @JsonProperty("id")
    private String id;

    @JsonProperty("type")
    private String type;


}
