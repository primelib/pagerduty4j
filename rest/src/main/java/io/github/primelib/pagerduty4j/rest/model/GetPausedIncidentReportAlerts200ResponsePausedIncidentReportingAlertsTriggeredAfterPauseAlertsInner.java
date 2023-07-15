package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetPausedIncidentReportAlerts200ResponsePausedIncidentReportingAlertsTriggeredAfterPauseAlertsInner
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "id",
    "service_id",
    "created_at"
})
@JsonTypeName("getPausedIncidentReportAlerts_200_response_paused_incident_reporting_alerts_triggered_after_pause_alerts_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetPausedIncidentReportAlerts200ResponsePausedIncidentReportingAlertsTriggeredAfterPauseAlertsInner {

    /**
     * The Alert ID
     */
    @JsonProperty("id")
    private String id;

    /**
     * The Alert's Service ID
     */
    @JsonProperty("service_id")
    private String serviceId;

    /**
     * The date/time the Alert was created
     */
    @JsonProperty("created_at")
    private String createdAt;


}
