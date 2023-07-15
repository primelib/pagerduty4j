package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CustomFieldsFieldValue
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private String id;

    /**
     * The name of the field. May include ASCII characters, specifically lowercase letters, digits, and underescores. The `name` for a Field must be unique.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Determines the type of the reference.
     */
    @JsonProperty("type")
    private TypeEnum type;

    /**
     * The human-readable name of the field. This must be unique across an account.
     */
    @JsonProperty("display_name")
    private String displayName;

    /**
     * The type of data this field contains. In combination with the `data_type` field.
     */
    @JsonProperty("field_type")
    private FieldTypeEnum fieldType;

    /**
     * The kind of data the custom field is allowed to contain.
     */
    @JsonProperty("data_type")
    private DataTypeEnum dataType;

    /**
     * A description of the data this field contains.
     */
    @JsonProperty("description")
    private String description;

    @JsonProperty("value")
    private CustomFieldsFieldValueValue value;


    /**
     * Determines the type of the reference.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        FIELD_VALUE("field_value");

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
