package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ContactMethodType
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
    protected TypeEnum type;

    /**
     * Constructs a validated instance of {@link ContactMethodType}.
     *
     * @param spec the specification to process
     */
    public ContactMethodType(Consumer<ContactMethodType> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContactMethodType}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContactMethodType(Consumer)} instead.
     * @param type The type of contact method being created.
     */
    @ApiStatus.Internal
    public ContactMethodType(TypeEnum type) {
        this.type = type;
    }

    /**
     * The type of contact method being created.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        EMAIL_CONTACT_METHOD("email_contact_method"),
        PHONE_CONTACT_METHOD("phone_contact_method"),
        PUSH_NOTIFICATION_CONTACT_METHOD("push_notification_contact_method"),
        SMS_CONTACT_METHOD("sms_contact_method");

        private static final TypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static TypeEnum of(String input) {
            if (input != null) {
                for (TypeEnum v : VALUES) {
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
