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
 * GetAnalyticsIncidents200ResponseFilters
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
@JsonTypeName("getAnalyticsIncidents_200_response_filters")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetAnalyticsIncidents200ResponseFilters {

    /**
     * Constructs a validated implementation of {@link GetAnalyticsIncidents200ResponseFilters}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetAnalyticsIncidents200ResponseFilters(Consumer<GetAnalyticsIncidents200ResponseFilters> spec) {
        spec.accept(this);
    }

    /**
     * The lower boundary for the created_at range filter applied to the results.
     */
    @JsonProperty("created_at_start")
    protected String createdAtStart;

    /**
     * The upper boundary for the created_at range filter applied to the results.
     */
    @JsonProperty("created_at_end")
    protected String createdAtEnd;

    /**
     * The urgency filter applied to the results.
     */
    @JsonProperty("urgency")
    protected UrgencyEnum urgency;

    /**
     * The [major incident](https://support.pagerduty.com/docs/operational-reviews#major-incidents) filter applied to the results.
     */
    @JsonProperty("major")
    protected Boolean major;

    /**
     * The team_ids filter applied to the results.
     */
    @JsonProperty("team_ids")
    protected List<String> teamIds;

    /**
     * The service_ids filter applied to the results.
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
     * The urgency filter applied to the results.
     */
    @AllArgsConstructor
    public enum UrgencyEnum {
        HIGH("high"),
        LOW("low");

        private final String value;
    }

}
