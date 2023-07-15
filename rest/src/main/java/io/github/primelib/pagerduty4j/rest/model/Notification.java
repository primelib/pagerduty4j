package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

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
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link Notification}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Notification(Consumer<Notification> spec) {
        spec.accept(this);
    }

    @JsonProperty("id")
    protected String id;

    /**
     * The type of notification.
     */
    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * The time at which the notification was sent
     */
    @JsonProperty("started_at")
    protected OffsetDateTime startedAt;

    /**
     * The address where the notification was sent. This will be null for notification type `push_notification`.
     */
    @JsonProperty("address")
    protected String address;

    @JsonProperty("user")
    protected UserReference user;

    /**
     * The address of the conference bridge
     */
    @JsonProperty("conferenceAddress")
    protected String conferenceAddress;

    @JsonProperty("status")
    protected String status;


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
