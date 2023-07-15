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
 * NotificationSubscriberWithContextSubscribedViaInner
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "name"
})
@JsonTypeName("NotificationSubscriberWithContext_subscribed_via_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class NotificationSubscriberWithContextSubscribedViaInner {

    /**
     * Constructs a validated implementation of {@link NotificationSubscriberWithContextSubscribedViaInner}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public NotificationSubscriberWithContextSubscribedViaInner(Consumer<NotificationSubscriberWithContextSubscribedViaInner> spec) {
        spec.accept(this);
    }

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


}
