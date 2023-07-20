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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateServiceDependencyRequestRelationshipsInner
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
    "supporting_service",
    "dependent_service"
})
@JsonTypeName("createServiceDependency_request_relationships_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateServiceDependencyRequestRelationshipsInner {

    @JsonProperty("supporting_service")
    protected CreateServiceDependencyRequestRelationshipsInnerSupportingService supportingService;

    @JsonProperty("dependent_service")
    protected CreateServiceDependencyRequestRelationshipsInnerDependentService dependentService;

    /**
     * Constructs a validated instance of {@link CreateServiceDependencyRequestRelationshipsInner}.
     *
     * @param spec the specification to process
     */
    public CreateServiceDependencyRequestRelationshipsInner(Consumer<CreateServiceDependencyRequestRelationshipsInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateServiceDependencyRequestRelationshipsInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateServiceDependencyRequestRelationshipsInner(Consumer)} instead.
     * @param supportingService var.name
     * @param dependentService var.name
     */
    @ApiStatus.Internal
    public CreateServiceDependencyRequestRelationshipsInner(CreateServiceDependencyRequestRelationshipsInnerSupportingService supportingService, CreateServiceDependencyRequestRelationshipsInnerDependentService dependentService) {
        this.supportingService = supportingService;
        this.dependentService = dependentService;
    }

}
