package io.github.primelib.pagerduty4j.eventsv2.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LinksInner
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "href",
    "text"
})
@JsonTypeName("Links_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class LinksInner {

    /**
     * The link being attached to an incident or alert.
     */
    @JsonProperty("href")
    private String href;

    /**
     * Optional information pertaining to this context link.
     */
    @JsonProperty("text")
    private String text;


}
