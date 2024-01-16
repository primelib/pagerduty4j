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
 * ListSchedulesSpec
 * <p>
 * Specification for the ListSchedules operation.
 * <p>
 * List schedules
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListSchedulesOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

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
     * Filters the result, showing only the records whose name matches the query.
     */
    @Nullable 
    private String query;

    /**
     * Array of additional details to include.
     */
    @Nullable 
    private String include;

    /**
     * Time zone in which results will be rendered. This will default to the current user's time zone and then the account's time zone.
     */
    @Nullable 
    private String timeZone;

    /**
     * Constructs a validated instance of {@link ListSchedulesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ListSchedulesOperationSpec(Consumer<ListSchedulesOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link ListSchedulesOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param limit                The number of results per page.
     * @param offset               Offset to start pagination search results.
     * @param total                By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information. 
     * @param query                Filters the result, showing only the records whose name matches the query.
     * @param include              Array of additional details to include.
     * @param timeZone             Time zone in which results will be rendered. This will default to the current user's time zone and then the account's time zone.
     */
    @ApiStatus.Internal
    public ListSchedulesOperationSpec(Integer limit, Integer offset, Boolean total, String query, String include, String timeZone) {
        this.limit = limit;
        this.offset = offset;
        this.total = total;
        this.query = query;
        this.include = include;
        this.timeZone = timeZone;

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
