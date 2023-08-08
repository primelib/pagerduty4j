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
 * CreateUserNotificationRuleRequest
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
@JsonTypeName("createUserNotificationRule_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateUserNotificationRuleRequest {

    @JsonProperty("notification_rule")
    protected NotificationRule notificationRule;

    /**
     * Constructs a validated instance of {@link CreateUserNotificationRuleRequest}.
     *
     * @param spec the specification to process
     */
    public CreateUserNotificationRuleRequest(Consumer<CreateUserNotificationRuleRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateUserNotificationRuleRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateUserNotificationRuleRequest(Consumer)} instead.
     * @param notificationRule notificationRule
     */
    @ApiStatus.Internal
    public CreateUserNotificationRuleRequest(NotificationRule notificationRule) {
        this.notificationRule = notificationRule;
    }

}
