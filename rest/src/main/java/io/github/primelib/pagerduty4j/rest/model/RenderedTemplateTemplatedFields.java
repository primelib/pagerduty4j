package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RenderedTemplateTemplatedFields
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
@JsonTypeName("RenderedTemplate_templated_fields")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RenderedTemplateTemplatedFields {

    /**
     * The rendered e-mail subject
     */
    @JsonProperty("email_subject")
    private String emailSubject;

    /**
     * The rendered e-mail body
     */
    @JsonProperty("email_body")
    private String emailBody;

    /**
     * The rendered short message (SMS, Push, Slack, etc)
     */
    @JsonProperty("message")
    private String message;


}
