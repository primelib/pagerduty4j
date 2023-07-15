package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AlertGroupingParametersConfigAnyOf
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "time_window",
    "recommended_time_window"
})
@JsonTypeName("AlertGroupingParameters_config_anyOf")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AlertGroupingParametersConfigAnyOf {

    /**
     * Constructs a validated implementation of {@link AlertGroupingParametersConfigAnyOf}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AlertGroupingParametersConfigAnyOf(Consumer<AlertGroupingParametersConfigAnyOf> spec) {
        spec.accept(this);
    }

    /**
     * The maximum amount of time allowed between Alerts. Any Alerts arriving greater than `time_window` seconds apart will not be grouped together. This is a rolling time window and is counted from the most recently grouped alert. The window is extended every time a new alert is added to the group, up to 24 hours. To use the "recommended_time_window," set the value to 0, otherwise the value must be between 300 and 3600.
     */
    @JsonProperty("time_window")
    protected Integer timeWindow;

    /**
     * In order to ensure your Service has the optimal grouping window, we use data science to calculate your Service's average Alert inter-arrival time. We encourage customer's to use this value, please set `time_window` to 0 to use the `recommended_time_window`.
     */
    @JsonProperty("recommended_time_window")
    protected Integer recommendedTimeWindow;


}
