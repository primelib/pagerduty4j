package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Context
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link Context}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Context(Consumer<Context> spec) {
        spec.accept(this);
    }

    /**
     * The type of context being attached to the incident.
     */
    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * The link's target url
     */
    @JsonProperty("href")
    protected String href;

    /**
     * The image's source url
     */
    @JsonProperty("src")
    protected String src;

    /**
     * The alternate display for an image
     */
    @JsonProperty("text")
    protected String text;


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
