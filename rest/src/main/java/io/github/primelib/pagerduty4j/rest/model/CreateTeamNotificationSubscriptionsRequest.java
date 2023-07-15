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
 * CreateTeamNotificationSubscriptionsRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "subscribables"
})
@JsonTypeName("createTeamNotificationSubscriptions_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateTeamNotificationSubscriptionsRequest {

    /**
     * Constructs a validated implementation of {@link CreateTeamNotificationSubscriptionsRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateTeamNotificationSubscriptionsRequest(Consumer<CreateTeamNotificationSubscriptionsRequest> spec) {
        spec.accept(this);
    }

    @JsonProperty("subscribables")
    protected Set<NotificationSubscribable> subscribables = new LinkedHashSet<>();


}
