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
 * ListScheduleOverridesSpec
 * <p>
 * Specification for the ListScheduleOverrides operation.
 * <p>
 * List overrides
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListScheduleOverridesOperationSpec {
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
     * The start of the date range over which you want to search.
     */
    @NotNull 
    private OffsetDateTime since;

    /**
     * The end of the date range over which you want to search.
     */
    @NotNull 
    private OffsetDateTime until;

    /**
     * When this parameter is present, only editable overrides will be returned. The result will only include the id of the override if this parameter is present. Only future overrides are editable.
     */
    @Nullable 
    private Boolean editable;

    /**
     * Any on-call schedule entries that pass the date range bounds will be truncated at the bounds, unless the parameter overflow=true is passed. This parameter defaults to false.
     */
    @Nullable 
    private Boolean overflow;

    /**
     * Constructs a validated instance of {@link ListScheduleOverridesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ListScheduleOverridesOperationSpec(Consumer<ListScheduleOverridesOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link ListScheduleOverridesOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the resource.
     * @param since                The start of the date range over which you want to search.
     * @param until                The end of the date range over which you want to search.
     * @param editable             When this parameter is present, only editable overrides will be returned. The result will only include the id of the override if this parameter is present. Only future overrides are editable.
     * @param overflow             Any on-call schedule entries that pass the date range bounds will be truncated at the bounds, unless the parameter overflow=true is passed. This parameter defaults to false.
     */
    @ApiStatus.Internal
    public ListScheduleOverridesOperationSpec(String id, OffsetDateTime since, OffsetDateTime until, Boolean editable, Boolean overflow) {
        this.id = id;
        this.since = since;
        this.until = until;
        this.editable = editable;
        this.overflow = overflow;

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
        Objects.requireNonNull(since, "since is a required parameter!");
        Objects.requireNonNull(until, "until is a required parameter!");
    }
}
