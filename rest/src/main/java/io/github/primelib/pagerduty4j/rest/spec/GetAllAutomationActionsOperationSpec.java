package io.github.primelib.pagerduty4j.rest.spec;

import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.pagerduty4j.rest.model.AutomationActionsActionClassificationEnum;
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
 * GetAllAutomationActionsSpec
 * <p>
 * Specification for the GetAllAutomationActions operation.
 * <p>
 * List Automation Actions
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetAllAutomationActionsOperationSpec {
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
     * Filters results to include the ones linked to the specified runner. Specifying the value {@code any} filters results to include the ones linked to runners only, thus omitting the results not linked to runners. 
     */
    @Nullable 
    private String runnerId;

    /**
     * Filters results to include the ones matching the specified classification (aka category)
     */
    @Nullable 
    private AutomationActionsActionClassificationEnum classification;

    /**
     * Filters results to include the ones associated with the specified team.
     */
    @Nullable 
    private String teamId;

    /**
     * Filters results to include the ones associated with the specified service
     */
    @Nullable 
    private String serviceId;

    /**
     * Filters results to include the ones matching the specified action type
     */
    @Nullable 
    private String actionType;

    /**
     * Constructs a validated instance of {@link GetAllAutomationActionsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetAllAutomationActionsOperationSpec(Consumer<GetAllAutomationActionsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetAllAutomationActionsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param limit                The minimum of the {@code limit} parameter used in the request or the maximum request size of the API.
     * @param cursor               Optional parameter used to request the "next" set of results from an API.  The value provided here is most commonly obtained from the {@code next_cursor} field of the previous request.  When no value is provided, the request starts at the beginning of the result set. 
     * @param name                 Filters results to include the ones matching the name (case insensitive substring matching)
     * @param runnerId             Filters results to include the ones linked to the specified runner. Specifying the value {@code any} filters results to include the ones linked to runners only, thus omitting the results not linked to runners. 
     * @param classification       Filters results to include the ones matching the specified classification (aka category)
     * @param teamId               Filters results to include the ones associated with the specified team.
     * @param serviceId            Filters results to include the ones associated with the specified service
     * @param actionType           Filters results to include the ones matching the specified action type
     */
    @ApiStatus.Internal
    public GetAllAutomationActionsOperationSpec(Integer limit, String cursor, String name, String runnerId, AutomationActionsActionClassificationEnum classification, String teamId, String serviceId, String actionType) {
        this.limit = limit;
        this.cursor = cursor;
        this.name = name;
        this.runnerId = runnerId;
        this.classification = classification;
        this.teamId = teamId;
        this.serviceId = serviceId;
        this.actionType = actionType;

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
