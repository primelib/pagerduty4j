package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WeeklyRestriction
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "start_day_of_week"
})
@JsonTypeName("WeeklyRestriction")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WeeklyRestriction extends Restriction {

    /**
     * The first day of the weekly rotation schedule as [ISO 8601 day](https://en.wikipedia.org/wiki/ISO_week_date) (1 is Monday, etc.)
     */
    @JsonProperty("start_day_of_week")
    private Integer startDayOfWeek;


}
