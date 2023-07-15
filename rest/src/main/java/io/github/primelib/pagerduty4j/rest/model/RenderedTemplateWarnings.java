package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
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
    private List emailSubject = null;

    /**
     * List of warnings for email_body
     */
    @JsonProperty("email_body")
    private List emailBody = null;

    /**
     * List of warnings for message field
     */
    @JsonProperty("message")
    private List message = null;


}
