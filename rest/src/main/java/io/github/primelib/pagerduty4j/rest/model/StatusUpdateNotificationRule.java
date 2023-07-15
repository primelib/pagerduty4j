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
 * StatusUpdateNotificationRule
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "contact_method"
})
@JsonTypeName("StatusUpdateNotificationRule")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class StatusUpdateNotificationRule {

    /**
     * Constructs a validated implementation of {@link StatusUpdateNotificationRule}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public StatusUpdateNotificationRule(Consumer<StatusUpdateNotificationRule> spec) {
        spec.accept(this);
    }

    @JsonProperty("contact_method")
    protected ContactMethodReference contactMethod;


}
