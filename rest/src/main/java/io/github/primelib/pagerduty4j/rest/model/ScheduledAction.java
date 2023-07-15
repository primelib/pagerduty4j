package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ScheduledAction
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "type",
    "at",
    "to_urgency"
})
@JsonTypeName("ScheduledAction")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ScheduledAction {

    /**
     * The type of schedule action. Must be set to urgency_change.
     */
    @JsonProperty("type")
    private TypeEnum type;

    @JsonProperty("at")
    private ScheduledActionAt at;

    /**
     * Urgency level. Must be set to high.
     */
    @JsonProperty("to_urgency")
    private ToUrgencyEnum toUrgency;


    /**
     * The type of schedule action. Must be set to urgency_change.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        URGENCY_CHANGE("urgency_change");

        private final String value;
    }

    /**
     * Urgency level. Must be set to high.
     */
    @AllArgsConstructor
    public enum ToUrgencyEnum {
        HIGH("high");

        private final String value;
    }

}
