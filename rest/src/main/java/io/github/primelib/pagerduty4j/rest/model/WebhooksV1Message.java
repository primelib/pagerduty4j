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
 * WebhooksV1Message
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "type",
    "created_on",
    "data"
})
@JsonTypeName("WebhooksV1Message")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WebhooksV1Message {

    /**
     * Constructs a validated implementation of {@link WebhooksV1Message}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WebhooksV1Message(Consumer<WebhooksV1Message> spec) {
        spec.accept(this);
    }

    /**
     * Uniquely identifies this outgoing webhook message; can be used for idempotency when processing the messages.
     */
    @JsonProperty("id")
    protected UUID id;

    /**
     * The type of action being reported by this message.
     */
    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * The date/time when the incident changed state.
     */
    @JsonProperty("created_on")
    protected OffsetDateTime createdOn;

    @JsonProperty("data")
    protected WebhooksV1MessageData data;


    /**
     * The type of action being reported by this message.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        TRIGGER("incident.trigger"),
        ACKNOWLEDGE("incident.acknowledge"),
        UNACKNOWLEDGE("incident.unacknowledge"),
        RESOLVE("incident.resolve"),
        ASSIGN("incident.assign"),
        ESCALATE("incident.escalate"),
        DELEGATE("incident.delegate");

        private final String value;
    }

}
