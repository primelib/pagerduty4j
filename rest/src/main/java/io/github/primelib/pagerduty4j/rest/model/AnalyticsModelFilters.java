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
 * AnalyticsModelFilters
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
@JsonTypeName("AnalyticsModel_filters")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AnalyticsModelFilters {

    /**
     * Constructs a validated implementation of {@link AnalyticsModelFilters}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AnalyticsModelFilters(Consumer<AnalyticsModelFilters> spec) {
        spec.accept(this);
    }

    /**
     * Accepts an ISO8601 DateTime string.
     * Any incidents with a created_at less than this value will be omitted from the results.
     * The maximum supported time range in conjunction with created_at_end is one year.
     */
    @JsonProperty("created_at_start")
    protected String createdAtStart;

    /**
     * Accepts an ISO8601 DateTime string.
     * Any incidents with a created_at greater than or equal to this value will be omitted from the results.
     * The maximum supported time range in conjunction with created_at_start is one year.
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
     * An array of priority IDs. Only incidents with these priorities will be included in the results. If omitted, all services the requestor has access to will be included in the results.
     */
    @JsonProperty("priority_ids")
    protected List<String> priorityIds;

    /**
     * An array of user-defined priority names. Only incidents with these priorities will be included in the results. If omitted, all services the requestor has access to will be included in the results.
     */
    @JsonProperty("priority_names")
    protected List<String> priorityNames;


    /**
     * Any incidents whose urgency does not match the provided string will be omitted from the results.
     */
    @AllArgsConstructor
    public enum UrgencyEnum {
        HIGH("high"),
        LOW("low");

        private final String value;
    }

}
