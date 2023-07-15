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
 * CustomFieldsEditableFieldValue
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "name",
    "value",
    "id"
})
@JsonTypeName("CustomFieldsEditableFieldValue")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldsEditableFieldValue {

    /**
     * Constructs a validated implementation of {@link CustomFieldsEditableFieldValue}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CustomFieldsEditableFieldValue(Consumer<CustomFieldsEditableFieldValue> spec) {
        spec.accept(this);
    }

    /**
     * The name of the field. May include ASCII characters, specifically lowercase letters, digits, and underescores. The `name` for a Field must be unique.
     */
    @JsonProperty("name")
    protected String name;

    @JsonProperty("value")
    protected CustomFieldsFieldValueValue value;

    /**
     * The ID of the Field.
     */
    @JsonProperty("id")
    protected String id;


}
