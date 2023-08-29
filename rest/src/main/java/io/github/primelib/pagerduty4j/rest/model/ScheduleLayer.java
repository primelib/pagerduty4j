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
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ScheduleLayer
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

    @JsonProperty("id")
    protected String id;

    /**
     * The start time of this layer.
     */
    @JsonProperty("start")
    protected OffsetDateTime start;

    /**
     * The end time of this layer. If {@code null}, the layer does not end.
     */
    @JsonProperty("end")
    protected OffsetDateTime end;

    /**
     * The ordered list of users on this layer. The position of the user on the list determines their order in the layer.
     */
    @JsonProperty("users")
    protected List<ScheduleLayerUser> users;

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

    /**
     * Constructs a validated instance of {@link ScheduleLayer}.
     *
     * @param spec the specification to process
     */
    public ScheduleLayer(Consumer<ScheduleLayer> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ScheduleLayer}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ScheduleLayer(Consumer)} instead.
     * @param id id
     * @param start The start time of this layer.
     * @param end The end time of this layer. If {@code null}, the layer does not end.
     * @param users The ordered list of users on this layer. The position of the user on the list determines their order in the layer.
     * @param restrictions An array of restrictions for the layer. A restriction is a limit on which period of the day or week the schedule layer can accept assignments.
     * @param rotationVirtualStart The effective start time of the layer. This can be before the start time of the schedule.
     * @param rotationTurnLengthSeconds The duration of each on-call shift in seconds.
     * @param name The name of the schedule layer.
     * @param renderedScheduleEntries This is a list of entries on the computed layer for the current time range. Since or until must be set in order for this field to be populated.
     * @param renderedCoveragePercentage The percentage of the time range covered by this layer. Returns null unless since or until are set.
     */
    @ApiStatus.Internal
    public ScheduleLayer(String id, OffsetDateTime start, OffsetDateTime end, List<ScheduleLayerUser> users, List<Restriction> restrictions, OffsetDateTime rotationVirtualStart, Integer rotationTurnLengthSeconds, String name, List<ScheduleLayerEntry> renderedScheduleEntries, BigDecimal renderedCoveragePercentage) {
        this.id = id;
        this.start = start;
        this.end = end;
        this.users = users;
        this.restrictions = restrictions;
        this.rotationVirtualStart = rotationVirtualStart;
        this.rotationTurnLengthSeconds = rotationTurnLengthSeconds;
        this.name = name;
        this.renderedScheduleEntries = renderedScheduleEntries;
        this.renderedCoveragePercentage = renderedCoveragePercentage;
    }

}
