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
 * GetBusinessServiceServiceDependencies200Response
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
@JsonTypeName("getBusinessServiceServiceDependencies_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetBusinessServiceServiceDependencies200Response {

    /**
     * List of all the Business Service's dependencies.
     */
    @JsonProperty("relationships")
    protected List<GetBusinessServiceServiceDependencies200ResponseRelationshipsInner> relationships;

    /**
     * Constructs a validated instance of {@link GetBusinessServiceServiceDependencies200Response}.
     *
     * @param spec the specification to process
     */
    public GetBusinessServiceServiceDependencies200Response(Consumer<GetBusinessServiceServiceDependencies200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetBusinessServiceServiceDependencies200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetBusinessServiceServiceDependencies200Response(Consumer)} instead.
     * @param relationships List of all the Business Service's dependencies.
     */
    @ApiStatus.Internal
    public GetBusinessServiceServiceDependencies200Response(List<GetBusinessServiceServiceDependencies200ResponseRelationshipsInner> relationships) {
        this.relationships = relationships;
    }

}
