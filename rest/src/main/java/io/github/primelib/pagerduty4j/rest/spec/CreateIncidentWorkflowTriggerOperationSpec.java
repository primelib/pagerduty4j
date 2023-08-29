package io.github.primelib.pagerduty4j.rest.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.pagerduty4j.rest.model.CreateIncidentWorkflowTriggerRequest;
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
 * CreateIncidentWorkflowTriggerSpec
 * <p>
 * Specification for the CreateIncidentWorkflowTrigger operation.
 * <p>
 * Create a Trigger
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateIncidentWorkflowTriggerOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     */
    @Nullable 
    private CreateIncidentWorkflowTriggerRequest createIncidentWorkflowTriggerRequest;

    /**
     * Constructs a validated instance of {@link CreateIncidentWorkflowTriggerOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateIncidentWorkflowTriggerOperationSpec(Consumer<CreateIncidentWorkflowTriggerOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link CreateIncidentWorkflowTriggerOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param createIncidentWorkflowTriggerRequest 
     */
    @ApiStatus.Internal
    public CreateIncidentWorkflowTriggerOperationSpec(CreateIncidentWorkflowTriggerRequest createIncidentWorkflowTriggerRequest) {
        this.createIncidentWorkflowTriggerRequest = createIncidentWorkflowTriggerRequest;

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
