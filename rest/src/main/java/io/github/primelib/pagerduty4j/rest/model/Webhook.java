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
 * Webhook
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "endpoint_url",
    "name",
    "webhook_object",
    "config",
    "outbound_integration"
})
@JsonTypeName("Webhook")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Webhook {

    /**
     * Constructs a validated implementation of {@link Webhook}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Webhook(Consumer<Webhook> spec) {
        spec.accept(this);
    }

    /**
     * The url endpoint the webhook payload is sent to.
     */
    @JsonProperty("endpoint_url")
    protected String endpointUrl;

    /**
     * The name of the webhook.
     */
    @JsonProperty("name")
    protected String name;

    @JsonProperty("webhook_object")
    protected WebhookObject webhookObject;

    /**
     * The object that contains webhook configuration values depending on the webhook type specification.
     */
    @JsonProperty("config")
    protected Object config;

    @JsonProperty("outbound_integration")
    protected OutboundIntegrationReference outboundIntegration;


}
