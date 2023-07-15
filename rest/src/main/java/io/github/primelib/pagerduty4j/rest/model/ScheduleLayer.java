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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ScheduleLayer
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "start",
    "end",
    "users",
    "restrictions",
    "rotation_virtual_start",
    "rotation_turn_length_seconds",
    "name",
    "rendered_schedule_entries",
    "rendered_coverage_percentage"
})
@JsonTypeName("ScheduleLayer")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ScheduleLayer {

    /**
     * Constructs a validated implementation of {@link ScheduleLayer}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ScheduleLayer(Consumer<ScheduleLayer> spec) {
        spec.accept(this);
    }

    @JsonProperty("id")
    protected String id;

    /**
     * The start time of this layer.
     */
    @JsonProperty("start")
    protected OffsetDateTime start;

    /**
     * The end time of this layer. If `null`, the layer does not end.
     */
    @JsonProperty("end")
    protected OffsetDateTime end;

    /**
     * The ordered list of users on this layer. The position of the user on the list determines their order in the layer.
     */
    @JsonProperty("users")
    protected List<ScheduleLayerUser> users = new ArrayList<>();

    /**
     * An array of restrictions for the layer. A restriction is a limit on which period of the day or week the schedule layer can accept assignments.
     */
    @JsonProperty("restrictions")
    protected List<Restriction> restrictions;

    /**
     * The effective start time of the layer. This can be before the start time of the schedule.
     */
    @JsonProperty("rotation_virtual_start")
    protected OffsetDateTime rotationVirtualStart;

    /**
     * The duration of each on-call shift in seconds.
     */
    @JsonProperty("rotation_turn_length_seconds")
    protected Integer rotationTurnLengthSeconds;

    /**
     * The name of the schedule layer.
     */
    @JsonProperty("name")
    protected String name;

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


}
