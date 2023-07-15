package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Context
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "type",
    "href",
    "src",
    "text"
})
@JsonTypeName("Context")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Context {

    /**
     * The type of context being attached to the incident.
     */
    @JsonProperty("type")
    private TypeEnum type;

    /**
     * The link's target url
     */
    @JsonProperty("href")
    private String href;

    /**
     * The image's source url
     */
    @JsonProperty("src")
    private String src;

    /**
     * The alternate display for an image
     */
    @JsonProperty("text")
    private String text;


    /**
     * The type of context being attached to the incident.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        LINK("link"),
        IMAGE("image");

        private final String value;
    }

}
