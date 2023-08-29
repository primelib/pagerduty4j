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

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateBusinessServiceNotificationSubscribersRequest
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
    "subscribers"
})
@JsonTypeName("createBusinessServiceNotificationSubscribers_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateBusinessServiceNotificationSubscribersRequest {

    @JsonProperty("subscribers")
    protected Set<NotificationSubscriber> subscribers;

    /**
     * Constructs a validated instance of {@link CreateBusinessServiceNotificationSubscribersRequest}.
     *
     * @param spec the specification to process
     */
    public CreateBusinessServiceNotificationSubscribersRequest(Consumer<CreateBusinessServiceNotificationSubscribersRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateBusinessServiceNotificationSubscribersRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateBusinessServiceNotificationSubscribersRequest(Consumer)} instead.
     * @param subscribers subscribers
     */
    @ApiStatus.Internal
    public CreateBusinessServiceNotificationSubscribersRequest(Set<NotificationSubscriber> subscribers) {
        this.subscribers = subscribers;
    }

}
