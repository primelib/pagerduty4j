package io.github.primelib.pagerduty4j.rest.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.pagerduty4j.rest.model.MergeIncidentsRequest;
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
 * MergeIncidentsSpec
 * <p>
 * Specification for the MergeIncidents operation.
 * <p>
 * Merge incidents
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MergeIncidentsOperationSpec {
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
     * The email address of a valid user associated with the account making the request.
     */
    @NotNull 
    private String from;

    /**
     */
    @Nullable 
    private MergeIncidentsRequest mergeIncidentsRequest;

    /**
     * Constructs a validated instance of {@link MergeIncidentsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public MergeIncidentsOperationSpec(Consumer<MergeIncidentsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link MergeIncidentsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the resource.
     * @param from                 The email address of a valid user associated with the account making the request.
     * @param mergeIncidentsRequest 
     */
    @ApiStatus.Internal
    public MergeIncidentsOperationSpec(String id, String from, MergeIncidentsRequest mergeIncidentsRequest) {
        this.id = id;
        this.from = from;
        this.mergeIncidentsRequest = mergeIncidentsRequest;

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
        Objects.requireNonNull(from, "from is a required parameter!");
    }
}
