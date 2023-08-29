package io.github.primelib.pagerduty4j.rest.spec;

import java.util.List;
import org.jetbrains.annotations.ApiStatus;
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
 * GetBusinessServiceImpactsSpec
 * <p>
 * Specification for the GetBusinessServiceImpacts operation.
 * <p>
 * List Business Services sorted by impacted status
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetBusinessServiceImpactsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * Provides access to additional fields such as highest priority per business service and total impacted count
     */
    @Nullable 
    private String additionalFields;

    /**
     * The IDs of the resources.
     */
    @Nullable 
    private String ids;

    /**
     * Constructs a validated instance of {@link GetBusinessServiceImpactsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetBusinessServiceImpactsOperationSpec(Consumer<GetBusinessServiceImpactsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetBusinessServiceImpactsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param additionalFields     Provides access to additional fields such as highest priority per business service and total impacted count
     * @param ids                  The IDs of the resources.
     */
    @ApiStatus.Internal
    public GetBusinessServiceImpactsOperationSpec(String additionalFields, String ids) {
        this.additionalFields = additionalFields;
        this.ids = ids;

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
