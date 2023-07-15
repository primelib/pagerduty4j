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
 * CreateIncidentSnoozeRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "duration"
})
@JsonTypeName("createIncidentSnooze_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateIncidentSnoozeRequest {

    /**
     * Constructs a validated implementation of {@link CreateIncidentSnoozeRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateIncidentSnoozeRequest(Consumer<CreateIncidentSnoozeRequest> spec) {
        spec.accept(this);
    }

    /**
     * The number of seconds to snooze the incident for. After this number of seconds has elapsed, the incident will return to the "triggered" state.
     */
    @JsonProperty("duration")
    protected Integer duration;


}
