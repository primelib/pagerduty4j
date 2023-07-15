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
 * EmailContactMethod
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "type",
    "send_short_email"
})
@JsonTypeName("EmailContactMethod")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EmailContactMethod extends ContactMethod {

    @JsonProperty("type")
    private ContactMethodType type;

    /**
     * Send an abbreviated email message instead of the standard email output. Useful for email-to-SMS gateways and email based pagers.
     */
    @JsonProperty("send_short_email")
    private Boolean sendShortEmail = false;


}
