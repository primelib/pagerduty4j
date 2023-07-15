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
 * Schedule
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "summary",
    "type",
    "self",
    "html_url",
    "schedule_layers",
    "time_zone",
    "name",
    "description",
    "final_schedule",
    "overrides_subschedule",
    "escalation_policies",
    "users",
    "teams"
})
@JsonTypeName("Schedule")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Schedule {

    /**
     * Constructs a validated implementation of {@link Schedule}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Schedule(Consumer<Schedule> spec) {
        spec.accept(this);
    }

    @JsonProperty("id")
    protected String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
     */
    @JsonProperty("summary")
    protected String summary;

    /**
     * The type of object being created.
     */
    @JsonProperty("type")
    protected TypeEnum type = TypeEnum.SCHEDULE;

    /**
     * the API show URL at which the object is accessible
     */
    @JsonProperty("self")
    protected String self;

    /**
     * a URL at which the entity is uniquely displayed in the Web app
     */
    @JsonProperty("html_url")
    protected String htmlUrl;

    /**
     * A list of schedule layers.
     */
    @JsonProperty("schedule_layers")
    protected List<ScheduleLayer> scheduleLayers;

    /**
     * The time zone of the schedule.
     */
    @JsonProperty("time_zone")
    protected String timeZone;

    /**
     * The name of the schedule
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The description of the schedule
     */
    @JsonProperty("description")
    protected String description;

    @JsonProperty("final_schedule")
    protected SubSchedule finalSchedule;

    @JsonProperty("overrides_subschedule")
    protected SubSchedule overridesSubschedule;

    /**
     * An array of all of the escalation policies that uses this schedule.
     */
    @JsonProperty("escalation_policies")
    protected List<EscalationPolicyReference> escalationPolicies;

    /**
     * An array of all of the users on the schedule.
     */
    @JsonProperty("users")
    protected List<UserReference> users;

    /**
     * An array of all of the teams on the schedule.
     */
    @JsonProperty("teams")
    protected List<TeamReference> teams;


    /**
     * The type of object being created.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        SCHEDULE("schedule");

        private final String value;
    }

}
