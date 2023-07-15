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
 * GetPausedIncidentReportAlerts200ResponsePausedIncidentReportingAlerts
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "since",
    "until",
    "triggered_after_pause_alerts",
    "resolved_after_pause_alerts"
})
@JsonTypeName("getPausedIncidentReportAlerts_200_response_paused_incident_reporting_alerts")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetPausedIncidentReportAlerts200ResponsePausedIncidentReportingAlerts {

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
     * An array of Alerts that were triggered after being paused.
     */
    @JsonProperty("triggered_after_pause_alerts")
    private List<GetPausedIncidentReportAlerts200ResponsePausedIncidentReportingAlertsTriggeredAfterPauseAlertsInner> triggeredAfterPauseAlerts;

    /**
     * An array of Alerts that were resolved after being paused.
     */
    @JsonProperty("resolved_after_pause_alerts")
    private List<GetPausedIncidentReportAlerts200ResponsePausedIncidentReportingAlertsTriggeredAfterPauseAlertsInner> resolvedAfterPauseAlerts;


}
