package io.github.primelib.pagerduty4j.rest.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.pagerduty4j.rest.model.CreateIncidentWorkflowInstanceRequest;
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
 * CreateIncidentWorkflowInstanceSpec
 * <p>
 * Specification for the CreateIncidentWorkflowInstance operation.
 * <p>
 * Start an Incident Workflow Instance
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateIncidentWorkflowInstanceOperationSpec {
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
    private CreateIncidentWorkflowInstanceRequest createIncidentWorkflowInstanceRequest;

    /**
     * Constructs a validated instance of {@link CreateIncidentWorkflowInstanceOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateIncidentWorkflowInstanceOperationSpec(Consumer<CreateIncidentWorkflowInstanceOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link CreateIncidentWorkflowInstanceOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the resource.
     * @param createIncidentWorkflowInstanceRequest 
     */
    @ApiStatus.Internal
    public CreateIncidentWorkflowInstanceOperationSpec(String id, CreateIncidentWorkflowInstanceRequest createIncidentWorkflowInstanceRequest) {
        this.id = id;
        this.createIncidentWorkflowInstanceRequest = createIncidentWorkflowInstanceRequest;

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
