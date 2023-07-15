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
 * CreateServiceDependency200ResponseRelationshipsInner
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "supporting_service",
    "dependent_service",
    "id",
    "type"
})
@JsonTypeName("createServiceDependency_200_response_relationships_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateServiceDependency200ResponseRelationshipsInner {

    /**
     * Constructs a validated implementation of {@link CreateServiceDependency200ResponseRelationshipsInner}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateServiceDependency200ResponseRelationshipsInner(Consumer<CreateServiceDependency200ResponseRelationshipsInner> spec) {
        spec.accept(this);
    }

    @JsonProperty("supporting_service")
    protected CreateServiceDependency200ResponseRelationshipsInnerSupportingService supportingService;

    @JsonProperty("dependent_service")
    protected CreateServiceDependency200ResponseRelationshipsInnerDependentService dependentService;

    @JsonProperty("id")
    protected String id;

    @JsonProperty("type")
    protected String type;


}
