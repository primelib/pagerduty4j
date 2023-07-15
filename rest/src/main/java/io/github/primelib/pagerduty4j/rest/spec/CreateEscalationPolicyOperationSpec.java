package io.github.primelib.pagerduty4j.rest.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.pagerduty4j.rest.model.CreateEscalationPolicyRequest;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * CreateEscalationPolicySpec
 * <p>
 * Specification for the CreateEscalationPolicy operation.
 * <p>
 * Create an escalation policy
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateEscalationPolicyOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The email address of a valid user associated with the account making the request. This is optional, and is only used for change tracking.
     */
    @Nullable 
    private String from;

    /**
     * The escalation policy to be created.
     */
    @Nullable 
    private CreateEscalationPolicyRequest createEscalationPolicyRequest;

    /**
     * Constructs a validated implementation of {@link CreateEscalationPolicyOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateEscalationPolicyOperationSpec(Consumer<CreateEscalationPolicyOperationSpec> spec) {
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
    }

}
