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
 * CreateServiceDependencyRequestRelationshipsInnerDependentService
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
    "id",
    "type"
})
@JsonTypeName("createServiceDependency_request_relationships_inner_dependent_service")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateServiceDependencyRequestRelationshipsInnerDependentService {

    @JsonProperty("id")
    protected String id;

    @JsonProperty("type")
    protected String type;

    /**
     * Constructs a validated instance of {@link CreateServiceDependencyRequestRelationshipsInnerDependentService}.
     *
     * @param spec the specification to process
     */
    public CreateServiceDependencyRequestRelationshipsInnerDependentService(Consumer<CreateServiceDependencyRequestRelationshipsInnerDependentService> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateServiceDependencyRequestRelationshipsInnerDependentService}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateServiceDependencyRequestRelationshipsInnerDependentService(Consumer)} instead.
     * @param id id
     * @param type type
     */
    @ApiStatus.Internal
    public CreateServiceDependencyRequestRelationshipsInnerDependentService(String id, String type) {
        this.id = id;
        this.type = type;
    }

}
