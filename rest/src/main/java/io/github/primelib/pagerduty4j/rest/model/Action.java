package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
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
    private UUID id;

    /**
     * The date/time when this message was was sent.
     */
    @JsonProperty("triggered_at")
    private OffsetDateTime triggeredAt;

    @JsonProperty("webhook")
    private Webhook webhook;


}
