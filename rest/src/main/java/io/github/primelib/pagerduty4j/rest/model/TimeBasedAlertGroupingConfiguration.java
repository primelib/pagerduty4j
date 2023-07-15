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
 * TimeBasedAlertGroupingConfiguration
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "timeout"
})
@JsonTypeName("TimeBasedAlertGroupingConfiguration")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class TimeBasedAlertGroupingConfiguration {

    /**
     * Constructs a validated implementation of {@link TimeBasedAlertGroupingConfiguration}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public TimeBasedAlertGroupingConfiguration(Consumer<TimeBasedAlertGroupingConfiguration> spec) {
        spec.accept(this);
    }

    /**
     * The duration in minutes within which to automatically group incoming Alerts.
     * To continue grouping Alerts until the Incident is resolved, set this value to 0.
     */
    @JsonProperty("timeout")
    protected Integer timeout;


}
