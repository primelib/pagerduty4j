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
 * AnalyticsResponderFilterFilters
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
    "date_range_start",
    "date_range_end",
    "urgency",
    "team_ids",
    "responder_ids",
    "priority_ids",
    "priority_names"
})
@JsonTypeName("AnalyticsResponderFilter_filters")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AnalyticsResponderFilterFilters {

    /**
     * Accepts an ISO8601 DateTime string. Any incidents with a created_at less than this value will be omitted from the results. The maximum supported time range in conjunction with date_range_end is one year.
     */
    @JsonProperty("date_range_start")
    protected String dateRangeStart;

    /**
     * Accepts an ISO8601 DateTime string. Any incidents with a created_at greater than or equal to this value will be omitted from the results. The maximum supported time range in conjunction with date_range_start is one year.
     */
    @JsonProperty("date_range_end")
    protected String dateRangeEnd;

    /**
     * Any incidents whose urgency does not match the provided string will be omitted from the results.
     */
    @JsonProperty("urgency")
    protected UrgencyEnum urgency;

    /**
     * An array of team IDs. Only incidents related to these teams will be included in the results. If omitted, all teams the requestor has access to will be included in the results.
     */
    @JsonProperty("team_ids")
    protected List<String> teamIds;

    /**
     * An array of responder IDs. Only incidents related to these responders will be included in the results. If omitted, all responders the requestor has access to will be included in the results.
     */
    @JsonProperty("responder_ids")
    protected List<String> responderIds;

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
     * Constructs a validated instance of {@link AnalyticsResponderFilterFilters}.
     *
     * @param spec the specification to process
     */
    public AnalyticsResponderFilterFilters(Consumer<AnalyticsResponderFilterFilters> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AnalyticsResponderFilterFilters}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AnalyticsResponderFilterFilters(Consumer)} instead.
     * @param dateRangeStart Accepts an ISO8601 DateTime string. Any incidents with a created_at less than this value will be omitted from the results. The maximum supported time range in conjunction with date_range_end is one year.
     * @param dateRangeEnd Accepts an ISO8601 DateTime string. Any incidents with a created_at greater than or equal to this value will be omitted from the results. The maximum supported time range in conjunction with date_range_start is one year.
     * @param urgency Any incidents whose urgency does not match the provided string will be omitted from the results.
     * @param teamIds An array of team IDs. Only incidents related to these teams will be included in the results. If omitted, all teams the requestor has access to will be included in the results.
     * @param responderIds An array of responder IDs. Only incidents related to these responders will be included in the results. If omitted, all responders the requestor has access to will be included in the results.
     * @param priorityIds An array of priority IDs. Only incidents with these priorities will be included in the results. If omitted, all priorities will be included in the results.
     * @param priorityNames An array of user-defined priority names. Only incidents with these priorities will be included in the results. If omitted, all priorities will be included in the results.
     */
    @ApiStatus.Internal
    public AnalyticsResponderFilterFilters(String dateRangeStart, String dateRangeEnd, UrgencyEnum urgency, List<String> teamIds, List<String> responderIds, List<String> priorityIds, List<String> priorityNames) {
        this.dateRangeStart = dateRangeStart;
        this.dateRangeEnd = dateRangeEnd;
        this.urgency = urgency;
        this.teamIds = teamIds;
        this.responderIds = responderIds;
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
