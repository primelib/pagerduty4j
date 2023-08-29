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
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PhoneContactMethod
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
    "country_code",
    "enabled",
    "blacklisted"
})
@JsonTypeName("PhoneContactMethod")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PhoneContactMethod extends ContactMethod {

    @JsonProperty("type")
    protected ContactMethodType type;

    /**
     * The 1-to-3 digit country calling code.
     */
    @JsonProperty("country_code")
    protected Integer countryCode;

    /**
     * If true, this phone is capable of receiving SMS messages.
     */
    @JsonProperty("enabled")
    protected Boolean enabled;

    /**
     * If true, this phone has been blacklisted by PagerDuty and no messages will be sent to it.
     */
    @JsonProperty("blacklisted")
    protected Boolean blacklisted;

    /**
     * Constructs a validated instance of {@link PhoneContactMethod}.
     *
     * @param spec the specification to process
     */
    public PhoneContactMethod(Consumer<PhoneContactMethod> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PhoneContactMethod}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PhoneContactMethod(Consumer)} instead.
     * @param type type
     * @param countryCode The 1-to-3 digit country calling code.
     * @param enabled If true, this phone is capable of receiving SMS messages.
     * @param blacklisted If true, this phone has been blacklisted by PagerDuty and no messages will be sent to it.
     */
    @ApiStatus.Internal
    public PhoneContactMethod(ContactMethodType type, Integer countryCode, Boolean enabled, Boolean blacklisted) {
        this.type = type;
        this.countryCode = countryCode;
        this.enabled = enabled;
        this.blacklisted = blacklisted;
    }

}
