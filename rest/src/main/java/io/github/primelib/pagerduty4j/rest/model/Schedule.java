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
 * Schedule
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
    protected String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to {@code name}, though it is not intended to be an identifier.
     */
    @JsonProperty("summary")
    protected String summary;

    /**
     * The type of object being created.
     */
    @JsonProperty("type")
    protected TypeEnum type;

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
     * Constructs a validated instance of {@link Schedule}.
     *
     * @param spec the specification to process
     */
    public Schedule(Consumer<Schedule> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Schedule}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Schedule(Consumer)} instead.
     * @param id id
     * @param summary A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to {@code name}, though it is not intended to be an identifier.
     * @param type The type of object being created.
     * @param self the API show URL at which the object is accessible
     * @param htmlUrl a URL at which the entity is uniquely displayed in the Web app
     * @param scheduleLayers A list of schedule layers.
     * @param timeZone The time zone of the schedule.
     * @param name The name of the schedule
     * @param description The description of the schedule
     * @param finalSchedule finalSchedule
     * @param overridesSubschedule overridesSubschedule
     * @param escalationPolicies An array of all of the escalation policies that uses this schedule.
     * @param users An array of all of the users on the schedule.
     * @param teams An array of all of the teams on the schedule.
     */
    @ApiStatus.Internal
    public Schedule(String id, String summary, TypeEnum type, String self, String htmlUrl, List<ScheduleLayer> scheduleLayers, String timeZone, String name, String description, SubSchedule finalSchedule, SubSchedule overridesSubschedule, List<EscalationPolicyReference> escalationPolicies, List<UserReference> users, List<TeamReference> teams) {
        this.id = id;
        this.summary = summary;
        this.type = type;
        this.self = self;
        this.htmlUrl = htmlUrl;
        this.scheduleLayers = scheduleLayers;
        this.timeZone = timeZone;
        this.name = name;
        this.description = description;
        this.finalSchedule = finalSchedule;
        this.overridesSubschedule = overridesSubschedule;
        this.escalationPolicies = escalationPolicies;
        this.users = users;
        this.teams = teams;
    }

    /**
     * The type of object being created.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        SCHEDULE("schedule");

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
