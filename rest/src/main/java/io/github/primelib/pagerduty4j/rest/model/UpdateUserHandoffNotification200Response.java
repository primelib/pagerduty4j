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
 * UpdateUserHandoffNotification200Response
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "oncall_handoff_notification_rule"
})
@JsonTypeName("updateUserHandoffNotification_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateUserHandoffNotification200Response {

    /**
     * Constructs a validated implementation of {@link UpdateUserHandoffNotification200Response}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateUserHandoffNotification200Response(Consumer<UpdateUserHandoffNotification200Response> spec) {
        spec.accept(this);
    }

    @JsonProperty("oncall_handoff_notification_rule")
    protected HandoffNotificationRule oncallHandoffNotificationRule;


}
