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
 * AnalyticsModelFilters
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
    "created_at_start",
    "created_at_end",
    "urgency",
    "major",
    "min_ackowledgements",
    "min_timeout_escalations",
    "min_manual_escalations",
    "team_ids",
    "service_ids",
    "escalation_policy_ids",
    "priority_ids",
    "priority_names"
})
@JsonTypeName("AnalyticsModel_filters")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AnalyticsModelFilters {

    /**
     * Accepts an ISO8601 DateTime string. Any incidents with a created_at less than this value will be omitted from the results. The maximum supported time range in conjunction with created_at_end is one year.
     */
    @JsonProperty("created_at_start")
    protected String createdAtStart;

    /**
     * Accepts an ISO8601 DateTime string. Any incidents with a created_at greater than or equal to this value will be omitted from the results. The maximum supported time range in conjunction with created_at_start is one year.
     */
    @JsonProperty("created_at_end")
    protected String createdAtEnd;

    /**
     * Any incidents whose urgency does not match the provided string will be omitted from the results.
     */
    @JsonProperty("urgency")
    protected UrgencyEnum urgency;

    /**
     * A boolean flag including whether results should contain *only* [major incidents](https://support.pagerduty.com/docs/operational-reviews#major-incidents), or exclude major incidents. If no value is provided all incidents will be included.
     */
    @JsonProperty("major")
    protected Boolean major;

    /**
     * An integer that sets the requirement for the minimum number of acknowledgements to occur on an incident. For example, setting this to 1 will return only incidents that have at least 1 acknowledgement. If no value is provided, all incidents will be included.
     */
    @JsonProperty("min_ackowledgements")
    protected Integer minAckowledgements;

    /**
     * An integer that sets the requirement for the minimum number of timeout escalations to occur on an incident. For example, setting this to 1 will return only incidents that have at least 1 timeout escalation. If no value is provided, all incidents will be included.
     */
    @JsonProperty("min_timeout_escalations")
    protected Integer minTimeoutEscalations;

    /**
     * An integer that sets the requirement for the minimum number of manual escalations to occur on an incident. For example, setting this to 1 will return only incidents that have at least 1 manual escalation. If no value is provided, all incidents will be included.
     */
    @JsonProperty("min_manual_escalations")
    protected Integer minManualEscalations;

    /**
     * An array of team IDs. Only incidents related to these teams will be included in the results. If omitted, all teams the requestor has access to will be included in the results.
     */
    @JsonProperty("team_ids")
    protected List<String> teamIds;

    /**
     * An array of service IDs. Only incidents related to these services will be included in the results. If omitted, all services the requestor has access to will be included in the results.
     */
    @JsonProperty("service_ids")
    protected List<String> serviceIds;

    /**
     * An array of escalation policy IDs. Only incidents related to these escalation policies will be included in the results. If omitted, all escalation policies the requestor has access to will be included in the results.
     */
    @JsonProperty("escalation_policy_ids")
    protected List<String> escalationPolicyIds;

    /**
     * An array of priority IDs. Only incidents with these priorities will be included in the results. If omitted, all priorities will be included in the results.
     */
    @JsonProperty("priority_ids")
    protected List<String> priorityIds;

    /**
     * An array of user-defined priority names. Only incidents with these priorities will be included in the results. If omitted, all priorities will be included in the results.
     */
    @JsonProperty("priority_names")
    protected List<String> priorityNames;

    /**
     * Constructs a validated instance of {@link AnalyticsModelFilters}.
     *
     * @param spec the specification to process
     */
    public AnalyticsModelFilters(Consumer<AnalyticsModelFilters> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AnalyticsModelFilters}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AnalyticsModelFilters(Consumer)} instead.
     * @param createdAtStart Accepts an ISO8601 DateTime string. Any incidents with a created_at less than this value will be omitted from the results. The maximum supported time range in conjunction with created_at_end is one year.
     * @param createdAtEnd Accepts an ISO8601 DateTime string. Any incidents with a created_at greater than or equal to this value will be omitted from the results. The maximum supported time range in conjunction with created_at_start is one year.
     * @param urgency Any incidents whose urgency does not match the provided string will be omitted from the results.
     * @param major A boolean flag including whether results should contain *only* [major incidents](https://support.pagerduty.com/docs/operational-reviews#major-incidents), or exclude major incidents. If no value is provided all incidents will be included.
     * @param minAckowledgements An integer that sets the requirement for the minimum number of acknowledgements to occur on an incident. For example, setting this to 1 will return only incidents that have at least 1 acknowledgement. If no value is provided, all incidents will be included.
     * @param minTimeoutEscalations An integer that sets the requirement for the minimum number of timeout escalations to occur on an incident. For example, setting this to 1 will return only incidents that have at least 1 timeout escalation. If no value is provided, all incidents will be included.
     * @param minManualEscalations An integer that sets the requirement for the minimum number of manual escalations to occur on an incident. For example, setting this to 1 will return only incidents that have at least 1 manual escalation. If no value is provided, all incidents will be included.
     * @param teamIds An array of team IDs. Only incidents related to these teams will be included in the results. If omitted, all teams the requestor has access to will be included in the results.
     * @param serviceIds An array of service IDs. Only incidents related to these services will be included in the results. If omitted, all services the requestor has access to will be included in the results.
     * @param escalationPolicyIds An array of escalation policy IDs. Only incidents related to these escalation policies will be included in the results. If omitted, all escalation policies the requestor has access to will be included in the results.
     * @param priorityIds An array of priority IDs. Only incidents with these priorities will be included in the results. If omitted, all priorities will be included in the results.
     * @param priorityNames An array of user-defined priority names. Only incidents with these priorities will be included in the results. If omitted, all priorities will be included in the results.
     */
    @ApiStatus.Internal
    public AnalyticsModelFilters(String createdAtStart, String createdAtEnd, UrgencyEnum urgency, Boolean major, Integer minAckowledgements, Integer minTimeoutEscalations, Integer minManualEscalations, List<String> teamIds, List<String> serviceIds, List<String> escalationPolicyIds, List<String> priorityIds, List<String> priorityNames) {
        this.createdAtStart = createdAtStart;
        this.createdAtEnd = createdAtEnd;
        this.urgency = urgency;
        this.major = major;
        this.minAckowledgements = minAckowledgements;
        this.minTimeoutEscalations = minTimeoutEscalations;
        this.minManualEscalations = minManualEscalations;
        this.teamIds = teamIds;
        this.serviceIds = serviceIds;
        this.escalationPolicyIds = escalationPolicyIds;
        this.priorityIds = priorityIds;
        this.priorityNames = priorityNames;
    }

    /**
     * Any incidents whose urgency does not match the provided string will be omitted from the results.
     */
    @AllArgsConstructor
    public enum UrgencyEnum {
        HIGH("high"),
        LOW("low");

        private static final UrgencyEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static UrgencyEnum of(String input) {
            if (input != null) {
                for (UrgencyEnum v : VALUES) {
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
