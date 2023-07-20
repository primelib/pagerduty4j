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
 * GetPausedIncidentReportAlerts200Response
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
    "paused_incident_reporting_alerts"
})
@JsonTypeName("getPausedIncidentReportAlerts_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetPausedIncidentReportAlerts200Response {

    @JsonProperty("paused_incident_reporting_alerts")
    protected GetPausedIncidentReportAlerts200ResponsePausedIncidentReportingAlerts pausedIncidentReportingAlerts;

    /**
     * Constructs a validated instance of {@link GetPausedIncidentReportAlerts200Response}.
     *
     * @param spec the specification to process
     */
    public GetPausedIncidentReportAlerts200Response(Consumer<GetPausedIncidentReportAlerts200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetPausedIncidentReportAlerts200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetPausedIncidentReportAlerts200Response(Consumer)} instead.
     * @param pausedIncidentReportingAlerts var.name
     */
    @ApiStatus.Internal
    public GetPausedIncidentReportAlerts200Response(GetPausedIncidentReportAlerts200ResponsePausedIncidentReportingAlerts pausedIncidentReportingAlerts) {
        this.pausedIncidentReportingAlerts = pausedIncidentReportingAlerts;
    }

}
