package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetTeamNotificationSubscriptions200ResponseAllOfSubscriptionsInner
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "subscription",
    "subscribable_name"
})
@JsonTypeName("getTeamNotificationSubscriptions_200_response_allOf_subscriptions_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetTeamNotificationSubscriptions200ResponseAllOfSubscriptionsInner {

    @JsonProperty("subscription")
    private NotificationSubscription subscription;

    /**
     * The name of the subscribable
     */
    @JsonProperty("subscribable_name")
    private String subscribableName;


}
