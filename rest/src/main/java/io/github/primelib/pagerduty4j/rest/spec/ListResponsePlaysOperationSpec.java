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
 * ListResponsePlaysSpec
 * <p>
 * Specification for the ListResponsePlays operation.
 * <p>
 * List Response Plays
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListResponsePlaysOperationSpec {
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
     * When this parameter is present, only those Response Plays that can be run manually will be returned.
     */
    @Nullable 
    private Boolean filterForManualRun;

    /**
     * The email address of a valid user associated with the account making the request. This is optional, and is only used for change tracking.
     */
    @Nullable 
    private String from;

    /**
     * Constructs a validated instance of {@link ListResponsePlaysOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ListResponsePlaysOperationSpec(Consumer<ListResponsePlaysOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link ListResponsePlaysOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param query                Filters the result, showing only the records whose name matches the query.
     * @param filterForManualRun   When this parameter is present, only those Response Plays that can be run manually will be returned.
     * @param from                 The email address of a valid user associated with the account making the request. This is optional, and is only used for change tracking.
     */
    @ApiStatus.Internal
    public ListResponsePlaysOperationSpec(String query, Boolean filterForManualRun, String from) {
        this.query = query;
        this.filterForManualRun = filterForManualRun;
        this.from = from;

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
