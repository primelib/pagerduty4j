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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Template
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
     * The type of template ({@code status_update} is the only supported template at this time)
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
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to {@code name}, though it is not intended to be an identifier.
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
     * Constructs a validated instance of {@link Template}.
     *
     * @param spec the specification to process
     */
    public Template(Consumer<Template> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Template}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Template(Consumer)} instead.
     * @param templateType The type of template ({@code status_update} is the only supported template at this time)
     * @param name The name of the template
     * @param description Description of the template
     * @param templatedFields var.name
     * @param id var.name
     * @param summary A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to {@code name}, though it is not intended to be an identifier.
     * @param self the API show URL at which the object is accessible
     * @param htmlUrl a URL at which the entity is uniquely displayed in the Web app
     * @param type var.name
     * @param createdBy var.name
     * @param updatedBy var.name
     */
    @ApiStatus.Internal
    public Template(TemplateTypeEnum templateType, String name, String description, EditableTemplateTemplatedFields templatedFields, String id, String summary, String self, String htmlUrl, TypeEnum type, UserReference createdBy, TemplateAllOfUpdatedBy updatedBy) {
        this.templateType = templateType;
        this.name = name;
        this.description = description;
        this.templatedFields = templatedFields;
        this.id = id;
        this.summary = summary;
        this.self = self;
        this.htmlUrl = htmlUrl;
        this.type = type;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
    }

    /**
     * The type of template ({@code status_update} is the only supported template at this time)
     */
    @AllArgsConstructor
    public enum TemplateTypeEnum {
        STATUS_UPDATE("status_update");

        private static final TemplateTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static TemplateTypeEnum of(String input) {
            if (input != null) {
                for (TemplateTypeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

    @AllArgsConstructor
    public enum TypeEnum {
        TEMPLATE("template");

        private static final TypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static TypeEnum of(String input) {
            if (input != null) {
                for (TypeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
