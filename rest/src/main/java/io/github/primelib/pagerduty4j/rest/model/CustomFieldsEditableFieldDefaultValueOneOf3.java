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
 * CustomFieldsEditableFieldDefaultValueOneOf3
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "value"
})
@JsonTypeName("CustomFieldsEditableField_default_value_oneOf_3")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldsEditableFieldDefaultValueOneOf3 {

    /**
     * Constructs a validated implementation of {@link CustomFieldsEditableFieldDefaultValueOneOf3}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CustomFieldsEditableFieldDefaultValueOneOf3(Consumer<CustomFieldsEditableFieldDefaultValueOneOf3> spec) {
        spec.accept(this);
    }

    @JsonProperty("value")
    protected CustomFieldsEditableFieldDefaultValueOneOf3Value value;


}
