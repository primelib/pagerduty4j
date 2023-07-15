package io.github.primelib.pagerduty4j.rest.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.pagerduty4j.rest.model.UpdateCustomFieldsFieldOptionRequest;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * UpdateCustomFieldsFieldOptionSpec
 * <p>
 * Specification for the UpdateCustomFieldsFieldOption operation.
 * <p>
 * Update a Field Option
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateCustomFieldsFieldOptionOperationSpec {
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
     */
    @Nullable 
    private UpdateCustomFieldsFieldOptionRequest updateCustomFieldsFieldOptionRequest;

    /**
     * Constructs a validated implementation of {@link UpdateCustomFieldsFieldOptionOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateCustomFieldsFieldOptionOperationSpec(Consumer<UpdateCustomFieldsFieldOptionOperationSpec> spec) {
        spec.accept(this);
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
