package io.github.primelib.pagerduty4j.rest.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.pagerduty4j.rest.model.PutIncidentManualBusinessServiceAssociationRequest;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * PutIncidentManualBusinessServiceAssociationSpec
 * <p>
 * Specification for the PutIncidentManualBusinessServiceAssociation operation.
 * <p>
 * Manually change an Incident's Impact on a Business Service.
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PutIncidentManualBusinessServiceAssociationOperationSpec {
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
     * The business service ID.
     */
    @NotNull 
    private String businessServiceId;

    /**
     * This header indicates that this API endpoint is __UNDER CONSTRUCTION__ and may change at any time. You __MUST__ pass in this header with the value `business-impact-early-access`. Do not use this endpoint in production, as it may change!
     */
    @NotNull 
    private String X_EARLY_ACCESS = "business-impact-early-access";

    /**
     * The `impacted` relation will cause the Business Service and any Services that it supports to become impacted by this incident.
     * The `not_impacted` relation will remove the Incident's Impact from the specified Business Service.
     * The effect of adding or removing Impact to a Business Service in this way will also change the propagation of Impact to other Services supported by that Business Service.
     */
    @Nullable 
    private PutIncidentManualBusinessServiceAssociationRequest putIncidentManualBusinessServiceAssociationRequest;

    /**
     * Constructs a validated implementation of {@link PutIncidentManualBusinessServiceAssociationOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PutIncidentManualBusinessServiceAssociationOperationSpec(Consumer<PutIncidentManualBusinessServiceAssociationOperationSpec> spec) {
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
        Objects.requireNonNull(id, "id is a required parameter!");
        Objects.requireNonNull(businessServiceId, "businessServiceId is a required parameter!");
        Objects.requireNonNull(X_EARLY_ACCESS, "X_EARLY_ACCESS is a required parameter!");
    }

}
