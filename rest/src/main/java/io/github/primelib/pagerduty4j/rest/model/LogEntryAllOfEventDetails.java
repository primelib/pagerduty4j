package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LogEntryAllOfEventDetails
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "description"
})
@JsonTypeName("LogEntry_allOf_event_details")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class LogEntryAllOfEventDetails {

    /**
     * Additional details about the event.
     */
    @JsonProperty("description")
    private String description;


}
