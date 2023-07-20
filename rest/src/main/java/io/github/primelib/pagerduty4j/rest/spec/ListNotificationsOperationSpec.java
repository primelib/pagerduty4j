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
 * ListNotificationsSpec
 * <p>
 * Specification for the ListNotifications operation.
 * <p>
 * List notifications
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListNotificationsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The start of the date range over which you want to search. The time element is optional.
     */
    @NotNull 
    private OffsetDateTime since;

    /**
     * The end of the date range over which you want to search. This should be in the same format as since. The size of the date range must be less than 3 months.
     */
    @NotNull 
    private OffsetDateTime until;

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
     * Return notification of this type only.
     */
    @Nullable 
    private String filter;

    /**
     * Array of additional details to include.
     */
    @Nullable 
    private String include;

    /**
     * Constructs a validated instance of {@link ListNotificationsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ListNotificationsOperationSpec(Consumer<ListNotificationsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link ListNotificationsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param since                The start of the date range over which you want to search. The time element is optional.
     * @param until                The end of the date range over which you want to search. This should be in the same format as since. The size of the date range must be less than 3 months.
     * @param limit                The number of results per page.
     * @param offset               Offset to start pagination search results.
     * @param total                By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information. 
     * @param timeZone             Time zone in which results will be rendered. This will default to the account time zone.
     * @param filter               Return notification of this type only.
     * @param include              Array of additional details to include.
     */
    @ApiStatus.Internal
    public ListNotificationsOperationSpec(OffsetDateTime since, OffsetDateTime until, Integer limit, Integer offset, Boolean total, String timeZone, String filter, String include) {
        this.since = since;
        this.until = until;
        this.limit = limit;
        this.offset = offset;
        this.total = total;
        this.timeZone = timeZone;
        this.filter = filter;
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
        Objects.requireNonNull(since, "since is a required parameter!");
        Objects.requireNonNull(until, "until is a required parameter!");
    }
}
