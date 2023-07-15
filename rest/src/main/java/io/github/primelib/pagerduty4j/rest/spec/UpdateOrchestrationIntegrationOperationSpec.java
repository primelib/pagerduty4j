package io.github.primelib.pagerduty4j.rest.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.pagerduty4j.rest.model.PostOrchestrationIntegrationRequest;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * UpdateOrchestrationIntegrationSpec
 * <p>
 * Specification for the UpdateOrchestrationIntegration operation.
 * <p>
 * Update an Integration for an Event Orchestration
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateOrchestrationIntegrationOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of an Event Orchestration.
     */
    @NotNull 
    private String id;

    /**
     * The ID of an Integration.
     */
    @NotNull 
    private String integrationId;

    /**
     */
    @Nullable 
    private PostOrchestrationIntegrationRequest postOrchestrationIntegrationRequest;

    /**
     * Constructs a validated implementation of {@link UpdateOrchestrationIntegrationOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateOrchestrationIntegrationOperationSpec(Consumer<UpdateOrchestrationIntegrationOperationSpec> spec) {
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
        Objects.requireNonNull(integrationId, "integrationId is a required parameter!");
    }

}
