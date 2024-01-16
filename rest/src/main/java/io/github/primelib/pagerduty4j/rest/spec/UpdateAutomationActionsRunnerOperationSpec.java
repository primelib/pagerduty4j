package io.github.primelib.pagerduty4j.rest.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import java.util.Set;
import io.github.primelib.pagerduty4j.rest.model.UpdateAutomationActionsRunnerRequest;
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
 * UpdateAutomationActionsRunnerSpec
 * <p>
 * Specification for the UpdateAutomationActionsRunner operation.
 * <p>
 * Update an Automation Action runner
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateAutomationActionsRunnerOperationSpec {
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
    private UpdateAutomationActionsRunnerRequest updateAutomationActionsRunnerRequest;

    /**
     * Constructs a validated instance of {@link UpdateAutomationActionsRunnerOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateAutomationActionsRunnerOperationSpec(Consumer<UpdateAutomationActionsRunnerOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdateAutomationActionsRunnerOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the resource.
     * @param updateAutomationActionsRunnerRequest 
     */
    @ApiStatus.Internal
    public UpdateAutomationActionsRunnerOperationSpec(String id, UpdateAutomationActionsRunnerRequest updateAutomationActionsRunnerRequest) {
        this.id = id;
        this.updateAutomationActionsRunnerRequest = updateAutomationActionsRunnerRequest;

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
        Objects.requireNonNull(updateAutomationActionsRunnerRequest, "updateAutomationActionsRunnerRequest is a required parameter!");
    }
}
