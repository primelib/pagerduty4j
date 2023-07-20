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
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ChangeEventAllOfImages
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
@JsonTypeName("ChangeEvent_allOf_images")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ChangeEventAllOfImages {

    @JsonProperty("src")
    protected String src;

    @JsonProperty("href")
    protected String href;

    @JsonProperty("alt")
    protected String alt;

    /**
     * Constructs a validated instance of {@link ChangeEventAllOfImages}.
     *
     * @param spec the specification to process
     */
    public ChangeEventAllOfImages(Consumer<ChangeEventAllOfImages> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ChangeEventAllOfImages}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ChangeEventAllOfImages(Consumer)} instead.
     * @param src var.name
     * @param href var.name
     * @param alt var.name
     */
    @ApiStatus.Internal
    public ChangeEventAllOfImages(String src, String href, String alt) {
        this.src = src;
        this.href = href;
        this.alt = alt;
    }

}
