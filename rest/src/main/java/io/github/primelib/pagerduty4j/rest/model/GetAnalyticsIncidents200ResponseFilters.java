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
 * GetAnalyticsIncidents200ResponseFilters
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
@JsonTypeName("getAnalyticsIncidents_200_response_filters")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetAnalyticsIncidents200ResponseFilters {

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
     * Constructs a validated instance of {@link GetAnalyticsIncidents200ResponseFilters}.
     *
     * @param spec the specification to process
     */
    public GetAnalyticsIncidents200ResponseFilters(Consumer<GetAnalyticsIncidents200ResponseFilters> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetAnalyticsIncidents200ResponseFilters}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetAnalyticsIncidents200ResponseFilters(Consumer)} instead.
     * @param createdAtStart The lower boundary for the created_at range filter applied to the results.
     * @param createdAtEnd The upper boundary for the created_at range filter applied to the results.
     * @param urgency The urgency filter applied to the results.
     * @param major The [major incident](https://support.pagerduty.com/docs/operational-reviews#major-incidents) filter applied to the results.
     * @param teamIds The team_ids filter applied to the results.
     * @param serviceIds The service_ids filter applied to the results.
     * @param priorityIds The priority_ids filter applied to the results.
     * @param priorityNames The priority_names filter applied to the results.
     */
    @ApiStatus.Internal
    public GetAnalyticsIncidents200ResponseFilters(String createdAtStart, String createdAtEnd, UrgencyEnum urgency, Boolean major, List<String> teamIds, List<String> serviceIds, List<String> priorityIds, List<String> priorityNames) {
        this.createdAtStart = createdAtStart;
        this.createdAtEnd = createdAtEnd;
        this.urgency = urgency;
        this.major = major;
        this.teamIds = teamIds;
        this.serviceIds = serviceIds;
        this.priorityIds = priorityIds;
        this.priorityNames = priorityNames;
    }

    /**
     * The urgency filter applied to the results.
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
