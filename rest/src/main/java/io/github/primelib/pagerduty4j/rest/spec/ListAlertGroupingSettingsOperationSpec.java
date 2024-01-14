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
 * ListAlertGroupingSettingsSpec
 * <p>
 * Specification for the ListAlertGroupingSettings operation.
 * <p>
 * List alert grouping settings
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListAlertGroupingSettingsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * Cursor to retrieve next page; only present if next page exists.
     */
    @Nullable 
    private String after;

    /**
     * Cursor to retrieve previous page; only present if not on first page.
     */
    @Nullable 
    private String before;

    /**
     * By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.
     * See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information. 
     */
    @Nullable 
    private Boolean total;

    /**
     * The number of results per page.
     */
    @Nullable 
    private Integer limit;

    /**
     * An array of service IDs. Only results related to these services will be returned.
     */
    @Nullable 
    private List<String> serviceIds;

    /**
     * Constructs a validated instance of {@link ListAlertGroupingSettingsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ListAlertGroupingSettingsOperationSpec(Consumer<ListAlertGroupingSettingsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link ListAlertGroupingSettingsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param after                Cursor to retrieve next page; only present if next page exists.
     * @param before               Cursor to retrieve previous page; only present if not on first page.
     * @param total                By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information. 
     * @param limit                The number of results per page.
     * @param serviceIds           An array of service IDs. Only results related to these services will be returned.
     */
    @ApiStatus.Internal
    public ListAlertGroupingSettingsOperationSpec(String after, String before, Boolean total, Integer limit, List<String> serviceIds) {
        this.after = after;
        this.before = before;
        this.total = total;
        this.limit = limit;
        this.serviceIds = serviceIds;

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
