package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TimeBasedAlertGroupingConfiguration
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private Integer timeout;


}
