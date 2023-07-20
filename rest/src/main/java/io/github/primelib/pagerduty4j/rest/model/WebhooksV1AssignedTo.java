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

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebhooksV1AssignedTo
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
    "at",
    "object"
})
@JsonTypeName("WebhooksV1AssignedTo")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WebhooksV1AssignedTo {

    /**
     * Time at which the assignment was created.
     */
    @JsonProperty("at")
    protected OffsetDateTime at;

    @JsonProperty("object")
    protected WebhooksV1AssignedToObject object;

    /**
     * Constructs a validated instance of {@link WebhooksV1AssignedTo}.
     *
     * @param spec the specification to process
     */
    public WebhooksV1AssignedTo(Consumer<WebhooksV1AssignedTo> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WebhooksV1AssignedTo}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WebhooksV1AssignedTo(Consumer)} instead.
     * @param at Time at which the assignment was created.
     * @param object var.name
     */
    @ApiStatus.Internal
    public WebhooksV1AssignedTo(OffsetDateTime at, WebhooksV1AssignedToObject object) {
        this.at = at;
        this.object = object;
    }

}
