package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
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
 * WeeklyRestriction
 *
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
    protected Integer startDayOfWeek;

    /**
     * Constructs a validated instance of {@link WeeklyRestriction}.
     *
     * @param spec the specification to process
     */
    public WeeklyRestriction(Consumer<WeeklyRestriction> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WeeklyRestriction}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WeeklyRestriction(Consumer)} instead.
     * @param startDayOfWeek The first day of the weekly rotation schedule as [ISO 8601 day](https://en.wikipedia.org/wiki/ISO_week_date) (1 is Monday, etc.)
     */
    @ApiStatus.Internal
    public WeeklyRestriction(Integer startDayOfWeek) {
        this.startDayOfWeek = startDayOfWeek;
    }

}
