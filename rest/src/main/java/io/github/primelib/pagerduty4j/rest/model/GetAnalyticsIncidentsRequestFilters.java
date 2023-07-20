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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetAnalyticsIncidentsRequestFilters
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
    "team_ids",
    "service_ids",
    "priority_ids",
    "priority_names"
})
@JsonTypeName("getAnalyticsIncidents_request_filters")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetAnalyticsIncidentsRequestFilters {

    /**
     * Filters the result, showing only the incidents where the creation timestamp is greater than the filter value.
     */
    @JsonProperty("created_at_start")
    protected String createdAtStart;

    /**
     * Filters the result, showing only the incidents where the creation timestamp is less than the filter value.
     */
    @JsonProperty("created_at_end")
    protected String createdAtEnd;

    /**
     * Filters the result, showing only the incidents where urgency matches the filter value.
     */
    @JsonProperty("urgency")
    protected String urgency;

    /**
     * An incident is classified as a [major incident](https://support.pagerduty.com/docs/operational-reviews#major-incidents) if it has one of the two highest priorities, or if multiple responders are added and acknowledge the incident.
     */
    @JsonProperty("major")
    protected Boolean major;

    /**
     * An array of team IDs. Only incidents that are assigned to a member of these teams will be returned. Account must have the teams ability to use this parameter.
     */
    @JsonProperty("team_ids")
    protected List<String> teamIds;

    /**
     * An array of service IDs. Only results related to these services will be returned.
     */
    @JsonProperty("service_ids")
    protected List<String> serviceIds;

    /**
     * The priority_ids filter applied to the results.
     */
    @JsonProperty("priority_ids")
    protected List<String> priorityIds;

    /**
     * The priority_names filter applied to the results.
     */
    @JsonProperty("priority_names")
    protected List<String> priorityNames;

    /**
     * Constructs a validated instance of {@link GetAnalyticsIncidentsRequestFilters}.
     *
     * @param spec the specification to process
     */
    public GetAnalyticsIncidentsRequestFilters(Consumer<GetAnalyticsIncidentsRequestFilters> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetAnalyticsIncidentsRequestFilters}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetAnalyticsIncidentsRequestFilters(Consumer)} instead.
     * @param createdAtStart Filters the result, showing only the incidents where the creation timestamp is greater than the filter value.
     * @param createdAtEnd Filters the result, showing only the incidents where the creation timestamp is less than the filter value.
     * @param urgency Filters the result, showing only the incidents where urgency matches the filter value.
     * @param major An incident is classified as a [major incident](https://support.pagerduty.com/docs/operational-reviews#major-incidents) if it has one of the two highest priorities, or if multiple responders are added and acknowledge the incident.
     * @param teamIds An array of team IDs. Only incidents that are assigned to a member of these teams will be returned. Account must have the teams ability to use this parameter.
     * @param serviceIds An array of service IDs. Only results related to these services will be returned.
     * @param priorityIds The priority_ids filter applied to the results.
     * @param priorityNames The priority_names filter applied to the results.
     */
    @ApiStatus.Internal
    public GetAnalyticsIncidentsRequestFilters(String createdAtStart, String createdAtEnd, String urgency, Boolean major, List<String> teamIds, List<String> serviceIds, List<String> priorityIds, List<String> priorityNames) {
        this.createdAtStart = createdAtStart;
        this.createdAtEnd = createdAtEnd;
        this.urgency = urgency;
        this.major = major;
        this.teamIds = teamIds;
        this.serviceIds = serviceIds;
        this.priorityIds = priorityIds;
        this.priorityNames = priorityNames;
    }

}
