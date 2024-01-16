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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * SupportHours
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
    protected TypeEnum type;

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
     * Constructs a validated instance of {@link SupportHours}.
     *
     * @param spec the specification to process
     */
    public SupportHours(Consumer<SupportHours> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SupportHours}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SupportHours(Consumer)} instead.
     * @param type The type of support hours
     * @param timeZone The time zone for the support hours
     * @param daysOfWeek daysOfWeek
     * @param startTime The support hours' starting time of day (date portion is ignored)
     * @param endTime The support hours' ending time of day (date portion is ignored)
     */
    @ApiStatus.Internal
    public SupportHours(TypeEnum type, String timeZone, List<Integer> daysOfWeek, String startTime, String endTime) {
        this.type = type;
        this.timeZone = timeZone;
        this.daysOfWeek = daysOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    /**
     * The type of support hours
     */
    @AllArgsConstructor
    public enum TypeEnum {
        FIXED_TIME_PER_DAY("fixed_time_per_day");

        private static final TypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static TypeEnum of(String input) {
            if (input != null) {
                for (TypeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
