package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

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
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link WebhookSubscriptionDeliveryMethod}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WebhookSubscriptionDeliveryMethod(Consumer<WebhookSubscriptionDeliveryMethod> spec) {
        spec.accept(this);
    }

    @JsonProperty("id")
    protected String id;

    /**
     * The secret used to sign webhook payloads. Only provided on the initial create response.
     */
    @JsonProperty("secret")
    protected String secret;

    /**
     * Whether or not this webhook subscription is temporarily disabled. Becomes `true` if the delivery method URL is repeatedly rejected by the server.
     */
    @JsonProperty("temporarily_disabled")
    protected Boolean temporarilyDisabled;

    /**
     * Indicates the type of the delivery method.
     */
    @JsonProperty("type")
    protected TypeEnum type = TypeEnum.HTTP_DELIVERY_METHOD;

    /**
     * The destination URL for webhook delivery.
     */
    @JsonProperty("url")
    protected String url;

    /**
     * Optional headers to be set on this webhook subscription when sent. The header values are redacted in GET requests, but are not redacted on the webhook when delivered to the webhook's endpoint.
     */
    @JsonProperty("custom_headers")
    protected List customHeaders = null;


    /**
     * Indicates the type of the delivery method.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        HTTP_DELIVERY_METHOD("http_delivery_method");

        private final String value;
    }

}
