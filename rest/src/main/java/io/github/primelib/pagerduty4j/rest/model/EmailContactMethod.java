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
 * EmailContactMethod
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
    "send_short_email"
})
@JsonTypeName("EmailContactMethod")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EmailContactMethod extends ContactMethod {

    @JsonProperty("type")
    protected ContactMethodType type;

    /**
     * Send an abbreviated email message instead of the standard email output. Useful for email-to-SMS gateways and email based pagers.
     */
    @JsonProperty("send_short_email")
    protected Boolean sendShortEmail;

    /**
     * Constructs a validated instance of {@link EmailContactMethod}.
     *
     * @param spec the specification to process
     */
    public EmailContactMethod(Consumer<EmailContactMethod> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link EmailContactMethod}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #EmailContactMethod(Consumer)} instead.
     * @param type type
     * @param sendShortEmail Send an abbreviated email message instead of the standard email output. Useful for email-to-SMS gateways and email based pagers.
     */
    @ApiStatus.Internal
    public EmailContactMethod(ContactMethodType type, Boolean sendShortEmail) {
        this.type = type;
        this.sendShortEmail = sendShortEmail;
    }

}
