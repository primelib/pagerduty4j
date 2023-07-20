package io.github.primelib.pagerduty4j.rest.model;

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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Context
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
     * Constructs a validated instance of {@link Context}.
     *
     * @param spec the specification to process
     */
    public Context(Consumer<Context> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Context}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Context(Consumer)} instead.
     * @param type The type of context being attached to the incident.
     * @param href The link's target url
     * @param src The image's source url
     * @param text The alternate display for an image
     */
    @ApiStatus.Internal
    public Context(TypeEnum type, String href, String src, String text) {
        this.type = type;
        this.href = href;
        this.src = src;
        this.text = text;
    }

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
