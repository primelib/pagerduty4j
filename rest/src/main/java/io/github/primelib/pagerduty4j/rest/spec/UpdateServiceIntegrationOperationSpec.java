package io.github.primelib.pagerduty4j.rest.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.pagerduty4j.rest.model.CreateServiceIntegrationRequest;
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
 * UpdateServiceIntegrationSpec
 * <p>
 * Specification for the UpdateServiceIntegration operation.
 * <p>
 * Update an existing integration
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateServiceIntegrationOperationSpec {
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
     * The integration ID on the service.
     */
    @NotNull 
    private String integrationId;

    /**
     * The integration to be updated
     */
    @Nullable 
    private CreateServiceIntegrationRequest createServiceIntegrationRequest;

    /**
     * Constructs a validated instance of {@link UpdateServiceIntegrationOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateServiceIntegrationOperationSpec(Consumer<UpdateServiceIntegrationOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdateServiceIntegrationOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the resource.
     * @param integrationId        The integration ID on the service.
     * @param createServiceIntegrationRequest The integration to be updated
     */
    @ApiStatus.Internal
    public UpdateServiceIntegrationOperationSpec(String id, String integrationId, CreateServiceIntegrationRequest createServiceIntegrationRequest) {
        this.id = id;
        this.integrationId = integrationId;
        this.createServiceIntegrationRequest = createServiceIntegrationRequest;

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
