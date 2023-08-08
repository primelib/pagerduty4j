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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebhookSubscriptionUpdate
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
    "webhook_subscription"
})
@JsonTypeName("WebhookSubscriptionUpdate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WebhookSubscriptionUpdate {

    @JsonProperty("webhook_subscription")
    protected WebhookSubscriptionUpdateWebhookSubscription webhookSubscription;

    /**
     * Constructs a validated instance of {@link WebhookSubscriptionUpdate}.
     *
     * @param spec the specification to process
     */
    public WebhookSubscriptionUpdate(Consumer<WebhookSubscriptionUpdate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WebhookSubscriptionUpdate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WebhookSubscriptionUpdate(Consumer)} instead.
     * @param webhookSubscription webhookSubscription
     */
    @ApiStatus.Internal
    public WebhookSubscriptionUpdate(WebhookSubscriptionUpdateWebhookSubscription webhookSubscription) {
        this.webhookSubscription = webhookSubscription;
    }

}
