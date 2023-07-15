package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebhookSubscriptionDeliveryMethod
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "id",
    "secret",
    "temporarily_disabled",
    "type",
    "url",
    "custom_headers"
})
@JsonTypeName("WebhookSubscription_delivery_method")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WebhookSubscriptionDeliveryMethod {

    @JsonProperty("id")
    private String id;

    /**
     * The secret used to sign webhook payloads. Only provided on the initial create response.
     */
    @JsonProperty("secret")
    private String secret;

    /**
     * Whether or not this webhook subscription is temporarily disabled. Becomes `true` if the delivery method URL is repeatedly rejected by the server.
     */
    @JsonProperty("temporarily_disabled")
    private Boolean temporarilyDisabled;

    /**
     * Indicates the type of the delivery method.
     */
    @JsonProperty("type")
    private TypeEnum type = TypeEnum.HTTP_DELIVERY_METHOD;

    /**
     * The destination URL for webhook delivery.
     */
    @JsonProperty("url")
    private String url;

    /**
     * Optional headers to be set on this webhook subscription when sent. The header values are redacted in GET requests, but are not redacted on the webhook when delivered to the webhook's endpoint.
     */
    @JsonProperty("custom_headers")
    private List customHeaders = null;


    /**
     * Indicates the type of the delivery method.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        HTTP_DELIVERY_METHOD("http_delivery_method");

        private final String value;
    }

}
