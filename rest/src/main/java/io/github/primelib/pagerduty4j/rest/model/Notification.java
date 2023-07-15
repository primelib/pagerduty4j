package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Notification
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "id",
    "type",
    "started_at",
    "address",
    "user",
    "conferenceAddress",
    "status"
})
@JsonTypeName("Notification")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Notification {

    @JsonProperty("id")
    private String id;

    /**
     * The type of notification.
     */
    @JsonProperty("type")
    private TypeEnum type;

    /**
     * The time at which the notification was sent
     */
    @JsonProperty("started_at")
    private OffsetDateTime startedAt;

    /**
     * The address where the notification was sent. This will be null for notification type `push_notification`.
     */
    @JsonProperty("address")
    private String address;

    @JsonProperty("user")
    private UserReference user;

    /**
     * The address of the conference bridge
     */
    @JsonProperty("conferenceAddress")
    private String conferenceAddress;

    @JsonProperty("status")
    private String status;


    /**
     * The type of notification.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        SMS_NOTIFICATION("sms_notification"),
        EMAIL_NOTIFICATION("email_notification"),
        PHONE_NOTIFICATION("phone_notification"),
        PUSH_NOTIFICATION("push_notification");

        private final String value;
    }

}
