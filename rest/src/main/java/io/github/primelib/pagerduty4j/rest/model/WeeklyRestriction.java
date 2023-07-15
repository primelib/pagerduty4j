package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WeeklyRestriction
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "start_day_of_week"
})
@JsonTypeName("WeeklyRestriction")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WeeklyRestriction extends Restriction {

    /**
     * Constructs a validated implementation of {@link WeeklyRestriction}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WeeklyRestriction(Consumer<WeeklyRestriction> spec) {
        spec.accept(this);
    }

    /**
     * The first day of the weekly rotation schedule as [ISO 8601 day](https://en.wikipedia.org/wiki/ISO_week_date) (1 is Monday, etc.)
     */
    @JsonProperty("start_day_of_week")
    protected Integer startDayOfWeek;


}
