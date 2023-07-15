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
 * Schedule
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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

    @JsonProperty("id")
    private String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
     */
    @JsonProperty("summary")
    private String summary;

    /**
     * The type of object being created.
     */
    @JsonProperty("type")
    private TypeEnum type = TypeEnum.SCHEDULE;

    /**
     * the API show URL at which the object is accessible
     */
    @JsonProperty("self")
    private String self;

    /**
     * a URL at which the entity is uniquely displayed in the Web app
     */
    @JsonProperty("html_url")
    private String htmlUrl;

    /**
     * A list of schedule layers.
     */
    @JsonProperty("schedule_layers")
    private List<ScheduleLayer> scheduleLayers;

    /**
     * The time zone of the schedule.
     */
    @JsonProperty("time_zone")
    private String timeZone;

    /**
     * The name of the schedule
     */
    @JsonProperty("name")
    private String name;

    /**
     * The description of the schedule
     */
    @JsonProperty("description")
    private String description;

    @JsonProperty("final_schedule")
    private SubSchedule finalSchedule;

    @JsonProperty("overrides_subschedule")
    private SubSchedule overridesSubschedule;

    /**
     * An array of all of the escalation policies that uses this schedule.
     */
    @JsonProperty("escalation_policies")
    private List<EscalationPolicyReference> escalationPolicies;

    /**
     * An array of all of the users on the schedule.
     */
    @JsonProperty("users")
    private List<UserReference> users;

    /**
     * An array of all of the teams on the schedule.
     */
    @JsonProperty("teams")
    private List<TeamReference> teams;


    /**
     * The type of object being created.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        SCHEDULE("schedule");

        private final String value;
    }

}
