package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebhookSubscriptionUpdateWebhookSubscriptionFilter
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private String id;

    /**
     * The type of object being used as the filter.
     */
    @JsonProperty("type")
    private TypeEnum type;


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
