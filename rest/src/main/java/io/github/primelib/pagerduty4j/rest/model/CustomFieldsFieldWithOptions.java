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

import java.time.OffsetDateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * CustomFieldsFieldWithOptions
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
    "default_value",
    "id",
    "name",
    "summary",
    "self",
    "type",
    "created_at",
    "updated_at",
    "data_type",
    "field_type",
    "field_options"
})
@JsonTypeName("CustomFieldsFieldWithOptions")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldsFieldWithOptions {

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
     * The ID of the resource.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The name of the field. May include ASCII characters, specifically lowercase letters, digits, and underescores. The {@code name} for a Field must be unique.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to {@code name}, though it is not intended to be an identifier.
     */
    @JsonProperty("summary")
    protected String summary;

    /**
     * The API show URL at which the object is accessible
     */
    @JsonProperty("self")
    protected String self;

    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * The date/time the object was created at.
     */
    @JsonProperty("created_at")
    protected OffsetDateTime createdAt;

    /**
     * The date/time the object was last updated.
     */
    @JsonProperty("updated_at")
    protected OffsetDateTime updatedAt;

    /**
     * The kind of data the custom field is allowed to contain.
     */
    @JsonProperty("data_type")
    protected DataTypeEnum dataType;

    /**
     * The type of data this field contains. In combination with the {@code data_type} field.
     */
    @JsonProperty("field_type")
    protected FieldTypeEnum fieldType;

    /**
     * The fixed list of value options that may be stored in this field.
     */
    @JsonProperty("field_options")
    protected List<CustomFieldsFieldOption> fieldOptions;

    /**
     * Constructs a validated instance of {@link CustomFieldsFieldWithOptions}.
     *
     * @param spec the specification to process
     */
    public CustomFieldsFieldWithOptions(Consumer<CustomFieldsFieldWithOptions> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CustomFieldsFieldWithOptions}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CustomFieldsFieldWithOptions(Consumer)} instead.
     * @param displayName The human-readable name of the field. This must be unique across an account.
     * @param description A description of the data this field contains.
     * @param defaultValue defaultValue
     * @param id The ID of the resource.
     * @param name The name of the field. May include ASCII characters, specifically lowercase letters, digits, and underescores. The {@code name} for a Field must be unique.
     * @param summary A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to {@code name}, though it is not intended to be an identifier.
     * @param self The API show URL at which the object is accessible
     * @param type type
     * @param createdAt The date/time the object was created at.
     * @param updatedAt The date/time the object was last updated.
     * @param dataType The kind of data the custom field is allowed to contain.
     * @param fieldType The type of data this field contains. In combination with the {@code data_type} field.
     * @param fieldOptions The fixed list of value options that may be stored in this field.
     */
    @ApiStatus.Internal
    public CustomFieldsFieldWithOptions(String displayName, String description, CustomFieldsEditableFieldDefaultValue defaultValue, String id, String name, String summary, String self, TypeEnum type, OffsetDateTime createdAt, OffsetDateTime updatedAt, DataTypeEnum dataType, FieldTypeEnum fieldType, List<CustomFieldsFieldOption> fieldOptions) {
        this.displayName = displayName;
        this.description = description;
        this.defaultValue = defaultValue;
        this.id = id;
        this.name = name;
        this.summary = summary;
        this.self = self;
        this.type = type;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.dataType = dataType;
        this.fieldType = fieldType;
        this.fieldOptions = fieldOptions;
    }

    @AllArgsConstructor
    public enum TypeEnum {
        FIELD("field");

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

        private static final DataTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static DataTypeEnum of(String input) {
            if (input != null) {
                for (DataTypeEnum v : VALUES) {
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

    /**
     * The type of data this field contains. In combination with the {@code data_type} field.
     */
    @AllArgsConstructor
    public enum FieldTypeEnum {
        SINGLE_VALUE("single_value"),
        SINGLE_VALUE_FIXED("single_value_fixed"),
        MULTI_VALUE("multi_value"),
        MULTI_VALUE_FIXED("multi_value_fixed");

        private static final FieldTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static FieldTypeEnum of(String input) {
            if (input != null) {
                for (FieldTypeEnum v : VALUES) {
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
