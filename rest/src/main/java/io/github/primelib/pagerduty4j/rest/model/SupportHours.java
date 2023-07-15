package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
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
     * The type of support hours
     */
    @JsonProperty("type")
    private TypeEnum type = TypeEnum.FIXED_TIME_PER_DAY;

    /**
     * The time zone for the support hours
     */
    @JsonProperty("time_zone")
    private String timeZone;

    @JsonProperty("days_of_week")
    private List<Integer> daysOfWeek;

    /**
     * The support hours' starting time of day (date portion is ignored)
     */
    @JsonProperty("start_time")
    private String startTime;

    /**
     * The support hours' ending time of day (date portion is ignored)
     */
    @JsonProperty("end_time")
    private String endTime;


    /**
     * The type of support hours
     */
    @AllArgsConstructor
    public enum TypeEnum {
        FIXED_TIME_PER_DAY("fixed_time_per_day");

        private final String value;
    }

}
