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
 * UpdateUserStatusUpdateNotificationRule200Response
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
@JsonTypeName("updateUserStatusUpdateNotificationRule_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateUserStatusUpdateNotificationRule200Response {

    @JsonProperty("notification_rule")
    protected StatusUpdateNotificationRule notificationRule;

    /**
     * Constructs a validated instance of {@link UpdateUserStatusUpdateNotificationRule200Response}.
     *
     * @param spec the specification to process
     */
    public UpdateUserStatusUpdateNotificationRule200Response(Consumer<UpdateUserStatusUpdateNotificationRule200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UpdateUserStatusUpdateNotificationRule200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UpdateUserStatusUpdateNotificationRule200Response(Consumer)} instead.
     * @param notificationRule notificationRule
     */
    @ApiStatus.Internal
    public UpdateUserStatusUpdateNotificationRule200Response(StatusUpdateNotificationRule notificationRule) {
        this.notificationRule = notificationRule;
    }

}
