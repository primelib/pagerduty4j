package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CustomFieldsEditableFieldDefaultValueOneOf3Value
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@Builder
@JsonTypeName("CustomFieldsEditableField_default_value_oneOf_3_value")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldsEditableFieldDefaultValueOneOf3Value {

    /**
     * Constructs a validated instance of {@link CustomFieldsEditableFieldDefaultValueOneOf3Value}.
     *
     * @param spec the specification to process
     */
    public CustomFieldsEditableFieldDefaultValueOneOf3Value(Consumer<CustomFieldsEditableFieldDefaultValueOneOf3Value> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CustomFieldsEditableFieldDefaultValueOneOf3Value}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CustomFieldsEditableFieldDefaultValueOneOf3Value(Consumer)} instead.
     */
    @ApiStatus.Internal
    public CustomFieldsEditableFieldDefaultValueOneOf3Value() {
    }

}
