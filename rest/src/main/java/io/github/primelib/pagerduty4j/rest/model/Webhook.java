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
 * Webhook
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

    /**
     * Constructs a validated instance of {@link Webhook}.
     *
     * @param spec the specification to process
     */
    public Webhook(Consumer<Webhook> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Webhook}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Webhook(Consumer)} instead.
     * @param endpointUrl The url endpoint the webhook payload is sent to.
     * @param name The name of the webhook.
     * @param webhookObject webhookObject
     * @param config The object that contains webhook configuration values depending on the webhook type specification.
     * @param outboundIntegration outboundIntegration
     */
    @ApiStatus.Internal
    public Webhook(String endpointUrl, String name, WebhookObject webhookObject, Object config, OutboundIntegrationReference outboundIntegration) {
        this.endpointUrl = endpointUrl;
        this.name = name;
        this.webhookObject = webhookObject;
        this.config = config;
        this.outboundIntegration = outboundIntegration;
    }

}
