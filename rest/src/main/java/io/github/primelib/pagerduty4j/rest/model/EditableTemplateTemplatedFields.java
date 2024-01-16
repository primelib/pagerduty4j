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
 * EditableTemplateTemplatedFields
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
@JsonTypeName("EditableTemplate_templated_fields")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EditableTemplateTemplatedFields {

    /**
     * The subject of the e-mail
     */
    @JsonProperty("email_subject")
    protected String emailSubject;

    /**
     * The HTML body of the e-mail message
     */
    @JsonProperty("email_body")
    protected String emailBody;

    /**
     * The short-message of the template (SMS, Push notification, Slack, etc)
     */
    @JsonProperty("message")
    protected String message;

    /**
     * Constructs a validated instance of {@link EditableTemplateTemplatedFields}.
     *
     * @param spec the specification to process
     */
    public EditableTemplateTemplatedFields(Consumer<EditableTemplateTemplatedFields> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link EditableTemplateTemplatedFields}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #EditableTemplateTemplatedFields(Consumer)} instead.
     * @param emailSubject The subject of the e-mail
     * @param emailBody The HTML body of the e-mail message
     * @param message The short-message of the template (SMS, Push notification, Slack, etc)
     */
    @ApiStatus.Internal
    public EditableTemplateTemplatedFields(String emailSubject, String emailBody, String message) {
        this.emailSubject = emailSubject;
        this.emailBody = emailBody;
        this.message = message;
    }

}
