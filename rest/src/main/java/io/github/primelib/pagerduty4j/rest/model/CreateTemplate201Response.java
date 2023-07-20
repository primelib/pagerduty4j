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
 * CreateTemplate201Response
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
    "template"
})
@JsonTypeName("createTemplate_201_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateTemplate201Response {

    @JsonProperty("template")
    protected Template template;

    /**
     * Constructs a validated instance of {@link CreateTemplate201Response}.
     *
     * @param spec the specification to process
     */
    public CreateTemplate201Response(Consumer<CreateTemplate201Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateTemplate201Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateTemplate201Response(Consumer)} instead.
     * @param template var.name
     */
    @ApiStatus.Internal
    public CreateTemplate201Response(Template template) {
        this.template = template;
    }

}
