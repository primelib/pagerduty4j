package io.github.primelib.pagerduty4j.rest.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * DeleteServiceFromIncidentWorkflowTriggerSpec
 * <p>
 * Specification for the DeleteServiceFromIncidentWorkflowTrigger operation.
 * <p>
 * Dissociate a Trigger and Service
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DeleteServiceFromIncidentWorkflowTriggerOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * Identifier for the Trigger
     */
    @NotNull 
    private String triggerId;

    /**
     * Identifier for the Service
     */
    @NotNull 
    private String serviceId;

    /**
     * Constructs a validated implementation of {@link DeleteServiceFromIncidentWorkflowTriggerOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DeleteServiceFromIncidentWorkflowTriggerOperationSpec(Consumer<DeleteServiceFromIncidentWorkflowTriggerOperationSpec> spec) {
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
        Objects.requireNonNull(triggerId, "triggerId is a required parameter!");
        Objects.requireNonNull(serviceId, "serviceId is a required parameter!");
    }

}
