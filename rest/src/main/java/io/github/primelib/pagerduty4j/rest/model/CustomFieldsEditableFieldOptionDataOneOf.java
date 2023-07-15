package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CustomFieldsEditableFieldOptionDataOneOf
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "data_type",
    "value"
})
@JsonTypeName("CustomFieldsEditableFieldOption_data_oneOf")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldsEditableFieldOptionDataOneOf {

    /**
     * The kind of data represented by this option. Must match the Field's `data_type`.
     */
    @JsonProperty("data_type")
    private DataTypeEnum dataType;

    @JsonProperty("value")
    private String value;


    /**
     * The kind of data represented by this option. Must match the Field's `data_type`.
     */
    @AllArgsConstructor
    public enum DataTypeEnum {
        STRING("string");

        private final String value;
    }

}
