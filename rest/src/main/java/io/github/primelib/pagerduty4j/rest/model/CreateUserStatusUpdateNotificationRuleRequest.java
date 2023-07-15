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
 * CreateUserStatusUpdateNotificationRuleRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "status_update_notification_rule"
})
@JsonTypeName("createUserStatusUpdateNotificationRule_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateUserStatusUpdateNotificationRuleRequest {

    /**
     * Constructs a validated implementation of {@link CreateUserStatusUpdateNotificationRuleRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateUserStatusUpdateNotificationRuleRequest(Consumer<CreateUserStatusUpdateNotificationRuleRequest> spec) {
        spec.accept(this);
    }

    @JsonProperty("status_update_notification_rule")
    protected StatusUpdateNotificationRule statusUpdateNotificationRule;


}
