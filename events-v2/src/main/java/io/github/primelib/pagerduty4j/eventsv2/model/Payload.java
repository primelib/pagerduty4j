package io.github.primelib.pagerduty4j.eventsv2.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Payload
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "summary",
    "timestamp",
    "severity",
    "source",
    "component",
    "group",
    "class",
    "custom_details"
})
@JsonTypeName("Payload")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Payload {

    /**
     * A brief text summary of the event, used to generate the summaries/titles of any associated alerts.
     */
    @JsonProperty("summary")
    private String summary;

    /**
     * The time at which the emitting tool detected or generated the event.
     */
    @JsonProperty("timestamp")
    private OffsetDateTime timestamp;

    /**
     * The perceived severity of the status the event is describing withrespect to the affected system.
     */
    @JsonProperty("severity")
    private SeverityEnum severity;

    /**
     * The unique location of the affected system, preferably a hostname or FQDN.
     */
    @JsonProperty("source")
    private String source;

    /**
     * Component of the source machine that is responsible for the event.
     */
    @JsonProperty("component")
    private String component;

    /**
     * Logical grouping of components of a service.
     */
    @JsonProperty("group")
    private String group;

    /**
     * The class/type of the event.
     */
    @JsonProperty("class")
    private String propertyClass;

    /**
     * Additional details about the event and affected system.
     */
    @JsonProperty("custom_details")
    private Object customDetails;


    /**
     * The perceived severity of the status the event is describing withrespect to the affected system.
     */
    @AllArgsConstructor
    public enum SeverityEnum {
        CRITICAL("critical"),
        WARNING("warning"),
        ERROR("error"),
        INFO("info");

        private final String value;
    }

}
