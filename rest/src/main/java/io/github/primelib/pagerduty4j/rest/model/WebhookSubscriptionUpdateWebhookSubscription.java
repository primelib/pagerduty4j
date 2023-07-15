package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebhookSubscriptionUpdateWebhookSubscription
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "description",
    "events",
    "filter",
    "active"
})
@JsonTypeName("WebhookSubscriptionUpdate_webhook_subscription")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WebhookSubscriptionUpdateWebhookSubscription {

    /**
     * Constructs a validated implementation of {@link WebhookSubscriptionUpdateWebhookSubscription}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WebhookSubscriptionUpdateWebhookSubscription(Consumer<WebhookSubscriptionUpdateWebhookSubscription> spec) {
        spec.accept(this);
    }

    /**
     * A short description of the webhook subscription.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The set of outbound event types the subscription will receive.
     */
    @JsonProperty("events")
    protected Set<String> events;

    @JsonProperty("filter")
    protected WebhookSubscriptionUpdateWebhookSubscriptionFilter filter;

    /**
     * If true, a webhook will be sent. True is the default state. If false, a webhook will not be sent.
     */
    @JsonProperty("active")
    protected Boolean active;


}
