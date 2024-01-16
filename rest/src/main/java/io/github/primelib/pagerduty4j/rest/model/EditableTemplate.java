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
 * EditableTemplate
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
    "templated_fields"
})
@JsonTypeName("EditableTemplate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EditableTemplate {

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

    /**
     * Constructs a validated instance of {@link EditableTemplate}.
     *
     * @param spec the specification to process
     */
    public EditableTemplate(Consumer<EditableTemplate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link EditableTemplate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #EditableTemplate(Consumer)} instead.
     * @param templateType The type of template ({@code status_update} is the only supported template at this time)
     * @param name The name of the template
     * @param description Description of the template
     * @param templatedFields templatedFields
     */
    @ApiStatus.Internal
    public EditableTemplate(TemplateTypeEnum templateType, String name, String description, EditableTemplateTemplatedFields templatedFields) {
        this.templateType = templateType;
        this.name = name;
        this.description = description;
        this.templatedFields = templatedFields;
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

}
