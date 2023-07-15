package io.github.primelib.pagerduty4j.rest.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.pagerduty4j.rest.model.CreateAutomationActionTeamAssociationRequest;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * CreateAutomationActionsRunnerTeamAssociationSpec
 * <p>
 * Specification for the CreateAutomationActionsRunnerTeamAssociation operation.
 * <p>
 * Associate a runner with a team
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateAutomationActionsRunnerTeamAssociationOperationSpec {
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
    @NotNull 
    private CreateAutomationActionTeamAssociationRequest createAutomationActionTeamAssociationRequest;

    /**
     * Constructs a validated implementation of {@link CreateAutomationActionsRunnerTeamAssociationOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateAutomationActionsRunnerTeamAssociationOperationSpec(Consumer<CreateAutomationActionsRunnerTeamAssociationOperationSpec> spec) {
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
        Objects.requireNonNull(createAutomationActionTeamAssociationRequest, "createAutomationActionTeamAssociationRequest is a required parameter!");
    }

}