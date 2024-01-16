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
 * DeleteServiceDependencyRequest
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
    "relationships"
})
@JsonTypeName("deleteServiceDependency_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DeleteServiceDependencyRequest {

    /**
     * List of all service dependencies to be deleted.
     */
    @JsonProperty("relationships")
    protected List<CreateServiceDependencyRequestRelationshipsInner> relationships;

    /**
     * Constructs a validated instance of {@link DeleteServiceDependencyRequest}.
     *
     * @param spec the specification to process
     */
    public DeleteServiceDependencyRequest(Consumer<DeleteServiceDependencyRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link DeleteServiceDependencyRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #DeleteServiceDependencyRequest(Consumer)} instead.
     * @param relationships List of all service dependencies to be deleted.
     */
    @ApiStatus.Internal
    public DeleteServiceDependencyRequest(List<CreateServiceDependencyRequestRelationshipsInner> relationships) {
        this.relationships = relationships;
    }

}
