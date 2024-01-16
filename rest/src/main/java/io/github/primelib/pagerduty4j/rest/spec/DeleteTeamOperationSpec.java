package io.github.primelib.pagerduty4j.rest.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
 * DeleteTeamSpec
 * <p>
 * Specification for the DeleteTeam operation.
 * <p>
 * Delete a team
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DeleteTeamOperationSpec {
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
     * Team to reassign unresolved incident to. If an unresolved incident exists on both the reassignment team and the team being deleted, a duplicate will not be made. If not supplied, unresolved incidents will be made account-level. 
     */
    @Nullable 
    private String reassignmentTeam;

    /**
     * Constructs a validated instance of {@link DeleteTeamOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DeleteTeamOperationSpec(Consumer<DeleteTeamOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link DeleteTeamOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the resource.
     * @param reassignmentTeam     Team to reassign unresolved incident to. If an unresolved incident exists on both the reassignment team and the team being deleted, a duplicate will not be made. If not supplied, unresolved incidents will be made account-level. 
     */
    @ApiStatus.Internal
    public DeleteTeamOperationSpec(String id, String reassignmentTeam) {
        this.id = id;
        this.reassignmentTeam = reassignmentTeam;

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
