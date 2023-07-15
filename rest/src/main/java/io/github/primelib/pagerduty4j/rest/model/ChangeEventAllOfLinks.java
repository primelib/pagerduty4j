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
 * ChangeEventAllOfLinks
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
@JsonTypeName("ChangeEvent_allOf_links")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ChangeEventAllOfLinks {

    /**
     * Constructs a validated implementation of {@link ChangeEventAllOfLinks}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ChangeEventAllOfLinks(Consumer<ChangeEventAllOfLinks> spec) {
        spec.accept(this);
    }

    @JsonProperty("href")
    protected String href;

    @JsonProperty("text")
    protected String text;


}
