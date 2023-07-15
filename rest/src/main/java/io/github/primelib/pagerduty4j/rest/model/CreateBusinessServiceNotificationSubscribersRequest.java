package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateBusinessServiceNotificationSubscribersRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "subscribers"
})
@JsonTypeName("createBusinessServiceNotificationSubscribers_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateBusinessServiceNotificationSubscribersRequest {

    /**
     * Constructs a validated implementation of {@link CreateBusinessServiceNotificationSubscribersRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateBusinessServiceNotificationSubscribersRequest(Consumer<CreateBusinessServiceNotificationSubscribersRequest> spec) {
        spec.accept(this);
    }

    @JsonProperty("subscribers")
    protected Set<NotificationSubscriber> subscribers = new LinkedHashSet<>();


}
