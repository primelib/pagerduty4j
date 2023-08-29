package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
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
 * PushContactMethod
 *
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
    protected ContactMethodType type;

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
     * Constructs a validated instance of {@link PushContactMethod}.
     *
     * @param spec the specification to process
     */
    public PushContactMethod(Consumer<PushContactMethod> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PushContactMethod}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PushContactMethod(Consumer)} instead.
     * @param type type
     * @param deviceType The type of device.
     * @param sounds sounds
     * @param createdAt Time at which the contact method was created.
     * @param blacklisted If true, this phone has been blacklisted by PagerDuty and no messages will be sent to it.
     */
    @ApiStatus.Internal
    public PushContactMethod(ContactMethodType type, DeviceTypeEnum deviceType, List<PushContactMethodSound> sounds, OffsetDateTime createdAt, Boolean blacklisted) {
        this.type = type;
        this.deviceType = deviceType;
        this.sounds = sounds;
        this.createdAt = createdAt;
        this.blacklisted = blacklisted;
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
