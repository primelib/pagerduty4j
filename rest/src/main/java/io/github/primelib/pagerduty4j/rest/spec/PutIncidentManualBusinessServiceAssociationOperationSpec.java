package io.github.primelib.pagerduty4j.rest.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.pagerduty4j.rest.model.PutIncidentManualBusinessServiceAssociationRequest;
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
 * PutIncidentManualBusinessServiceAssociationSpec
 * <p>
 * Specification for the PutIncidentManualBusinessServiceAssociation operation.
 * <p>
 * Manually change an Incident's Impact on a Business Service.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
     * The {@code impacted} relation will cause the Business Service and any Services that it supports to become impacted by this incident.
     * The {@code not_impacted} relation will remove the Incident's Impact from the specified Business Service.
     * The effect of adding or removing Impact to a Business Service in this way will also change the propagation of Impact to other Services supported by that Business Service.
     */
    @Nullable 
    private PutIncidentManualBusinessServiceAssociationRequest putIncidentManualBusinessServiceAssociationRequest;

    /**
     * Constructs a validated instance of {@link PutIncidentManualBusinessServiceAssociationOperationSpec}.
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
     * Constructs a validated instance of {@link PutIncidentManualBusinessServiceAssociationOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the resource.
     * @param businessServiceId    The business service ID.
     * @param putIncidentManualBusinessServiceAssociationRequest The {@code impacted} relation will cause the Business Service and any Services that it supports to become impacted by this incident.  The {@code not_impacted} relation will remove the Incident's Impact from the specified Business Service.  The effect of adding or removing Impact to a Business Service in this way will also change the propagation of Impact to other Services supported by that Business Service.
     */
    @ApiStatus.Internal
    public PutIncidentManualBusinessServiceAssociationOperationSpec(String id, String businessServiceId, PutIncidentManualBusinessServiceAssociationRequest putIncidentManualBusinessServiceAssociationRequest) {
        this.id = id;
        this.businessServiceId = businessServiceId;
        this.putIncidentManualBusinessServiceAssociationRequest = putIncidentManualBusinessServiceAssociationRequest;

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
    }
}
