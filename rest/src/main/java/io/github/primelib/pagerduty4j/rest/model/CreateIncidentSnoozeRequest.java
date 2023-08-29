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
 * CreateIncidentSnoozeRequest
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
    "duration"
})
@JsonTypeName("createIncidentSnooze_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateIncidentSnoozeRequest {

    /**
     * The number of seconds to snooze the incident for. After this number of seconds has elapsed, the incident will return to the "triggered" state.
     */
    @JsonProperty("duration")
    protected Integer duration;

    /**
     * Constructs a validated instance of {@link CreateIncidentSnoozeRequest}.
     *
     * @param spec the specification to process
     */
    public CreateIncidentSnoozeRequest(Consumer<CreateIncidentSnoozeRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateIncidentSnoozeRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateIncidentSnoozeRequest(Consumer)} instead.
     * @param duration The number of seconds to snooze the incident for. After this number of seconds has elapsed, the incident will return to the "triggered" state.
     */
    @ApiStatus.Internal
    public CreateIncidentSnoozeRequest(Integer duration) {
        this.duration = duration;
    }

}
