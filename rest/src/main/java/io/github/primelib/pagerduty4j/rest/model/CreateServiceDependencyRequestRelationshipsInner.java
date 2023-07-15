package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateServiceDependencyRequestRelationshipsInner
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "supporting_service",
    "dependent_service"
})
@JsonTypeName("createServiceDependency_request_relationships_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateServiceDependencyRequestRelationshipsInner {

    @JsonProperty("supporting_service")
    private CreateServiceDependencyRequestRelationshipsInnerSupportingService supportingService;

    @JsonProperty("dependent_service")
    private CreateServiceDependencyRequestRelationshipsInnerDependentService dependentService;


}
