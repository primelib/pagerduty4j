package io.github.primelib.pagerduty4j.rest.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.pagerduty4j.rest.model.PutBusinessServicePriorityThresholdsRequest;
import java.util.Set;
import lombok.AccessLevel;
import lombok.Data;
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
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PutBusinessServicePriorityThresholdsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * Set the `id` and `order` of the global Priority Threshold. These values can be obtained by calling the `/priorities` endpoint.
     * Once set, Incidents must be at or above the specified level in order to impact Business Services.
     * An exception to this rule is if the Incident has been added to the incident directly using the `PUT /incidents/{id}/business_services/{business_service_id}/impacts` endpoint.
     */
    @Nullable 
    private PutBusinessServicePriorityThresholdsRequest putBusinessServicePriorityThresholdsRequest;

    /**
     * Constructs a validated implementation of {@link PutBusinessServicePriorityThresholdsOperationSpec}.
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
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
    }

}
