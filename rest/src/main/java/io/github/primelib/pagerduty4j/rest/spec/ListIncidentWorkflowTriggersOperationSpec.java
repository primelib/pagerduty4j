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
 * ListIncidentWorkflowTriggersSpec
 * <p>
 * Specification for the ListIncidentWorkflowTriggers operation.
 * <p>
 * List Triggers
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListIncidentWorkflowTriggersOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * If provided, only show triggers configured to start the given workflow. Useful for listing all services associated with the given workflow
     */
    @Nullable 
    private String workflowId;

    /**
     * If provided, only show triggers configured on the service of the given incident. Useful for finding manual triggers that are configured on the service for a specific incident. Cannot be specified if {@code service_id} is provided.
     */
    @Nullable 
    private String incidentId;

    /**
     * If provided, only show triggers configured for incidents in the given service. Useful for listing all workflows associated with the given service. Cannot be specified if {@code incident_id} is provided.
     */
    @Nullable 
    private String serviceId;

    /**
     * If provided, only show triggers of the given type. For example “manual” to search for manual triggers
     */
    @Nullable 
    private String triggerType;

    /**
     * If provided, only show triggers configured to start workflows whose name contain the provided value.
     */
    @Nullable 
    private String workflowNameContains;

    /**
     * If provided, returns triggers sorted by the specified property.
     */
    @Nullable 
    private String sortBy;

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
     * Constructs a validated instance of {@link ListIncidentWorkflowTriggersOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ListIncidentWorkflowTriggersOperationSpec(Consumer<ListIncidentWorkflowTriggersOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link ListIncidentWorkflowTriggersOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param workflowId           If provided, only show triggers configured to start the given workflow. Useful for listing all services associated with the given workflow
     * @param incidentId           If provided, only show triggers configured on the service of the given incident. Useful for finding manual triggers that are configured on the service for a specific incident. Cannot be specified if {@code service_id} is provided.
     * @param serviceId            If provided, only show triggers configured for incidents in the given service. Useful for listing all workflows associated with the given service. Cannot be specified if {@code incident_id} is provided.
     * @param triggerType          If provided, only show triggers of the given type. For example “manual” to search for manual triggers
     * @param workflowNameContains If provided, only show triggers configured to start workflows whose name contain the provided value.
     * @param sortBy               If provided, returns triggers sorted by the specified property.
     * @param limit                The minimum of the {@code limit} parameter used in the request or the maximum request size of the API.
     * @param cursor               Optional parameter used to request the "next" set of results from an API.  The value provided here is most commonly obtained from the {@code next_cursor} field of the previous request.  When no value is provided, the request starts at the beginning of the result set. 
     */
    @ApiStatus.Internal
    public ListIncidentWorkflowTriggersOperationSpec(String workflowId, String incidentId, String serviceId, String triggerType, String workflowNameContains, String sortBy, Integer limit, String cursor) {
        this.workflowId = workflowId;
        this.incidentId = incidentId;
        this.serviceId = serviceId;
        this.triggerType = triggerType;
        this.workflowNameContains = workflowNameContains;
        this.sortBy = sortBy;
        this.limit = limit;
        this.cursor = cursor;

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
