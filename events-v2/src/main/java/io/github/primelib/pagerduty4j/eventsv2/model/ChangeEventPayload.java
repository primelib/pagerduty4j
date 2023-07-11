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
 * ChangeEventPayload
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "summary",
    "timestamp",
    "source",
    "custom_details"
})
@JsonTypeName("ChangeEventPayload")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ChangeEventPayload {

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
     * The unique location of the affected system, preferably a hostname or FQDN.
     */
    @JsonProperty("source")
    private String source;

    /**
     * Additional details about the event and affected system.
     */
    @JsonProperty("custom_details")
    private Object customDetails;


}
