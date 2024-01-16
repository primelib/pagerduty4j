package io.github.primelib.pagerduty4j.rest.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.pagerduty4j.rest.model.ServiceOrchestration;
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
 * UpdateOrchPathServiceSpec
 * <p>
 * Specification for the UpdateOrchPathService operation.
 * <p>
 * Update the Service Orchestration for a Service
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
     * Constructs a validated instance of {@link UpdateOrchPathServiceOperationSpec}.
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
     * Constructs a validated instance of {@link UpdateOrchPathServiceOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param serviceId            The service ID
     * @param serviceOrchestration Update Service Orchestration rules. Omitted rules and rule details are deleted.
     */
    @ApiStatus.Internal
    public UpdateOrchPathServiceOperationSpec(String serviceId, ServiceOrchestration serviceOrchestration) {
        this.serviceId = serviceId;
        this.serviceOrchestration = serviceOrchestration;

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
