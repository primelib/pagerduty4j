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
 * ListMaintenanceWindowsSpec
 * <p>
 * Specification for the ListMaintenanceWindows operation.
 * <p>
 * List maintenance windows
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListMaintenanceWindowsOperationSpec {
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
     * An array of service IDs. Only results related to these services will be returned.
     */
    @Nullable 
    private List<String> serviceIds;

    /**
     * Array of additional Models to include in response.
     */
    @Nullable 
    private String include;

    /**
     * Only return maintenance windows in a given state.
     */
    @Nullable 
    private String filter;

    /**
     * Constructs a validated instance of {@link ListMaintenanceWindowsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ListMaintenanceWindowsOperationSpec(Consumer<ListMaintenanceWindowsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link ListMaintenanceWindowsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param query                Filters the result, showing only the records whose name matches the query.
     * @param limit                The number of results per page.
     * @param offset               Offset to start pagination search results.
     * @param total                By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information. 
     * @param teamIds              An array of team IDs. Only results related to these teams will be returned. Account must have the {@code teams} ability to use this parameter.
     * @param serviceIds           An array of service IDs. Only results related to these services will be returned.
     * @param include              Array of additional Models to include in response.
     * @param filter               Only return maintenance windows in a given state.
     */
    @ApiStatus.Internal
    public ListMaintenanceWindowsOperationSpec(String query, Integer limit, Integer offset, Boolean total, Set<String> teamIds, List<String> serviceIds, String include, String filter) {
        this.query = query;
        this.limit = limit;
        this.offset = offset;
        this.total = total;
        this.teamIds = teamIds;
        this.serviceIds = serviceIds;
        this.include = include;
        this.filter = filter;

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
