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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebhookSubscriptionUpdateWebhookSubscriptionFilter
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
    "type"
})
@JsonTypeName("WebhookSubscriptionUpdate_webhook_subscription_filter")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WebhookSubscriptionUpdateWebhookSubscriptionFilter {

    /**
     * The id of the object being used as the filter.
     * This field is required for all filter types except account_reference.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The type of object being used as the filter.
     */
    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * Constructs a validated instance of {@link WebhookSubscriptionUpdateWebhookSubscriptionFilter}.
     *
     * @param spec the specification to process
     */
    public WebhookSubscriptionUpdateWebhookSubscriptionFilter(Consumer<WebhookSubscriptionUpdateWebhookSubscriptionFilter> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WebhookSubscriptionUpdateWebhookSubscriptionFilter}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WebhookSubscriptionUpdateWebhookSubscriptionFilter(Consumer)} instead.
     * @param id The id of the object being used as the filter.  This field is required for all filter types except account_reference.
     * @param type The type of object being used as the filter.
     */
    @ApiStatus.Internal
    public WebhookSubscriptionUpdateWebhookSubscriptionFilter(String id, TypeEnum type) {
        this.id = id;
        this.type = type;
    }

    /**
     * The type of object being used as the filter.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        ACCOUNT_REFERENCE("account_reference"),
        SERVICE_REFERENCE("service_reference"),
        TEAM_REFERENCE("team_reference");

        private final String value;
    }

}
