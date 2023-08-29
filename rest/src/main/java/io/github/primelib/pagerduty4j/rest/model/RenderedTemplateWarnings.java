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
 * RenderedTemplateWarnings
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
@JsonTypeName("RenderedTemplate_warnings")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RenderedTemplateWarnings {

    /**
     * List of warnings for email_subject
     */
    @JsonProperty("email_subject")
    protected List emailSubject;

    /**
     * List of warnings for email_body
     */
    @JsonProperty("email_body")
    protected List emailBody;

    /**
     * List of warnings for message field
     */
    @JsonProperty("message")
    protected List message;

    /**
     * Constructs a validated instance of {@link RenderedTemplateWarnings}.
     *
     * @param spec the specification to process
     */
    public RenderedTemplateWarnings(Consumer<RenderedTemplateWarnings> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link RenderedTemplateWarnings}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #RenderedTemplateWarnings(Consumer)} instead.
     * @param emailSubject List of warnings for email_subject
     * @param emailBody List of warnings for email_body
     * @param message List of warnings for message field
     */
    @ApiStatus.Internal
    public RenderedTemplateWarnings(List emailSubject, List emailBody, List message) {
        this.emailSubject = emailSubject;
        this.emailBody = emailBody;
        this.message = message;
    }

}
