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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PhoneContactMethod
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "type",
    "country_code",
    "enabled",
    "blacklisted"
})
@JsonTypeName("PhoneContactMethod")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PhoneContactMethod extends ContactMethod {

    /**
     * Constructs a validated implementation of {@link PhoneContactMethod}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PhoneContactMethod(Consumer<PhoneContactMethod> spec) {
        spec.accept(this);
    }

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


}
