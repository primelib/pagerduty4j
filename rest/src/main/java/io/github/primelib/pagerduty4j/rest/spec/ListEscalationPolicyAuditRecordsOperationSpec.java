package io.github.primelib.pagerduty4j.rest.spec;

import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
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
 * ListEscalationPolicyAuditRecordsSpec
 * <p>
 * Specification for the ListEscalationPolicyAuditRecords operation.
 * <p>
 * List audit records for an escalation policy
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListEscalationPolicyAuditRecordsOperationSpec {
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
     * Constructs a validated instance of {@link ListEscalationPolicyAuditRecordsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ListEscalationPolicyAuditRecordsOperationSpec(Consumer<ListEscalationPolicyAuditRecordsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link ListEscalationPolicyAuditRecordsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the resource.
     * @param limit                The minimum of the {@code limit} parameter used in the request or the maximum request size of the API.
     * @param cursor               Optional parameter used to request the "next" set of results from an API.  The value provided here is most commonly obtained from the {@code next_cursor} field of the previous request.  When no value is provided, the request starts at the beginning of the result set. 
     * @param since                The start of the date range over which you want to search. If not specified, defaults to {@code now() - 24 hours} (past 24 hours)
     * @param until                The end of the date range over which you want to search. If not specified, defaults to {@code now()}. May not be more than 31 days after {@code since}.
     */
    @ApiStatus.Internal
    public ListEscalationPolicyAuditRecordsOperationSpec(String id, Integer limit, String cursor, OffsetDateTime since, OffsetDateTime until) {
        this.id = id;
        this.limit = limit;
        this.cursor = cursor;
        this.since = since;
        this.until = until;

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
    }
}
