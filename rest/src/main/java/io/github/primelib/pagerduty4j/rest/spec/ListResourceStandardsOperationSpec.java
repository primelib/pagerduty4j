package io.github.primelib.pagerduty4j.rest.spec;

import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import java.util.Set;
import io.github.primelib.pagerduty4j.rest.model.Standard;
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
 * ListResourceStandardsSpec
 * <p>
 * Specification for the ListResourceStandards operation.
 * <p>
 * List a resource's standards scores
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListResourceStandardsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * Id of the resource to apply the standards.
     */
    @NotNull 
    private String id;

    /**
     */
    @NotNull 
    private String resourceType;

    /**
     * Constructs a validated instance of {@link ListResourceStandardsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ListResourceStandardsOperationSpec(Consumer<ListResourceStandardsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link ListResourceStandardsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   Id of the resource to apply the standards.
     * @param resourceType         
     */
    @ApiStatus.Internal
    public ListResourceStandardsOperationSpec(String id, String resourceType) {
        this.id = id;
        this.resourceType = resourceType;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(id, "id is a required parameter!");
        Objects.requireNonNull(resourceType, "resourceType is a required parameter!");
    }
}
