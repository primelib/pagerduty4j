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
 * GetAnalyticsIncidentsRequestFilters
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private String createdAtStart;

    /**
     * Filters the result, showing only the incidents where the creation timestamp is less than the filter value.
     */
    @JsonProperty("created_at_end")
    private String createdAtEnd;

    /**
     * Filters the result, showing only the incidents where urgency matches the filter value.
     */
    @JsonProperty("urgency")
    private String urgency;

    /**
     * An incident is classified as a [major incident](https://support.pagerduty.com/docs/operational-reviews#major-incidents) if it has one of the two highest priorities, or if multiple responders are added and acknowledge the incident.
     */
    @JsonProperty("major")
    private Boolean major;

    /**
     * An array of team IDs. Only incidents that are assigned to a member of these teams will be returned. Account must have the teams ability to use this parameter.
     */
    @JsonProperty("team_ids")
    private List<String> teamIds;

    /**
     * An array of service IDs. Only results related to these services will be returned.
     */
    @JsonProperty("service_ids")
    private List<String> serviceIds;

    /**
     * The priority_ids filter applied to the results.
     */
    @JsonProperty("priority_ids")
    private List<String> priorityIds;

    /**
     * The priority_names filter applied to the results.
     */
    @JsonProperty("priority_names")
    private List<String> priorityNames;


}
