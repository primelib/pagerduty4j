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
 * ServiceEventRuleAllOfTimeFrameActiveBetween
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "start_time",
    "end_time"
})
@JsonTypeName("ServiceEventRule_allOf_time_frame_active_between")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceEventRuleAllOfTimeFrameActiveBetween {

    /**
     * Constructs a validated implementation of {@link ServiceEventRuleAllOfTimeFrameActiveBetween}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ServiceEventRuleAllOfTimeFrameActiveBetween(Consumer<ServiceEventRuleAllOfTimeFrameActiveBetween> spec) {
        spec.accept(this);
    }

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


}
