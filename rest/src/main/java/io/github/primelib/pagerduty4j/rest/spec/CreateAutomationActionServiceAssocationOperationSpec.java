package io.github.primelib.pagerduty4j.rest.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.pagerduty4j.rest.model.CreateAutomationActionServiceAssocationRequest;
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
 * CreateAutomationActionServiceAssocationSpec
 * <p>
 * Specification for the CreateAutomationActionServiceAssocation operation.
 * <p>
 * Associate an Automation Action with a service
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateAutomationActionServiceAssocationOperationSpec {
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
    private CreateAutomationActionServiceAssocationRequest createAutomationActionServiceAssocationRequest;

    /**
     * Constructs a validated instance of {@link CreateAutomationActionServiceAssocationOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateAutomationActionServiceAssocationOperationSpec(Consumer<CreateAutomationActionServiceAssocationOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link CreateAutomationActionServiceAssocationOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the resource.
     * @param createAutomationActionServiceAssocationRequest 
     */
    @ApiStatus.Internal
    public CreateAutomationActionServiceAssocationOperationSpec(String id, CreateAutomationActionServiceAssocationRequest createAutomationActionServiceAssocationRequest) {
        this.id = id;
        this.createAutomationActionServiceAssocationRequest = createAutomationActionServiceAssocationRequest;

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
        Objects.requireNonNull(createAutomationActionServiceAssocationRequest, "createAutomationActionServiceAssocationRequest is a required parameter!");
    }
}
