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
 * RenderedTemplateTemplatedFields
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
    "email_subject",
    "email_body",
    "message"
})
@JsonTypeName("RenderedTemplate_templated_fields")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RenderedTemplateTemplatedFields {

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

    /**
     * Constructs a validated instance of {@link RenderedTemplateTemplatedFields}.
     *
     * @param spec the specification to process
     */
    public RenderedTemplateTemplatedFields(Consumer<RenderedTemplateTemplatedFields> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link RenderedTemplateTemplatedFields}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #RenderedTemplateTemplatedFields(Consumer)} instead.
     * @param emailSubject The rendered e-mail subject
     * @param emailBody The rendered e-mail body
     * @param message The rendered short message (SMS, Push, Slack, etc)
     */
    @ApiStatus.Internal
    public RenderedTemplateTemplatedFields(String emailSubject, String emailBody, String message) {
        this.emailSubject = emailSubject;
        this.emailBody = emailBody;
        this.message = message;
    }

}
