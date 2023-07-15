package io.github.primelib.pagerduty4j.rest.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.pagerduty4j.rest.model.CreateEntityTypeByIdChangeTagsRequest;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * CreateEntityTypeByIdChangeTagsSpec
 * <p>
 * Specification for the CreateEntityTypeByIdChangeTags operation.
 * <p>
 * Assign tags
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateEntityTypeByIdChangeTagsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * Type of entity related with the tag
     */
    @NotNull 
    private String entityType;

    /**
     * The ID of the resource.
     */
    @NotNull 
    private String id;

    /**
     */
    @Nullable 
    private CreateEntityTypeByIdChangeTagsRequest createEntityTypeByIdChangeTagsRequest;

    /**
     * Constructs a validated implementation of {@link CreateEntityTypeByIdChangeTagsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateEntityTypeByIdChangeTagsOperationSpec(Consumer<CreateEntityTypeByIdChangeTagsOperationSpec> spec) {
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
        Objects.requireNonNull(entityType, "entityType is a required parameter!");
        Objects.requireNonNull(id, "id is a required parameter!");
    }

}
