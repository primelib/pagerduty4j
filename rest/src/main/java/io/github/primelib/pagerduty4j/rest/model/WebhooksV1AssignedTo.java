package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebhooksV1AssignedTo
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "at",
    "object"
})
@JsonTypeName("WebhooksV1AssignedTo")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WebhooksV1AssignedTo {

    /**
     * Constructs a validated implementation of {@link WebhooksV1AssignedTo}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WebhooksV1AssignedTo(Consumer<WebhooksV1AssignedTo> spec) {
        spec.accept(this);
    }

    /**
     * Time at which the assignment was created.
     */
    @JsonProperty("at")
    protected OffsetDateTime at;

    @JsonProperty("object")
    protected WebhooksV1AssignedToObject _object;


}
