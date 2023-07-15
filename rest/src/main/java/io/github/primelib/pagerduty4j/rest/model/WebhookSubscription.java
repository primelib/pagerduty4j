package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
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
    private String id;

    /**
     * The type indicating the schema of the object.
     */
    @JsonProperty("type")
    private TypeEnum type = TypeEnum.WEBHOOK_SUBSCRIPTION;

    /**
     * Determines whether this subscription will produce webhook events.
     */
    @JsonProperty("active")
    private Boolean active = true;

    @JsonProperty("delivery_method")
    private WebhookSubscriptionDeliveryMethod deliveryMethod;

    /**
     * A short description of the webhook subscription.
     */
    @JsonProperty("description")
    private String description;

    /**
     * The set of outbound event types the webhook will receive.
     */
    @JsonProperty("events")
    private Set<String> events = new LinkedHashSet<>();

    @JsonProperty("filter")
    private WebhookSubscriptionFilter filter;


    /**
     * The type indicating the schema of the object.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        WEBHOOK_SUBSCRIPTION("webhook_subscription");

        private final String value;
    }

}
