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
 * TimeBasedAlertGroupingConfiguration
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
    "timeout"
})
@JsonTypeName("TimeBasedAlertGroupingConfiguration")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class TimeBasedAlertGroupingConfiguration {

    /**
     * The duration in minutes within which to automatically group incoming Alerts.
     * To continue grouping Alerts until the Incident is resolved, set this value to 0.
     */
    @JsonProperty("timeout")
    protected Integer timeout;

    /**
     * Constructs a validated instance of {@link TimeBasedAlertGroupingConfiguration}.
     *
     * @param spec the specification to process
     */
    public TimeBasedAlertGroupingConfiguration(Consumer<TimeBasedAlertGroupingConfiguration> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link TimeBasedAlertGroupingConfiguration}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #TimeBasedAlertGroupingConfiguration(Consumer)} instead.
     * @param timeout The duration in minutes within which to automatically group incoming Alerts.  To continue grouping Alerts until the Incident is resolved, set this value to 0.
     */
    @ApiStatus.Internal
    public TimeBasedAlertGroupingConfiguration(Integer timeout) {
        this.timeout = timeout;
    }

}
