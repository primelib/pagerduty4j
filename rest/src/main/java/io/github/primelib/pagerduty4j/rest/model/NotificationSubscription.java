package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * NotificationSubscription
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private String subscriberId;

    /**
     * The type of the entity being subscribed
     */
    @JsonProperty("subscriber_type")
    private SubscriberTypeEnum subscriberType;

    /**
     * The ID of the entity being subscribed to
     */
    @JsonProperty("subscribable_id")
    private String subscribableId;

    /**
     * The type of the entity being subscribed to
     */
    @JsonProperty("subscribable_type")
    private SubscribableTypeEnum subscribableType;

    /**
     * The ID of the account belonging to the subscriber entity
     */
    @JsonProperty("account_id")
    private String accountId;


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

}
