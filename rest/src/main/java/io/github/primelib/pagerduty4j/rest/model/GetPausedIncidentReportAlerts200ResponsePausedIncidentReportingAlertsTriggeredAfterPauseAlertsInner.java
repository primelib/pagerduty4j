package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetPausedIncidentReportAlerts200ResponsePausedIncidentReportingAlertsTriggeredAfterPauseAlertsInner
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "service_id",
    "created_at"
})
@JsonTypeName("getPausedIncidentReportAlerts_200_response_paused_incident_reporting_alerts_triggered_after_pause_alerts_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetPausedIncidentReportAlerts200ResponsePausedIncidentReportingAlertsTriggeredAfterPauseAlertsInner {

    /**
     * Constructs a validated implementation of {@link GetPausedIncidentReportAlerts200ResponsePausedIncidentReportingAlertsTriggeredAfterPauseAlertsInner}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetPausedIncidentReportAlerts200ResponsePausedIncidentReportingAlertsTriggeredAfterPauseAlertsInner(Consumer<GetPausedIncidentReportAlerts200ResponsePausedIncidentReportingAlertsTriggeredAfterPauseAlertsInner> spec) {
        spec.accept(this);
    }

    /**
     * The Alert ID
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The Alert's Service ID
     */
    @JsonProperty("service_id")
    protected String serviceId;

    /**
     * The date/time the Alert was created
     */
    @JsonProperty("created_at")
    protected String createdAt;


}
