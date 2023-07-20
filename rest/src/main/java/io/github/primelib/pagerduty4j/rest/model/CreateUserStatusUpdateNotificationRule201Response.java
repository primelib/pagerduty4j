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
 * CreateUserStatusUpdateNotificationRule201Response
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
    "status_update_notification_rule"
})
@JsonTypeName("createUserStatusUpdateNotificationRule_201_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateUserStatusUpdateNotificationRule201Response {

    @JsonProperty("status_update_notification_rule")
    protected StatusUpdateNotificationRule statusUpdateNotificationRule;

    /**
     * Constructs a validated instance of {@link CreateUserStatusUpdateNotificationRule201Response}.
     *
     * @param spec the specification to process
     */
    public CreateUserStatusUpdateNotificationRule201Response(Consumer<CreateUserStatusUpdateNotificationRule201Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateUserStatusUpdateNotificationRule201Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateUserStatusUpdateNotificationRule201Response(Consumer)} instead.
     * @param statusUpdateNotificationRule var.name
     */
    @ApiStatus.Internal
    public CreateUserStatusUpdateNotificationRule201Response(StatusUpdateNotificationRule statusUpdateNotificationRule) {
        this.statusUpdateNotificationRule = statusUpdateNotificationRule;
    }

}
