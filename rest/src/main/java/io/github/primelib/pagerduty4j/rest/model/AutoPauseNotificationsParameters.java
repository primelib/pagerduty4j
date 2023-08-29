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
 * AutoPauseNotificationsParameters
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
    "enabled",
    "timeout"
})
@JsonTypeName("AutoPauseNotificationsParameters")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AutoPauseNotificationsParameters {

    /**
     * Indicates whether alerts should be automatically suspended when identified as transient
     */
    @JsonProperty("enabled")
    protected Boolean enabled;

    /**
     * Indicates in seconds how long alerts should be suspended before triggering
     */
    @JsonProperty("timeout")
    protected TimeoutEnum timeout;

    /**
     * Constructs a validated instance of {@link AutoPauseNotificationsParameters}.
     *
     * @param spec the specification to process
     */
    public AutoPauseNotificationsParameters(Consumer<AutoPauseNotificationsParameters> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AutoPauseNotificationsParameters}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AutoPauseNotificationsParameters(Consumer)} instead.
     * @param enabled Indicates whether alerts should be automatically suspended when identified as transient
     * @param timeout Indicates in seconds how long alerts should be suspended before triggering
     */
    @ApiStatus.Internal
    public AutoPauseNotificationsParameters(Boolean enabled, TimeoutEnum timeout) {
        this.enabled = enabled;
        this.timeout = timeout;
    }

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

        private static final TimeoutEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final Integer value;

        @JsonCreator
        public static TimeoutEnum of(Integer input) {
            if (input != null) {
                for (TimeoutEnum v : VALUES) {
                    if (input == v.value) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }
    }

}
