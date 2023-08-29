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
 * ListIncidentLogEntriesSpec
 * <p>
 * Specification for the ListIncidentLogEntries operation.
 * <p>
 * List log entries for an incident
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListIncidentLogEntriesOperationSpec {
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
     * Time zone in which results will be rendered. This will default to the account time zone.
     */
    @Nullable 
    private String timeZone;

    /**
     * The start of the date range over which you want to search.
     */
    @Nullable 
    private OffsetDateTime since;

    /**
     * The end of the date range over which you want to search.
     */
    @Nullable 
    private OffsetDateTime until;

    /**
     * If {@code true}, will return a subset of log entries that show only the most important changes to the incident.
     */
    @Nullable 
    private Boolean isOverview;

    /**
     * Array of additional Models to include in response.
     */
    @Nullable 
    private String include;

    /**
     * Constructs a validated instance of {@link ListIncidentLogEntriesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ListIncidentLogEntriesOperationSpec(Consumer<ListIncidentLogEntriesOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link ListIncidentLogEntriesOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the resource.
     * @param limit                The number of results per page.
     * @param offset               Offset to start pagination search results.
     * @param total                By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information. 
     * @param timeZone             Time zone in which results will be rendered. This will default to the account time zone.
     * @param since                The start of the date range over which you want to search.
     * @param until                The end of the date range over which you want to search.
     * @param isOverview           If {@code true}, will return a subset of log entries that show only the most important changes to the incident.
     * @param include              Array of additional Models to include in response.
     */
    @ApiStatus.Internal
    public ListIncidentLogEntriesOperationSpec(String id, Integer limit, Integer offset, Boolean total, String timeZone, OffsetDateTime since, OffsetDateTime until, Boolean isOverview, String include) {
        this.id = id;
        this.limit = limit;
        this.offset = offset;
        this.total = total;
        this.timeZone = timeZone;
        this.since = since;
        this.until = until;
        this.isOverview = isOverview;
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
        Objects.requireNonNull(id, "id is a required parameter!");
    }
}
