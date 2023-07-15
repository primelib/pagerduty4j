package io.github.primelib.pagerduty4j.rest.spec;

import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import java.time.OffsetDateTime;
import java.util.Set;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * ListOnCallsSpec
 * <p>
 * Specification for the ListOnCalls operation.
 * <p>
 * List all of the on-calls
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListOnCallsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * Time zone in which results will be rendered. This will default to the account time zone.
     */
    @Nullable 
    private String timeZone;

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
     * By default the `total` field in pagination responses is set to `null` to provide the fastest possible response times. Set `total` to `true` for this field to be populated.
     * See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information. 
     */
    @Nullable 
    private Boolean total = false;

    /**
     * Array of additional details to include.
     */
    @Nullable 
    private String include;

    /**
     * Filters the results, showing only on-calls for the specified user IDs.
     */
    @Nullable 
    private Set<String> userIds;

    /**
     * Filters the results, showing only on-calls for the specified escalation policy IDs.
     */
    @Nullable 
    private Set<String> escalationPolicyIds;

    /**
     * Filters the results, showing only on-calls for the specified schedule IDs. If `null` is provided in the array, it includes permanent on-calls due to direct user escalation targets.
     */
    @Nullable 
    private Set<String> scheduleIds;

    /**
     * The start of the time range over which you want to search. If an on-call period overlaps with the range, it will be included in the result. Defaults to current time. On-call shifts are limited to 90 days in the future.
     */
    @Nullable 
    private OffsetDateTime since;

    /**
     * The end of the time range over which you want to search. If an on-call period overlaps with the range, it will be included in the result. Defaults to current time. On-call shifts are limited to 90 days in the future, and the `until` time cannot be before the `since` time.
     */
    @Nullable 
    private OffsetDateTime until;

    /**
     * This will filter on-calls such that only the earliest on-call for each combination of escalation policy, escalation level, and user is returned. This is useful for determining when the "next" on-calls are for a given set of filters.
     */
    @Nullable 
    private Boolean earliest;

    /**
     * Constructs a validated implementation of {@link ListOnCallsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ListOnCallsOperationSpec(Consumer<ListOnCallsOperationSpec> spec) {
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
