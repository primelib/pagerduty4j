package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AutoPauseNotificationsParameters
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private Boolean enabled = false;

    /**
     * Indicates in seconds how long alerts should be suspended before triggering
     */
    @JsonProperty("timeout")
    private TimeoutEnum timeout;


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
