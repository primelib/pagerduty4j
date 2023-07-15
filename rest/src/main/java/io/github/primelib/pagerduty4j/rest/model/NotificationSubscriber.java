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
 * NotificationSubscriber
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "subscriber_id",
    "subscriber_type"
})
@JsonTypeName("NotificationSubscriber")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class NotificationSubscriber {

    /**
     * Constructs a validated implementation of {@link NotificationSubscriber}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public NotificationSubscriber(Consumer<NotificationSubscriber> spec) {
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
     * The type of the entity being subscribed
     */
    @AllArgsConstructor
    public enum SubscriberTypeEnum {
        USER("user"),
        TEAM("team");

        private final String value;
    }

}
