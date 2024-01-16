package io.github.primelib.pagerduty4j.rest.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.pagerduty4j.rest.model.AnalyticsResponderFilter;
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
 * GetAnalyticsMetricsRespondersAllSpec
 * <p>
 * Specification for the GetAnalyticsMetricsRespondersAll operation.
 * <p>
 * Get aggregated metrics for all responders
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetAnalyticsMetricsRespondersAllOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * Parameters and filters to apply to the dataset.
     */
    @Nullable 
    private AnalyticsResponderFilter analyticsResponderFilter;

    /**
     * Constructs a validated instance of {@link GetAnalyticsMetricsRespondersAllOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetAnalyticsMetricsRespondersAllOperationSpec(Consumer<GetAnalyticsMetricsRespondersAllOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetAnalyticsMetricsRespondersAllOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param analyticsResponderFilter Parameters and filters to apply to the dataset.
     */
    @ApiStatus.Internal
    public GetAnalyticsMetricsRespondersAllOperationSpec(AnalyticsResponderFilter analyticsResponderFilter) {
        this.analyticsResponderFilter = analyticsResponderFilter;

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
