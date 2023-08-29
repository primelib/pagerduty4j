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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * WebhookSubscriptionDeliveryMethod
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
    protected String id;

    /**
     * The secret used to sign webhook payloads. Only provided on the initial create response.
     */
    @JsonProperty("secret")
    protected String secret;

    /**
     * Whether or not this webhook subscription is temporarily disabled. Becomes {@code true} if the delivery method URL is repeatedly rejected by the server.
     */
    @JsonProperty("temporarily_disabled")
    protected Boolean temporarilyDisabled;

    /**
     * Indicates the type of the delivery method.
     */
    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * The destination URL for webhook delivery.
     */
    @JsonProperty("url")
    protected String url;

    /**
     * Optional headers to be set on this webhook subscription when sent. The header values are redacted in GET requests, but are not redacted on the webhook when delivered to the webhook's endpoint.
     */
    @JsonProperty("custom_headers")
    protected List customHeaders;

    /**
     * Constructs a validated instance of {@link WebhookSubscriptionDeliveryMethod}.
     *
     * @param spec the specification to process
     */
    public WebhookSubscriptionDeliveryMethod(Consumer<WebhookSubscriptionDeliveryMethod> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WebhookSubscriptionDeliveryMethod}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WebhookSubscriptionDeliveryMethod(Consumer)} instead.
     * @param id id
     * @param secret The secret used to sign webhook payloads. Only provided on the initial create response.
     * @param temporarilyDisabled Whether or not this webhook subscription is temporarily disabled. Becomes {@code true} if the delivery method URL is repeatedly rejected by the server.
     * @param type Indicates the type of the delivery method.
     * @param url The destination URL for webhook delivery.
     * @param customHeaders Optional headers to be set on this webhook subscription when sent. The header values are redacted in GET requests, but are not redacted on the webhook when delivered to the webhook's endpoint.
     */
    @ApiStatus.Internal
    public WebhookSubscriptionDeliveryMethod(String id, String secret, Boolean temporarilyDisabled, TypeEnum type, String url, List customHeaders) {
        this.id = id;
        this.secret = secret;
        this.temporarilyDisabled = temporarilyDisabled;
        this.type = type;
        this.url = url;
        this.customHeaders = customHeaders;
    }

    /**
     * Indicates the type of the delivery method.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        HTTP_DELIVERY_METHOD("http_delivery_method");

        private static final TypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static TypeEnum of(String input) {
            if (input != null) {
                for (TypeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
