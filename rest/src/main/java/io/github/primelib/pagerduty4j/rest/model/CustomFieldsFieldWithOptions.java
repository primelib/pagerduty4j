package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.time.OffsetDateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CustomFieldsFieldWithOptions
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link CustomFieldsFieldWithOptions}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CustomFieldsFieldWithOptions(Consumer<CustomFieldsFieldWithOptions> spec) {
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

    /**
     * The ID of the resource.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The name of the field. May include ASCII characters, specifically lowercase letters, digits, and underescores. The `name` for a Field must be unique.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
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
     * The type of data this field contains. In combination with the `data_type` field.
     */
    @JsonProperty("field_type")
    protected FieldTypeEnum fieldType;

    /**
     * The fixed list of value options that may be stored in this field.
     */
    @JsonProperty("field_options")
    protected List<CustomFieldsFieldOption> fieldOptions;


    @AllArgsConstructor
    public enum TypeEnum {
        FIELD("field");

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

    /**
     * The type of data this field contains. In combination with the `data_type` field.
     */
    @AllArgsConstructor
    public enum FieldTypeEnum {
        SINGLE_VALUE("single_value"),
        SINGLE_VALUE_FIXED("single_value_fixed"),
        MULTI_VALUE("multi_value"),
        MULTI_VALUE_FIXED("multi_value_fixed");

        private final String value;
    }

}
