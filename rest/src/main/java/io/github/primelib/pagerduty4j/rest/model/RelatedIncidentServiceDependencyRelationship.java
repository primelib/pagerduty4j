package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

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
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "dependent_services",
    "supporting_services"
})
@JsonTypeName("RelatedIncidentServiceDependencyRelationship")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RelatedIncidentServiceDependencyRelationship {

    /**
     * Constructs a validated implementation of {@link RelatedIncidentServiceDependencyRelationship}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RelatedIncidentServiceDependencyRelationship(Consumer<RelatedIncidentServiceDependencyRelationship> spec) {
        spec.accept(this);
    }

    @JsonProperty("dependent_services")
    protected List<RelatedIncidentServiceDependencyBase> dependentServices;

    @JsonProperty("supporting_services")
    protected List<RelatedIncidentServiceDependencyBase> supportingServices;


}
