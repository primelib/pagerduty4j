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
 * RenderedTemplateTemplatedFields
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
@JsonTypeName("RenderedTemplate_templated_fields")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RenderedTemplateTemplatedFields {

    /**
     * Constructs a validated implementation of {@link RenderedTemplateTemplatedFields}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RenderedTemplateTemplatedFields(Consumer<RenderedTemplateTemplatedFields> spec) {
        spec.accept(this);
    }

    /**
     * The rendered e-mail subject
     */
    @JsonProperty("email_subject")
    protected String emailSubject;

    /**
     * The rendered e-mail body
     */
    @JsonProperty("email_body")
    protected String emailBody;

    /**
     * The rendered short message (SMS, Push, Slack, etc)
     */
    @JsonProperty("message")
    protected String message;


}
