package io.github.primelib.pagerduty4j.rest.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.pagerduty4j.rest.model.PutBusinessServicePriorityThresholdsRequest;
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
 * PutBusinessServicePriorityThresholdsSpec
 * <p>
 * Specification for the PutBusinessServicePriorityThresholds operation.
 * <p>
 * Set the Account-level priority threshold for Business Service impact.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PutBusinessServicePriorityThresholdsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * Set the {@code id} and {@code order} of the global Priority Threshold. These values can be obtained by calling the {@code /priorities} endpoint.
     * Once set, Incidents must be at or above the specified level in order to impact Business Services.
     * An exception to this rule is if the Incident has been added to the incident directly using the {@code PUT /incidents/{id}/business_services/{business_service_id}/impacts} endpoint.
     */
    @Nullable 
    private PutBusinessServicePriorityThresholdsRequest putBusinessServicePriorityThresholdsRequest;

    /**
     * Constructs a validated instance of {@link PutBusinessServicePriorityThresholdsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PutBusinessServicePriorityThresholdsOperationSpec(Consumer<PutBusinessServicePriorityThresholdsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link PutBusinessServicePriorityThresholdsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param putBusinessServicePriorityThresholdsRequest Set the {@code id} and {@code order} of the global Priority Threshold. These values can be obtained by calling the {@code /priorities} endpoint.  Once set, Incidents must be at or above the specified level in order to impact Business Services.  An exception to this rule is if the Incident has been added to the incident directly using the {@code PUT /incidents/{id}/business_services/{business_service_id}/impacts} endpoint.
     */
    @ApiStatus.Internal
    public PutBusinessServicePriorityThresholdsOperationSpec(PutBusinessServicePriorityThresholdsRequest putBusinessServicePriorityThresholdsRequest) {
        this.putBusinessServicePriorityThresholdsRequest = putBusinessServicePriorityThresholdsRequest;

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
