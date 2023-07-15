package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Restriction
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
     * Specify the types of `restriction`.
     */
    @JsonProperty("type")
    private TypeEnum type;

    /**
     * The duration of the restriction in seconds.
     */
    @JsonProperty("duration_seconds")
    private Integer durationSeconds;

    /**
     * The start time in HH:mm:ss format.
     */
    @JsonProperty("start_time_of_day")
    private String startTimeOfDay;

    /**
     * Only required for use with a `weekly_restriction` restriction type. The first day of the weekly rotation schedule as [ISO 8601 day](https://en.wikipedia.org/wiki/ISO_week_date) (1 is Monday, etc.)
     */
    @JsonProperty("start_day_of_week")
    private Integer startDayOfWeek;


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
