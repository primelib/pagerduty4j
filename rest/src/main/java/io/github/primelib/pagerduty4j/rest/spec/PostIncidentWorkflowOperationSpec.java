package io.github.primelib.pagerduty4j.rest.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.pagerduty4j.rest.model.PostIncidentWorkflowRequest;
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
 * PostIncidentWorkflowSpec
 * <p>
 * Specification for the PostIncidentWorkflow operation.
 * <p>
 * Create an Incident Workflow
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PostIncidentWorkflowOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     */
    @Nullable 
    private PostIncidentWorkflowRequest postIncidentWorkflowRequest;

    /**
     * Constructs a validated instance of {@link PostIncidentWorkflowOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PostIncidentWorkflowOperationSpec(Consumer<PostIncidentWorkflowOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link PostIncidentWorkflowOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param postIncidentWorkflowRequest 
     */
    @ApiStatus.Internal
    public PostIncidentWorkflowOperationSpec(PostIncidentWorkflowRequest postIncidentWorkflowRequest) {
        this.postIncidentWorkflowRequest = postIncidentWorkflowRequest;

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
