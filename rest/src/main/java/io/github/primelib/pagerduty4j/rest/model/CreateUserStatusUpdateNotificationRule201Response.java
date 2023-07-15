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
 * CreateUserStatusUpdateNotificationRule201Response
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "status_update_notification_rule"
})
@JsonTypeName("createUserStatusUpdateNotificationRule_201_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateUserStatusUpdateNotificationRule201Response {

    /**
     * Constructs a validated implementation of {@link CreateUserStatusUpdateNotificationRule201Response}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateUserStatusUpdateNotificationRule201Response(Consumer<CreateUserStatusUpdateNotificationRule201Response> spec) {
        spec.accept(this);
    }

    @JsonProperty("status_update_notification_rule")
    protected StatusUpdateNotificationRule statusUpdateNotificationRule;


}
