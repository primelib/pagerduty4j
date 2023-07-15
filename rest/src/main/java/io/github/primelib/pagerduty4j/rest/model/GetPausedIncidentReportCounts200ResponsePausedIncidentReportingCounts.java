package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetPausedIncidentReportCounts200ResponsePausedIncidentReportingCounts
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "since",
    "until",
    "paused_count",
    "triggered_after_pause_count",
    "resolved_after_pause_count"
})
@JsonTypeName("getPausedIncidentReportCounts_200_response_paused_incident_reporting_counts")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetPausedIncidentReportCounts200ResponsePausedIncidentReportingCounts {

    /**
     * Constructs a validated implementation of {@link GetPausedIncidentReportCounts200ResponsePausedIncidentReportingCounts}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetPausedIncidentReportCounts200ResponsePausedIncidentReportingCounts(Consumer<GetPausedIncidentReportCounts200ResponsePausedIncidentReportingCounts> spec) {
        spec.accept(this);
    }

    /**
     * The start of the date range over which the report data is represented.
     */
    @JsonProperty("since")
    protected String since;

    /**
     * The end of the date range over which the report data is represented.
     */
    @JsonProperty("until")
    protected String until;

    /**
     * The total number of paused Alerts for the Account or Servce.
     */
    @JsonProperty("paused_count")
    protected BigDecimal pausedCount;

    /**
     * The total number of paused Alerts for the Account or Service that were triggerd after being paused (non-transient Alerts).
     */
    @JsonProperty("triggered_after_pause_count")
    protected BigDecimal triggeredAfterPauseCount;

    /**
     * The total number of paused Alerts for the Account or Service that were resolved after being paused and not triggered (transient Alerts).
     */
    @JsonProperty("resolved_after_pause_count")
    protected BigDecimal resolvedAfterPauseCount;


}
