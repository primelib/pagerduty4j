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
 * CreateServiceDependency200Response
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "relationships"
})
@JsonTypeName("createServiceDependency_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateServiceDependency200Response {

    /**
     * Constructs a validated implementation of {@link CreateServiceDependency200Response}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateServiceDependency200Response(Consumer<CreateServiceDependency200Response> spec) {
        spec.accept(this);
    }

    /**
     * List of all the technical service's dependencies
     */
    @JsonProperty("relationships")
    protected List<CreateServiceDependency200ResponseRelationshipsInner> relationships;


}
