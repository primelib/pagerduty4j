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
 * CreateServiceDependency200Response
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
@JsonTypeName("createServiceDependency_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateServiceDependency200Response {

    /**
     * List of all the technical service's dependencies
     */
    @JsonProperty("relationships")
    protected List<CreateServiceDependency200ResponseRelationshipsInner> relationships;

    /**
     * Constructs a validated instance of {@link CreateServiceDependency200Response}.
     *
     * @param spec the specification to process
     */
    public CreateServiceDependency200Response(Consumer<CreateServiceDependency200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateServiceDependency200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateServiceDependency200Response(Consumer)} instead.
     * @param relationships List of all the technical service's dependencies
     */
    @ApiStatus.Internal
    public CreateServiceDependency200Response(List<CreateServiceDependency200ResponseRelationshipsInner> relationships) {
        this.relationships = relationships;
    }

}
