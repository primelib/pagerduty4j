package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebhookSubscription
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link WebhookSubscription}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WebhookSubscription(Consumer<WebhookSubscription> spec) {
        spec.accept(this);
    }

    @JsonProperty("id")
    protected String id;

    /**
     * The type indicating the schema of the object.
     */
    @JsonProperty("type")
    protected TypeEnum type = TypeEnum.WEBHOOK_SUBSCRIPTION;

    /**
     * Determines whether this subscription will produce webhook events.
     */
    @JsonProperty("active")
    protected Boolean active = true;

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
    protected Set<String> events = new LinkedHashSet<>();

    @JsonProperty("filter")
    protected WebhookSubscriptionFilter filter;


    /**
     * The type indicating the schema of the object.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        WEBHOOK_SUBSCRIPTION("webhook_subscription");

        private final String value;
    }

}
