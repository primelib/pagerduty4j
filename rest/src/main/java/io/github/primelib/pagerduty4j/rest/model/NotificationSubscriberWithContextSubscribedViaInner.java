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
 * NotificationSubscriberWithContextSubscribedViaInner
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
    "id",
    "name"
})
@JsonTypeName("NotificationSubscriberWithContext_subscribed_via_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class NotificationSubscriberWithContextSubscribedViaInner {

    /**
     * The id of the object this subscriber is subscribed via
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The type of the object this subscriber is subscribed via
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Constructs a validated instance of {@link NotificationSubscriberWithContextSubscribedViaInner}.
     *
     * @param spec the specification to process
     */
    public NotificationSubscriberWithContextSubscribedViaInner(Consumer<NotificationSubscriberWithContextSubscribedViaInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link NotificationSubscriberWithContextSubscribedViaInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #NotificationSubscriberWithContextSubscribedViaInner(Consumer)} instead.
     * @param id The id of the object this subscriber is subscribed via
     * @param name The type of the object this subscriber is subscribed via
     */
    @ApiStatus.Internal
    public NotificationSubscriberWithContextSubscribedViaInner(String id, String name) {
        this.id = id;
        this.name = name;
    }

}
