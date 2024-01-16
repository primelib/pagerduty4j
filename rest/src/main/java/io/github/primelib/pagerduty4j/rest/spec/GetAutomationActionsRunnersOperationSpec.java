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
 * GetAutomationActionsRunnersSpec
 * <p>
 * Specification for the GetAutomationActionsRunners operation.
 * <p>
 * List Automation Action runners
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetAutomationActionsRunnersOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The minimum of the {@code limit} parameter used in the request or the maximum request size of the API.
     */
    @Nullable 
    private Integer limit;

    /**
     * Optional parameter used to request the "next" set of results from an API.
     * The value provided here is most commonly obtained from the {@code next_cursor} field of the previous request.
     * When no value is provided, the request starts at the beginning of the result set. 
     */
    @Nullable 
    private String cursor;

    /**
     * Filters results to include the ones matching the name (case insensitive substring matching)
     */
    @Nullable 
    private String name;

    /**
     * Includes additional data elements into the response
     */
    @Nullable 
    private Set<String> include;

    /**
     * Constructs a validated instance of {@link GetAutomationActionsRunnersOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetAutomationActionsRunnersOperationSpec(Consumer<GetAutomationActionsRunnersOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetAutomationActionsRunnersOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param limit                The minimum of the {@code limit} parameter used in the request or the maximum request size of the API.
     * @param cursor               Optional parameter used to request the "next" set of results from an API.  The value provided here is most commonly obtained from the {@code next_cursor} field of the previous request.  When no value is provided, the request starts at the beginning of the result set. 
     * @param name                 Filters results to include the ones matching the name (case insensitive substring matching)
     * @param include              Includes additional data elements into the response
     */
    @ApiStatus.Internal
    public GetAutomationActionsRunnersOperationSpec(Integer limit, String cursor, String name, Set<String> include) {
        this.limit = limit;
        this.cursor = cursor;
        this.name = name;
        this.include = include;

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
