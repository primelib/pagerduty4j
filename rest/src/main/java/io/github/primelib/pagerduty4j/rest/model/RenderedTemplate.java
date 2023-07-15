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
 * RenderedTemplate
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "templated_fields",
    "warnings",
    "errors"
})
@JsonTypeName("RenderedTemplate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RenderedTemplate {

    @JsonProperty("templated_fields")
    private RenderedTemplateTemplatedFields templatedFields;

    @JsonProperty("warnings")
    private RenderedTemplateWarnings warnings;

    /**
     * List of errors
     */
    @JsonProperty("errors")
    private List<String> errors;


}
