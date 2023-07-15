package io.github.primelib.pagerduty4j.rest.spec;

import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import java.util.Set;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * ListIncidentsSpec
 * <p>
 * Specification for the ListIncidents operation.
 * <p>
 * List incidents
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListIncidentsOperationSpec {
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
     * By default the `total` field in pagination responses is set to `null` to provide the fastest possible response times. Set `total` to `true` for this field to be populated.
     * See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information. 
     */
    @Nullable 
    private Boolean total = false;

    /**
     * When set to all, the since and until parameters and defaults are ignored.
     */
    @Nullable 
    private String dateRange;

    /**
     * Incident de-duplication key. Incidents with child alerts do not have an incident key; querying by incident key will return incidents whose alerts have alert_key matching the given incident key.
     */
    @Nullable 
    private String incidentKey;

    /**
     * Returns only the incidents associated with the passed service(s). This expects one or more service IDs.
     */
    @Nullable 
    private Set<String> serviceIds;

    /**
     * An array of team IDs. Only results related to these teams will be returned. Account must have the `teams` ability to use this parameter.
     */
    @Nullable 
    private Set<String> teamIds;

    /**
     * Returns only the incidents currently assigned to the passed user(s). This expects one or more user IDs. Note: When using the assigned_to_user filter, you will only receive incidents with statuses of triggered or acknowledged. This is because resolved incidents are not assigned to any user.
     */
    @Nullable 
    private Set<String> userIds;

    /**
     * Array of the urgencies of the incidents to be returned. Defaults to all urgencies. Account must have the `urgencies` ability to do this.
     */
    @Nullable 
    private String urgencies;

    /**
     * Time zone in which results will be rendered. This will default to the account time zone.
     */
    @Nullable 
    private String timeZone;

    /**
     * Return only incidents with the given statuses. To query multiple statuses, pass `statuses[]` more than once, for example: `https://api.pagerduty.com/incidents?statuses[]=triggered&amp;statuses[]=acknowledged`. (More status codes may be introduced in the future.)
     */
    @Nullable 
    private String statuses;

    /**
     * Used to specify both the field you wish to sort the results on (incident_number/created_at/resolved_at/urgency), as well as the direction (asc/desc) of the results. The sort_by field and direction should be separated by a colon. A maximum of two fields can be included, separated by a comma. Sort direction defaults to ascending. The account must have the `urgencies` ability to sort by the urgency.
     */
    @Nullable 
    private Set<String> sortBy;

    /**
     * Array of additional details to include.
     */
    @Nullable 
    private String include;

    /**
     * The start of the date range over which you want to search. Maximum range is 6 months and default is 1 month.
     */
    @Nullable 
    private String since;

    /**
     * The end of the date range over which you want to search. Maximum range is 6 months and default is 1 month.
     */
    @Nullable 
    private String until;

    /**
     * Constructs a validated implementation of {@link ListIncidentsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ListIncidentsOperationSpec(Consumer<ListIncidentsOperationSpec> spec) {
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
