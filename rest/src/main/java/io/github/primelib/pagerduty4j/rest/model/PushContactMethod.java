package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

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
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link PushContactMethod}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PushContactMethod(Consumer<PushContactMethod> spec) {
        spec.accept(this);
    }

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
     * The type of device.
     */
    @AllArgsConstructor
    public enum DeviceTypeEnum {
        ANDROID("android"),
        IOS("ios");

        private final String value;
    }

}
