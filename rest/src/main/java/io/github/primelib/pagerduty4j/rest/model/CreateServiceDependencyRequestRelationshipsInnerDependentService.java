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
 * CreateServiceDependencyRequestRelationshipsInnerDependentService
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "type"
})
@JsonTypeName("createServiceDependency_request_relationships_inner_dependent_service")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateServiceDependencyRequestRelationshipsInnerDependentService {

    /**
     * Constructs a validated implementation of {@link CreateServiceDependencyRequestRelationshipsInnerDependentService}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateServiceDependencyRequestRelationshipsInnerDependentService(Consumer<CreateServiceDependencyRequestRelationshipsInnerDependentService> spec) {
        spec.accept(this);
    }

    @JsonProperty("id")
    protected String id;

    @JsonProperty("type")
    protected String type;


}
