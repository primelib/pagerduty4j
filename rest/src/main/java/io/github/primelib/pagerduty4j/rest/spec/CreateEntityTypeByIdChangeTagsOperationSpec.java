package io.github.primelib.pagerduty4j.rest.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.pagerduty4j.rest.model.CreateEntityTypeByIdChangeTagsRequest;
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
 * CreateEntityTypeByIdChangeTagsSpec
 * <p>
 * Specification for the CreateEntityTypeByIdChangeTags operation.
 * <p>
 * Assign tags
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
     * Constructs a validated instance of {@link CreateEntityTypeByIdChangeTagsOperationSpec}.
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
     * Constructs a validated instance of {@link CreateEntityTypeByIdChangeTagsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param entityType           Type of entity related with the tag
     * @param id                   The ID of the resource.
     * @param createEntityTypeByIdChangeTagsRequest 
     */
    @ApiStatus.Internal
    public CreateEntityTypeByIdChangeTagsOperationSpec(String entityType, String id, CreateEntityTypeByIdChangeTagsRequest createEntityTypeByIdChangeTagsRequest) {
        this.entityType = entityType;
        this.id = id;
        this.createEntityTypeByIdChangeTagsRequest = createEntityTypeByIdChangeTagsRequest;

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
