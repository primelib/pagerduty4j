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
 * CustomFieldsEditableFieldValueOneOf
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
    "name",
    "value"
})
@JsonTypeName("CustomFieldsEditableFieldValue_oneOf")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldsEditableFieldValueOneOf {

    /**
     * The name of the field. May include ASCII characters, specifically lowercase letters, digits, and underescores. The {@code name} for a Field must be unique.
     */
    @JsonProperty("name")
    protected String name;

    @JsonProperty("value")
    protected CustomFieldsFieldValueValue value;

    /**
     * Constructs a validated instance of {@link CustomFieldsEditableFieldValueOneOf}.
     *
     * @param spec the specification to process
     */
    public CustomFieldsEditableFieldValueOneOf(Consumer<CustomFieldsEditableFieldValueOneOf> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CustomFieldsEditableFieldValueOneOf}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CustomFieldsEditableFieldValueOneOf(Consumer)} instead.
     * @param name The name of the field. May include ASCII characters, specifically lowercase letters, digits, and underescores. The {@code name} for a Field must be unique.
     * @param value value
     */
    @ApiStatus.Internal
    public CustomFieldsEditableFieldValueOneOf(String name, CustomFieldsFieldValueValue value) {
        this.name = name;
        this.value = value;
    }

}
