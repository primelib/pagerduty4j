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
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetPausedIncidentReportAlerts200ResponsePausedIncidentReportingAlerts
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

    /**
     * Constructs a validated instance of {@link GetPausedIncidentReportAlerts200ResponsePausedIncidentReportingAlerts}.
     *
     * @param spec the specification to process
     */
    public GetPausedIncidentReportAlerts200ResponsePausedIncidentReportingAlerts(Consumer<GetPausedIncidentReportAlerts200ResponsePausedIncidentReportingAlerts> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetPausedIncidentReportAlerts200ResponsePausedIncidentReportingAlerts}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetPausedIncidentReportAlerts200ResponsePausedIncidentReportingAlerts(Consumer)} instead.
     * @param since The start of the date range over which the report data is represented.
     * @param until The end of the date range over which the report data is represented.
     * @param triggeredAfterPauseAlerts An array of Alerts that were triggered after being paused.
     * @param resolvedAfterPauseAlerts An array of Alerts that were resolved after being paused.
     */
    @ApiStatus.Internal
    public GetPausedIncidentReportAlerts200ResponsePausedIncidentReportingAlerts(String since, String until, List<GetPausedIncidentReportAlerts200ResponsePausedIncidentReportingAlertsTriggeredAfterPauseAlertsInner> triggeredAfterPauseAlerts, List<GetPausedIncidentReportAlerts200ResponsePausedIncidentReportingAlertsTriggeredAfterPauseAlertsInner> resolvedAfterPauseAlerts) {
        this.since = since;
        this.until = until;
        this.triggeredAfterPauseAlerts = triggeredAfterPauseAlerts;
        this.resolvedAfterPauseAlerts = resolvedAfterPauseAlerts;
    }

}
