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
 * RenderedTemplateWarnings
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "email_subject",
    "email_body",
    "message"
})
@JsonTypeName("RenderedTemplate_warnings")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RenderedTemplateWarnings {

    /**
     * Constructs a validated implementation of {@link RenderedTemplateWarnings}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RenderedTemplateWarnings(Consumer<RenderedTemplateWarnings> spec) {
        spec.accept(this);
    }

    /**
     * List of warnings for email_subject
     */
    @JsonProperty("email_subject")
    protected List emailSubject = null;

    /**
     * List of warnings for email_body
     */
    @JsonProperty("email_body")
    protected List emailBody = null;

    /**
     * List of warnings for message field
     */
    @JsonProperty("message")
    protected List message = null;


}
