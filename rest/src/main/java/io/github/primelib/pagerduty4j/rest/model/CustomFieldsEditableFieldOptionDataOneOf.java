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
 * CustomFieldsEditableFieldOptionDataOneOf
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "data_type",
    "value"
})
@JsonTypeName("CustomFieldsEditableFieldOption_data_oneOf")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldsEditableFieldOptionDataOneOf {

    /**
     * Constructs a validated implementation of {@link CustomFieldsEditableFieldOptionDataOneOf}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CustomFieldsEditableFieldOptionDataOneOf(Consumer<CustomFieldsEditableFieldOptionDataOneOf> spec) {
        spec.accept(this);
    }

    /**
     * The kind of data represented by this option. Must match the Field's `data_type`.
     */
    @JsonProperty("data_type")
    protected DataTypeEnum dataType;

    @JsonProperty("value")
    protected String value;


    /**
     * The kind of data represented by this option. Must match the Field's `data_type`.
     */
    @AllArgsConstructor
    public enum DataTypeEnum {
        STRING("string");

        private final String value;
    }

}
