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
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * GetUserContactMethods200ResponseContactMethodsInner
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
    "summary",
    "type",
    "self",
    "html_url",
    "label",
    "address",
    "device_type",
    "sounds",
    "created_at",
    "blacklisted",
    "send_short_email"
})
@JsonTypeName("getUserContactMethods_200_response_contact_methods_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetUserContactMethods200ResponseContactMethodsInner {

    @JsonProperty("id")
    protected String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to {@code name}, though it is not intended to be an identifier.
     */
    @JsonProperty("summary")
    protected String summary;

    @JsonProperty("type")
    protected ContactMethodType type;

    /**
     * the API show URL at which the object is accessible
     */
    @JsonProperty("self")
    protected String self;

    /**
     * a URL at which the entity is uniquely displayed in the Web app
     */
    @JsonProperty("html_url")
    protected String htmlUrl;

    /**
     * The label (e.g., "Work", "Mobile", etc.).
     */
    @JsonProperty("label")
    protected String label;

    /**
     * The "address" to deliver to: email, phone number, etc., depending on the type.
     */
    @JsonProperty("address")
    protected String address;

    /**
     * The type of device.
     */
    @JsonProperty("device_type")
    protected DeviceTypeEnum deviceType;

    @JsonProperty("sounds")
    protected List<PushContactMethodSound> sounds;

    /**
     * Time at which the contact method was created.
     */
    @JsonProperty("created_at")
    protected OffsetDateTime createdAt;

    /**
     * If true, this phone has been blacklisted by PagerDuty and no messages will be sent to it.
     */
    @JsonProperty("blacklisted")
    protected Boolean blacklisted;

    /**
     * Send an abbreviated email message instead of the standard email output. Useful for email-to-SMS gateways and email based pagers.
     */
    @JsonProperty("send_short_email")
    protected Boolean sendShortEmail;

    /**
     * Constructs a validated instance of {@link GetUserContactMethods200ResponseContactMethodsInner}.
     *
     * @param spec the specification to process
     */
    public GetUserContactMethods200ResponseContactMethodsInner(Consumer<GetUserContactMethods200ResponseContactMethodsInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetUserContactMethods200ResponseContactMethodsInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetUserContactMethods200ResponseContactMethodsInner(Consumer)} instead.
     * @param id id
     * @param summary A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to {@code name}, though it is not intended to be an identifier.
     * @param type type
     * @param self the API show URL at which the object is accessible
     * @param htmlUrl a URL at which the entity is uniquely displayed in the Web app
     * @param label The label (e.g., "Work", "Mobile", etc.).
     * @param address The "address" to deliver to: email, phone number, etc., depending on the type.
     * @param deviceType The type of device.
     * @param sounds sounds
     * @param createdAt Time at which the contact method was created.
     * @param blacklisted If true, this phone has been blacklisted by PagerDuty and no messages will be sent to it.
     * @param sendShortEmail Send an abbreviated email message instead of the standard email output. Useful for email-to-SMS gateways and email based pagers.
     */
    @ApiStatus.Internal
    public GetUserContactMethods200ResponseContactMethodsInner(String id, String summary, ContactMethodType type, String self, String htmlUrl, String label, String address, DeviceTypeEnum deviceType, List<PushContactMethodSound> sounds, OffsetDateTime createdAt, Boolean blacklisted, Boolean sendShortEmail) {
        this.id = id;
        this.summary = summary;
        this.type = type;
        this.self = self;
        this.htmlUrl = htmlUrl;
        this.label = label;
        this.address = address;
        this.deviceType = deviceType;
        this.sounds = sounds;
        this.createdAt = createdAt;
        this.blacklisted = blacklisted;
        this.sendShortEmail = sendShortEmail;
    }

    /**
     * The type of device.
     */
    @AllArgsConstructor
    public enum DeviceTypeEnum {
        ANDROID("android"),
        IOS("ios");

        private static final DeviceTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static DeviceTypeEnum of(String input) {
            if (input != null) {
                for (DeviceTypeEnum v : VALUES) {
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
