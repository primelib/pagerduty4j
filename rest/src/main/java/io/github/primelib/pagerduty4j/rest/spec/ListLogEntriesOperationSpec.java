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
 * ListLogEntriesSpec
 * <p>
 * Specification for the ListLogEntries operation.
 * <p>
 * List log entries
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListLogEntriesOperationSpec {
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
     * If `true`, will return a subset of log entries that show only the most important changes to the incident.
     */
    @Nullable 
    private Boolean isOverview = false;

    /**
     * Array of additional Models to include in response.
     */
    @Nullable 
    private String include;

    /**
     * An array of team IDs. Only results related to these teams will be returned. Account must have the `teams` ability to use this parameter.
     */
    @Nullable 
    private Set<String> teamIds;

    /**
     * Constructs a validated implementation of {@link ListLogEntriesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ListLogEntriesOperationSpec(Consumer<ListLogEntriesOperationSpec> spec) {
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
