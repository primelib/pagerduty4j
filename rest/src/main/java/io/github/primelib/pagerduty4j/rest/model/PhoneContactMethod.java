package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PhoneContactMethod
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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

    @JsonProperty("type")
    private ContactMethodType type;

    /**
     * The 1-to-3 digit country calling code.
     */
    @JsonProperty("country_code")
    private Integer countryCode;

    /**
     * If true, this phone is capable of receiving SMS messages.
     */
    @JsonProperty("enabled")
    private Boolean enabled;

    /**
     * If true, this phone has been blacklisted by PagerDuty and no messages will be sent to it.
     */
    @JsonProperty("blacklisted")
    private Boolean blacklisted;


}
