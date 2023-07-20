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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Restriction
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
    "type",
    "duration_seconds",
    "start_time_of_day",
    "start_day_of_week"
})
@JsonTypeName("Restriction")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Restriction {

    /**
     * Specify the types of {@code restriction}.
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
     * Only required for use with a {@code weekly_restriction} restriction type. The first day of the weekly rotation schedule as [ISO 8601 day](https://en.wikipedia.org/wiki/ISO_week_date) (1 is Monday, etc.)
     */
    @JsonProperty("start_day_of_week")
    protected Integer startDayOfWeek;

    /**
     * Constructs a validated instance of {@link Restriction}.
     *
     * @param spec the specification to process
     */
    public Restriction(Consumer<Restriction> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Restriction}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Restriction(Consumer)} instead.
     * @param type Specify the types of {@code restriction}.
     * @param durationSeconds The duration of the restriction in seconds.
     * @param startTimeOfDay The start time in HH:mm:ss format.
     * @param startDayOfWeek Only required for use with a {@code weekly_restriction} restriction type. The first day of the weekly rotation schedule as [ISO 8601 day](https://en.wikipedia.org/wiki/ISO_week_date) (1 is Monday, etc.)
     */
    @ApiStatus.Internal
    public Restriction(TypeEnum type, Integer durationSeconds, String startTimeOfDay, Integer startDayOfWeek) {
        this.type = type;
        this.durationSeconds = durationSeconds;
        this.startTimeOfDay = startTimeOfDay;
        this.startDayOfWeek = startDayOfWeek;
    }

    /**
     * Specify the types of {@code restriction}.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        DAILY_RESTRICTION("daily_restriction"),
        WEEKLY_RESTRICTION("weekly_restriction");

        private final String value;
    }

}
