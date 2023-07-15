package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebhookSubscriptionUpdate
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "webhook_subscription"
})
@JsonTypeName("WebhookSubscriptionUpdate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WebhookSubscriptionUpdate {

    /**
     * Constructs a validated implementation of {@link WebhookSubscriptionUpdate}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WebhookSubscriptionUpdate(Consumer<WebhookSubscriptionUpdate> spec) {
        spec.accept(this);
    }

    @JsonProperty("webhook_subscription")
    protected WebhookSubscriptionUpdateWebhookSubscription webhookSubscription;


}
