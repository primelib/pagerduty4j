package io.github.primelib.pagerduty4j.rest.spec;

import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import java.time.OffsetDateTime;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * ListAuditRecordsSpec
 * <p>
 * Specification for the ListAuditRecords operation.
 * <p>
 * List audit records
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListAuditRecordsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The minimum of the `limit` parameter used in the request or the maximum request size of the API.
     */
    @Nullable 
    private Integer limit;

    /**
     * Optional parameter used to request the "next" set of results from an API.
     * The value provided here is most commonly obtained from the `next_cursor` field of the previous request.
     * When no value is provided, the request starts at the beginning of the result set. 
     */
    @Nullable 
    private String cursor;

    /**
     * The start of the date range over which you want to search. If not specified, defaults to `now() - 24 hours` (past 24 hours)
     */
    @Nullable 
    private OffsetDateTime since;

    /**
     * The end of the date range over which you want to search. If not specified, defaults to `now()`. May not be more than 31 days after `since`.
     */
    @Nullable 
    private OffsetDateTime until;

    /**
     * Resource type filter for the root_resource.
     */
    @Nullable 
    private String rootResourceTypes;

    /**
     * Actor type filter.
     */
    @Nullable 
    private String actorType;

    /**
     * Actor Id filter. Must be qualified by providing the `actor_type` param.
     */
    @Nullable 
    private String actorId;

    /**
     * Method type filter.
     */
    @Nullable 
    private String methodType;

    /**
     * Method truncated_token filter. Must be qualified by providing the `method_type` param.
     */
    @Nullable 
    private String methodTruncatedToken;

    /**
     * Action filter
     */
    @Nullable 
    private String actions;

    /**
     * Constructs a validated implementation of {@link ListAuditRecordsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ListAuditRecordsOperationSpec(Consumer<ListAuditRecordsOperationSpec> spec) {
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
    }

}
