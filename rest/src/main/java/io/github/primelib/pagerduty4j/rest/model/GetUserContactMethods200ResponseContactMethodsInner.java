package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetUserContactMethods200ResponseContactMethodsInner
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
     */
    @JsonProperty("summary")
    private String summary;

    @JsonProperty("type")
    private ContactMethodType type;

    /**
     * the API show URL at which the object is accessible
     */
    @JsonProperty("self")
    private String self;

    /**
     * a URL at which the entity is uniquely displayed in the Web app
     */
    @JsonProperty("html_url")
    private String htmlUrl;

    /**
     * The label (e.g., "Work", "Mobile", etc.).
     */
    @JsonProperty("label")
    private String label;

    /**
     * The "address" to deliver to: email, phone number, etc., depending on the type.
     */
    @JsonProperty("address")
    private String address;

    /**
     * The type of device.
     */
    @JsonProperty("device_type")
    private DeviceTypeEnum deviceType;

    @JsonProperty("sounds")
    private List<PushContactMethodSound> sounds;

    /**
     * Time at which the contact method was created.
     */
    @JsonProperty("created_at")
    private OffsetDateTime createdAt;

    /**
     * If true, this phone has been blacklisted by PagerDuty and no messages will be sent to it.
     */
    @JsonProperty("blacklisted")
    private Boolean blacklisted;

    /**
     * Send an abbreviated email message instead of the standard email output. Useful for email-to-SMS gateways and email based pagers.
     */
    @JsonProperty("send_short_email")
    private Boolean sendShortEmail = false;


    /**
     * The type of device.
     */
    @AllArgsConstructor
    public enum DeviceTypeEnum {
        ANDROID("android"),
        IOS("ios");

        private final String value;
    }

}
