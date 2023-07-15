package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DeleteServiceDependencyRequest
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "relationships"
})
@JsonTypeName("deleteServiceDependency_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DeleteServiceDependencyRequest {

    /**
     * List of all service dependencies to be deleted.
     */
    @JsonProperty("relationships")
    private List<CreateServiceDependencyRequestRelationshipsInner> relationships;


}
