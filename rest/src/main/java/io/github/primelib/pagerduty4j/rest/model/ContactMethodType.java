package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ContactMethodType
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "type"
})
@JsonTypeName("ContactMethodType")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContactMethodType {

    /**
     * Constructs a validated implementation of {@link ContactMethodType}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ContactMethodType(Consumer<ContactMethodType> spec) {
        spec.accept(this);
    }

    /**
     * The type of contact method being created.
     */
    @JsonProperty("type")
    protected TypeEnum type;


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
