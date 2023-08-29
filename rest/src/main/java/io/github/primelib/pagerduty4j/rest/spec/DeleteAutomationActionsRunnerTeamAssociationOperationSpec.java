package io.github.primelib.pagerduty4j.rest.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

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
 * DeleteAutomationActionsRunnerTeamAssociationSpec
 * <p>
 * Specification for the DeleteAutomationActionsRunnerTeamAssociation operation.
 * <p>
 * Disassociate a runner from a team
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DeleteAutomationActionsRunnerTeamAssociationOperationSpec {
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
     * The team ID
     */
    @NotNull 
    private String teamId;

    /**
     * Constructs a validated instance of {@link DeleteAutomationActionsRunnerTeamAssociationOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DeleteAutomationActionsRunnerTeamAssociationOperationSpec(Consumer<DeleteAutomationActionsRunnerTeamAssociationOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link DeleteAutomationActionsRunnerTeamAssociationOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the resource.
     * @param teamId               The team ID
     */
    @ApiStatus.Internal
    public DeleteAutomationActionsRunnerTeamAssociationOperationSpec(String id, String teamId) {
        this.id = id;
        this.teamId = teamId;

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
        Objects.requireNonNull(teamId, "teamId is a required parameter!");
    }
}
