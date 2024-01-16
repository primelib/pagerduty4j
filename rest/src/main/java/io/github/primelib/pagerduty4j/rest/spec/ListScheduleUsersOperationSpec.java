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
 * ListScheduleUsersSpec
 * <p>
 * Specification for the ListScheduleUsers operation.
 * <p>
 * List users on call.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListScheduleUsersOperationSpec {
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
    @Nullable 
    private OffsetDateTime since;

    /**
     * The end of the date range over which you want to search.
     */
    @Nullable 
    private OffsetDateTime until;

    /**
     * Constructs a validated instance of {@link ListScheduleUsersOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ListScheduleUsersOperationSpec(Consumer<ListScheduleUsersOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link ListScheduleUsersOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the resource.
     * @param since                The start of the date range over which you want to search.
     * @param until                The end of the date range over which you want to search.
     */
    @ApiStatus.Internal
    public ListScheduleUsersOperationSpec(String id, OffsetDateTime since, OffsetDateTime until) {
        this.id = id;
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
        Objects.requireNonNull(id, "id is a required parameter!");
    }
}
