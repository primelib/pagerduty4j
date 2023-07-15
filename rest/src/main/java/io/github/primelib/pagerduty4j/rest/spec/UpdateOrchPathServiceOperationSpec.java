package io.github.primelib.pagerduty4j.rest.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.pagerduty4j.rest.model.ServiceOrchestration;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * UpdateOrchPathServiceSpec
 * <p>
 * Specification for the UpdateOrchPathService operation.
 * <p>
 * Update the Service Orchestration for a Service
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateOrchPathServiceOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The service ID
     */
    @NotNull 
    private String serviceId;

    /**
     * Update Service Orchestration rules. Omitted rules and rule details are deleted.
     */
    @Nullable 
    private ServiceOrchestration serviceOrchestration;

    /**
     * Constructs a validated implementation of {@link UpdateOrchPathServiceOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateOrchPathServiceOperationSpec(Consumer<UpdateOrchPathServiceOperationSpec> spec) {
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
        Objects.requireNonNull(serviceId, "serviceId is a required parameter!");
    }

}