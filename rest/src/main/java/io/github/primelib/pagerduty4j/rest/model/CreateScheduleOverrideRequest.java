package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateScheduleOverrideRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "overrides"
})
@JsonTypeName("createScheduleOverride_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateScheduleOverrideRequest {

    /**
     * Constructs a validated implementation of {@link CreateScheduleOverrideRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateScheduleOverrideRequest(Consumer<CreateScheduleOverrideRequest> spec) {
        spec.accept(this);
    }

    @JsonProperty("overrides")
    protected List<ScheduleOverride> overrides;


}
