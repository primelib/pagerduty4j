package io.github.primelib.pagerduty4j.rest.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.pagerduty4j.rest.model.CreateScheduleRequest;
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
 * CreateScheduleSpec
 * <p>
 * Specification for the CreateSchedule operation.
 * <p>
 * Create a schedule
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateScheduleOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * Any on-call schedule entries that pass the date range bounds will be truncated at the bounds, unless the parameter {@code overflow=true} is passed. This parameter defaults to false. For instance, if your schedule is a rotation that changes daily at midnight UTC, and your date range is from {@code 2011-06-01T10:00:00Z} to {@code 2011-06-01T14:00:00Z}:
     *  - If you don't pass the {@code overflow=true} parameter, you will get one schedule entry returned with a start of {@code 2011-06-01T10:00:00Z} and end of {@code 2011-06-01T14:00:00Z}. - If you do pass the {@code overflow=true} parameter, you will get one schedule entry returned with a start of {@code 2011-06-01T00:00:00Z} and end of {@code 2011-06-02T00:00:00Z}. 
     */
    @Nullable 
    private Boolean overflow;

    /**
     * The schedule to be created.
     */
    @Nullable 
    private CreateScheduleRequest createScheduleRequest;

    /**
     * Constructs a validated instance of {@link CreateScheduleOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateScheduleOperationSpec(Consumer<CreateScheduleOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link CreateScheduleOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param overflow             Any on-call schedule entries that pass the date range bounds will be truncated at the bounds, unless the parameter {@code overflow=true} is passed. This parameter defaults to false. For instance, if your schedule is a rotation that changes daily at midnight UTC, and your date range is from {@code 2011-06-01T10:00:00Z} to {@code 2011-06-01T14:00:00Z}:   - If you don't pass the {@code overflow=true} parameter, you will get one schedule entry returned with a start of {@code 2011-06-01T10:00:00Z} and end of {@code 2011-06-01T14:00:00Z}. - If you do pass the {@code overflow=true} parameter, you will get one schedule entry returned with a start of {@code 2011-06-01T00:00:00Z} and end of {@code 2011-06-02T00:00:00Z}. 
     * @param createScheduleRequest The schedule to be created.
     */
    @ApiStatus.Internal
    public CreateScheduleOperationSpec(Boolean overflow, CreateScheduleRequest createScheduleRequest) {
        this.overflow = overflow;
        this.createScheduleRequest = createScheduleRequest;

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
