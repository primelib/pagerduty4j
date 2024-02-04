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
 * StatusPagePostLinkedResource
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
@JsonTypeName("StatusPagePost_linked_resource")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class StatusPagePostLinkedResource {

    /**
     * Linked resource unique identifier
     */
    @JsonProperty("id")
    protected String id;

    /**
     * A string that determines the schema of the object.
     */
    @JsonProperty("type")
    protected String type;

    /**
     * Constructs a validated instance of {@link StatusPagePostLinkedResource}.
     *
     * @param spec the specification to process
     */
    public StatusPagePostLinkedResource(Consumer<StatusPagePostLinkedResource> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link StatusPagePostLinkedResource}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #StatusPagePostLinkedResource(Consumer)} instead.
     * @param id Linked resource unique identifier
     * @param type A string that determines the schema of the object.
     */
    @ApiStatus.Internal
    public StatusPagePostLinkedResource(String id, String type) {
        this.id = id;
        this.type = type;
    }

}
