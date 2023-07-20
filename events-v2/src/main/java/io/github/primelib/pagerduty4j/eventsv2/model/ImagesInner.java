package io.github.primelib.pagerduty4j.eventsv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ImagesInner
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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

    /**
     * Constructs a validated instance of {@link ImagesInner}.
     *
     * @param spec the specification to process
     */
    public ImagesInner(Consumer<ImagesInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ImagesInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ImagesInner(Consumer)} instead.
     * @param src The source of the image being attached to the incident or alert. This image must be served via HTTPS.
     * @param href Optional link for the image.
     * @param alt Optional alternative text for the image.
     */
    @ApiStatus.Internal
    public ImagesInner(String src, String href, String alt) {
        this.src = src;
        this.href = href;
        this.alt = alt;
    }

}
