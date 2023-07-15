package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SubSchedule
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "name",
    "rendered_schedule_entries",
    "rendered_coverage_percentage"
})
@JsonTypeName("SubSchedule")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SubSchedule {

    /**
     * Constructs a validated implementation of {@link SubSchedule}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SubSchedule(Consumer<SubSchedule> spec) {
        spec.accept(this);
    }

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
     * The name of the subschedule
     */
    @AllArgsConstructor
    public enum NameEnum {
        FINAL_SCHEDULE("Final Schedule"),
        OVERRIDES("Overrides");

        private final String value;
    }

}
