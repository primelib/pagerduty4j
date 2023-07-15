package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CustomFieldsEditableField
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private String displayName;

    /**
     * A description of the data this field contains.
     */
    @JsonProperty("description")
    private String description;

    @JsonProperty("default_value")
    private CustomFieldsEditableFieldDefaultValue defaultValue;


}
