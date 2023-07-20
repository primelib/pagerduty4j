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
 * GetBusinessServiceServiceDependencies200ResponseRelationshipsInnerSupportingService
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
@JsonTypeName("getBusinessServiceServiceDependencies_200_response_relationships_inner_supporting_service")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetBusinessServiceServiceDependencies200ResponseRelationshipsInnerSupportingService {

    @JsonProperty("id")
    protected String id;

    @JsonProperty("type")
    protected String type;

    /**
     * Constructs a validated instance of {@link GetBusinessServiceServiceDependencies200ResponseRelationshipsInnerSupportingService}.
     *
     * @param spec the specification to process
     */
    public GetBusinessServiceServiceDependencies200ResponseRelationshipsInnerSupportingService(Consumer<GetBusinessServiceServiceDependencies200ResponseRelationshipsInnerSupportingService> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetBusinessServiceServiceDependencies200ResponseRelationshipsInnerSupportingService}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetBusinessServiceServiceDependencies200ResponseRelationshipsInnerSupportingService(Consumer)} instead.
     * @param id var.name
     * @param type var.name
     */
    @ApiStatus.Internal
    public GetBusinessServiceServiceDependencies200ResponseRelationshipsInnerSupportingService(String id, String type) {
        this.id = id;
        this.type = type;
    }

}
