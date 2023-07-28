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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import java.time.OffsetDateTime;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * WebhooksV1Message
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
    "type",
    "created_on",
    "data"
})
@JsonTypeName("WebhooksV1Message")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WebhooksV1Message {

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
     * Constructs a validated instance of {@link WebhooksV1Message}.
     *
     * @param spec the specification to process
     */
    public WebhooksV1Message(Consumer<WebhooksV1Message> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WebhooksV1Message}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WebhooksV1Message(Consumer)} instead.
     * @param id Uniquely identifies this outgoing webhook message; can be used for idempotency when processing the messages.
     * @param type The type of action being reported by this message.
     * @param createdOn The date/time when the incident changed state.
     * @param data var.name
     */
    @ApiStatus.Internal
    public WebhooksV1Message(UUID id, TypeEnum type, OffsetDateTime createdOn, WebhooksV1MessageData data) {
        this.id = id;
        this.type = type;
        this.createdOn = createdOn;
        this.data = data;
    }

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

        private static final TypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static TypeEnum of(String input) {
            if (input != null) {
                for (TypeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
