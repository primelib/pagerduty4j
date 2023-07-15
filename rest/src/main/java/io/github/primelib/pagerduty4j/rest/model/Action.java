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
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Action
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "triggered_at",
    "webhook"
})
@JsonTypeName("Action")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Action {

    /**
     * Constructs a validated implementation of {@link Action}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Action(Consumer<Action> spec) {
        spec.accept(this);
    }

    /**
     * Uniquely identifies this outgoing webhook message; can be used for idempotency when processing the messages.
     */
    @JsonProperty("id")
    protected UUID id;

    /**
     * The date/time when this message was was sent.
     */
    @JsonProperty("triggered_at")
    protected OffsetDateTime triggeredAt;

    @JsonProperty("webhook")
    protected Webhook webhook;


}
