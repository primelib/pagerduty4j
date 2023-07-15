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
 * EditableTemplate
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
    "templated_fields"
})
@JsonTypeName("EditableTemplate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EditableTemplate {

    /**
     * Constructs a validated implementation of {@link EditableTemplate}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public EditableTemplate(Consumer<EditableTemplate> spec) {
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


    /**
     * The type of template (`status_update` is the only supported template at this time)
     */
    @AllArgsConstructor
    public enum TemplateTypeEnum {
        STATUS_UPDATE("status_update");

        private final String value;
    }

}
