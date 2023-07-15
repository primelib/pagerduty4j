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
 * ChangeEventAllOfImages
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
@JsonTypeName("ChangeEvent_allOf_images")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ChangeEventAllOfImages {

    /**
     * Constructs a validated implementation of {@link ChangeEventAllOfImages}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ChangeEventAllOfImages(Consumer<ChangeEventAllOfImages> spec) {
        spec.accept(this);
    }

    @JsonProperty("src")
    protected String src;

    @JsonProperty("href")
    protected String href;

    @JsonProperty("alt")
    protected String alt;


}
