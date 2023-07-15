package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetUserHandoffNotificationRules200Response
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "oncall_handoff_notification_rules"
})
@JsonTypeName("getUserHandoffNotificationRules_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetUserHandoffNotificationRules200Response {

    /**
     * Constructs a validated implementation of {@link GetUserHandoffNotificationRules200Response}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetUserHandoffNotificationRules200Response(Consumer<GetUserHandoffNotificationRules200Response> spec) {
        spec.accept(this);
    }

    @JsonProperty("oncall_handoff_notification_rules")
    protected List<HandoffNotificationRule> oncallHandoffNotificationRules = new ArrayList<>();


}
