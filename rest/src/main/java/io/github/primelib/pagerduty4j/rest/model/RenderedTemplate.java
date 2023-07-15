package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RenderedTemplate
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "templated_fields",
    "warnings",
    "errors"
})
@JsonTypeName("RenderedTemplate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RenderedTemplate {

    /**
     * Constructs a validated implementation of {@link RenderedTemplate}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RenderedTemplate(Consumer<RenderedTemplate> spec) {
        spec.accept(this);
    }

    @JsonProperty("templated_fields")
    protected RenderedTemplateTemplatedFields templatedFields;

    @JsonProperty("warnings")
    protected RenderedTemplateWarnings warnings;

    /**
     * List of errors
     */
    @JsonProperty("errors")
    protected List<String> errors;


}
