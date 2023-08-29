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
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Action
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
    "triggered_at",
    "webhook"
})
@JsonTypeName("Action")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Action {

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

    /**
     * Constructs a validated instance of {@link Action}.
     *
     * @param spec the specification to process
     */
    public Action(Consumer<Action> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Action}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Action(Consumer)} instead.
     * @param id Uniquely identifies this outgoing webhook message; can be used for idempotency when processing the messages.
     * @param triggeredAt The date/time when this message was was sent.
     * @param webhook webhook
     */
    @ApiStatus.Internal
    public Action(UUID id, OffsetDateTime triggeredAt, Webhook webhook) {
        this.id = id;
        this.triggeredAt = triggeredAt;
        this.webhook = webhook;
    }

}
