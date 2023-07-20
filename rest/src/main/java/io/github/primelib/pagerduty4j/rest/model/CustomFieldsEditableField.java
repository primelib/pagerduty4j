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
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CustomFieldsEditableField
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
    "display_name",
    "description",
    "default_value"
})
@JsonTypeName("CustomFieldsEditableField")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldsEditableField {

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

    /**
     * Constructs a validated instance of {@link CustomFieldsEditableField}.
     *
     * @param spec the specification to process
     */
    public CustomFieldsEditableField(Consumer<CustomFieldsEditableField> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CustomFieldsEditableField}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CustomFieldsEditableField(Consumer)} instead.
     * @param displayName The human-readable name of the field. This must be unique across an account.
     * @param description A description of the data this field contains.
     * @param defaultValue var.name
     */
    @ApiStatus.Internal
    public CustomFieldsEditableField(String displayName, String description, CustomFieldsEditableFieldDefaultValue defaultValue) {
        this.displayName = displayName;
        this.description = description;
        this.defaultValue = defaultValue;
    }

}
