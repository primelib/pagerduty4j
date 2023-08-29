package io.github.primelib.pagerduty4j.rest.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.pagerduty4j.rest.model.CreateResponsePlayRequest;
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
 * CreateResponsePlaySpec
 * <p>
 * Specification for the CreateResponsePlay operation.
 * <p>
 * Create a Response Play
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateResponsePlayOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The email address of a valid user associated with the account making the request.
     */
    @NotNull 
    private String from;

    /**
     * The Response Play to be created.
     */
    @Nullable 
    private CreateResponsePlayRequest createResponsePlayRequest;

    /**
     * Constructs a validated instance of {@link CreateResponsePlayOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateResponsePlayOperationSpec(Consumer<CreateResponsePlayOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link CreateResponsePlayOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param from                 The email address of a valid user associated with the account making the request.
     * @param createResponsePlayRequest The Response Play to be created.
     */
    @ApiStatus.Internal
    public CreateResponsePlayOperationSpec(String from, CreateResponsePlayRequest createResponsePlayRequest) {
        this.from = from;
        this.createResponsePlayRequest = createResponsePlayRequest;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(from, "from is a required parameter!");
    }
}
