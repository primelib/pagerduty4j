package io.github.primelib.pagerduty4j.rest.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.pagerduty4j.rest.model.GetIncidentAlert200Response;
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
 * UpdateIncidentAlertSpec
 * <p>
 * Specification for the UpdateIncidentAlert operation.
 * <p>
 * Update an alert
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateIncidentAlertOperationSpec {
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
     * The id of the alert to retrieve.
     */
    @NotNull 
    private String alertId;

    /**
     * The email address of a valid user associated with the account making the request.
     */
    @NotNull 
    private String from;

    /**
     * The parameters of the alert to update.
     */
    @Nullable 
    private GetIncidentAlert200Response getIncidentAlert200Response;

    /**
     * Constructs a validated instance of {@link UpdateIncidentAlertOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateIncidentAlertOperationSpec(Consumer<UpdateIncidentAlertOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdateIncidentAlertOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the resource.
     * @param alertId              The id of the alert to retrieve.
     * @param from                 The email address of a valid user associated with the account making the request.
     * @param getIncidentAlert200Response The parameters of the alert to update.
     */
    @ApiStatus.Internal
    public UpdateIncidentAlertOperationSpec(String id, String alertId, String from, GetIncidentAlert200Response getIncidentAlert200Response) {
        this.id = id;
        this.alertId = alertId;
        this.from = from;
        this.getIncidentAlert200Response = getIncidentAlert200Response;

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
        Objects.requireNonNull(alertId, "alertId is a required parameter!");
        Objects.requireNonNull(from, "from is a required parameter!");
    }
}
