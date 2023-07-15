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
 * CreateUserNotificationRuleRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "notification_rule"
})
@JsonTypeName("createUserNotificationRule_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateUserNotificationRuleRequest {

    /**
     * Constructs a validated implementation of {@link CreateUserNotificationRuleRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateUserNotificationRuleRequest(Consumer<CreateUserNotificationRuleRequest> spec) {
        spec.accept(this);
    }

    @JsonProperty("notification_rule")
    protected NotificationRule notificationRule;


}
