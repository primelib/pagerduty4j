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
 * DeleteTeamEscalationPolicySpec
 * <p>
 * Specification for the DeleteTeamEscalationPolicy operation.
 * <p>
 * Remove an escalation policy from a team
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DeleteTeamEscalationPolicyOperationSpec {
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
     * The escalation policy ID on the team.
     */
    @NotNull 
    private String escalationPolicyId;

    /**
     * Constructs a validated instance of {@link DeleteTeamEscalationPolicyOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DeleteTeamEscalationPolicyOperationSpec(Consumer<DeleteTeamEscalationPolicyOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link DeleteTeamEscalationPolicyOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the resource.
     * @param escalationPolicyId   The escalation policy ID on the team.
     */
    @ApiStatus.Internal
    public DeleteTeamEscalationPolicyOperationSpec(String id, String escalationPolicyId) {
        this.id = id;
        this.escalationPolicyId = escalationPolicyId;

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
        Objects.requireNonNull(escalationPolicyId, "escalationPolicyId is a required parameter!");
    }
}
