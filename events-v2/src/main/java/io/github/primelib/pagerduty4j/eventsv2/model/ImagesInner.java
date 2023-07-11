package io.github.primelib.pagerduty4j.eventsv2.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ImagesInner
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "src",
    "href",
    "alt"
})
@JsonTypeName("Images_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ImagesInner {

    /**
     * The source of the image being attached to the incident or alert. This image must be served via HTTPS.
     */
    @JsonProperty("src")
    private String src;

    /**
     * Optional link for the image.
     */
    @JsonProperty("href")
    private String href;

    /**
     * Optional alternative text for the image.
     */
    @JsonProperty("alt")
    private String alt;


}
