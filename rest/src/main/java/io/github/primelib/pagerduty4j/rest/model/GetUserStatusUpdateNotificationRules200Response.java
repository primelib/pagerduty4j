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
 * GetUserStatusUpdateNotificationRules200Response
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "status_update_notification_rules"
})
@JsonTypeName("getUserStatusUpdateNotificationRules_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetUserStatusUpdateNotificationRules200Response {

    /**
     * Constructs a validated implementation of {@link GetUserStatusUpdateNotificationRules200Response}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetUserStatusUpdateNotificationRules200Response(Consumer<GetUserStatusUpdateNotificationRules200Response> spec) {
        spec.accept(this);
    }

    @JsonProperty("status_update_notification_rules")
    protected List<StatusUpdateNotificationRule> statusUpdateNotificationRules = new ArrayList<>();


}
