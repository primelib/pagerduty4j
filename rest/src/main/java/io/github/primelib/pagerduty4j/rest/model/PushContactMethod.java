package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PushContactMethod
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "type",
    "device_type",
    "sounds",
    "created_at",
    "blacklisted"
})
@JsonTypeName("PushContactMethod")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PushContactMethod extends ContactMethod {

    @JsonProperty("type")
    private ContactMethodType type;

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
     * The type of device.
     */
    @AllArgsConstructor
    public enum DeviceTypeEnum {
        ANDROID("android"),
        IOS("ios");

        private final String value;
    }

}
