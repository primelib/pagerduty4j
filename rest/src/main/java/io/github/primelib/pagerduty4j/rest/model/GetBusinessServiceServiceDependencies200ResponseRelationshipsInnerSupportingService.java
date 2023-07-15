package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetBusinessServiceServiceDependencies200ResponseRelationshipsInnerSupportingService
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "id",
    "type"
})
@JsonTypeName("getBusinessServiceServiceDependencies_200_response_relationships_inner_supporting_service")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetBusinessServiceServiceDependencies200ResponseRelationshipsInnerSupportingService {

    @JsonProperty("id")
    private String id;

    @JsonProperty("type")
    private String type;


}
