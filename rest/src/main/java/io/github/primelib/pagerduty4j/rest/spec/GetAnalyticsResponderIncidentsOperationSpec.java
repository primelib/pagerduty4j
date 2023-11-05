package io.github.primelib.pagerduty4j.rest.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.pagerduty4j.rest.model.GetAnalyticsResponderIncidentsRequest;
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
 * GetAnalyticsResponderIncidentsSpec
 * <p>
 * Specification for the GetAnalyticsResponderIncidents operation.
 * <p>
 * Get raw incidents for a single responder_id
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetAnalyticsResponderIncidentsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the responder.
     */
    @NotNull 
    private String responderId;

    /**
     * Parameters and filters to apply to the dataset.
     */
    @Nullable 
    private GetAnalyticsResponderIncidentsRequest getAnalyticsResponderIncidentsRequest;

    /**
     * Constructs a validated instance of {@link GetAnalyticsResponderIncidentsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetAnalyticsResponderIncidentsOperationSpec(Consumer<GetAnalyticsResponderIncidentsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetAnalyticsResponderIncidentsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param responderId          The ID of the responder.
     * @param getAnalyticsResponderIncidentsRequest Parameters and filters to apply to the dataset.
     */
    @ApiStatus.Internal
    public GetAnalyticsResponderIncidentsOperationSpec(String responderId, GetAnalyticsResponderIncidentsRequest getAnalyticsResponderIncidentsRequest) {
        this.responderId = responderId;
        this.getAnalyticsResponderIncidentsRequest = getAnalyticsResponderIncidentsRequest;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(responderId, "responderId is a required parameter!");
    }
}
