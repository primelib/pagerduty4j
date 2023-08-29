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
 * ListChangeEventsSpec
 * <p>
 * Specification for the ListChangeEvents operation.
 * <p>
 * List Change Events
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListChangeEventsOperationSpec {
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
     * An array of team IDs. Only results related to these teams will be returned. Account must have the {@code teams} ability to use this parameter.
     */
    @Nullable 
    private Set<String> teamIds;

    /**
     * An array of integration IDs. Only results related to these integrations will be returned.
     */
    @Nullable 
    private Set<String> integrationIds;

    /**
     * The start of the date range over which you want to search, as a UTC ISO 8601 datetime string. Will return an HTTP 400 for non-UTC datetimes.
     */
    @Nullable 
    private OffsetDateTime since;

    /**
     * The end of the date range over which you want to search, as a UTC ISO 8601 datetime string. Will return an HTTP 400 for non-UTC datetimes.
     */
    @Nullable 
    private OffsetDateTime until;

    /**
     * Constructs a validated instance of {@link ListChangeEventsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ListChangeEventsOperationSpec(Consumer<ListChangeEventsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link ListChangeEventsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param limit                The number of results per page.
     * @param offset               Offset to start pagination search results.
     * @param total                By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information. 
     * @param teamIds              An array of team IDs. Only results related to these teams will be returned. Account must have the {@code teams} ability to use this parameter.
     * @param integrationIds       An array of integration IDs. Only results related to these integrations will be returned.
     * @param since                The start of the date range over which you want to search, as a UTC ISO 8601 datetime string. Will return an HTTP 400 for non-UTC datetimes.
     * @param until                The end of the date range over which you want to search, as a UTC ISO 8601 datetime string. Will return an HTTP 400 for non-UTC datetimes.
     */
    @ApiStatus.Internal
    public ListChangeEventsOperationSpec(Integer limit, Integer offset, Boolean total, Set<String> teamIds, Set<String> integrationIds, OffsetDateTime since, OffsetDateTime until) {
        this.limit = limit;
        this.offset = offset;
        this.total = total;
        this.teamIds = teamIds;
        this.integrationIds = integrationIds;
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
    }
}
