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
 * ListServicesSpec
 * <p>
 * Specification for the ListServices operation.
 * <p>
 * List services
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListServicesOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * Filters the result, showing only the records whose name matches the query.
     */
    @Nullable 
    private String query;

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
     * Time zone in which results will be rendered. This will default to the account time zone.
     */
    @Nullable 
    private String timeZone;

    /**
     * Used to specify the field you wish to sort the results on.
     */
    @Nullable 
    private String sortBy;

    /**
     * Array of additional details to include.
     */
    @Nullable 
    private String include;

    /**
     * Constructs a validated instance of {@link ListServicesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ListServicesOperationSpec(Consumer<ListServicesOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link ListServicesOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param query                Filters the result, showing only the records whose name matches the query.
     * @param limit                The number of results per page.
     * @param offset               Offset to start pagination search results.
     * @param total                By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information. 
     * @param teamIds              An array of team IDs. Only results related to these teams will be returned. Account must have the {@code teams} ability to use this parameter.
     * @param timeZone             Time zone in which results will be rendered. This will default to the account time zone.
     * @param sortBy               Used to specify the field you wish to sort the results on.
     * @param include              Array of additional details to include.
     */
    @ApiStatus.Internal
    public ListServicesOperationSpec(String query, Integer limit, Integer offset, Boolean total, Set<String> teamIds, String timeZone, String sortBy, String include) {
        this.query = query;
        this.limit = limit;
        this.offset = offset;
        this.total = total;
        this.teamIds = teamIds;
        this.timeZone = timeZone;
        this.sortBy = sortBy;
        this.include = include;

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
