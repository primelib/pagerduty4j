package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Template
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "template_type",
    "name",
    "description",
    "templated_fields",
    "id",
    "summary",
    "self",
    "html_url",
    "type",
    "created_by",
    "updated_by"
})
@JsonTypeName("Template")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Template {

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

    @JsonProperty("id")
    private String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
     */
    @JsonProperty("summary")
    private String summary;

    /**
     * the API show URL at which the object is accessible
     */
    @JsonProperty("self")
    private String self;

    /**
     * a URL at which the entity is uniquely displayed in the Web app
     */
    @JsonProperty("html_url")
    private String htmlUrl;

    @JsonProperty("type")
    private TypeEnum type;

    @JsonProperty("created_by")
    private UserReference createdBy;

    @JsonProperty("updated_by")
    private TemplateAllOfUpdatedBy updatedBy;


    /**
     * The type of template (`status_update` is the only supported template at this time)
     */
    @AllArgsConstructor
    public enum TemplateTypeEnum {
        STATUS_UPDATE("status_update");

        private final String value;
    }

    @AllArgsConstructor
    public enum TypeEnum {
        TEMPLATE("template");

        private final String value;
    }

}
