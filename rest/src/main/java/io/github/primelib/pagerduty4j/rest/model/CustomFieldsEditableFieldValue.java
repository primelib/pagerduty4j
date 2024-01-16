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
 * CustomFieldsEditableFieldValue
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
    "value",
    "id"
})
@JsonTypeName("CustomFieldsEditableFieldValue")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldsEditableFieldValue {

    /**
     * The name of the field. May include ASCII characters, specifically lowercase letters, digits, and underescores. The {@code name} for a Field must be unique.
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

    /**
     * Constructs a validated instance of {@link CustomFieldsEditableFieldValue}.
     *
     * @param spec the specification to process
     */
    public CustomFieldsEditableFieldValue(Consumer<CustomFieldsEditableFieldValue> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CustomFieldsEditableFieldValue}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CustomFieldsEditableFieldValue(Consumer)} instead.
     * @param name The name of the field. May include ASCII characters, specifically lowercase letters, digits, and underescores. The {@code name} for a Field must be unique.
     * @param value value
     * @param id The ID of the Field.
     */
    @ApiStatus.Internal
    public CustomFieldsEditableFieldValue(String name, CustomFieldsFieldValueValue value, String id) {
        this.name = name;
        this.value = value;
        this.id = id;
    }

}
