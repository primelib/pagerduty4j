package io.github.primelib.pagerduty4j.rest.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.pagerduty4j.rest.model.AnalyticsModel;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetAnalyticsMetricsIncidentsAllSpec
 * <p>
 * Specification for the GetAnalyticsMetricsIncidentsAll operation.
 * <p>
 * Get aggregated incident data
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetAnalyticsMetricsIncidentsAllOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * This header indicates that this API endpoint is __UNDER CONSTRUCTION__ and may change at any time.
     * You __MUST__ pass in this header and the above value.
     * Do not use this endpoint in production, as it may change! 
     */
    @NotNull 
    private String X_EARLY_ACCESS = "analytics-v2";

    /**
     * Parameters and filters to apply to the dataset.
     */
    @Nullable 
    private AnalyticsModel analyticsModel;

    /**
     * Constructs a validated implementation of {@link GetAnalyticsMetricsIncidentsAllOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetAnalyticsMetricsIncidentsAllOperationSpec(Consumer<GetAnalyticsMetricsIncidentsAllOperationSpec> spec) {
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
        Objects.requireNonNull(X_EARLY_ACCESS, "X_EARLY_ACCESS is a required parameter!");
    }

}
