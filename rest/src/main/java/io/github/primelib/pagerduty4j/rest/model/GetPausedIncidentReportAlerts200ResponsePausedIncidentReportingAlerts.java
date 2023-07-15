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
 * GetPausedIncidentReportAlerts200ResponsePausedIncidentReportingAlerts
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link GetPausedIncidentReportAlerts200ResponsePausedIncidentReportingAlerts}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetPausedIncidentReportAlerts200ResponsePausedIncidentReportingAlerts(Consumer<GetPausedIncidentReportAlerts200ResponsePausedIncidentReportingAlerts> spec) {
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
     * An array of Alerts that were triggered after being paused.
     */
    @JsonProperty("triggered_after_pause_alerts")
    protected List<GetPausedIncidentReportAlerts200ResponsePausedIncidentReportingAlertsTriggeredAfterPauseAlertsInner> triggeredAfterPauseAlerts;

    /**
     * An array of Alerts that were resolved after being paused.
     */
    @JsonProperty("resolved_after_pause_alerts")
    protected List<GetPausedIncidentReportAlerts200ResponsePausedIncidentReportingAlertsTriggeredAfterPauseAlertsInner> resolvedAfterPauseAlerts;


}
