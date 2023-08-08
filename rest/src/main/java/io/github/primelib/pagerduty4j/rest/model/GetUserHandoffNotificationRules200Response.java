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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetUserHandoffNotificationRules200Response
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
    "oncall_handoff_notification_rules"
})
@JsonTypeName("getUserHandoffNotificationRules_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetUserHandoffNotificationRules200Response {

    @JsonProperty("oncall_handoff_notification_rules")
    protected List<HandoffNotificationRule> oncallHandoffNotificationRules;

    /**
     * Constructs a validated instance of {@link GetUserHandoffNotificationRules200Response}.
     *
     * @param spec the specification to process
     */
    public GetUserHandoffNotificationRules200Response(Consumer<GetUserHandoffNotificationRules200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetUserHandoffNotificationRules200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetUserHandoffNotificationRules200Response(Consumer)} instead.
     * @param oncallHandoffNotificationRules oncallHandoffNotificationRules
     */
    @ApiStatus.Internal
    public GetUserHandoffNotificationRules200Response(List<HandoffNotificationRule> oncallHandoffNotificationRules) {
        this.oncallHandoffNotificationRules = oncallHandoffNotificationRules;
    }

}
