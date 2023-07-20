package io.github.primelib.pagerduty4j.rest.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.pagerduty4j.rest.model.MigrateOrchestrationIntegrationRequest;
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
 * MigrateOrchestrationIntegrationSpec
 * <p>
 * Specification for the MigrateOrchestrationIntegration operation.
 * <p>
 * Migrate an Integration from one Event Orchestration to another
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MigrateOrchestrationIntegrationOperationSpec {
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
     */
    @Nullable 
    private MigrateOrchestrationIntegrationRequest migrateOrchestrationIntegrationRequest;

    /**
     * Constructs a validated instance of {@link MigrateOrchestrationIntegrationOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public MigrateOrchestrationIntegrationOperationSpec(Consumer<MigrateOrchestrationIntegrationOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link MigrateOrchestrationIntegrationOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of an Event Orchestration.
     * @param migrateOrchestrationIntegrationRequest 
     */
    @ApiStatus.Internal
    public MigrateOrchestrationIntegrationOperationSpec(String id, MigrateOrchestrationIntegrationRequest migrateOrchestrationIntegrationRequest) {
        this.id = id;
        this.migrateOrchestrationIntegrationRequest = migrateOrchestrationIntegrationRequest;

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
