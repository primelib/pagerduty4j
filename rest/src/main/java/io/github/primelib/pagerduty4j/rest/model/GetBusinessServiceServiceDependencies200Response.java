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
 * GetBusinessServiceServiceDependencies200Response
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "relationships"
})
@JsonTypeName("getBusinessServiceServiceDependencies_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetBusinessServiceServiceDependencies200Response {

    /**
     * Constructs a validated implementation of {@link GetBusinessServiceServiceDependencies200Response}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetBusinessServiceServiceDependencies200Response(Consumer<GetBusinessServiceServiceDependencies200Response> spec) {
        spec.accept(this);
    }

    /**
     * List of all the Business Service's dependencies.
     */
    @JsonProperty("relationships")
    protected List<GetBusinessServiceServiceDependencies200ResponseRelationshipsInner> relationships;


}
