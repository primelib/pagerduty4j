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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Notification
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
     * The address where the notification was sent. This will be null for notification type {@code push_notification}.
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
     * Constructs a validated instance of {@link Notification}.
     *
     * @param spec the specification to process
     */
    public Notification(Consumer<Notification> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Notification}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Notification(Consumer)} instead.
     * @param id id
     * @param type The type of notification.
     * @param startedAt The time at which the notification was sent
     * @param address The address where the notification was sent. This will be null for notification type {@code push_notification}.
     * @param user user
     * @param conferenceAddress The address of the conference bridge
     * @param status status
     */
    @ApiStatus.Internal
    public Notification(String id, TypeEnum type, OffsetDateTime startedAt, String address, UserReference user, String conferenceAddress, String status) {
        this.id = id;
        this.type = type;
        this.startedAt = startedAt;
        this.address = address;
        this.user = user;
        this.conferenceAddress = conferenceAddress;
        this.status = status;
    }

    /**
     * The type of notification.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        SMS_NOTIFICATION("sms_notification"),
        EMAIL_NOTIFICATION("email_notification"),
        PHONE_NOTIFICATION("phone_notification"),
        PUSH_NOTIFICATION("push_notification");

        private static final TypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static TypeEnum of(String input) {
            if (input != null) {
                for (TypeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
