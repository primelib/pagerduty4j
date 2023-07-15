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
 * RelatedIncidentServiceDependencyRelationship
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "dependent_services",
    "supporting_services"
})
@JsonTypeName("RelatedIncidentServiceDependencyRelationship")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RelatedIncidentServiceDependencyRelationship {

    @JsonProperty("dependent_services")
    private List<RelatedIncidentServiceDependencyBase> dependentServices;

    @JsonProperty("supporting_services")
    private List<RelatedIncidentServiceDependencyBase> supportingServices;


}
