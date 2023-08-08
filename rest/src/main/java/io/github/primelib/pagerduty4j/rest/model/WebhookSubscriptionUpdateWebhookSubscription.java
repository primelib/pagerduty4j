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

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebhookSubscriptionUpdateWebhookSubscription
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
    "description",
    "events",
    "filter",
    "active"
})
@JsonTypeName("WebhookSubscriptionUpdate_webhook_subscription")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WebhookSubscriptionUpdateWebhookSubscription {

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

    /**
     * Constructs a validated instance of {@link WebhookSubscriptionUpdateWebhookSubscription}.
     *
     * @param spec the specification to process
     */
    public WebhookSubscriptionUpdateWebhookSubscription(Consumer<WebhookSubscriptionUpdateWebhookSubscription> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WebhookSubscriptionUpdateWebhookSubscription}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WebhookSubscriptionUpdateWebhookSubscription(Consumer)} instead.
     * @param description A short description of the webhook subscription.
     * @param events The set of outbound event types the subscription will receive.
     * @param filter filter
     * @param active If true, a webhook will be sent. True is the default state. If false, a webhook will not be sent.
     */
    @ApiStatus.Internal
    public WebhookSubscriptionUpdateWebhookSubscription(String description, Set<String> events, WebhookSubscriptionUpdateWebhookSubscriptionFilter filter, Boolean active) {
        this.description = description;
        this.events = events;
        this.filter = filter;
        this.active = active;
    }

}
