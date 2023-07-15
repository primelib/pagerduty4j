package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * NotificationSubscriberWithContext
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link NotificationSubscriberWithContext}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public NotificationSubscriberWithContext(Consumer<NotificationSubscriberWithContext> spec) {
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
     * If this subcriber has an indirect subscription to this incident via another object
     */
    @JsonProperty("has_indirect_subscription")
    protected Boolean hasIndirectSubscription;

    @JsonProperty("subscribed_via")
    protected List<NotificationSubscriberWithContextSubscribedViaInner> subscribedVia;


    /**
     * The type of the entity being subscribed
     */
    @AllArgsConstructor
    public enum SubscriberTypeEnum {
        USER("user"),
        TEAM("team");

        private final String value;
    }

}
