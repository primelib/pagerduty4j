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
 * CreateScheduleRequest
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
    "schedule"
})
@JsonTypeName("createSchedule_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateScheduleRequest {

    @JsonProperty("schedule")
    protected Schedule schedule;

    /**
     * Constructs a validated instance of {@link CreateScheduleRequest}.
     *
     * @param spec the specification to process
     */
    public CreateScheduleRequest(Consumer<CreateScheduleRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateScheduleRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateScheduleRequest(Consumer)} instead.
     * @param schedule var.name
     */
    @ApiStatus.Internal
    public CreateScheduleRequest(Schedule schedule) {
        this.schedule = schedule;
    }

}
