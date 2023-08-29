package io.github.primelib.pagerduty4j.rest.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
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
 * GetPastIncidentsSpec
 * <p>
 * Specification for the GetPastIncidents operation.
 * <p>
 * Get Past Incidents
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetPastIncidentsOperationSpec {
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
     * The number of results to be returned in the response.
     */
    @Nullable 
    private Integer limit;

    /**
     * By default the {@code total} field in the response body is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated with the total number of Past Incidents. 
     */
    @Nullable 
    private Boolean total;

    /**
     * Constructs a validated instance of {@link GetPastIncidentsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetPastIncidentsOperationSpec(Consumer<GetPastIncidentsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetPastIncidentsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the resource.
     * @param limit                The number of results to be returned in the response.
     * @param total                By default the {@code total} field in the response body is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated with the total number of Past Incidents. 
     */
    @ApiStatus.Internal
    public GetPastIncidentsOperationSpec(String id, Integer limit, Boolean total) {
        this.id = id;
        this.limit = limit;
        this.total = total;

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
