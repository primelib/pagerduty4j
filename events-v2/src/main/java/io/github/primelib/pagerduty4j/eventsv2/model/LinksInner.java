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
 * LinksInner
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "href",
    "text"
})
@JsonTypeName("Links_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class LinksInner {

    /**
     * Constructs a validated implementation of {@link LinksInner}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public LinksInner(Consumer<LinksInner> spec) {
        spec.accept(this);
    }

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


}
