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
 * CustomFieldsEditableFieldDefaultValueOneOf
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
@JsonTypeName("CustomFieldsEditableField_default_value_oneOf")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldsEditableFieldDefaultValueOneOf {

    @JsonProperty("value")
    protected Boolean value;

    /**
     * Constructs a validated instance of {@link CustomFieldsEditableFieldDefaultValueOneOf}.
     *
     * @param spec the specification to process
     */
    public CustomFieldsEditableFieldDefaultValueOneOf(Consumer<CustomFieldsEditableFieldDefaultValueOneOf> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CustomFieldsEditableFieldDefaultValueOneOf}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CustomFieldsEditableFieldDefaultValueOneOf(Consumer)} instead.
     * @param value value
     */
    @ApiStatus.Internal
    public CustomFieldsEditableFieldDefaultValueOneOf(Boolean value) {
        this.value = value;
    }

}
