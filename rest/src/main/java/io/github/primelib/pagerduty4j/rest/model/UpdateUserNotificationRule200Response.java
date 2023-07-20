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
 * UpdateUserNotificationRule200Response
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
    "notification_rule"
})
@JsonTypeName("updateUserNotificationRule_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateUserNotificationRule200Response {

    @JsonProperty("notification_rule")
    protected NotificationRule notificationRule;

    /**
     * Constructs a validated instance of {@link UpdateUserNotificationRule200Response}.
     *
     * @param spec the specification to process
     */
    public UpdateUserNotificationRule200Response(Consumer<UpdateUserNotificationRule200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UpdateUserNotificationRule200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UpdateUserNotificationRule200Response(Consumer)} instead.
     * @param notificationRule var.name
     */
    @ApiStatus.Internal
    public UpdateUserNotificationRule200Response(NotificationRule notificationRule) {
        this.notificationRule = notificationRule;
    }

}
