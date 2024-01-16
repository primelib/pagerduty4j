package io.github.primelib.pagerduty4j.rest.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.pagerduty4j.rest.model.CreateScheduleOverrideRequest;
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
 * CreateScheduleOverrideSpec
 * <p>
 * Specification for the CreateScheduleOverride operation.
 * <p>
 * Create one or more overrides
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateScheduleOverrideOperationSpec {
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
     * The overrides to be created
     */
    @NotNull 
    private CreateScheduleOverrideRequest createScheduleOverrideRequest;

    /**
     * Constructs a validated instance of {@link CreateScheduleOverrideOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateScheduleOverrideOperationSpec(Consumer<CreateScheduleOverrideOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link CreateScheduleOverrideOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the resource.
     * @param createScheduleOverrideRequest The overrides to be created
     */
    @ApiStatus.Internal
    public CreateScheduleOverrideOperationSpec(String id, CreateScheduleOverrideRequest createScheduleOverrideRequest) {
        this.id = id;
        this.createScheduleOverrideRequest = createScheduleOverrideRequest;

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
        Objects.requireNonNull(createScheduleOverrideRequest, "createScheduleOverrideRequest is a required parameter!");
    }
}
