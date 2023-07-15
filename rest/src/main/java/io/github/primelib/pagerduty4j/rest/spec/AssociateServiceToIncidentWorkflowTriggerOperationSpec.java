package io.github.primelib.pagerduty4j.rest.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.pagerduty4j.rest.model.AssociateServiceToIncidentWorkflowTriggerRequest;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * AssociateServiceToIncidentWorkflowTriggerSpec
 * <p>
 * Specification for the AssociateServiceToIncidentWorkflowTrigger operation.
 * <p>
 * Associate a Trigger and Service
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AssociateServiceToIncidentWorkflowTriggerOperationSpec {
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
     */
    @Nullable 
    private AssociateServiceToIncidentWorkflowTriggerRequest associateServiceToIncidentWorkflowTriggerRequest;

    /**
     * Constructs a validated implementation of {@link AssociateServiceToIncidentWorkflowTriggerOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AssociateServiceToIncidentWorkflowTriggerOperationSpec(Consumer<AssociateServiceToIncidentWorkflowTriggerOperationSpec> spec) {
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
        Objects.requireNonNull(id, "id is a required parameter!");
    }

}
