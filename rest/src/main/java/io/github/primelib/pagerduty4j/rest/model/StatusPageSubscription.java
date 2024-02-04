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
 * StatusPageSubscription
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
    "channel",
    "contact",
    "id",
    "self",
    "status",
    "status_page",
    "subscribable_object",
    "type"
})
@JsonTypeName("StatusPageSubscription")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class StatusPageSubscription {

    /**
     * The channel of the subscription.
     */
    @JsonProperty("channel")
    protected ChannelEnum channel;

    /**
     * The subscriber's contact - email address, webhook URL, etc...
     */
    @JsonProperty("contact")
    protected String contact;

    /**
     * The ID of the Subscription.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The path in which the Subscription resource is accessible.
     */
    @JsonProperty("self")
    protected String self;

    /**
     * The status of the Subscription.
     */
    @JsonProperty("status")
    protected StatusEnum status;

    @JsonProperty("status_page")
    protected StatusPageImpactStatusPage statusPage;

    @JsonProperty("subscribable_object")
    protected SubscribableObject1 subscribableObject;

    /**
     * A string that determines the schema of the object.
     */
    @JsonProperty("type")
    protected String type;

    /**
     * Constructs a validated instance of {@link StatusPageSubscription}.
     *
     * @param spec the specification to process
     */
    public StatusPageSubscription(Consumer<StatusPageSubscription> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link StatusPageSubscription}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #StatusPageSubscription(Consumer)} instead.
     * @param channel The channel of the subscription.
     * @param contact The subscriber's contact - email address, webhook URL, etc...
     * @param id The ID of the Subscription.
     * @param self The path in which the Subscription resource is accessible.
     * @param status The status of the Subscription.
     * @param statusPage statusPage
     * @param subscribableObject subscribableObject
     * @param type A string that determines the schema of the object.
     */
    @ApiStatus.Internal
    public StatusPageSubscription(ChannelEnum channel, String contact, String id, String self, StatusEnum status, StatusPageImpactStatusPage statusPage, SubscribableObject1 subscribableObject, String type) {
        this.channel = channel;
        this.contact = contact;
        this.id = id;
        this.self = self;
        this.status = status;
        this.statusPage = statusPage;
        this.subscribableObject = subscribableObject;
        this.type = type;
    }

    /**
     * The channel of the subscription.
     */
    @AllArgsConstructor
    public enum ChannelEnum {
        WEBHOOK("webhook"),
        EMAIL("email"),
        SLACK("slack");

        private static final ChannelEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static ChannelEnum of(String input) {
            if (input != null) {
                for (ChannelEnum v : VALUES) {
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
     * The status of the Subscription.
     */
    @AllArgsConstructor
    public enum StatusEnum {
        ACTIVE("active"),
        PENDING("pending");

        private static final StatusEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static StatusEnum of(String input) {
            if (input != null) {
                for (StatusEnum v : VALUES) {
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
