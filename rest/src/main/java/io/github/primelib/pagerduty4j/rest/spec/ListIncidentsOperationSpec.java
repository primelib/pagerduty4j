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
 * ListIncidentsSpec
 * <p>
 * Specification for the ListIncidents operation.
 * <p>
 * List incidents
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
     * By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.
     * See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information. 
     */
    @Nullable 
    private Boolean total;

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
     * An array of team IDs. Only results related to these teams will be returned. Account must have the {@code teams} ability to use this parameter.
     */
    @Nullable 
    private Set<String> teamIds;

    /**
     * Returns only the incidents currently assigned to the passed user(s). This expects one or more user IDs. Note: When using the assigned_to_user filter, you will only receive incidents with statuses of triggered or acknowledged. This is because resolved incidents are not assigned to any user.
     */
    @Nullable 
    private Set<String> userIds;

    /**
     * Array of the urgencies of the incidents to be returned. Defaults to all urgencies. Account must have the {@code urgencies} ability to do this.
     */
    @Nullable 
    private String urgencies;

    /**
     * Time zone in which results will be rendered. This will default to the account time zone.
     */
    @Nullable 
    private String timeZone;

    /**
     * Return only incidents with the given statuses. To query multiple statuses, pass {@code statuses[]} more than once, for example: {@code https://api.pagerduty.com/incidents?statuses[]=triggered&amp;statuses[]=acknowledged}. (More status codes may be introduced in the future.)
     */
    @Nullable 
    private String statuses;

    /**
     * Used to specify both the field you wish to sort the results on (incident_number/created_at/resolved_at/urgency), as well as the direction (asc/desc) of the results. The sort_by field and direction should be separated by a colon. A maximum of two fields can be included, separated by a comma. Sort direction defaults to ascending. The account must have the {@code urgencies} ability to sort by the urgency.
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
     * Constructs a validated instance of {@link ListIncidentsOperationSpec}.
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
     * Constructs a validated instance of {@link ListIncidentsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param limit                The number of results per page.
     * @param offset               Offset to start pagination search results.
     * @param total                By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information. 
     * @param dateRange            When set to all, the since and until parameters and defaults are ignored.
     * @param incidentKey          Incident de-duplication key. Incidents with child alerts do not have an incident key; querying by incident key will return incidents whose alerts have alert_key matching the given incident key.
     * @param serviceIds           Returns only the incidents associated with the passed service(s). This expects one or more service IDs.
     * @param teamIds              An array of team IDs. Only results related to these teams will be returned. Account must have the {@code teams} ability to use this parameter.
     * @param userIds              Returns only the incidents currently assigned to the passed user(s). This expects one or more user IDs. Note: When using the assigned_to_user filter, you will only receive incidents with statuses of triggered or acknowledged. This is because resolved incidents are not assigned to any user.
     * @param urgencies            Array of the urgencies of the incidents to be returned. Defaults to all urgencies. Account must have the {@code urgencies} ability to do this.
     * @param timeZone             Time zone in which results will be rendered. This will default to the account time zone.
     * @param statuses             Return only incidents with the given statuses. To query multiple statuses, pass {@code statuses[]} more than once, for example: {@code https://api.pagerduty.com/incidents?statuses[]=triggered&amp;statuses[]=acknowledged}. (More status codes may be introduced in the future.)
     * @param sortBy               Used to specify both the field you wish to sort the results on (incident_number/created_at/resolved_at/urgency), as well as the direction (asc/desc) of the results. The sort_by field and direction should be separated by a colon. A maximum of two fields can be included, separated by a comma. Sort direction defaults to ascending. The account must have the {@code urgencies} ability to sort by the urgency.
     * @param include              Array of additional details to include.
     * @param since                The start of the date range over which you want to search. Maximum range is 6 months and default is 1 month.
     * @param until                The end of the date range over which you want to search. Maximum range is 6 months and default is 1 month.
     */
    @ApiStatus.Internal
    public ListIncidentsOperationSpec(Integer limit, Integer offset, Boolean total, String dateRange, String incidentKey, Set<String> serviceIds, Set<String> teamIds, Set<String> userIds, String urgencies, String timeZone, String statuses, Set<String> sortBy, String include, String since, String until) {
        this.limit = limit;
        this.offset = offset;
        this.total = total;
        this.dateRange = dateRange;
        this.incidentKey = incidentKey;
        this.serviceIds = serviceIds;
        this.teamIds = teamIds;
        this.userIds = userIds;
        this.urgencies = urgencies;
        this.timeZone = timeZone;
        this.statuses = statuses;
        this.sortBy = sortBy;
        this.include = include;
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
