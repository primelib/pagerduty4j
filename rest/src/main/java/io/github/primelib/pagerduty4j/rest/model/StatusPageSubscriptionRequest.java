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
 * StatusPageSubscriptionRequest
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
    "status_page",
    "subscribable_object",
    "type"
})
@JsonTypeName("StatusPageSubscriptionRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class StatusPageSubscriptionRequest {

    /**
     * The channel of the Subscription.
     */
    @JsonProperty("channel")
    protected ChannelEnum channel;

    /**
     * The subscriber's contact - email address or webhook URL.
     */
    @JsonProperty("contact")
    protected String contact;

    @JsonProperty("status_page")
    protected StatusPageSubscriptionRequestStatusPage statusPage;

    @JsonProperty("subscribable_object")
    protected SubscribableObject subscribableObject;

    /**
     * A string that determines the schema of the object.
     */
    @JsonProperty("type")
    protected String type;

    /**
     * Constructs a validated instance of {@link StatusPageSubscriptionRequest}.
     *
     * @param spec the specification to process
     */
    public StatusPageSubscriptionRequest(Consumer<StatusPageSubscriptionRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link StatusPageSubscriptionRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #StatusPageSubscriptionRequest(Consumer)} instead.
     * @param channel The channel of the Subscription.
     * @param contact The subscriber's contact - email address or webhook URL.
     * @param statusPage statusPage
     * @param subscribableObject subscribableObject
     * @param type A string that determines the schema of the object.
     */
    @ApiStatus.Internal
    public StatusPageSubscriptionRequest(ChannelEnum channel, String contact, StatusPageSubscriptionRequestStatusPage statusPage, SubscribableObject subscribableObject, String type) {
        this.channel = channel;
        this.contact = contact;
        this.statusPage = statusPage;
        this.subscribableObject = subscribableObject;
        this.type = type;
    }

    /**
     * The channel of the Subscription.
     */
    @AllArgsConstructor
    public enum ChannelEnum {
        WEBHOOK("webhook"),
        EMAIL("email");

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

}
