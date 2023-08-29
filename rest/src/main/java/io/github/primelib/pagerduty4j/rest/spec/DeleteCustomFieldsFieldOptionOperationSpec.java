package io.github.primelib.pagerduty4j.rest.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import java.util.Set;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * DeleteCustomFieldsFieldOptionSpec
 * <p>
 * Specification for the DeleteCustomFieldsFieldOption operation.
 * <p>
 * Delete a Field Option
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DeleteCustomFieldsFieldOptionOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the field.
     */
    @NotNull 
    private String fieldId;

    /**
     * The ID of the field option.
     */
    @NotNull 
    private String fieldOptionId;

    /**
     * Constructs a validated instance of {@link DeleteCustomFieldsFieldOptionOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DeleteCustomFieldsFieldOptionOperationSpec(Consumer<DeleteCustomFieldsFieldOptionOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link DeleteCustomFieldsFieldOptionOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param fieldId              The ID of the field.
     * @param fieldOptionId        The ID of the field option.
     */
    @ApiStatus.Internal
    public DeleteCustomFieldsFieldOptionOperationSpec(String fieldId, String fieldOptionId) {
        this.fieldId = fieldId;
        this.fieldOptionId = fieldOptionId;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(fieldId, "fieldId is a required parameter!");
        Objects.requireNonNull(fieldOptionId, "fieldOptionId is a required parameter!");
    }
}
