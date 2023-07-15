package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateUserStatusUpdateNotificationRuleRequest
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "status_update_notification_rule"
})
@JsonTypeName("createUserStatusUpdateNotificationRule_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateUserStatusUpdateNotificationRuleRequest {

    @JsonProperty("status_update_notification_rule")
    private StatusUpdateNotificationRule statusUpdateNotificationRule;


}
