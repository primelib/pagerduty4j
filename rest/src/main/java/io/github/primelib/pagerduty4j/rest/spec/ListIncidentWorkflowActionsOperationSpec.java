package io.github.primelib.pagerduty4j.rest.spec;

import java.util.List;
import org.jetbrains.annotations.ApiStatus;
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
 * ListIncidentWorkflowActionsSpec
 * <p>
 * Specification for the ListIncidentWorkflowActions operation.
 * <p>
 * List Actions
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListIncidentWorkflowActionsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The minimum of the {@code limit} parameter used in the request or the maximum request size of the API.
     */
    @Nullable 
    private Integer limit;

    /**
     * Optional parameter used to request the "next" set of results from an API.
     * The value provided here is most commonly obtained from the {@code next_cursor} field of the previous request.
     * When no value is provided, the request starts at the beginning of the result set. 
     */
    @Nullable 
    private String cursor;

    /**
     * If provided, only show actions tagged with the specified keyword
     */
    @Nullable 
    private String keyword;

    /**
     * Constructs a validated instance of {@link ListIncidentWorkflowActionsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ListIncidentWorkflowActionsOperationSpec(Consumer<ListIncidentWorkflowActionsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link ListIncidentWorkflowActionsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param limit                The minimum of the {@code limit} parameter used in the request or the maximum request size of the API.
     * @param cursor               Optional parameter used to request the "next" set of results from an API.  The value provided here is most commonly obtained from the {@code next_cursor} field of the previous request.  When no value is provided, the request starts at the beginning of the result set. 
     * @param keyword              If provided, only show actions tagged with the specified keyword
     */
    @ApiStatus.Internal
    public ListIncidentWorkflowActionsOperationSpec(Integer limit, String cursor, String keyword) {
        this.limit = limit;
        this.cursor = cursor;
        this.keyword = keyword;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
    }
}
