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
 * CreateUserHandoffNotificationRuleRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "oncall_handoff_notification_rule"
})
@JsonTypeName("createUserHandoffNotificationRule_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateUserHandoffNotificationRuleRequest {

    /**
     * Constructs a validated implementation of {@link CreateUserHandoffNotificationRuleRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateUserHandoffNotificationRuleRequest(Consumer<CreateUserHandoffNotificationRuleRequest> spec) {
        spec.accept(this);
    }

    @JsonProperty("oncall_handoff_notification_rule")
    protected HandoffNotificationRule oncallHandoffNotificationRule;


}
