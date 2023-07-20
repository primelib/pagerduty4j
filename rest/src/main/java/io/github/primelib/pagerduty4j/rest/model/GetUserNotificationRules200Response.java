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
 * GetUserNotificationRules200Response
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
    "notification_rules"
})
@JsonTypeName("getUserNotificationRules_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetUserNotificationRules200Response {

    @JsonProperty("notification_rules")
    protected List<NotificationRule> notificationRules;

    /**
     * Constructs a validated instance of {@link GetUserNotificationRules200Response}.
     *
     * @param spec the specification to process
     */
    public GetUserNotificationRules200Response(Consumer<GetUserNotificationRules200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetUserNotificationRules200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetUserNotificationRules200Response(Consumer)} instead.
     * @param notificationRules var.name
     */
    @ApiStatus.Internal
    public GetUserNotificationRules200Response(List<NotificationRule> notificationRules) {
        this.notificationRules = notificationRules;
    }

}
