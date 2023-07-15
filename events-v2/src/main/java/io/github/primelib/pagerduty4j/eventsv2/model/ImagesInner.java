package io.github.primelib.pagerduty4j.eventsv2.model;

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
 * ImagesInner
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "src",
    "href",
    "alt"
})
@JsonTypeName("Images_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ImagesInner {

    /**
     * Constructs a validated implementation of {@link ImagesInner}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ImagesInner(Consumer<ImagesInner> spec) {
        spec.accept(this);
    }

    /**
     * The source of the image being attached to the incident or alert. This image must be served via HTTPS.
     */
    @JsonProperty("src")
    protected String src;

    /**
     * Optional link for the image.
     */
    @JsonProperty("href")
    protected String href;

    /**
     * Optional alternative text for the image.
     */
    @JsonProperty("alt")
    protected String alt;


}
