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
 * CustomFieldsEditableFieldValueOneOf1
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
    "id",
    "value"
})
@JsonTypeName("CustomFieldsEditableFieldValue_oneOf_1")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldsEditableFieldValueOneOf1 {

    /**
     * The ID of the Field.
     */
    @JsonProperty("id")
    protected String id;

    @JsonProperty("value")
    protected CustomFieldsFieldValueValue value;

    /**
     * Constructs a validated instance of {@link CustomFieldsEditableFieldValueOneOf1}.
     *
     * @param spec the specification to process
     */
    public CustomFieldsEditableFieldValueOneOf1(Consumer<CustomFieldsEditableFieldValueOneOf1> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CustomFieldsEditableFieldValueOneOf1}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CustomFieldsEditableFieldValueOneOf1(Consumer)} instead.
     * @param id The ID of the Field.
     * @param value var.name
     */
    @ApiStatus.Internal
    public CustomFieldsEditableFieldValueOneOf1(String id, CustomFieldsFieldValueValue value) {
        this.id = id;
        this.value = value;
    }

}
