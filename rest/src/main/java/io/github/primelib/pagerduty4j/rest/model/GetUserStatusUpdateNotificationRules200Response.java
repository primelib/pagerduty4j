package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
@JsonPropertyOrder({
    "status_update_notification_rules"
})
@JsonTypeName("getUserStatusUpdateNotificationRules_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetUserStatusUpdateNotificationRules200Response {

    @JsonProperty("status_update_notification_rules")
    private List<StatusUpdateNotificationRule> statusUpdateNotificationRules = new ArrayList<>();


}
