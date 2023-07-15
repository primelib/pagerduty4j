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
 * Restriction
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "type",
    "duration_seconds",
    "start_time_of_day",
    "start_day_of_week"
})
@JsonTypeName("Restriction")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Restriction {

    /**
     * Constructs a validated implementation of {@link Restriction}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Restriction(Consumer<Restriction> spec) {
        spec.accept(this);
    }

    /**
     * Specify the types of `restriction`.
     */
    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * The duration of the restriction in seconds.
     */
    @JsonProperty("duration_seconds")
    protected Integer durationSeconds;

    /**
     * The start time in HH:mm:ss format.
     */
    @JsonProperty("start_time_of_day")
    protected String startTimeOfDay;

    /**
     * Only required for use with a `weekly_restriction` restriction type. The first day of the weekly rotation schedule as [ISO 8601 day](https://en.wikipedia.org/wiki/ISO_week_date) (1 is Monday, etc.)
     */
    @JsonProperty("start_day_of_week")
    protected Integer startDayOfWeek;


    /**
     * Specify the types of `restriction`.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        DAILY_RESTRICTION("daily_restriction"),
        WEEKLY_RESTRICTION("weekly_restriction");

        private final String value;
    }

}
