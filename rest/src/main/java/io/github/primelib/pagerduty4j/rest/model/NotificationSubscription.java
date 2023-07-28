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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * NotificationSubscription
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
    "account_id"
})
@JsonTypeName("NotificationSubscription")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class NotificationSubscription {

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
     * The ID of the account belonging to the subscriber entity
     */
    @JsonProperty("account_id")
    protected String accountId;

    /**
     * Constructs a validated instance of {@link NotificationSubscription}.
     *
     * @param spec the specification to process
     */
    public NotificationSubscription(Consumer<NotificationSubscription> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link NotificationSubscription}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #NotificationSubscription(Consumer)} instead.
     * @param subscriberId The ID of the entity being subscribed
     * @param subscriberType The type of the entity being subscribed
     * @param subscribableId The ID of the entity being subscribed to
     * @param subscribableType The type of the entity being subscribed to
     * @param accountId The ID of the account belonging to the subscriber entity
     */
    @ApiStatus.Internal
    public NotificationSubscription(String subscriberId, SubscriberTypeEnum subscriberType, String subscribableId, SubscribableTypeEnum subscribableType, String accountId) {
        this.subscriberId = subscriberId;
        this.subscriberType = subscriberType;
        this.subscribableId = subscribableId;
        this.subscribableType = subscribableType;
        this.accountId = accountId;
    }

    /**
     * The type of the entity being subscribed
     */
    @AllArgsConstructor
    public enum SubscriberTypeEnum {
        USER("user"),
        TEAM("team");

        private static final SubscriberTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static SubscriberTypeEnum of(String input) {
            if (input != null) {
                for (SubscriberTypeEnum v : VALUES) {
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

    /**
     * The type of the entity being subscribed to
     */
    @AllArgsConstructor
    public enum SubscribableTypeEnum {
        INCIDENT("incident"),
        BUSINESS_SERVICE("business_service");

        private static final SubscribableTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static SubscribableTypeEnum of(String input) {
            if (input != null) {
                for (SubscribableTypeEnum v : VALUES) {
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
