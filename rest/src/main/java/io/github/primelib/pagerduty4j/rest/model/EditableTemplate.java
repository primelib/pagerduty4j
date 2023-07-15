package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EditableTemplate
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "template_type",
    "name",
    "description",
    "templated_fields"
})
@JsonTypeName("EditableTemplate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EditableTemplate {

    /**
     * The type of template (`status_update` is the only supported template at this time)
     */
    @JsonProperty("template_type")
    private TemplateTypeEnum templateType;

    /**
     * The name of the template
     */
    @JsonProperty("name")
    private String name;

    /**
     * Description of the template
     */
    @JsonProperty("description")
    private String description;

    @JsonProperty("templated_fields")
    private EditableTemplateTemplatedFields templatedFields;


    /**
     * The type of template (`status_update` is the only supported template at this time)
     */
    @AllArgsConstructor
    public enum TemplateTypeEnum {
        STATUS_UPDATE("status_update");

        private final String value;
    }

}
