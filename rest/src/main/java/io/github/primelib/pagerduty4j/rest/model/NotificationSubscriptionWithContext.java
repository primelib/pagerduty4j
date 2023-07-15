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
 * NotificationSubscriptionWithContext
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link NotificationSubscriptionWithContext}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public NotificationSubscriptionWithContext(Consumer<NotificationSubscriptionWithContext> spec) {
        spec.accept(this);
    }

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
