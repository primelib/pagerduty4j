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
 * Template
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link Template}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Template(Consumer<Template> spec) {
        spec.accept(this);
    }

    /**
     * The type of template (`status_update` is the only supported template at this time)
     */
    @JsonProperty("template_type")
    protected TemplateTypeEnum templateType;

    /**
     * The name of the template
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Description of the template
     */
    @JsonProperty("description")
    protected String description;

    @JsonProperty("templated_fields")
    protected EditableTemplateTemplatedFields templatedFields;

    @JsonProperty("id")
    protected String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
     */
    @JsonProperty("summary")
    protected String summary;

    /**
     * the API show URL at which the object is accessible
     */
    @JsonProperty("self")
    protected String self;

    /**
     * a URL at which the entity is uniquely displayed in the Web app
     */
    @JsonProperty("html_url")
    protected String htmlUrl;

    @JsonProperty("type")
    protected TypeEnum type;

    @JsonProperty("created_by")
    protected UserReference createdBy;

    @JsonProperty("updated_by")
    protected TemplateAllOfUpdatedBy updatedBy;


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
