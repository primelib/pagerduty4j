package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RelatedIncidentServiceDependencyRelationship
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@JsonPropertyOrder({
    "dependent_services",
    "supporting_services"
})
@JsonTypeName("RelatedIncidentServiceDependencyRelationship")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RelatedIncidentServiceDependencyRelationship {

    @JsonProperty("dependent_services")
    protected List<RelatedIncidentServiceDependencyBase> dependentServices;

    @JsonProperty("supporting_services")
    protected List<RelatedIncidentServiceDependencyBase> supportingServices;

    /**
     * Constructs a validated instance of {@link RelatedIncidentServiceDependencyRelationship}.
     *
     * @param spec the specification to process
     */
    public RelatedIncidentServiceDependencyRelationship(Consumer<RelatedIncidentServiceDependencyRelationship> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link RelatedIncidentServiceDependencyRelationship}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #RelatedIncidentServiceDependencyRelationship(Consumer)} instead.
     * @param dependentServices var.name
     * @param supportingServices var.name
     */
    @ApiStatus.Internal
    public RelatedIncidentServiceDependencyRelationship(List<RelatedIncidentServiceDependencyBase> dependentServices, List<RelatedIncidentServiceDependencyBase> supportingServices) {
        this.dependentServices = dependentServices;
        this.supportingServices = supportingServices;
    }

}
