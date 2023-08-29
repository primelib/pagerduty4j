package io.github.primelib.pagerduty4j.rest.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.pagerduty4j.rest.model.MergeIncidents200Response;
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
 * RunResponsePlaySpec
 * <p>
 * Specification for the RunResponsePlay operation.
 * <p>
 * Run a response play
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
     * Constructs a validated instance of {@link RunResponsePlayOperationSpec}.
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
     * Constructs a validated instance of {@link RunResponsePlayOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param responsePlayId       The response play ID of the response play associated with the request.
     * @param from                 The email address of a valid user associated with the account making the request.
     * @param mergeIncidents200Response 
     */
    @ApiStatus.Internal
    public RunResponsePlayOperationSpec(String responsePlayId, String from, MergeIncidents200Response mergeIncidents200Response) {
        this.responsePlayId = responsePlayId;
        this.from = from;
        this.mergeIncidents200Response = mergeIncidents200Response;

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
