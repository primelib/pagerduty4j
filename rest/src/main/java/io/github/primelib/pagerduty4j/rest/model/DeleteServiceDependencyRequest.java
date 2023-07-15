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
 * DeleteServiceDependencyRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "relationships"
})
@JsonTypeName("deleteServiceDependency_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DeleteServiceDependencyRequest {

    /**
     * Constructs a validated implementation of {@link DeleteServiceDependencyRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DeleteServiceDependencyRequest(Consumer<DeleteServiceDependencyRequest> spec) {
        spec.accept(this);
    }

    /**
     * List of all service dependencies to be deleted.
     */
    @JsonProperty("relationships")
    protected List<CreateServiceDependencyRequestRelationshipsInner> relationships;


}
