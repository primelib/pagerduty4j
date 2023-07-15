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
 * AutoPauseNotificationsParameters
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "enabled",
    "timeout"
})
@JsonTypeName("AutoPauseNotificationsParameters")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AutoPauseNotificationsParameters {

    /**
     * Constructs a validated implementation of {@link AutoPauseNotificationsParameters}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AutoPauseNotificationsParameters(Consumer<AutoPauseNotificationsParameters> spec) {
        spec.accept(this);
    }

    /**
     * Indicates whether alerts should be automatically suspended when identified as transient
     */
    @JsonProperty("enabled")
    protected Boolean enabled = false;

    /**
     * Indicates in seconds how long alerts should be suspended before triggering
     */
    @JsonProperty("timeout")
    protected TimeoutEnum timeout;


    /**
     * Indicates in seconds how long alerts should be suspended before triggering
     */
    @AllArgsConstructor
    public enum TimeoutEnum {
        NUMBER_120(120),
        NUMBER_180(180),
        NUMBER_300(300),
        NUMBER_600(600),
        NUMBER_900(900);

        private final Integer value;
    }

}
