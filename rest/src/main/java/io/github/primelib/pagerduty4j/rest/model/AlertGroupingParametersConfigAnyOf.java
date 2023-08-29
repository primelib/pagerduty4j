package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AlertGroupingParametersConfigAnyOf
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@JsonPropertyOrder({
    "time_window",
    "recommended_time_window"
})
@JsonTypeName("AlertGroupingParameters_config_anyOf")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AlertGroupingParametersConfigAnyOf {

    /**
     * The maximum amount of time allowed between Alerts. Any Alerts arriving greater than {@code time_window} seconds apart will not be grouped together. This is a rolling time window and is counted from the most recently grouped alert. The window is extended every time a new alert is added to the group, up to 24 hours. To use the "recommended_time_window," set the value to 0, otherwise the value must be between 300 and 3600.
     */
    @JsonProperty("time_window")
    protected Integer timeWindow;

    /**
     * In order to ensure your Service has the optimal grouping window, we use data science to calculate your Service's average Alert inter-arrival time. We encourage customer's to use this value, please set {@code time_window} to 0 to use the {@code recommended_time_window}.
     */
    @JsonProperty("recommended_time_window")
    protected Integer recommendedTimeWindow;

    /**
     * Constructs a validated instance of {@link AlertGroupingParametersConfigAnyOf}.
     *
     * @param spec the specification to process
     */
    public AlertGroupingParametersConfigAnyOf(Consumer<AlertGroupingParametersConfigAnyOf> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AlertGroupingParametersConfigAnyOf}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AlertGroupingParametersConfigAnyOf(Consumer)} instead.
     * @param timeWindow The maximum amount of time allowed between Alerts. Any Alerts arriving greater than {@code time_window} seconds apart will not be grouped together. This is a rolling time window and is counted from the most recently grouped alert. The window is extended every time a new alert is added to the group, up to 24 hours. To use the "recommended_time_window," set the value to 0, otherwise the value must be between 300 and 3600.
     * @param recommendedTimeWindow In order to ensure your Service has the optimal grouping window, we use data science to calculate your Service's average Alert inter-arrival time. We encourage customer's to use this value, please set {@code time_window} to 0 to use the {@code recommended_time_window}.
     */
    @ApiStatus.Internal
    public AlertGroupingParametersConfigAnyOf(Integer timeWindow, Integer recommendedTimeWindow) {
        this.timeWindow = timeWindow;
        this.recommendedTimeWindow = recommendedTimeWindow;
    }

}
