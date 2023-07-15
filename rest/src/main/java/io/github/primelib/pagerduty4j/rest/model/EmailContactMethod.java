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
 * EmailContactMethod
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "type",
    "send_short_email"
})
@JsonTypeName("EmailContactMethod")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EmailContactMethod extends ContactMethod {

    /**
     * Constructs a validated implementation of {@link EmailContactMethod}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public EmailContactMethod(Consumer<EmailContactMethod> spec) {
        spec.accept(this);
    }

    @JsonProperty("type")
    protected ContactMethodType type;

    /**
     * Send an abbreviated email message instead of the standard email output. Useful for email-to-SMS gateways and email based pagers.
     */
    @JsonProperty("send_short_email")
    protected Boolean sendShortEmail = false;


}
