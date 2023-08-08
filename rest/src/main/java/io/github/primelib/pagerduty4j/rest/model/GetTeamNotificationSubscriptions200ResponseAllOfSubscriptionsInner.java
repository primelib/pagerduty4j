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
 * GetTeamNotificationSubscriptions200ResponseAllOfSubscriptionsInner
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
    "subscription",
    "subscribable_name"
})
@JsonTypeName("getTeamNotificationSubscriptions_200_response_allOf_subscriptions_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetTeamNotificationSubscriptions200ResponseAllOfSubscriptionsInner {

    @JsonProperty("subscription")
    protected NotificationSubscription subscription;

    /**
     * The name of the subscribable
     */
    @JsonProperty("subscribable_name")
    protected String subscribableName;

    /**
     * Constructs a validated instance of {@link GetTeamNotificationSubscriptions200ResponseAllOfSubscriptionsInner}.
     *
     * @param spec the specification to process
     */
    public GetTeamNotificationSubscriptions200ResponseAllOfSubscriptionsInner(Consumer<GetTeamNotificationSubscriptions200ResponseAllOfSubscriptionsInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetTeamNotificationSubscriptions200ResponseAllOfSubscriptionsInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetTeamNotificationSubscriptions200ResponseAllOfSubscriptionsInner(Consumer)} instead.
     * @param subscription subscription
     * @param subscribableName The name of the subscribable
     */
    @ApiStatus.Internal
    public GetTeamNotificationSubscriptions200ResponseAllOfSubscriptionsInner(NotificationSubscription subscription, String subscribableName) {
        this.subscription = subscription;
        this.subscribableName = subscribableName;
    }

}
