package io.github.primelib.pagerduty4j.rest.spec;

import java.util.List;
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
 * ListAutomationActionInvocationsSpec
 * <p>
 * Specification for the ListAutomationActionInvocations operation.
 * <p>
 * List Invocations
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListAutomationActionInvocationsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * Incident ID
     */
    @NotNull 
    private String incidentId;

    /**
     * Invocation state
     */
    @Nullable 
    private String invocationState;

    /**
     * Constructs a validated instance of {@link ListAutomationActionInvocationsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ListAutomationActionInvocationsOperationSpec(Consumer<ListAutomationActionInvocationsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link ListAutomationActionInvocationsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param incidentId           Incident ID
     * @param invocationState      Invocation state
     */
    @ApiStatus.Internal
    public ListAutomationActionInvocationsOperationSpec(String incidentId, String invocationState) {
        this.incidentId = incidentId;
        this.invocationState = invocationState;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(incidentId, "incidentId is a required parameter!");
    }
}
