package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConferenceBridge
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "conference_number",
    "conference_url"
})
@JsonTypeName("ConferenceBridge")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ConferenceBridge {

    /**
     * The phone number of the conference call for the conference bridge. Phone numbers should be formatted like +1 415-555-1212,,,,1234#, where a comma (,) represents a one-second wait and pound (#) completes access code input.
     */
    @JsonProperty("conference_number")
    private String conferenceNumber;

    /**
     * An URL for the conference bridge. This could be a link to a web conference or Slack channel.
     */
    @JsonProperty("conference_url")
    private String conferenceUrl;


}
