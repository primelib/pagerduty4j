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
 * ChangeEventAllOfLinks
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
@JsonTypeName("ChangeEvent_allOf_links")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ChangeEventAllOfLinks {

    @JsonProperty("href")
    protected String href;

    @JsonProperty("text")
    protected String text;

    /**
     * Constructs a validated instance of {@link ChangeEventAllOfLinks}.
     *
     * @param spec the specification to process
     */
    public ChangeEventAllOfLinks(Consumer<ChangeEventAllOfLinks> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ChangeEventAllOfLinks}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ChangeEventAllOfLinks(Consumer)} instead.
     * @param href var.name
     * @param text var.name
     */
    @ApiStatus.Internal
    public ChangeEventAllOfLinks(String href, String text) {
        this.href = href;
        this.text = text;
    }

}
