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

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * WebhookSubscription
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
    "active",
    "delivery_method",
    "description",
    "events",
    "filter"
})
@JsonTypeName("WebhookSubscription")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WebhookSubscription {

    @JsonProperty("id")
    protected String id;

    /**
     * The type indicating the schema of the object.
     */
    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * Determines whether this subscription will produce webhook events.
     */
    @JsonProperty("active")
    protected Boolean active;

    @JsonProperty("delivery_method")
    protected WebhookSubscriptionDeliveryMethod deliveryMethod;

    /**
     * A short description of the webhook subscription.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The set of outbound event types the webhook will receive.
     */
    @JsonProperty("events")
    protected Set<String> events;

    @JsonProperty("filter")
    protected WebhookSubscriptionFilter filter;

    /**
     * Constructs a validated instance of {@link WebhookSubscription}.
     *
     * @param spec the specification to process
     */
    public WebhookSubscription(Consumer<WebhookSubscription> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WebhookSubscription}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WebhookSubscription(Consumer)} instead.
     * @param id var.name
     * @param type The type indicating the schema of the object.
     * @param active Determines whether this subscription will produce webhook events.
     * @param deliveryMethod var.name
     * @param description A short description of the webhook subscription.
     * @param events The set of outbound event types the webhook will receive.
     * @param filter var.name
     */
    @ApiStatus.Internal
    public WebhookSubscription(String id, TypeEnum type, Boolean active, WebhookSubscriptionDeliveryMethod deliveryMethod, String description, Set<String> events, WebhookSubscriptionFilter filter) {
        this.id = id;
        this.type = type;
        this.active = active;
        this.deliveryMethod = deliveryMethod;
        this.description = description;
        this.events = events;
        this.filter = filter;
    }

    /**
     * The type indicating the schema of the object.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        WEBHOOK_SUBSCRIPTION("webhook_subscription");

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
