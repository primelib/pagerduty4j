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
 * EditableTemplateTemplatedFields
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
@JsonTypeName("EditableTemplate_templated_fields")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EditableTemplateTemplatedFields {

    /**
     * Constructs a validated implementation of {@link EditableTemplateTemplatedFields}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public EditableTemplateTemplatedFields(Consumer<EditableTemplateTemplatedFields> spec) {
        spec.accept(this);
    }

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


}
