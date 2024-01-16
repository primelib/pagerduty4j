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
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CustomFieldsEditableFieldDefaultValueOneOf3
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
    "value"
})
@JsonTypeName("CustomFieldsEditableField_default_value_oneOf_3")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldsEditableFieldDefaultValueOneOf3 {

    @JsonProperty("value")
    protected CustomFieldsEditableFieldDefaultValueOneOf3Value value;

    /**
     * Constructs a validated instance of {@link CustomFieldsEditableFieldDefaultValueOneOf3}.
     *
     * @param spec the specification to process
     */
    public CustomFieldsEditableFieldDefaultValueOneOf3(Consumer<CustomFieldsEditableFieldDefaultValueOneOf3> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CustomFieldsEditableFieldDefaultValueOneOf3}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CustomFieldsEditableFieldDefaultValueOneOf3(Consumer)} instead.
     * @param value value
     */
    @ApiStatus.Internal
    public CustomFieldsEditableFieldDefaultValueOneOf3(CustomFieldsEditableFieldDefaultValueOneOf3Value value) {
        this.value = value;
    }

}
