package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Webhook
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private String endpointUrl;

    /**
     * The name of the webhook.
     */
    @JsonProperty("name")
    private String name;

    @JsonProperty("webhook_object")
    private WebhookObject webhookObject;

    /**
     * The object that contains webhook configuration values depending on the webhook type specification.
     */
    @JsonProperty("config")
    private Object config;

    @JsonProperty("outbound_integration")
    private OutboundIntegrationReference outboundIntegration;


}
