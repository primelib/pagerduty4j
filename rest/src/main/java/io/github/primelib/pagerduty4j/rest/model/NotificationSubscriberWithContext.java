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
 * NotificationSubscriberWithContext
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
    "has_indirect_subscription",
    "subscribed_via"
})
@JsonTypeName("NotificationSubscriberWithContext")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class NotificationSubscriberWithContext {

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
     * If this subcriber has an indirect subscription to this incident via another object
     */
    @JsonProperty("has_indirect_subscription")
    protected Boolean hasIndirectSubscription;

    @JsonProperty("subscribed_via")
    protected List<NotificationSubscriberWithContextSubscribedViaInner> subscribedVia;

    /**
     * Constructs a validated instance of {@link NotificationSubscriberWithContext}.
     *
     * @param spec the specification to process
     */
    public NotificationSubscriberWithContext(Consumer<NotificationSubscriberWithContext> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link NotificationSubscriberWithContext}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #NotificationSubscriberWithContext(Consumer)} instead.
     * @param subscriberId The ID of the entity being subscribed
     * @param subscriberType The type of the entity being subscribed
     * @param hasIndirectSubscription If this subcriber has an indirect subscription to this incident via another object
     * @param subscribedVia var.name
     */
    @ApiStatus.Internal
    public NotificationSubscriberWithContext(String subscriberId, SubscriberTypeEnum subscriberType, Boolean hasIndirectSubscription, List<NotificationSubscriberWithContextSubscribedViaInner> subscribedVia) {
        this.subscriberId = subscriberId;
        this.subscriberType = subscriberType;
        this.hasIndirectSubscription = hasIndirectSubscription;
        this.subscribedVia = subscribedVia;
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

}
