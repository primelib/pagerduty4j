package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateUserStatusUpdateNotificationRule201Response
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "status_update_notification_rule"
})
@JsonTypeName("createUserStatusUpdateNotificationRule_201_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateUserStatusUpdateNotificationRule201Response {

    @JsonProperty("status_update_notification_rule")
    private StatusUpdateNotificationRule statusUpdateNotificationRule;


}
