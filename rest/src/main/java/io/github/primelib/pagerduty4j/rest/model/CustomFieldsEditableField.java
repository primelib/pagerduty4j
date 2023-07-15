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
 * CustomFieldsEditableField
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "display_name",
    "description",
    "default_value"
})
@JsonTypeName("CustomFieldsEditableField")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldsEditableField {

    /**
     * Constructs a validated implementation of {@link CustomFieldsEditableField}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CustomFieldsEditableField(Consumer<CustomFieldsEditableField> spec) {
        spec.accept(this);
    }

    /**
     * The human-readable name of the field. This must be unique across an account.
     */
    @JsonProperty("display_name")
    protected String displayName;

    /**
     * A description of the data this field contains.
     */
    @JsonProperty("description")
    protected String description;

    @JsonProperty("default_value")
    protected CustomFieldsEditableFieldDefaultValue defaultValue;


}
