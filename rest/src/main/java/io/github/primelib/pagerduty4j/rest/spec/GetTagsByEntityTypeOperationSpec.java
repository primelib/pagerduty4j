package io.github.primelib.pagerduty4j.rest.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
 * GetTagsByEntityTypeSpec
 * <p>
 * Specification for the GetTagsByEntityType operation.
 * <p>
 * Get connected entities
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetTagsByEntityTypeOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the resource.
     */
    @NotNull 
    private String id;

    /**
     * Type of entity related with the tag
     */
    @NotNull 
    private String entityType;

    /**
     * The number of results per page.
     */
    @Nullable 
    private Integer limit;

    /**
     * Offset to start pagination search results.
     */
    @Nullable 
    private Integer offset;

    /**
     * By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.
     * See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information. 
     */
    @Nullable 
    private Boolean total;

    /**
     * Constructs a validated instance of {@link GetTagsByEntityTypeOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetTagsByEntityTypeOperationSpec(Consumer<GetTagsByEntityTypeOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetTagsByEntityTypeOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the resource.
     * @param entityType           Type of entity related with the tag
     * @param limit                The number of results per page.
     * @param offset               Offset to start pagination search results.
     * @param total                By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information. 
     */
    @ApiStatus.Internal
    public GetTagsByEntityTypeOperationSpec(String id, String entityType, Integer limit, Integer offset, Boolean total) {
        this.id = id;
        this.entityType = entityType;
        this.limit = limit;
        this.offset = offset;
        this.total = total;

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
        Objects.requireNonNull(entityType, "entityType is a required parameter!");
    }
}
