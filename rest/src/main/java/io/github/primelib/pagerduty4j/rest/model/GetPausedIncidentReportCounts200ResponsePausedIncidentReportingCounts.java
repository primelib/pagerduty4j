package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
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
     * The start of the date range over which the report data is represented.
     */
    @JsonProperty("since")
    private String since;

    /**
     * The end of the date range over which the report data is represented.
     */
    @JsonProperty("until")
    private String until;

    /**
     * The total number of paused Alerts for the Account or Servce.
     */
    @JsonProperty("paused_count")
    private BigDecimal pausedCount;

    /**
     * The total number of paused Alerts for the Account or Service that were triggerd after being paused (non-transient Alerts).
     */
    @JsonProperty("triggered_after_pause_count")
    private BigDecimal triggeredAfterPauseCount;

    /**
     * The total number of paused Alerts for the Account or Service that were resolved after being paused and not triggered (transient Alerts).
     */
    @JsonProperty("resolved_after_pause_count")
    private BigDecimal resolvedAfterPauseCount;


}
