package io.github.primelib.pagerduty4j.rest.spec;

import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import java.time.OffsetDateTime;
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
 * ListAuditRecordsSpec
 * <p>
 * Specification for the ListAuditRecords operation.
 * <p>
 * List audit records
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListAuditRecordsOperationSpec {
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
     * The start of the date range over which you want to search. If not specified, defaults to {@code now() - 24 hours} (past 24 hours)
     */
    @Nullable 
    private OffsetDateTime since;

    /**
     * The end of the date range over which you want to search. If not specified, defaults to {@code now()}. May not be more than 31 days after {@code since}.
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
     * Actor Id filter. Must be qualified by providing the {@code actor_type} param.
     */
    @Nullable 
    private String actorId;

    /**
     * Method type filter.
     */
    @Nullable 
    private String methodType;

    /**
     * Method truncated_token filter. Must be qualified by providing the {@code method_type} param.
     */
    @Nullable 
    private String methodTruncatedToken;

    /**
     * Action filter
     */
    @Nullable 
    private String actions;

    /**
     * Constructs a validated instance of {@link ListAuditRecordsOperationSpec}.
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
     * Constructs a validated instance of {@link ListAuditRecordsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param limit                The minimum of the {@code limit} parameter used in the request or the maximum request size of the API.
     * @param cursor               Optional parameter used to request the "next" set of results from an API.  The value provided here is most commonly obtained from the {@code next_cursor} field of the previous request.  When no value is provided, the request starts at the beginning of the result set. 
     * @param since                The start of the date range over which you want to search. If not specified, defaults to {@code now() - 24 hours} (past 24 hours)
     * @param until                The end of the date range over which you want to search. If not specified, defaults to {@code now()}. May not be more than 31 days after {@code since}.
     * @param rootResourceTypes    Resource type filter for the root_resource.
     * @param actorType            Actor type filter.
     * @param actorId              Actor Id filter. Must be qualified by providing the {@code actor_type} param.
     * @param methodType           Method type filter.
     * @param methodTruncatedToken Method truncated_token filter. Must be qualified by providing the {@code method_type} param.
     * @param actions              Action filter
     */
    @ApiStatus.Internal
    public ListAuditRecordsOperationSpec(Integer limit, String cursor, OffsetDateTime since, OffsetDateTime until, String rootResourceTypes, String actorType, String actorId, String methodType, String methodTruncatedToken, String actions) {
        this.limit = limit;
        this.cursor = cursor;
        this.since = since;
        this.until = until;
        this.rootResourceTypes = rootResourceTypes;
        this.actorType = actorType;
        this.actorId = actorId;
        this.methodType = methodType;
        this.methodTruncatedToken = methodTruncatedToken;
        this.actions = actions;

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
