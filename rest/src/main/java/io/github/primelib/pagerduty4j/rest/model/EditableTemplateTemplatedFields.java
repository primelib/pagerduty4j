package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EditableTemplateTemplatedFields
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private String emailSubject;

    /**
     * The HTML body of the e-mail message
     */
    @JsonProperty("email_body")
    private String emailBody;

    /**
     * The short-message of the template (SMS, Push notification, Slack, etc)
     */
    @JsonProperty("message")
    private String message;


}
