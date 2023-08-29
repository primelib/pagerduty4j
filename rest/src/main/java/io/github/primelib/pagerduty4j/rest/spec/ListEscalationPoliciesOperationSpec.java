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
 * ListEscalationPoliciesSpec
 * <p>
 * Specification for the ListEscalationPolicies operation.
 * <p>
 * List escalation policies
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListEscalationPoliciesOperationSpec {
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
     * Filters the results, showing only escalation policies on which any of the users is a target.
     */
    @Nullable 
    private Set<String> userIds;

    /**
     * An array of team IDs. Only results related to these teams will be returned. Account must have the {@code teams} ability to use this parameter.
     */
    @Nullable 
    private Set<String> teamIds;

    /**
     * Array of additional Models to include in response.
     */
    @Nullable 
    private String include;

    /**
     * Used to specify the field you wish to sort the results on.
     */
    @Nullable 
    private String sortBy;

    /**
     * Constructs a validated instance of {@link ListEscalationPoliciesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ListEscalationPoliciesOperationSpec(Consumer<ListEscalationPoliciesOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link ListEscalationPoliciesOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param limit                The number of results per page.
     * @param offset               Offset to start pagination search results.
     * @param total                By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information. 
     * @param query                Filters the result, showing only the records whose name matches the query.
     * @param userIds              Filters the results, showing only escalation policies on which any of the users is a target.
     * @param teamIds              An array of team IDs. Only results related to these teams will be returned. Account must have the {@code teams} ability to use this parameter.
     * @param include              Array of additional Models to include in response.
     * @param sortBy               Used to specify the field you wish to sort the results on.
     */
    @ApiStatus.Internal
    public ListEscalationPoliciesOperationSpec(Integer limit, Integer offset, Boolean total, String query, Set<String> userIds, Set<String> teamIds, String include, String sortBy) {
        this.limit = limit;
        this.offset = offset;
        this.total = total;
        this.query = query;
        this.userIds = userIds;
        this.teamIds = teamIds;
        this.include = include;
        this.sortBy = sortBy;

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
