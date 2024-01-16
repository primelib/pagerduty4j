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
 * GetBusinessServiceServiceDependencies200ResponseRelationshipsInner
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
    "dependent_service",
    "id",
    "type"
})
@JsonTypeName("getBusinessServiceServiceDependencies_200_response_relationships_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetBusinessServiceServiceDependencies200ResponseRelationshipsInner {

    @JsonProperty("supporting_service")
    protected GetBusinessServiceServiceDependencies200ResponseRelationshipsInnerSupportingService supportingService;

    @JsonProperty("dependent_service")
    protected GetBusinessServiceServiceDependencies200ResponseRelationshipsInnerDependentService dependentService;

    @JsonProperty("id")
    protected String id;

    @JsonProperty("type")
    protected String type;

    /**
     * Constructs a validated instance of {@link GetBusinessServiceServiceDependencies200ResponseRelationshipsInner}.
     *
     * @param spec the specification to process
     */
    public GetBusinessServiceServiceDependencies200ResponseRelationshipsInner(Consumer<GetBusinessServiceServiceDependencies200ResponseRelationshipsInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetBusinessServiceServiceDependencies200ResponseRelationshipsInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetBusinessServiceServiceDependencies200ResponseRelationshipsInner(Consumer)} instead.
     * @param supportingService supportingService
     * @param dependentService dependentService
     * @param id id
     * @param type type
     */
    @ApiStatus.Internal
    public GetBusinessServiceServiceDependencies200ResponseRelationshipsInner(GetBusinessServiceServiceDependencies200ResponseRelationshipsInnerSupportingService supportingService, GetBusinessServiceServiceDependencies200ResponseRelationshipsInnerDependentService dependentService, String id, String type) {
        this.supportingService = supportingService;
        this.dependentService = dependentService;
        this.id = id;
        this.type = type;
    }

}
