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

/**
 * CustomFieldsFieldValue
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
    "id",
    "name",
    "type",
    "display_name",
    "field_type",
    "data_type",
    "description",
    "value"
})
@JsonTypeName("CustomFieldsFieldValue")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldsFieldValue {

    /**
     * Id of the field.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The name of the field. May include ASCII characters, specifically lowercase letters, digits, and underescores. The {@code name} for a Field must be unique.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Determines the type of the reference.
     */
    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * The human-readable name of the field. This must be unique across an account.
     */
    @JsonProperty("display_name")
    protected String displayName;

    /**
     * The type of data this field contains. In combination with the {@code data_type} field.
     */
    @JsonProperty("field_type")
    protected FieldTypeEnum fieldType;

    /**
     * The kind of data the custom field is allowed to contain.
     */
    @JsonProperty("data_type")
    protected DataTypeEnum dataType;

    /**
     * A description of the data this field contains.
     */
    @JsonProperty("description")
    protected String description;

    @JsonProperty("value")
    protected CustomFieldsFieldValueValue value;

    /**
     * Constructs a validated instance of {@link CustomFieldsFieldValue}.
     *
     * @param spec the specification to process
     */
    public CustomFieldsFieldValue(Consumer<CustomFieldsFieldValue> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CustomFieldsFieldValue}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CustomFieldsFieldValue(Consumer)} instead.
     * @param id Id of the field.
     * @param name The name of the field. May include ASCII characters, specifically lowercase letters, digits, and underescores. The {@code name} for a Field must be unique.
     * @param type Determines the type of the reference.
     * @param displayName The human-readable name of the field. This must be unique across an account.
     * @param fieldType The type of data this field contains. In combination with the {@code data_type} field.
     * @param dataType The kind of data the custom field is allowed to contain.
     * @param description A description of the data this field contains.
     * @param value var.name
     */
    @ApiStatus.Internal
    public CustomFieldsFieldValue(String id, String name, TypeEnum type, String displayName, FieldTypeEnum fieldType, DataTypeEnum dataType, String description, CustomFieldsFieldValueValue value) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.displayName = displayName;
        this.fieldType = fieldType;
        this.dataType = dataType;
        this.description = description;
        this.value = value;
    }

    /**
     * Determines the type of the reference.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        FIELD_VALUE("field_value");

        private final String value;
    }

    /**
     * The type of data this field contains. In combination with the {@code data_type} field.
     */
    @AllArgsConstructor
    public enum FieldTypeEnum {
        SINGLE_VALUE("single_value"),
        SINGLE_VALUE_FIXED("single_value_fixed"),
        MULTI_VALUE("multi_value"),
        MULTI_VALUE_FIXED("multi_value_fixed");

        private final String value;
    }

    /**
     * The kind of data the custom field is allowed to contain.
     */
    @AllArgsConstructor
    public enum DataTypeEnum {
        BOOLEAN("boolean"),
        INTEGER("integer"),
        FLOAT("float"),
        STRING("string"),
        DATETIME("datetime"),
        URL("url");

        private final String value;
    }

}
