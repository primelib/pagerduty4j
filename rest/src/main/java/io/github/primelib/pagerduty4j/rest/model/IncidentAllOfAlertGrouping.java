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

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * IncidentAllOfAlertGrouping
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
    "grouping_type",
    "started_at",
    "ended_at",
    "alert_grouping_active"
})
@JsonTypeName("Incident_allOf_alert_grouping")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncidentAllOfAlertGrouping {

    @JsonProperty("grouping_type")
    protected GroupingTypeEnum groupingType;

    @JsonProperty("started_at")
    protected OffsetDateTime startedAt;

    @JsonProperty("ended_at")
    protected OffsetDateTime endedAt;

    @JsonProperty("alert_grouping_active")
    protected Boolean alertGroupingActive;

    /**
     * Constructs a validated instance of {@link IncidentAllOfAlertGrouping}.
     *
     * @param spec the specification to process
     */
    public IncidentAllOfAlertGrouping(Consumer<IncidentAllOfAlertGrouping> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IncidentAllOfAlertGrouping}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IncidentAllOfAlertGrouping(Consumer)} instead.
     * @param groupingType groupingType
     * @param startedAt startedAt
     * @param endedAt endedAt
     * @param alertGroupingActive alertGroupingActive
     */
    @ApiStatus.Internal
    public IncidentAllOfAlertGrouping(GroupingTypeEnum groupingType, OffsetDateTime startedAt, OffsetDateTime endedAt, Boolean alertGroupingActive) {
        this.groupingType = groupingType;
        this.startedAt = startedAt;
        this.endedAt = endedAt;
        this.alertGroupingActive = alertGroupingActive;
    }

    @AllArgsConstructor
    public enum GroupingTypeEnum {
        BASIC("basic"),
        ADVANCED("advanced"),
        RULES("rules");

        private static final GroupingTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static GroupingTypeEnum of(String input) {
            if (input != null) {
                for (GroupingTypeEnum v : VALUES) {
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
