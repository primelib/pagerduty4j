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
 * GetTeamNotificationSubscriptions200ResponseAllOfSubscriptionsInner
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "subscription",
    "subscribable_name"
})
@JsonTypeName("getTeamNotificationSubscriptions_200_response_allOf_subscriptions_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetTeamNotificationSubscriptions200ResponseAllOfSubscriptionsInner {

    /**
     * Constructs a validated implementation of {@link GetTeamNotificationSubscriptions200ResponseAllOfSubscriptionsInner}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetTeamNotificationSubscriptions200ResponseAllOfSubscriptionsInner(Consumer<GetTeamNotificationSubscriptions200ResponseAllOfSubscriptionsInner> spec) {
        spec.accept(this);
    }

    @JsonProperty("subscription")
    protected NotificationSubscription subscription;

    /**
     * The name of the subscribable
     */
    @JsonProperty("subscribable_name")
    protected String subscribableName;


}
