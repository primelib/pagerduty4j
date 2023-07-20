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
 * LinksInner
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
    protected String href;

    /**
     * Optional information pertaining to this context link.
     */
    @JsonProperty("text")
    protected String text;

    /**
     * Constructs a validated instance of {@link LinksInner}.
     *
     * @param spec the specification to process
     */
    public LinksInner(Consumer<LinksInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link LinksInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #LinksInner(Consumer)} instead.
     * @param href The link being attached to an incident or alert.
     * @param text Optional information pertaining to this context link.
     */
    @ApiStatus.Internal
    public LinksInner(String href, String text) {
        this.href = href;
        this.text = text;
    }

}
