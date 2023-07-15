package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
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
    private String description;

    /**
     * The set of outbound event types the subscription will receive.
     */
    @JsonProperty("events")
    private Set<String> events;

    @JsonProperty("filter")
    private WebhookSubscriptionUpdateWebhookSubscriptionFilter filter;

    /**
     * If true, a webhook will be sent. True is the default state. If false, a webhook will not be sent.
     */
    @JsonProperty("active")
    private Boolean active;


}
