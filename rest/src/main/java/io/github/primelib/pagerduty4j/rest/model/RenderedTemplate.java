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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RenderedTemplate
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
    "templated_fields",
    "warnings",
    "errors"
})
@JsonTypeName("RenderedTemplate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RenderedTemplate {

    @JsonProperty("templated_fields")
    protected RenderedTemplateTemplatedFields templatedFields;

    @JsonProperty("warnings")
    protected RenderedTemplateWarnings warnings;

    /**
     * List of errors
     */
    @JsonProperty("errors")
    protected List<String> errors;

    /**
     * Constructs a validated instance of {@link RenderedTemplate}.
     *
     * @param spec the specification to process
     */
    public RenderedTemplate(Consumer<RenderedTemplate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link RenderedTemplate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #RenderedTemplate(Consumer)} instead.
     * @param templatedFields var.name
     * @param warnings var.name
     * @param errors List of errors
     */
    @ApiStatus.Internal
    public RenderedTemplate(RenderedTemplateTemplatedFields templatedFields, RenderedTemplateWarnings warnings, List<String> errors) {
        this.templatedFields = templatedFields;
        this.warnings = warnings;
        this.errors = errors;
    }

}
