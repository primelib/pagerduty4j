package io.github.primelib.pagerduty4j.rest.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.pagerduty4j.rest.model.MergeIncidents200Response;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * RunResponsePlaySpec
 * <p>
 * Specification for the RunResponsePlay operation.
 * <p>
 * Run a response play
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RunResponsePlayOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The response play ID of the response play associated with the request.
     */
    @NotNull 
    private String responsePlayId;

    /**
     * The email address of a valid user associated with the account making the request.
     */
    @NotNull 
    private String from;

    /**
     */
    @Nullable 
    private MergeIncidents200Response mergeIncidents200Response;

    /**
     * Constructs a validated implementation of {@link RunResponsePlayOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RunResponsePlayOperationSpec(Consumer<RunResponsePlayOperationSpec> spec) {
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
        Objects.requireNonNull(responsePlayId, "responsePlayId is a required parameter!");
        Objects.requireNonNull(from, "from is a required parameter!");
    }

}
