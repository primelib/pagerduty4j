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
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * StatusUpdateNotificationRule
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
    "contact_method"
})
@JsonTypeName("StatusUpdateNotificationRule")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class StatusUpdateNotificationRule {

    @JsonProperty("contact_method")
    protected ContactMethodReference contactMethod;

    /**
     * Constructs a validated instance of {@link StatusUpdateNotificationRule}.
     *
     * @param spec the specification to process
     */
    public StatusUpdateNotificationRule(Consumer<StatusUpdateNotificationRule> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link StatusUpdateNotificationRule}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #StatusUpdateNotificationRule(Consumer)} instead.
     * @param contactMethod var.name
     */
    @ApiStatus.Internal
    public StatusUpdateNotificationRule(ContactMethodReference contactMethod) {
        this.contactMethod = contactMethod;
    }

}
