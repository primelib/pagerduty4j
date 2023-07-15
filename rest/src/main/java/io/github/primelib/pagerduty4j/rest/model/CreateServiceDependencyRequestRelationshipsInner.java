package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateServiceDependencyRequestRelationshipsInner
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "supporting_service",
    "dependent_service"
})
@JsonTypeName("createServiceDependency_request_relationships_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateServiceDependencyRequestRelationshipsInner {

    /**
     * Constructs a validated implementation of {@link CreateServiceDependencyRequestRelationshipsInner}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateServiceDependencyRequestRelationshipsInner(Consumer<CreateServiceDependencyRequestRelationshipsInner> spec) {
        spec.accept(this);
    }

    @JsonProperty("supporting_service")
    protected CreateServiceDependencyRequestRelationshipsInnerSupportingService supportingService;

    @JsonProperty("dependent_service")
    protected CreateServiceDependencyRequestRelationshipsInnerDependentService dependentService;


}
