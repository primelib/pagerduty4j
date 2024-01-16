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
 * ServiceEventRuleAllOfTimeFrameActiveBetween
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
    "start_time",
    "end_time"
})
@JsonTypeName("ServiceEventRule_allOf_time_frame_active_between")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceEventRuleAllOfTimeFrameActiveBetween {

    /**
     * The start time in milliseconds.
     */
    @JsonProperty("start_time")
    protected Integer startTime;

    /**
     * End time in milliseconds.
     */
    @JsonProperty("end_time")
    protected Integer endTime;

    /**
     * Constructs a validated instance of {@link ServiceEventRuleAllOfTimeFrameActiveBetween}.
     *
     * @param spec the specification to process
     */
    public ServiceEventRuleAllOfTimeFrameActiveBetween(Consumer<ServiceEventRuleAllOfTimeFrameActiveBetween> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ServiceEventRuleAllOfTimeFrameActiveBetween}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ServiceEventRuleAllOfTimeFrameActiveBetween(Consumer)} instead.
     * @param startTime The start time in milliseconds.
     * @param endTime End time in milliseconds.
     */
    @ApiStatus.Internal
    public ServiceEventRuleAllOfTimeFrameActiveBetween(Integer startTime, Integer endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

}
