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

import java.math.BigDecimal;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * SubSchedule
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
    "name",
    "rendered_schedule_entries",
    "rendered_coverage_percentage"
})
@JsonTypeName("SubSchedule")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SubSchedule {

    /**
     * The name of the subschedule
     */
    @JsonProperty("name")
    protected NameEnum name;

    /**
     * This is a list of entries on the computed layer for the current time range. Since or until must be set in order for this field to be populated.
     */
    @JsonProperty("rendered_schedule_entries")
    protected List<ScheduleLayerEntry> renderedScheduleEntries;

    /**
     * The percentage of the time range covered by this layer. Returns null unless since or until are set.
     */
    @JsonProperty("rendered_coverage_percentage")
    protected BigDecimal renderedCoveragePercentage;

    /**
     * Constructs a validated instance of {@link SubSchedule}.
     *
     * @param spec the specification to process
     */
    public SubSchedule(Consumer<SubSchedule> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SubSchedule}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SubSchedule(Consumer)} instead.
     * @param name The name of the subschedule
     * @param renderedScheduleEntries This is a list of entries on the computed layer for the current time range. Since or until must be set in order for this field to be populated.
     * @param renderedCoveragePercentage The percentage of the time range covered by this layer. Returns null unless since or until are set.
     */
    @ApiStatus.Internal
    public SubSchedule(NameEnum name, List<ScheduleLayerEntry> renderedScheduleEntries, BigDecimal renderedCoveragePercentage) {
        this.name = name;
        this.renderedScheduleEntries = renderedScheduleEntries;
        this.renderedCoveragePercentage = renderedCoveragePercentage;
    }

    /**
     * The name of the subschedule
     */
    @AllArgsConstructor
    public enum NameEnum {
        FINAL_SCHEDULE("Final Schedule"),
        OVERRIDES("Overrides");

        private static final NameEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static NameEnum of(String input) {
            if (input != null) {
                for (NameEnum v : VALUES) {
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
