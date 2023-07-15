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
 * CreateScheduleRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "schedule"
})
@JsonTypeName("createSchedule_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateScheduleRequest {

    /**
     * Constructs a validated implementation of {@link CreateScheduleRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateScheduleRequest(Consumer<CreateScheduleRequest> spec) {
        spec.accept(this);
    }

    @JsonProperty("schedule")
    protected Schedule schedule;


}
