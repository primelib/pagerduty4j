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
 * SupportHours
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "type",
    "time_zone",
    "days_of_week",
    "start_time",
    "end_time"
})
@JsonTypeName("SupportHours")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SupportHours {

    /**
     * Constructs a validated implementation of {@link SupportHours}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SupportHours(Consumer<SupportHours> spec) {
        spec.accept(this);
    }

    /**
     * The type of support hours
     */
    @JsonProperty("type")
    protected TypeEnum type = TypeEnum.FIXED_TIME_PER_DAY;

    /**
     * The time zone for the support hours
     */
    @JsonProperty("time_zone")
    protected String timeZone;

    @JsonProperty("days_of_week")
    protected List<Integer> daysOfWeek;

    /**
     * The support hours' starting time of day (date portion is ignored)
     */
    @JsonProperty("start_time")
    protected String startTime;

    /**
     * The support hours' ending time of day (date portion is ignored)
     */
    @JsonProperty("end_time")
    protected String endTime;


    /**
     * The type of support hours
     */
    @AllArgsConstructor
    public enum TypeEnum {
        FIXED_TIME_PER_DAY("fixed_time_per_day");

        private final String value;
    }

}
