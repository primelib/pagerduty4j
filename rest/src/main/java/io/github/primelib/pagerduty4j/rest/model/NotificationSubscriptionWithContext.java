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
 * NotificationSubscriptionWithContext
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
    "subscriber_id",
    "subscriber_type",
    "subscribable_id",
    "subscribable_type",
    "account_id",
    "result"
})
@JsonTypeName("NotificationSubscriptionWithContext")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class NotificationSubscriptionWithContext {

    /**
     * The ID of the entity being subscribed
     */
    @JsonProperty("subscriber_id")
    protected String subscriberId;

    /**
     * The type of the entity being subscribed
     */
    @JsonProperty("subscriber_type")
    protected SubscriberTypeEnum subscriberType;

    /**
     * The ID of the entity being subscribed to
     */
    @JsonProperty("subscribable_id")
    protected String subscribableId;

    /**
     * The type of the entity being subscribed to
     */
    @JsonProperty("subscribable_type")
    protected SubscribableTypeEnum subscribableType;

    /**
     * The type of the entity being subscribed to
     */
    @JsonProperty("account_id")
    protected String accountId;

    /**
     * The resulting status of the subscription
     */
    @JsonProperty("result")
    protected ResultEnum result;

    /**
     * Constructs a validated instance of {@link NotificationSubscriptionWithContext}.
     *
     * @param spec the specification to process
     */
    public NotificationSubscriptionWithContext(Consumer<NotificationSubscriptionWithContext> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link NotificationSubscriptionWithContext}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #NotificationSubscriptionWithContext(Consumer)} instead.
     * @param subscriberId The ID of the entity being subscribed
     * @param subscriberType The type of the entity being subscribed
     * @param subscribableId The ID of the entity being subscribed to
     * @param subscribableType The type of the entity being subscribed to
     * @param accountId The type of the entity being subscribed to
     * @param result The resulting status of the subscription
     */
    @ApiStatus.Internal
    public NotificationSubscriptionWithContext(String subscriberId, SubscriberTypeEnum subscriberType, String subscribableId, SubscribableTypeEnum subscribableType, String accountId, ResultEnum result) {
        this.subscriberId = subscriberId;
        this.subscriberType = subscriberType;
        this.subscribableId = subscribableId;
        this.subscribableType = subscribableType;
        this.accountId = accountId;
        this.result = result;
    }

    /**
     * The type of the entity being subscribed
     */
    @AllArgsConstructor
    public enum SubscriberTypeEnum {
        USER("user"),
        TEAM("team");

        private final String value;
    }

    /**
     * The type of the entity being subscribed to
     */
    @AllArgsConstructor
    public enum SubscribableTypeEnum {
        INCIDENT("incident"),
        BUSINESS_SERVICE("business_service");

        private final String value;
    }

    /**
     * The resulting status of the subscription
     */
    @AllArgsConstructor
    public enum ResultEnum {
        SUCCESS("success"),
        DUPLICATE("duplicate"),
        UNAUTHORIZED("unauthorized");

        private final String value;
    }

}
