package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ContactMethodType
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "type"
})
@JsonTypeName("ContactMethodType")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContactMethodType {

    /**
     * The type of contact method being created.
     */
    @JsonProperty("type")
    private TypeEnum type;


    /**
     * The type of contact method being created.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        EMAIL_CONTACT_METHOD("email_contact_method"),
        PHONE_CONTACT_METHOD("phone_contact_method"),
        PUSH_NOTIFICATION_CONTACT_METHOD("push_notification_contact_method"),
        SMS_CONTACT_METHOD("sms_contact_method");

        private final String value;
    }

}
