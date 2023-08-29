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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetPausedIncidentReportAlerts200ResponsePausedIncidentReportingAlertsTriggeredAfterPauseAlertsInner
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

    /**
     * Constructs a validated instance of {@link GetPausedIncidentReportAlerts200ResponsePausedIncidentReportingAlertsTriggeredAfterPauseAlertsInner}.
     *
     * @param spec the specification to process
     */
    public GetPausedIncidentReportAlerts200ResponsePausedIncidentReportingAlertsTriggeredAfterPauseAlertsInner(Consumer<GetPausedIncidentReportAlerts200ResponsePausedIncidentReportingAlertsTriggeredAfterPauseAlertsInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetPausedIncidentReportAlerts200ResponsePausedIncidentReportingAlertsTriggeredAfterPauseAlertsInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetPausedIncidentReportAlerts200ResponsePausedIncidentReportingAlertsTriggeredAfterPauseAlertsInner(Consumer)} instead.
     * @param id The Alert ID
     * @param serviceId The Alert's Service ID
     * @param createdAt The date/time the Alert was created
     */
    @ApiStatus.Internal
    public GetPausedIncidentReportAlerts200ResponsePausedIncidentReportingAlertsTriggeredAfterPauseAlertsInner(String id, String serviceId, String createdAt) {
        this.id = id;
        this.serviceId = serviceId;
        this.createdAt = createdAt;
    }

}
